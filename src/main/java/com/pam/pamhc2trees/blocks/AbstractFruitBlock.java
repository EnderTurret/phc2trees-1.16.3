package com.pam.pamhc2trees.blocks;

import java.util.List;
import java.util.Random;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.BonemealableBlock;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.InteractionResult;
import net.minecraft.core.Direction;
import net.minecraft.world.InteractionHand;
import net.minecraft.sounds.SoundSource;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.core.BlockPos;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.ticks.ScheduledTick;
import net.minecraft.util.Mth;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.Level;
import net.minecraft.server.level.ServerLevel;

public abstract class AbstractFruitBlock extends Block implements BonemealableBlock {

	public static final IntegerProperty AGE = BlockStateProperties.AGE_7;

	public AbstractFruitBlock(Block.Properties properties) {
		super(properties);
		this.registerDefaultState(this.stateDefinition.any().setValue(AGE, 0));
	}

	public int getMaxAge() {
		return 7;
	}

	protected int getAge(BlockState state) {
		return state.getValue(AGE);
	}

	public BlockState withAge(int age) {
		return this.defaultBlockState().setValue(AGE, Integer.valueOf(age));
	}

	public boolean isMaxAge(BlockState state) {
		return state.getValue(AGE) >= this.getMaxAge();
	}

	@SuppressWarnings("deprecation")
	@Override
	public InteractionResult use(BlockState state, Level level, BlockPos pos, Player player, InteractionHand hand, BlockHitResult hit) {
		if (isMaxAge(state)) {
			if (!level.isClientSide) {
				List<ItemStack> drops = Block.getDrops(state, (ServerLevel) level, pos, level.getBlockEntity(pos));

				for (ItemStack stack : drops) {
					level.addFreshEntity(new ItemEntity(level, pos.getX(), pos.getY(), pos.getZ(), stack));
				}
			}

			player.causeFoodExhaustion(.05F);
			level.playSound((Player) null, pos, SoundEvents.CROP_BREAK,
					SoundSource.BLOCKS, 1.0F, 0.8F + level.random.nextFloat() * 0.4F);
			level.setBlock(pos, defaultBlockState(), 2);
			return InteractionResult.SUCCESS;
		}
		return super.use(state, level, pos, player, hand, hit);
	}

	@Override
	@SuppressWarnings("deprecation")
	public abstract void tick(BlockState state, ServerLevel level, BlockPos pos, Random random);

	@Override
	protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
		builder.add(AGE);
	}

	@Override
	public boolean isValidBonemealTarget(BlockGetter level, BlockPos pos, BlockState state, boolean isClient) {
		return state.getValue(AGE) < 7;
	}

	@Override
	public boolean isBonemealSuccess(Level level, Random rand, BlockPos pos, BlockState state) {
		return true;
	}

	protected int getBonemealAgeIncrease(Level level) {
		return Mth.nextInt(level.random, 2, 5);
	}

	public void growFruit(ServerLevel level, Random rand, BlockPos pos, BlockState state) {
		int newAge = this.getAge(state) + this.getBonemealAgeIncrease(level);
		int maxAge = this.getMaxAge();
		if (newAge > maxAge) {
			newAge = maxAge;
		}

		level.setBlock(pos, this.withAge(newAge), 2);
	}

	@SuppressWarnings("deprecation")
	@Override
	public abstract boolean canSurvive(BlockState state, LevelReader level, BlockPos pos);

	@Override
	public void performBonemeal(ServerLevel level, Random random, BlockPos pos, BlockState state) {
		this.growFruit(level, random, pos, state);
	}
}
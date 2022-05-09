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
	public InteractionResult use(BlockState state, Level world, BlockPos pos, Player player, InteractionHand hand, BlockHitResult hit) {
		if (isMaxAge(state)) {
			if (!world.isClientSide) {
				List<ItemStack> drops = Block.getDrops(state, (ServerLevel) world, pos, world.getBlockEntity(pos));

				for (ItemStack stack : drops) {
					world.addFreshEntity(new ItemEntity(world, pos.getX(), pos.getY(), pos.getZ(), stack));
				}
			}

			player.causeFoodExhaustion(.05F);
			world.playSound((Player) null, pos, SoundEvents.CROP_BREAK,
					SoundSource.BLOCKS, 1.0F, 0.8F + world.random.nextFloat() * 0.4F);
			world.setBlock(pos, defaultBlockState(), 2);
			return InteractionResult.SUCCESS;
		}
		return super.use(state, world, pos, player, hand, hit);
	}

	@Override
	@SuppressWarnings("deprecation")
	public abstract void tick(BlockState state, ServerLevel worldIn, BlockPos pos, Random random);

	@Override
	protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
		builder.add(AGE);
	}

	@Override
	public boolean isValidBonemealTarget(BlockGetter worldIn, BlockPos pos, BlockState state, boolean isClient) {
		return state.getValue(AGE) < 7;
	}

	@Override
	public boolean isBonemealSuccess(Level worldIn, Random rand, BlockPos pos, BlockState state) {
		return true;
	}

	protected int getBonemealAgeIncrease(Level worldIn) {
		return Mth.nextInt(worldIn.random, 2, 5);
	}

	public void growFruit(ServerLevel worldIn, Random rand, BlockPos pos, BlockState state) {
		int i = this.getAge(state) + this.getBonemealAgeIncrease(worldIn);
		int j = this.getMaxAge();
		if (i > j) {
			i = j;
		}

		worldIn.setBlock(pos, this.withAge(i), 2);
	}

	@SuppressWarnings("deprecation")
	@Override
	public abstract boolean canSurvive(BlockState state, LevelReader world, BlockPos pos);

	@Override
	public void performBonemeal(ServerLevel p_225535_1_, Random p_225535_2_, BlockPos p_225535_3_, BlockState p_225535_4_) {
		this.growFruit(p_225535_1_, p_225535_2_, p_225535_3_, p_225535_4_);
	}
}
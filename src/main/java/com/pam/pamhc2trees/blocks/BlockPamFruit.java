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

public class BlockPamFruit extends Block implements BonemealableBlock {

	public static final IntegerProperty AGE = BlockStateProperties.AGE_7;

	public BlockPamFruit(Block.Properties properties) {
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
	public void tick(BlockState state, ServerLevel worldIn, BlockPos pos, Random random) {
		if (!state.canSurvive(worldIn, pos)) {
			worldIn.destroyBlock(pos, true);
			return;
		}
		super.tick(state, worldIn, pos, random);
		int i = state.getValue(AGE);
		if (i < 7 && random.nextInt(5) == 0 && worldIn.getRawBrightness(pos.above(), 0) >= 9) {
			worldIn.setBlock(pos, state.setValue(AGE, Integer.valueOf(i + 1)), 2);
		}
	}

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
	public boolean canSurvive(BlockState state, LevelReader world, BlockPos pos) {
		if (world.getBlockState(pos.above()).is(BlockTags.LEAVES))
			return true;

		return false;
	}

	@Override
	public void performBonemeal(ServerLevel p_225535_1_, Random p_225535_2_, BlockPos p_225535_3_, BlockState p_225535_4_) {
		this.growFruit(p_225535_1_, p_225535_2_, p_225535_3_, p_225535_4_);
	}

	@SuppressWarnings("deprecation")
	@Override
	public BlockState updateShape(BlockState stateIn, Direction facing, BlockState facingState, LevelAccessor worldIn, BlockPos currentPos, BlockPos facingPos) {
		if (!canSurvive(stateIn,worldIn,currentPos)) {
			worldIn.scheduleTick(currentPos, this, 2);
		}

		return stateIn;
	}
}
package com.pam.pamhc2trees.blocks;

import java.util.List;
import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.IGrowable;
import net.minecraft.entity.item.ItemEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.state.IntegerProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Direction;
import net.minecraft.util.Hand;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorldReader;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;

public class BlockPamLogFruit extends Block implements IGrowable {
	private String name;
	public static final IntegerProperty AGE = BlockStateProperties.AGE_7;
	public static boolean fruitRemoval = false;
	public BlockPamLogFruit(Block.Properties p_i49971_1_, String name) {
		super(p_i49971_1_);
		this.name = name;
		this.registerDefaultState(this.stateDefinition.any().setValue(this.getAgeProperty(), Integer.valueOf(0)));
	}

	public IntegerProperty getAgeProperty() {
		return AGE;
	}

	public int getMaxAge() {
		return 7;
	}

	protected int getAge(BlockState state) {
		return state.getValue(this.getAgeProperty());
	}

	public BlockState withAge(int age) {
		return this.defaultBlockState().setValue(this.getAgeProperty(), Integer.valueOf(age));
	}

	public boolean isMaxAge(BlockState state) {
		return state.getValue(this.getAgeProperty()) >= this.getMaxAge();
	}

	@SuppressWarnings("deprecation")
	@Override
	public ActionResultType use(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockRayTraceResult hit) {
		if (isMaxAge(state)) {
			if (!world.isClientSide) {
				List<ItemStack> drops = Block.getDrops(state, (ServerWorld) world, pos, world.getBlockEntity(pos));

				for (ItemStack stack : drops) {
					//if (drops.get(i).getItem() != getCropSeed(block))
					world.addFreshEntity(new ItemEntity(world, pos.getX(), pos.getY(), pos.getZ(), stack));
				}
			}

			player.causeFoodExhaustion(.05F);
			world.playSound((PlayerEntity) null, pos, SoundEvents.CROP_BREAK,
					SoundCategory.BLOCKS, 1.0F, 0.8F + world.random.nextFloat() * 0.4F);
			world.setBlock(pos, defaultBlockState(), 2);
			return ActionResultType.SUCCESS;
		}
		return super.use(state, world, pos, player, hand, hit);
	}

	@Override
	@SuppressWarnings("deprecation")
	public void tick(BlockState state, ServerWorld worldIn, BlockPos pos, Random random) {
		if (!state.canSurvive(worldIn, pos)) {
			worldIn.destroyBlock(pos, true);
		}
		super.tick(state, worldIn, pos, random);
		int i = state.getValue(AGE);
		//for (int j = 0; j < 3; j++) {
		//if (i < 7 && random.nextInt(5) == 0 && worldIn.getLightSubtracted(pos.offset(net.minecraft.util.Direction.byHorizontalIndex(j), 1), 0) >= 9) {
		//	worldIn.setBlockState(pos, state.with(AGE, Integer.valueOf(i + 1)), 2);
		//	break;
		//}
		//}
		for(Direction facing : Direction.Plane.HORIZONTAL){
			if (i < 7 && random.nextInt(5) == 0 && worldIn.getRawBrightness(pos.relative(facing), 0) >= 9) {
				worldIn.setBlock(pos, state.setValue(AGE, i + 1), 2);
				break;
			}
		}

	}

	@Override
	protected void createBlockStateDefinition(StateContainer.Builder<Block, BlockState> builder) {
		builder.add(AGE);
	}

	@Override
	public boolean isValidBonemealTarget(IBlockReader worldIn, BlockPos pos, BlockState state, boolean isClient) {
		return state.getValue(AGE) < 7;
	}

	@Override
	public boolean isBonemealSuccess(World worldIn, Random rand, BlockPos pos, BlockState state) {
		return true;
	}

	protected int getBonemealAgeIncrease(World worldIn) {
		return MathHelper.nextInt(worldIn.random, 2, 5);
	}

	public void growFruit(ServerWorld worldIn, Random rand, BlockPos pos, BlockState state) {
		int i = this.getAge(state) + this.getBonemealAgeIncrease(worldIn);
		int j = this.getMaxAge();
		if (i > j) {
			i = j;
		}

		worldIn.setBlock(pos, this.withAge(i), 2);
	}






	@SuppressWarnings("deprecation")
	@Override
	public boolean canSurvive(BlockState state, IWorldReader world, BlockPos pos) {

		return true;

	}

	@Override
	public void performBonemeal(ServerWorld p_225535_1_, Random p_225535_2_, BlockPos p_225535_3_, BlockState p_225535_4_) {
		this.growFruit(p_225535_1_, p_225535_2_, p_225535_3_, p_225535_4_);

	}
}
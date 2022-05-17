package com.pam.pamhc2trees.worldgen;

import java.util.Random;

import com.pam.pamhc2trees.config.ChanceConfig;
import com.pam.pamhc2trees.worldgen.config.TreeConfig;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;

public class WarmFruitTreeFeature extends TreeFeature {

	public WarmFruitTreeFeature() {
		super();
	}

	@Override
	protected int chance() {
		return ChanceConfig.warmfruittree_chance.get();
	}

	@Override
	public void generateTree(LevelAccessor world, BlockPos pos, Random random, TreeConfig config, boolean randomizeFruitAge) {
		BlockState trunk = getTrunk();
		BlockState leaves = getLeaves();
		BlockState fruit = getFruit(config, random, pos, randomizeFruitAge);

		world.setBlock(pos.above(0), trunk, 3);
		world.setBlock(pos.above(1), trunk, 3);
		world.setBlock(pos.above(2), trunk, 3);
		world.setBlock(pos.above(3), trunk, 3);
		world.setBlock(pos.above(4), trunk, 3);

		//Fruit Layer 1
		if (world.getBlockState(pos.above(3).north().north()).getMaterial().isReplaceable())
			world.setBlock(pos.above(3).north().north(), fruit, 3);
		if (world.getBlockState(pos.above(3).south().south()).getMaterial().isReplaceable())
			world.setBlock(pos.above(3).south().south(), fruit, 3);
		if (world.getBlockState(pos.above(3).east().east()).getMaterial().isReplaceable())
			world.setBlock(pos.above(3).east().east(), fruit, 3);
		if (world.getBlockState(pos.above(3).west().west()).getMaterial().isReplaceable())
			world.setBlock(pos.above(3).west().west(), fruit, 3);

		//Fruit Layer 2
		if (world.getBlockState(pos.above(4).north()).getMaterial().isReplaceable())
			world.setBlock(pos.above(4).north(), fruit, 3);
		if (world.getBlockState(pos.above(4).south()).getMaterial().isReplaceable())
			world.setBlock(pos.above(4).south(), fruit, 3);
		if (world.getBlockState(pos.above(4).east()).getMaterial().isReplaceable())
			world.setBlock(pos.above(4).east(), fruit, 3);
		if (world.getBlockState(pos.above(4).west()).getMaterial().isReplaceable())
			world.setBlock(pos.above(4).west(), fruit, 3);

		//Layer 1
		if (world.getBlockState(pos.above(4).north().north()).getMaterial().isReplaceable())
			world.setBlock(pos.above(4).north().north(), leaves, 3);
		if (world.getBlockState(pos.above(4).south().south()).getMaterial().isReplaceable())
			world.setBlock(pos.above(4).south().south(), leaves, 3);
		if (world.getBlockState(pos.above(4).east().east()).getMaterial().isReplaceable())
			world.setBlock(pos.above(4).east().east(), leaves, 3);
		if (world.getBlockState(pos.above(4).west().west()).getMaterial().isReplaceable())
			world.setBlock(pos.above(4).west().west(), leaves, 3);



		//Layer 2
		if (world.getBlockState(pos.above(5)).getMaterial().isReplaceable())
			world.setBlock(pos.above(5), trunk, 3);
		if (world.getBlockState(pos.above(5).north()).getMaterial().isReplaceable())
			world.setBlock(pos.above(5).north(), leaves, 3);
		if (world.getBlockState(pos.above(5).north().north()).getMaterial().isReplaceable())
			world.setBlock(pos.above(5).north().north(), leaves, 3);
		if (world.getBlockState(pos.above(5).north().east()).getMaterial().isReplaceable())
			world.setBlock(pos.above(5).north().east(), leaves, 3);
		if (world.getBlockState(pos.above(5).north().west()).getMaterial().isReplaceable())
			world.setBlock(pos.above(5).north().west(), leaves, 3);
		if (world.getBlockState(pos.above(5).south()).getMaterial().isReplaceable())
			world.setBlock(pos.above(5).south(), leaves, 3);
		if (world.getBlockState(pos.above(5).south().south()).getMaterial().isReplaceable())
			world.setBlock(pos.above(5).south().south(), leaves, 3);
		if (world.getBlockState(pos.above(5).south().east()).getMaterial().isReplaceable())
			world.setBlock(pos.above(5).south().east(), leaves, 3);
		if (world.getBlockState(pos.above(5).south().west()).getMaterial().isReplaceable())
			world.setBlock(pos.above(5).south().west(), leaves, 3);
		if (world.getBlockState(pos.above(5).east()).getMaterial().isReplaceable())
			world.setBlock(pos.above(5).east(), leaves, 3);
		if (world.getBlockState(pos.above(5).east().east()).getMaterial().isReplaceable())
			world.setBlock(pos.above(5).east().east(), leaves, 3);
		if (world.getBlockState(pos.above(5).west()).getMaterial().isReplaceable())
			world.setBlock(pos.above(5).west(), leaves, 3);
		if (world.getBlockState(pos.above(5).west().west()).getMaterial().isReplaceable())
			world.setBlock(pos.above(5).west().west(), leaves, 3);

		//Layer 3
		if (world.getBlockState(pos.above(6)).getMaterial().isReplaceable())
			world.setBlock(pos.above(6), leaves, 3);

	}

	@Override
	public BlockState getLeaves() {
		return Blocks.JUNGLE_LEAVES.defaultBlockState().setValue(BlockStateProperties.DISTANCE, 1);
	}

	@Override
	public BlockState getTrunk() {
		return Blocks.JUNGLE_LOG.defaultBlockState();
	}
}
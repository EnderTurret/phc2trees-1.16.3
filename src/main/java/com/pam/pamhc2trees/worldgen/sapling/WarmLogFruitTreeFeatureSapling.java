package com.pam.pamhc2trees.worldgen.sapling;

import java.util.Random;

import com.mojang.serialization.Codec;
import com.pam.pamhc2trees.config.ChanceConfig;
import com.pam.pamhc2trees.config.DimensionConfig;
import com.pam.pamhc2trees.config.EnableConfig;
import com.pam.pamhc2trees.init.BlockRegistry;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.ISeedReader;
import net.minecraft.world.IWorld;
import net.minecraft.world.gen.ChunkGenerator;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.NoFeatureConfig;

public class WarmLogFruitTreeFeatureSapling extends Feature<NoFeatureConfig> {
	public WarmLogFruitTreeFeatureSapling(Codec<NoFeatureConfig> configFactory) {
		super(configFactory);
	}

	@Override
	public boolean place(ISeedReader world, ChunkGenerator generator, Random random,
			BlockPos pos, NoFeatureConfig config) {
		if (random.nextInt(ChanceConfig.warmfruittree_chance.get()) != 0
				|| DimensionConfig.blacklist.get().contains(world.getLevel().dimension().location().toString())
				|| !DimensionConfig.whitelist.get().contains(world.getLevel().dimension().location().toString()))
			return false;

		if (isValidGround(world.getBlockState(pos.below()), world, pos)
				&& world.getBlockState(pos).getMaterial().isReplaceable()) {
			int type = random.nextInt(2) + 1;
			generateTree(world, pos, random, type);
			return true;
		}
		return false;
	}

	private boolean isValidGround(BlockState state, IBlockReader worldIn, BlockPos pos) {
		Block block = state.getBlock();
		return block == Blocks.GRASS_BLOCK || block == Blocks.DIRT || block == Blocks.COARSE_DIRT
				|| block == Blocks.PODZOL;
	}

	public static void generateTree(IWorld world, BlockPos pos, Random random, int verify) {
		BlockState trunk = getTrunk(verify);
		BlockState leaves = getLeaves(verify);
		BlockState fruit = getFruit(verify, random);

		world.setBlock(pos.above(0), fruit, 3);
		world.setBlock(pos.above(1), fruit, 3);
		world.setBlock(pos.above(2), fruit, 3);
		world.setBlock(pos.above(3), fruit, 3);
		world.setBlock(pos.above(4), fruit, 3);

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

	private static BlockState getLeaves(int verify)
	{
		return Blocks.JUNGLE_LEAVES.defaultBlockState().setValue(BlockStateProperties.DISTANCE, 1);
	}

	private static BlockState getTrunk(int verify)
	{
		return Blocks.JUNGLE_LOG.defaultBlockState();
	}

	private static BlockState getFruit(int verify, Random random)
	{
		int i = 0;
		switch (verify) {
		case 1:
			if (EnableConfig.cinnamon_worldgen != null)
				return BlockRegistry.pamcinnamon.defaultBlockState().setValue(BlockStateProperties.AGE_7, i);
		case 2:
			if (EnableConfig.paperbark_worldgen != null)
				return BlockRegistry.pampaperbark.defaultBlockState().setValue(BlockStateProperties.AGE_7, i);
		default:
			return BlockRegistry.pamalmond.defaultBlockState().setValue(BlockStateProperties.AGE_7, i);
		}
	}
}
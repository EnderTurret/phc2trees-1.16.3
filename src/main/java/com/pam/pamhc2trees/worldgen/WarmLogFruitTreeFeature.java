package com.pam.pamhc2trees.worldgen;

import java.util.Random;

import com.mojang.serialization.Codec;
import com.pam.pamhc2trees.config.ChanceConfig;
import com.pam.pamhc2trees.config.DimensionConfig;
import com.pam.pamhc2trees.config.EnableConfig;
import com.pam.pamhc2trees.init.BlockRegistry;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.chunk.ChunkGenerator;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.FeaturePlaceContext;
import net.minecraft.world.level.levelgen.feature.configurations.NoneFeatureConfiguration;

public class WarmLogFruitTreeFeature extends Feature<NoneFeatureConfiguration> {
	public WarmLogFruitTreeFeature(Codec<NoneFeatureConfiguration> configFactory) {
		super(configFactory);
	}

	@Override
	public boolean place(FeaturePlaceContext<NoneFeatureConfiguration> ctx) {
		if (ctx.random().nextInt(ChanceConfig.warmfruittree_chance.get()) != 0
				|| DimensionConfig.blacklist.get().contains(ctx.level().getLevel().dimension().location().toString())
				|| (!DimensionConfig.whitelist.get().contains(ctx.level().getLevel().dimension().location().toString()) && DimensionConfig.whitelist.get().size()>0))
			return false;

		if (isValidGround(ctx.level().getBlockState(ctx.origin().below()), ctx.level(), ctx.origin())
				&& ctx.level().getBlockState(ctx.origin()).getMaterial().isReplaceable()) {
			int type = ctx.random().nextInt(2) + 1;
			generateTree(ctx.level(), ctx.origin(), ctx.random(), type);
			return true;
		}
		return false;
	}

	private boolean isValidGround(BlockState state, BlockGetter worldIn, BlockPos pos) {
		Block block = state.getBlock();
		return block == Blocks.GRASS_BLOCK || block == Blocks.DIRT || block == Blocks.COARSE_DIRT
				|| block == Blocks.PODZOL;
	}

	public static void generateTree(LevelAccessor world, BlockPos pos, Random random, int verify) {
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
		int i = random.nextInt(2);
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
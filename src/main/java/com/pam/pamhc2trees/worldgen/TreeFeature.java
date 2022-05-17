package com.pam.pamhc2trees.worldgen;

import java.util.Random;

import com.pam.pamhc2trees.config.DimensionConfig;
import com.pam.pamhc2trees.worldgen.config.TreeConfig;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.FeaturePlaceContext;

public abstract class TreeFeature extends Feature<TreeConfig> {

	public TreeFeature() {
		super(TreeConfig.CODEC);
	}

	@Override
	public boolean place(FeaturePlaceContext<TreeConfig> ctx) {
		if (ctx.random().nextInt(chance()) != 0
				|| !DimensionConfig.allows(ctx.level().getLevel()))
			return false;

		BlockPos pos = ctx.origin();

		if (ctx.level().getBlockState(pos).getMaterial().isReplaceable()) {
			//Pamhc2trees.LOGGER.debug("[" + getClass().getSimpleName() + "] Placing at " + pos);
			generateTree(ctx.level(), pos, ctx.random(), ctx.config(), true);
			return true;
		}

		return false;
	}

	protected abstract int chance();

	protected boolean isValidGround(BlockState state, BlockGetter worldIn, BlockPos pos) {
		Block block = state.getBlock();
		return block == Blocks.GRASS_BLOCK || block == Blocks.DIRT || block == Blocks.COARSE_DIRT
				|| block == Blocks.PODZOL;
	}

	public abstract void generateTree(LevelAccessor world, BlockPos pos, Random random, TreeConfig config, boolean randomizeFruitAge);

	public abstract BlockState getLeaves();
	public abstract BlockState getTrunk();

	public BlockState getFruit(TreeConfig config, Random rand, BlockPos pos, boolean randomizeAge) {
		final BlockState state = config.fruit().getState(rand, pos);
		return state.setValue(BlockStateProperties.AGE_7, randomizeAge ? rand.nextInt(2) : 0);
	}
}
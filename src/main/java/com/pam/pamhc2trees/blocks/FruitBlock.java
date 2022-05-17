package com.pam.pamhc2trees.blocks;

import java.util.Random;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;

public class FruitBlock extends AbstractFruitBlock {

	public FruitBlock(Block.Properties properties) {
		super(properties);
	}

	@Override
	public void tick(BlockState state, ServerLevel level, BlockPos pos, Random random) {
		if (!state.canSurvive(level, pos)) {
			level.destroyBlock(pos, true);
			return;
		}

		int age = state.getValue(AGE);
		if (age < 7 && random.nextInt(5) == 0 && level.getRawBrightness(pos.above(), 0) >= 9) {
			level.setBlock(pos, state.setValue(AGE, age + 1), 2);
		}
	}

	@Override
	public boolean canSurvive(BlockState state, LevelReader level, BlockPos pos) {
		return level.getBlockState(pos.above()).is(BlockTags.LEAVES);
	}

	@SuppressWarnings("deprecation")
	@Override
	public BlockState updateShape(BlockState state, Direction facing, BlockState facingState, LevelAccessor level, BlockPos currentPos, BlockPos facingPos) {
		if (!canSurvive(state, level, currentPos)) {
			level.scheduleTick(currentPos, this, 2);
		}

		return state;
	}
}
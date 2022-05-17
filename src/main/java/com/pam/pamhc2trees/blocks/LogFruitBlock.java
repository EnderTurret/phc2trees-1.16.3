package com.pam.pamhc2trees.blocks;

import java.util.Random;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;

public class LogFruitBlock extends AbstractFruitBlock {

	public LogFruitBlock(Block.Properties properties) {
		super(properties);
	}

	@Override
	public void tick(BlockState state, ServerLevel level, BlockPos pos, Random random) {
		if (!state.canSurvive(level, pos)) {
			level.destroyBlock(pos, true);
			return;
		}

		int age = state.getValue(AGE);
		for (Direction facing : Direction.Plane.HORIZONTAL) {
			if (age < 7 && random.nextInt(5) == 0 && level.getRawBrightness(pos.relative(facing), 0) >= 9) {
				level.setBlock(pos, state.setValue(AGE, age + 1), 2);
				break;
			}
		}
	}

	@Override
	public boolean canSurvive(BlockState state, LevelReader level, BlockPos pos) {
		return true;
	}
}
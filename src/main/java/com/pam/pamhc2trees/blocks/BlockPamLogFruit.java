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
import net.minecraft.world.InteractionResult;
import net.minecraft.core.Direction;
import net.minecraft.world.InteractionHand;
import net.minecraft.sounds.SoundSource;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.core.BlockPos;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.util.Mth;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.Level;
import net.minecraft.server.level.ServerLevel;

public class BlockPamLogFruit extends AbstractFruitBlock {

	public BlockPamLogFruit(Block.Properties properties) {
		super(properties);
	}

	@Override
	public void tick(BlockState state, ServerLevel worldIn, BlockPos pos, Random random) {
		if (!state.canSurvive(worldIn, pos)) {
			worldIn.destroyBlock(pos, true);
			return;
		}

		int age = state.getValue(AGE);
		for (Direction facing : Direction.Plane.HORIZONTAL) {
			if (age < 7 && random.nextInt(5) == 0 && worldIn.getRawBrightness(pos.relative(facing), 0) >= 9) {
				worldIn.setBlock(pos, state.setValue(AGE, age + 1), 2);
				break;
			}
		}
	}

	@Override
	public boolean canSurvive(BlockState state, LevelReader world, BlockPos pos) {
		return true;
	}
}
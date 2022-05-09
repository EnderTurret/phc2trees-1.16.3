package com.pam.pamhc2trees.blocks;

import java.util.Random;

import com.pam.pamhc2trees.util.FeatureHolder;
import com.pam.pamhc2trees.worldgen.TreeFeature;
import com.pam.pamhc2trees.worldgen.config.TreeConfig;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.BushBlock;
import net.minecraft.world.level.block.BonemealableBlock;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.core.BlockPos;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraftforge.event.ForgeEventFactory;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.server.level.ServerLevel;

public class BlockPamSapling extends BushBlock implements BonemealableBlock {

	public static final IntegerProperty STAGE = BlockStateProperties.STAGE;
	protected static final VoxelShape SHAPE = Block.box(2.0D, 0.0D, 2.0D, 14.0D, 12.0D, 14.0D);
	private final FeatureHolder<? extends TreeFeature, TreeConfig> feature;

	public BlockPamSapling(Block.Properties properties, FeatureHolder<? extends TreeFeature, TreeConfig> feature) {
		super(properties);
		this.feature = feature;
		this.registerDefaultState(this.stateDefinition.any().setValue(STAGE, 0));
	}

	@SuppressWarnings("deprecation")
	@Override
	public VoxelShape getShape(BlockState state, BlockGetter level, BlockPos pos, CollisionContext context) {
		return SHAPE;
	}

	@Override
	@SuppressWarnings("deprecation")
	public void tick(BlockState state, ServerLevel level, BlockPos pos, Random random) {
		if (!level.isAreaLoaded(pos, 1))
			return;

		if (level.getMaxLocalRawBrightness(pos.above()) >= 9 && random.nextInt(7) == 0) {
			grow(level, pos, state, random);
		}
	}

	public void grow(LevelAccessor level, BlockPos pos, BlockState state, Random rand) {
		if (state.getValue(STAGE) == 0)
			level.setBlock(pos, state.cycle(STAGE), 4);
		else if (ForgeEventFactory.saplingGrowTree(level, rand, pos))
			feature.feature().generateTree(level, pos, rand, feature.configuredFeature().config(), false);
	}

	@Override
	public boolean isValidBonemealTarget(BlockGetter level, BlockPos pos, BlockState state, boolean isClient) {
		return true;
	}

	@Override
	public boolean isBonemealSuccess(Level level, Random rand, BlockPos pos, BlockState state) {
		return level.random.nextFloat() < 0.45F;
	}

	@Override
	protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
		builder.add(STAGE);
	}

	@Override
	public void performBonemeal(ServerLevel level, Random random, BlockPos pos, BlockState state) {
		this.grow(level, pos, state, random);
	}
}
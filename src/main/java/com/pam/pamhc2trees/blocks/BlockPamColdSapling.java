package com.pam.pamhc2trees.blocks;

import java.util.Random;

import com.pam.pamhc2trees.util.FeatureHolder;
import com.pam.pamhc2trees.worldgen.ColdFruitTreeFeature;
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
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.server.level.ServerLevel;

public class BlockPamColdSapling extends BushBlock implements BonemealableBlock {

	public static final IntegerProperty STAGE = BlockStateProperties.STAGE;
	protected static final VoxelShape SHAPE = Block.box(2.0D, 0.0D, 2.0D, 14.0D, 12.0D, 14.0D);
	private final FeatureHolder<ColdFruitTreeFeature, TreeConfig> feature;

	public BlockPamColdSapling(Block.Properties properties, FeatureHolder<ColdFruitTreeFeature, TreeConfig> feature) {
		super(properties);
		this.feature = feature;
		this.registerDefaultState(this.stateDefinition.any().setValue(STAGE, 0));
	}

	@SuppressWarnings("deprecation")
	@Override
	public VoxelShape getShape(BlockState state, BlockGetter worldIn, BlockPos pos, CollisionContext context) {
		return SHAPE;
	}

	@Override
	@SuppressWarnings("deprecation")
	public void tick(BlockState state, ServerLevel worldIn, BlockPos pos, Random random) {
		super.tick(state, worldIn, pos, random);
		if (!worldIn.isAreaLoaded(pos, 1))
			return;
		if (worldIn.getMaxLocalRawBrightness(pos.above()) >= 9 && random.nextInt(7) == 0) {
			this.grow(worldIn, pos, state, random);
		}

	}

	public void grow(LevelAccessor worldIn, BlockPos pos, BlockState state, Random rand) {
		if (state.getValue(STAGE) == 0) {
			worldIn.setBlock(pos, state.cycle(STAGE), 4);
		} else {
			if (!net.minecraftforge.event.ForgeEventFactory.saplingGrowTree(worldIn, rand, pos))
				return;
			feature.feature().generateTree(worldIn, pos, rand, feature.configuredFeature().config(), false);
		}
	}

	@Override
	public boolean isValidBonemealTarget(BlockGetter worldIn, BlockPos pos, BlockState state, boolean isClient) {
		return true;
	}

	@Override
	public boolean isBonemealSuccess(Level worldIn, Random rand, BlockPos pos, BlockState state) {
		return worldIn.random.nextFloat() < 0.45F;
	}

	public void grow(Level worldIn, Random rand, BlockPos pos, BlockState state) {
		this.grow(worldIn, pos, state, rand);
	}

	@Override
	protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
		builder.add(STAGE);
	}

	@Override
	public void performBonemeal(ServerLevel world, Random random, BlockPos pos, BlockState state) {
		this.grow(world, pos, state, random);

	}
}
package com.pam.pamhc2trees.worldgen.config;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;

public record TreeConfig(BlockStateProvider fruit) implements FeatureConfiguration {

	public static final Codec<TreeConfig> CODEC = RecordCodecBuilder.create(builder -> builder
			.group(BlockStateProvider.CODEC.fieldOf("fruit").forGetter(TreeConfig::fruit))
			.apply(builder, TreeConfig::new));
}
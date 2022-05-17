package com.pam.pamhc2trees.util;

import java.util.List;
import java.util.function.Supplier;

import net.minecraft.core.Holder;
import net.minecraft.data.BuiltinRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.placement.PlacementModifier;
import net.minecraftforge.registries.ForgeRegistries;

public class FeatureHolder<T extends Feature<C>, C extends FeatureConfiguration> {

	private final ResourceLocation key;
	private Supplier<T> featureSup;
	private Supplier<C> configSup;
	private Supplier<List<PlacementModifier>> placementSup;

	private T feature;

	private ConfiguredFeature<C, T> configured;
	private Holder<ConfiguredFeature<?, ?>> configuredHolder;

	private PlacedFeature placed;
	private Holder<PlacedFeature> placedHolder;

	public FeatureHolder(ResourceLocation key, Supplier<T> feature, Supplier<C> config, Supplier<List<PlacementModifier>> placement) {
		this.key = key;
		featureSup = feature;
		configSup = config;
		placementSup = placement;
	}

	public ResourceLocation key() {
		return key;
	}

	public T feature() {
		if (feature == null) throw new IllegalStateException("Feature not registered yet!");
		return feature;
	}

	public ConfiguredFeature<C, T> configuredFeature() {
		if (configured == null) throw new IllegalStateException("Configured feature not registered yet!");
		return configured;
	}

	public Holder<ConfiguredFeature<?, ?>> configuredFeatureHolder() {
		if (configuredHolder == null) throw new IllegalStateException("Configured feature not registered yet!");
		return configuredHolder;
	}

	public PlacedFeature placedFeature() {
		if (placed == null) throw new IllegalStateException("Placed feature not registered yet!");
		return placed;
	}

	public Holder<PlacedFeature> placedFeatureHolder() {
		if (placedHolder == null) throw new IllegalStateException("Placed feature not registered yet!");
		return placedHolder;
	}

	public void registerFeature() {
		if (feature != null) throw new IllegalStateException("Feature already registered!");
		feature = featureSup.get();
		feature.setRegistryName(key);
		ForgeRegistries.FEATURES.register(feature);
		featureSup = null;
	}

	public void registerConfiguredFeature() {
		if (configured != null) throw new IllegalStateException("Configured feature already registered!");
		configured = new ConfiguredFeature<>(feature(), configSup.get());
		configuredHolder = BuiltinRegistries.register(BuiltinRegistries.CONFIGURED_FEATURE, key, configured);
		configSup = null;
	}

	public void registerPlacedFeature() {
		if (placed != null) throw new IllegalStateException("Placed feature already registered!");
		placed = new PlacedFeature(configuredFeatureHolder(), placementSup.get());
		placedHolder = BuiltinRegistries.register(BuiltinRegistries.PLACED_FEATURE, key, placed);
		placementSup = null;
	}
}
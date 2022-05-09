package com.pam.pamhc2trees.init;

import java.util.Set;

import com.pam.pamhc2trees.config.EnableConfig;

import net.minecraft.resources.ResourceKey;
import net.minecraft.core.Registry;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.event.world.BiomeLoadingEvent;

public class TemperateFruitTreeWorldGenRegistry {

	public static void addToBiome(BiomeLoadingEvent evt) {
		Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(ResourceKey.create(Registry.BIOME_REGISTRY, evt.getName()));
		if ((evt.getClimate().temperature >= 1F || evt.getClimate().temperature < 0.2F) && !types.contains(BiomeDictionary.Type.SPOOKY)) return;
		//apple
		if (EnableConfig.apple_worldgen.get()) {
			if (types.contains(BiomeDictionary.Type.FOREST))
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, WorldGenRegistry.APPLE.placedFeatureHolder());
			if (types.contains(BiomeDictionary.Type.HILLS))
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, WorldGenRegistry.APPLE.placedFeatureHolder());
			if (types.contains(BiomeDictionary.Type.SPOOKY))
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, WorldGenRegistry.APPLE.placedFeatureHolder());
		}
		//avocado
		if (EnableConfig.avocado_worldgen.get()) {
			if (types.contains(BiomeDictionary.Type.FOREST))
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, WorldGenRegistry.AVOCADO.placedFeatureHolder());
			if (types.contains(BiomeDictionary.Type.HILLS))
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, WorldGenRegistry.AVOCADO.placedFeatureHolder());
			if (types.contains(BiomeDictionary.Type.SPOOKY))
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, WorldGenRegistry.AVOCADO.placedFeatureHolder());
		}
		//candlenut
		if (EnableConfig.candlenut_worldgen.get()) {
			if (types.contains(BiomeDictionary.Type.FOREST))
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, WorldGenRegistry.CANDLENUT.placedFeatureHolder());
			if (types.contains(BiomeDictionary.Type.HILLS))
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, WorldGenRegistry.CANDLENUT.placedFeatureHolder());
			if (types.contains(BiomeDictionary.Type.SPOOKY))
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, WorldGenRegistry.CANDLENUT.placedFeatureHolder());
		}
		//cherry
		if (EnableConfig.cherry_worldgen.get()) {
			if (types.contains(BiomeDictionary.Type.FOREST))
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, WorldGenRegistry.CHERRY.placedFeatureHolder());
			if (types.contains(BiomeDictionary.Type.HILLS))
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, WorldGenRegistry.CHERRY.placedFeatureHolder());
			if (types.contains(BiomeDictionary.Type.SPOOKY))
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, WorldGenRegistry.CHERRY.placedFeatureHolder());
		}
		//chestnut
		if (EnableConfig.chestnut_worldgen.get()) {
			if (types.contains(BiomeDictionary.Type.FOREST))
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, WorldGenRegistry.CHESTNUT.placedFeatureHolder());
			if (types.contains(BiomeDictionary.Type.HILLS))
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, WorldGenRegistry.CHESTNUT.placedFeatureHolder());
			if (types.contains(BiomeDictionary.Type.SPOOKY))
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, WorldGenRegistry.CHESTNUT.placedFeatureHolder());
		}
		//gooseberry
		if (EnableConfig.gooseberry_worldgen.get()) {
			if (types.contains(BiomeDictionary.Type.FOREST))
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, WorldGenRegistry.GOOSEBERRY.placedFeatureHolder());
			if (types.contains(BiomeDictionary.Type.HILLS))
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, WorldGenRegistry.GOOSEBERRY.placedFeatureHolder());
			if (types.contains(BiomeDictionary.Type.SPOOKY))
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, WorldGenRegistry.GOOSEBERRY.placedFeatureHolder());
		}
		//lemon
		if (EnableConfig.lemon_worldgen.get()) {
			if (types.contains(BiomeDictionary.Type.FOREST))
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, WorldGenRegistry.LEMON.placedFeatureHolder());
			if (types.contains(BiomeDictionary.Type.HILLS))
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, WorldGenRegistry.LEMON.placedFeatureHolder());
			if (types.contains(BiomeDictionary.Type.SPOOKY))
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, WorldGenRegistry.LEMON.placedFeatureHolder());
		}
		//nutmeg
		if (EnableConfig.nutmeg_worldgen.get()) {
			if (types.contains(BiomeDictionary.Type.FOREST))
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, WorldGenRegistry.NUTMEG.placedFeatureHolder());
			if (types.contains(BiomeDictionary.Type.HILLS))
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, WorldGenRegistry.NUTMEG.placedFeatureHolder());
			if (types.contains(BiomeDictionary.Type.SPOOKY))
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, WorldGenRegistry.NUTMEG.placedFeatureHolder());
		}
		//orange
		if (EnableConfig.orange_worldgen.get()) {
			if (types.contains(BiomeDictionary.Type.FOREST))
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, WorldGenRegistry.ORANGE.placedFeatureHolder());
			if (types.contains(BiomeDictionary.Type.HILLS))
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, WorldGenRegistry.ORANGE.placedFeatureHolder());
			if (types.contains(BiomeDictionary.Type.SPOOKY))
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, WorldGenRegistry.ORANGE.placedFeatureHolder());
		}
		//peach
		if (EnableConfig.peach_worldgen.get()) {
			if (types.contains(BiomeDictionary.Type.FOREST))
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, WorldGenRegistry.PEACH.placedFeatureHolder());
			if (types.contains(BiomeDictionary.Type.HILLS))
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, WorldGenRegistry.PEACH.placedFeatureHolder());
			if (types.contains(BiomeDictionary.Type.SPOOKY))
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, WorldGenRegistry.PEACH.placedFeatureHolder());
		}
		//pear
		if (EnableConfig.pear_worldgen.get()) {
			if (types.contains(BiomeDictionary.Type.FOREST))
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, WorldGenRegistry.PEAR.placedFeatureHolder());
			if (types.contains(BiomeDictionary.Type.HILLS))
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, WorldGenRegistry.PEAR.placedFeatureHolder());
			if (types.contains(BiomeDictionary.Type.SPOOKY))
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, WorldGenRegistry.PEAR.placedFeatureHolder());
		}
		//plum
		if (EnableConfig.plum_worldgen.get()) {
			if (types.contains(BiomeDictionary.Type.FOREST))
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, WorldGenRegistry.PLUM.placedFeatureHolder());
			if (types.contains(BiomeDictionary.Type.HILLS))
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, WorldGenRegistry.PLUM.placedFeatureHolder());
			if (types.contains(BiomeDictionary.Type.SPOOKY))
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, WorldGenRegistry.PLUM.placedFeatureHolder());
		}
		//walnut
		if (EnableConfig.walnut_worldgen.get()) {
			if (types.contains(BiomeDictionary.Type.FOREST))
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, WorldGenRegistry.WALNUT.placedFeatureHolder());
			if (types.contains(BiomeDictionary.Type.HILLS))
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, WorldGenRegistry.WALNUT.placedFeatureHolder());
			if (types.contains(BiomeDictionary.Type.SPOOKY))
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, WorldGenRegistry.WALNUT.placedFeatureHolder());
		}
		//spiderweb
		if (EnableConfig.avocado_worldgen.get()) {
			if (types.contains(BiomeDictionary.Type.FOREST))
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, WorldGenRegistry.SPIDERWEB.placedFeatureHolder());
			if (types.contains(BiomeDictionary.Type.HILLS))
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, WorldGenRegistry.SPIDERWEB.placedFeatureHolder());
			if (types.contains(BiomeDictionary.Type.SPOOKY))
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, WorldGenRegistry.SPIDERWEB.placedFeatureHolder());
		}
		//hazelnut
		if (EnableConfig.hazelnut_worldgen.get()) {
			if (types.contains(BiomeDictionary.Type.FOREST))
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, WorldGenRegistry.HAZELNUT.placedFeatureHolder());
			if (types.contains(BiomeDictionary.Type.HILLS))
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, WorldGenRegistry.HAZELNUT.placedFeatureHolder());
			if (types.contains(BiomeDictionary.Type.SPOOKY))
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, WorldGenRegistry.HAZELNUT.placedFeatureHolder());
		}
		//pawpaw
		if (EnableConfig.pawpaw_worldgen.get()) {
			if (types.contains(BiomeDictionary.Type.FOREST))
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, WorldGenRegistry.PAWPAW.placedFeatureHolder());
			if (types.contains(BiomeDictionary.Type.HILLS))
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, WorldGenRegistry.PAWPAW.placedFeatureHolder());
			if (types.contains(BiomeDictionary.Type.SPOOKY))
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, WorldGenRegistry.PAWPAW.placedFeatureHolder());
		}
		//soursop
		if (EnableConfig.soursop_worldgen.get()) {
			if (types.contains(BiomeDictionary.Type.FOREST))
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, WorldGenRegistry.SOURSOP.placedFeatureHolder());
			if (types.contains(BiomeDictionary.Type.HILLS))
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, WorldGenRegistry.SOURSOP.placedFeatureHolder());
			if (types.contains(BiomeDictionary.Type.SPOOKY))
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, WorldGenRegistry.SOURSOP.placedFeatureHolder());
		}
	}
}
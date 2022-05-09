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
			if (types.contains(BiomeDictionary.Type.FOREST)) {
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
						TreeConfiguredFeatures.APPLE_WORLDGEN);
			}
			if (types.contains(BiomeDictionary.Type.HILLS)) {
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
						TreeConfiguredFeatures.APPLE_WORLDGEN);
			}
			if (types.contains(BiomeDictionary.Type.SPOOKY)) {
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
						TreeConfiguredFeatures.APPLE_WORLDGEN);
			}
		}
		//avocado
		if (EnableConfig.avocado_worldgen.get()) {
			if (types.contains(BiomeDictionary.Type.FOREST)) {
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
						TreeConfiguredFeatures.AVOCADO_WORLDGEN);
			}
			if (types.contains(BiomeDictionary.Type.HILLS)) {
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
						TreeConfiguredFeatures.AVOCADO_WORLDGEN);
			}
			if (types.contains(BiomeDictionary.Type.SPOOKY)) {
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
						TreeConfiguredFeatures.AVOCADO_WORLDGEN);
			}
		}
		//candlenut
		if (EnableConfig.candlenut_worldgen.get()) {
			if (types.contains(BiomeDictionary.Type.FOREST)) {
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
						TreeConfiguredFeatures.CANDLENUT_WORLDGEN);
			}
			if (types.contains(BiomeDictionary.Type.HILLS)) {
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
						TreeConfiguredFeatures.CANDLENUT_WORLDGEN);
			}
			if (types.contains(BiomeDictionary.Type.SPOOKY)) {
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
						TreeConfiguredFeatures.CANDLENUT_WORLDGEN);
			}
		}
		//cherry
		if (EnableConfig.cherry_worldgen.get()) {
			if (types.contains(BiomeDictionary.Type.FOREST)) {
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
						TreeConfiguredFeatures.CHERRY_WORLDGEN);
			}
			if (types.contains(BiomeDictionary.Type.HILLS)) {
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
						TreeConfiguredFeatures.CHERRY_WORLDGEN);
			}
			if (types.contains(BiomeDictionary.Type.SPOOKY)) {
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
						TreeConfiguredFeatures.CHERRY_WORLDGEN);
			}
		}
		//chestnut
		if (EnableConfig.chestnut_worldgen.get()) {
			if (types.contains(BiomeDictionary.Type.FOREST)) {
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
						TreeConfiguredFeatures.CHESTNUT_WORLDGEN);
			}
			if (types.contains(BiomeDictionary.Type.HILLS)) {
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
						TreeConfiguredFeatures.CHESTNUT_WORLDGEN);
			}
			if (types.contains(BiomeDictionary.Type.SPOOKY)) {
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
						TreeConfiguredFeatures.CHESTNUT_WORLDGEN);
			}
		}
		//gooseberry
		if (EnableConfig.gooseberry_worldgen.get()) {
			if (types.contains(BiomeDictionary.Type.FOREST)) {
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
						TreeConfiguredFeatures.GOOSEBERRY_WORLDGEN);
			}
			if (types.contains(BiomeDictionary.Type.HILLS)) {
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
						TreeConfiguredFeatures.GOOSEBERRY_WORLDGEN);
			}
			if (types.contains(BiomeDictionary.Type.SPOOKY)) {
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
						TreeConfiguredFeatures.GOOSEBERRY_WORLDGEN);
			}
		}
		//lemon
		if (EnableConfig.lemon_worldgen.get()) {
			if (types.contains(BiomeDictionary.Type.FOREST)) {
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
						TreeConfiguredFeatures.LEMON_WORLDGEN);
			}
			if (types.contains(BiomeDictionary.Type.HILLS)) {
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
						TreeConfiguredFeatures.LEMON_WORLDGEN);
			}
			if (types.contains(BiomeDictionary.Type.SPOOKY)) {
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
						TreeConfiguredFeatures.LEMON_WORLDGEN);
			}
		}
		//nutmeg
		if (EnableConfig.nutmeg_worldgen.get()) {
			if (types.contains(BiomeDictionary.Type.FOREST)) {
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
						TreeConfiguredFeatures.NUTMEG_WORLDGEN);
			}
			if (types.contains(BiomeDictionary.Type.HILLS)) {
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
						TreeConfiguredFeatures.NUTMEG_WORLDGEN);
			}
			if (types.contains(BiomeDictionary.Type.SPOOKY)) {
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
						TreeConfiguredFeatures.NUTMEG_WORLDGEN);
			}
		}
		//orange
		if (EnableConfig.orange_worldgen.get()) {
			if (types.contains(BiomeDictionary.Type.FOREST)) {
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
						TreeConfiguredFeatures.ORANGE_WORLDGEN);
			}
			if (types.contains(BiomeDictionary.Type.HILLS)) {
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
						TreeConfiguredFeatures.ORANGE_WORLDGEN);
			}
			if (types.contains(BiomeDictionary.Type.SPOOKY)) {
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
						TreeConfiguredFeatures.ORANGE_WORLDGEN);
			}
		}
		//peach
		if (EnableConfig.peach_worldgen.get()) {
			if (types.contains(BiomeDictionary.Type.FOREST)) {
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
						TreeConfiguredFeatures.PEACH_WORLDGEN);
			}
			if (types.contains(BiomeDictionary.Type.HILLS)) {
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
						TreeConfiguredFeatures.PEACH_WORLDGEN);
			}
			if (types.contains(BiomeDictionary.Type.SPOOKY)) {
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
						TreeConfiguredFeatures.PEACH_WORLDGEN);
			}
		}
		//pear
		if (EnableConfig.pear_worldgen.get()) {
			if (types.contains(BiomeDictionary.Type.FOREST)) {
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
						TreeConfiguredFeatures.PEAR_WORLDGEN);
			}
			if (types.contains(BiomeDictionary.Type.HILLS)) {
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
						TreeConfiguredFeatures.PEAR_WORLDGEN);
			}
			if (types.contains(BiomeDictionary.Type.SPOOKY)) {
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
						TreeConfiguredFeatures.PEAR_WORLDGEN);
			}
		}
		//plum
		if (EnableConfig.plum_worldgen.get()) {
			if (types.contains(BiomeDictionary.Type.FOREST)) {
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
						TreeConfiguredFeatures.PLUM_WORLDGEN);
			}
			if (types.contains(BiomeDictionary.Type.HILLS)) {
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
						TreeConfiguredFeatures.PLUM_WORLDGEN);
			}
			if (types.contains(BiomeDictionary.Type.SPOOKY)) {
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
						TreeConfiguredFeatures.PLUM_WORLDGEN);
			}
		}
		//walnut
		if (EnableConfig.walnut_worldgen.get()) {
			if (types.contains(BiomeDictionary.Type.FOREST)) {
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
						TreeConfiguredFeatures.WALNUT_WORLDGEN);
			}
			if (types.contains(BiomeDictionary.Type.HILLS)) {
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
						TreeConfiguredFeatures.WALNUT_WORLDGEN);
			}
			if (types.contains(BiomeDictionary.Type.SPOOKY)) {
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
						TreeConfiguredFeatures.WALNUT_WORLDGEN);
			}
		}
		//spiderweb
		if (EnableConfig.avocado_worldgen.get()) {
			if (types.contains(BiomeDictionary.Type.FOREST)) {
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
						TreeConfiguredFeatures.SPIDERWEB_WORLDGEN);
			}
			if (types.contains(BiomeDictionary.Type.HILLS)) {
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
						TreeConfiguredFeatures.SPIDERWEB_WORLDGEN);
			}
			if (types.contains(BiomeDictionary.Type.SPOOKY)) {
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
						TreeConfiguredFeatures.SPIDERWEB_WORLDGEN);
			}
		}
		//hazelnut
		if (EnableConfig.hazelnut_worldgen.get()) {
			if (types.contains(BiomeDictionary.Type.FOREST)) {
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
						TreeConfiguredFeatures.HAZELNUT_WORLDGEN);
			}
			if (types.contains(BiomeDictionary.Type.HILLS)) {
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
						TreeConfiguredFeatures.HAZELNUT_WORLDGEN);
			}
			if (types.contains(BiomeDictionary.Type.SPOOKY)) {
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
						TreeConfiguredFeatures.HAZELNUT_WORLDGEN);
			}
		}
		//pawpaw
		if (EnableConfig.pawpaw_worldgen.get()) {
			if (types.contains(BiomeDictionary.Type.FOREST)) {
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
						TreeConfiguredFeatures.PAWPAW_WORLDGEN);
			}
			if (types.contains(BiomeDictionary.Type.HILLS)) {
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
						TreeConfiguredFeatures.PAWPAW_WORLDGEN);
			}
			if (types.contains(BiomeDictionary.Type.SPOOKY)) {
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
						TreeConfiguredFeatures.PAWPAW_WORLDGEN);
			}
		}
		//soursop
		if (EnableConfig.soursop_worldgen.get()) {
			if (types.contains(BiomeDictionary.Type.FOREST)) {
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
						TreeConfiguredFeatures.SOURSOP_WORLDGEN);
			}
			if (types.contains(BiomeDictionary.Type.HILLS)) {
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
						TreeConfiguredFeatures.SOURSOP_WORLDGEN);
			}
			if (types.contains(BiomeDictionary.Type.SPOOKY)) {
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
						TreeConfiguredFeatures.SOURSOP_WORLDGEN);
			}
		}


	}

}

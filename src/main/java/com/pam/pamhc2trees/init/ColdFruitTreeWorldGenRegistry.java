package com.pam.pamhc2trees.init;

import java.util.Set;

import net.minecraft.resources.ResourceKey;
import net.minecraft.core.Registry;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.event.world.BiomeLoadingEvent;

public class ColdFruitTreeWorldGenRegistry {

	public static void addToBiomes(BiomeLoadingEvent evt) {
		Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(ResourceKey.create(Registry.BIOME_REGISTRY, evt.getName()));
		//maple
		if (WorldGenRegistry.maple_worldgen != null) {
			if (types.contains(BiomeDictionary.Type.CONIFEROUS)) {
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
						TreeConfiguredFeatures.MAPLE_WORLDGEN);
			}
			if (types.contains(BiomeDictionary.Type.COLD)) {
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
						TreeConfiguredFeatures.MAPLE_WORLDGEN);
			}
			if (types.contains(BiomeDictionary.Type.HILLS) && types.contains(BiomeDictionary.Type.COLD)) {
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
						TreeConfiguredFeatures.MAPLE_WORLDGEN);
			}
		}
		//pinenut
		if (WorldGenRegistry.pinenut_worldgen != null) {
			if (types.contains(BiomeDictionary.Type.CONIFEROUS)) {
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
						TreeConfiguredFeatures.PINENUT_WORLDGEN);

			}
			if (types.contains(BiomeDictionary.Type.COLD)) {
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
						TreeConfiguredFeatures.PINENUT_WORLDGEN);
			}
			if (types.contains(BiomeDictionary.Type.HILLS) && types.contains(BiomeDictionary.Type.COLD)) {
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
						TreeConfiguredFeatures.PINENUT_WORLDGEN);
			}
		}
	}
}

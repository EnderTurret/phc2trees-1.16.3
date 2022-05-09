package com.pam.pamhc2trees.init;

import java.util.Set;

import com.pam.pamhc2trees.config.EnableConfig;

import net.minecraft.resources.ResourceKey;
import net.minecraft.core.Registry;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.event.world.BiomeLoadingEvent;

public class WarmFruitTreeWorldGenRegistry {

	public static void addToBiomes(BiomeLoadingEvent evt) {
		Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(ResourceKey.create(Registry.BIOME_REGISTRY, evt.getName()));
		//almond
		if (EnableConfig.almond_worldgen.get()) {
			if (types.contains(BiomeDictionary.Type.JUNGLE)) {
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
						TreeConfiguredFeatures.ALMOND_WORLDGEN);
			}
			if (types.contains(BiomeDictionary.Type.OCEAN)) {
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
						TreeConfiguredFeatures.ALMOND_WORLDGEN);
			}
			if (types.contains(BiomeDictionary.Type.SWAMP)) {
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
						TreeConfiguredFeatures.ALMOND_WORLDGEN);
			}
		}
		//apricot
		if (EnableConfig.apricot_worldgen.get()) {
			if (types.contains(BiomeDictionary.Type.JUNGLE)) {
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
						TreeConfiguredFeatures.APRICOT_WORLDGEN);
			}
			if (types.contains(BiomeDictionary.Type.OCEAN)) {
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
						TreeConfiguredFeatures.APRICOT_WORLDGEN);
			}
			if (types.contains(BiomeDictionary.Type.SWAMP)) {
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
						TreeConfiguredFeatures.APRICOT_WORLDGEN);
			}
		}

		//banana
		if (EnableConfig.banana_worldgen.get()) {
			if (types.contains(BiomeDictionary.Type.JUNGLE)) {
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
						TreeConfiguredFeatures.BANANA_WORLDGEN);
			}
			if (types.contains(BiomeDictionary.Type.OCEAN)) {
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
						TreeConfiguredFeatures.BANANA_WORLDGEN);
			}
			if (types.contains(BiomeDictionary.Type.SWAMP)) {
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
						TreeConfiguredFeatures.BANANA_WORLDGEN);
			}
		}
		//cashew
		if (EnableConfig.cashew_worldgen.get()) {
			if (types.contains(BiomeDictionary.Type.JUNGLE)) {
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
						TreeConfiguredFeatures.CASHEW_WORLDGEN);
			}
			if (types.contains(BiomeDictionary.Type.OCEAN)) {
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
						TreeConfiguredFeatures.CASHEW_WORLDGEN);
			}
			if (types.contains(BiomeDictionary.Type.SWAMP)) {
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
						TreeConfiguredFeatures.CASHEW_WORLDGEN);
			}
		}
		//cinnamon
		if (EnableConfig.cinnamon_worldgen.get()) {
			if (types.contains(BiomeDictionary.Type.JUNGLE)) {
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
						TreeConfiguredFeatures.CINNAMON_WORLDGEN);
			}
			if (types.contains(BiomeDictionary.Type.OCEAN)) {
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
						TreeConfiguredFeatures.CINNAMON_WORLDGEN);
			}
			if (types.contains(BiomeDictionary.Type.SWAMP)) {
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
						TreeConfiguredFeatures.CINNAMON_WORLDGEN);
			}
		}
		//coconut
		if (EnableConfig.coconut_worldgen.get()) {
			if (types.contains(BiomeDictionary.Type.JUNGLE)) {
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
						TreeConfiguredFeatures.COCONUT_WORLDGEN);
			}
			if (types.contains(BiomeDictionary.Type.OCEAN)) {
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
						TreeConfiguredFeatures.COCONUT_WORLDGEN);
			}
			if (types.contains(BiomeDictionary.Type.SWAMP)) {
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
						TreeConfiguredFeatures.COCONUT_WORLDGEN);
			}
		}
		//date
		if (EnableConfig.date_worldgen.get()) {
			if (types.contains(BiomeDictionary.Type.JUNGLE)) {
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
						TreeConfiguredFeatures.DATE_WORLDGEN);
			}
			if (types.contains(BiomeDictionary.Type.OCEAN)) {
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
						TreeConfiguredFeatures.DATE_WORLDGEN);
			}
			if (types.contains(BiomeDictionary.Type.SWAMP)) {
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
						TreeConfiguredFeatures.DATE_WORLDGEN);
			}
		}
		//dragonfruit
		if (EnableConfig.dragonfruit_worldgen.get()) {
			if (types.contains(BiomeDictionary.Type.JUNGLE)) {
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
						TreeConfiguredFeatures.DRAGONFRUIT_WORLDGEN);
			}
			if (types.contains(BiomeDictionary.Type.OCEAN)) {
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
						TreeConfiguredFeatures.DRAGONFRUIT_WORLDGEN);
			}
			if (types.contains(BiomeDictionary.Type.SWAMP)) {
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
						TreeConfiguredFeatures.DRAGONFRUIT_WORLDGEN);
			}
		}
		//durian
		if (EnableConfig.durian_worldgen.get()) {
			if (types.contains(BiomeDictionary.Type.JUNGLE)) {
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
						TreeConfiguredFeatures.DURIAN_WORLDGEN);
			}
			if (types.contains(BiomeDictionary.Type.OCEAN)) {
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
						TreeConfiguredFeatures.DURIAN_WORLDGEN);
			}
			if (types.contains(BiomeDictionary.Type.SWAMP)) {
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
						TreeConfiguredFeatures.DURIAN_WORLDGEN);
			}
		}
		//fig
		if (EnableConfig.fig_worldgen.get()) {
			if (types.contains(BiomeDictionary.Type.JUNGLE)) {
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
						TreeConfiguredFeatures.FIG_WORLDGEN);
			}
			if (types.contains(BiomeDictionary.Type.OCEAN)) {
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
						TreeConfiguredFeatures.FIG_WORLDGEN);
			}
			if (types.contains(BiomeDictionary.Type.SWAMP)) {
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
						TreeConfiguredFeatures.FIG_WORLDGEN);
			}
		}
		//grapefruit
		if (EnableConfig.grapefruit_worldgen.get()) {
			if (types.contains(BiomeDictionary.Type.JUNGLE)) {
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
						TreeConfiguredFeatures.GRAPEFRUIT_WORLDGEN);
			}
			if (types.contains(BiomeDictionary.Type.OCEAN)) {
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
						TreeConfiguredFeatures.GRAPEFRUIT_WORLDGEN);
			}
			if (types.contains(BiomeDictionary.Type.SWAMP)) {
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
						TreeConfiguredFeatures.GRAPEFRUIT_WORLDGEN);
			}
		}
		//lime
		if (EnableConfig.lime_worldgen.get()) {
			if (types.contains(BiomeDictionary.Type.JUNGLE)) {
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
						TreeConfiguredFeatures.LIME_WORLDGEN);
			}
			if (types.contains(BiomeDictionary.Type.OCEAN)) {
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
						TreeConfiguredFeatures.LIME_WORLDGEN);
			}
			if (types.contains(BiomeDictionary.Type.SWAMP)) {
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
						TreeConfiguredFeatures.LIME_WORLDGEN);
			}
		}
		//mango
		if (EnableConfig.mango_worldgen.get()) {
			if (types.contains(BiomeDictionary.Type.JUNGLE)) {
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
						TreeConfiguredFeatures.MANGO_WORLDGEN);
			}
			if (types.contains(BiomeDictionary.Type.OCEAN)) {
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
						TreeConfiguredFeatures.MANGO_WORLDGEN);
			}
			if (types.contains(BiomeDictionary.Type.SWAMP)) {
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
						TreeConfiguredFeatures.MANGO_WORLDGEN);
			}
		}
		//olive
		if (EnableConfig.olive_worldgen.get()) {
			if (types.contains(BiomeDictionary.Type.JUNGLE)) {
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
						TreeConfiguredFeatures.OLIVE_WORLDGEN);
			}
			if (types.contains(BiomeDictionary.Type.OCEAN)) {
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
						TreeConfiguredFeatures.OLIVE_WORLDGEN);
			}
			if (types.contains(BiomeDictionary.Type.SWAMP)) {
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
						TreeConfiguredFeatures.OLIVE_WORLDGEN);
			}
		}
		//papaya
		if (EnableConfig.papaya_worldgen.get()) {
			if (types.contains(BiomeDictionary.Type.JUNGLE)) {
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
						TreeConfiguredFeatures.PAPAYA_WORLDGEN);
			}
			if (types.contains(BiomeDictionary.Type.OCEAN)) {
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
						TreeConfiguredFeatures.PAPAYA_WORLDGEN);
			}
			if (types.contains(BiomeDictionary.Type.SWAMP)) {
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
						TreeConfiguredFeatures.PAPAYA_WORLDGEN);
			}
		}
		//paperbark
		if (EnableConfig.paperbark_worldgen.get()) {
			if (types.contains(BiomeDictionary.Type.JUNGLE)) {
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
						TreeConfiguredFeatures.PAPERBARK_WORLDGEN);
			}
			if (types.contains(BiomeDictionary.Type.OCEAN)) {
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
						TreeConfiguredFeatures.PAPERBARK_WORLDGEN);
			}
			if (types.contains(BiomeDictionary.Type.SWAMP)) {
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
						TreeConfiguredFeatures.PAPERBARK_WORLDGEN);
			}
		}
		//pecan
		if (EnableConfig.pecan_worldgen.get()) {
			if (types.contains(BiomeDictionary.Type.JUNGLE)) {
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
						TreeConfiguredFeatures.PECAN_WORLDGEN);
			}
			if (types.contains(BiomeDictionary.Type.OCEAN)) {
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
						TreeConfiguredFeatures.PECAN_WORLDGEN);
			}
			if (types.contains(BiomeDictionary.Type.SWAMP)) {
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
						TreeConfiguredFeatures.PECAN_WORLDGEN);
			}
		}
		//peppercorn
		if (EnableConfig.peppercorn_worldgen.get()) {
			if (types.contains(BiomeDictionary.Type.JUNGLE)) {
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
						TreeConfiguredFeatures.PEPPERCORN_WORLDGEN);
			}
			if (types.contains(BiomeDictionary.Type.OCEAN)) {
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
						TreeConfiguredFeatures.PEPPERCORN_WORLDGEN);
			}
			if (types.contains(BiomeDictionary.Type.SWAMP)) {
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
						TreeConfiguredFeatures.PEPPERCORN_WORLDGEN);
			}
		}
		//persimmon
		if (EnableConfig.persimmon_worldgen.get()) {
			if (types.contains(BiomeDictionary.Type.JUNGLE)) {
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
						TreeConfiguredFeatures.PERSIMMON_WORLDGEN);
			}
			if (types.contains(BiomeDictionary.Type.OCEAN)) {
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
						TreeConfiguredFeatures.PERSIMMON_WORLDGEN);
			}
			if (types.contains(BiomeDictionary.Type.SWAMP)) {
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
						TreeConfiguredFeatures.PERSIMMON_WORLDGEN);
			}
		}
		//pistachio
		if (EnableConfig.pistachio_worldgen.get()) {
			if (types.contains(BiomeDictionary.Type.JUNGLE)) {
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
						TreeConfiguredFeatures.PISTACHIO_WORLDGEN);
			}
			if (types.contains(BiomeDictionary.Type.OCEAN)) {
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
						TreeConfiguredFeatures.PISTACHIO_WORLDGEN);
			}
			if (types.contains(BiomeDictionary.Type.SWAMP)) {
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
						TreeConfiguredFeatures.PISTACHIO_WORLDGEN);
			}
		}
		//pomegranate
		if (EnableConfig.pomegranate_worldgen.get()) {
			if (types.contains(BiomeDictionary.Type.JUNGLE)) {
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
						TreeConfiguredFeatures.POMEGRANATE_WORLDGEN);
			}
			if (types.contains(BiomeDictionary.Type.OCEAN)) {
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
						TreeConfiguredFeatures.POMEGRANATE_WORLDGEN);
			}
			if (types.contains(BiomeDictionary.Type.SWAMP)) {
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
						TreeConfiguredFeatures.POMEGRANATE_WORLDGEN);
			}
		}
		//starfruit
		if (EnableConfig.starfruit_worldgen.get()) {
			if (types.contains(BiomeDictionary.Type.JUNGLE)) {
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
						TreeConfiguredFeatures.STARFRUIT_WORLDGEN);
			}
			if (types.contains(BiomeDictionary.Type.OCEAN)) {
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
						TreeConfiguredFeatures.STARFRUIT_WORLDGEN);
			}
			if (types.contains(BiomeDictionary.Type.SWAMP)) {
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
						TreeConfiguredFeatures.STARFRUIT_WORLDGEN);
			}
		}
		//vanillabean
		if (EnableConfig.vanillabean_worldgen.get()) {
			if (types.contains(BiomeDictionary.Type.JUNGLE)) {
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
						TreeConfiguredFeatures.VANILLABEAN_WORLDGEN);
			}
			if (types.contains(BiomeDictionary.Type.OCEAN)) {
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
						TreeConfiguredFeatures.VANILLABEAN_WORLDGEN);
			}
			if (types.contains(BiomeDictionary.Type.SWAMP)) {
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
						TreeConfiguredFeatures.VANILLABEAN_WORLDGEN);
			}
		}
		//breadfruit
		if (EnableConfig.breadfruit_worldgen.get()) {
			if (types.contains(BiomeDictionary.Type.JUNGLE)) {
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
						TreeConfiguredFeatures.BREADFRUIT_WORLDGEN);
			}
			if (types.contains(BiomeDictionary.Type.OCEAN)) {
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
						TreeConfiguredFeatures.BREADFRUIT_WORLDGEN);
			}
			if (types.contains(BiomeDictionary.Type.SWAMP)) {
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
						TreeConfiguredFeatures.BREADFRUIT_WORLDGEN);
			}
		}
		//guava
		if (EnableConfig.guava_worldgen.get()) {
			if (types.contains(BiomeDictionary.Type.JUNGLE)) {
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
						TreeConfiguredFeatures.GUAVA_WORLDGEN);
			}
			if (types.contains(BiomeDictionary.Type.OCEAN)) {
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
						TreeConfiguredFeatures.GUAVA_WORLDGEN);
			}
			if (types.contains(BiomeDictionary.Type.SWAMP)) {
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
						TreeConfiguredFeatures.GUAVA_WORLDGEN);
			}
		}
		//jackfruit
		if (EnableConfig.jackfruit_worldgen.get()) {
			if (types.contains(BiomeDictionary.Type.JUNGLE)) {
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
						TreeConfiguredFeatures.JACKFRUIT_WORLDGEN);
			}
			if (types.contains(BiomeDictionary.Type.OCEAN)) {
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
						TreeConfiguredFeatures.JACKFRUIT_WORLDGEN);
			}
			if (types.contains(BiomeDictionary.Type.SWAMP)) {
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
						TreeConfiguredFeatures.JACKFRUIT_WORLDGEN);
			}
		}
		//lychee
		if (EnableConfig.lychee_worldgen.get()) {
			if (types.contains(BiomeDictionary.Type.JUNGLE)) {
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
						TreeConfiguredFeatures.LYCHEE_WORLDGEN);
			}
			if (types.contains(BiomeDictionary.Type.OCEAN)) {
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
						TreeConfiguredFeatures.LYCHEE_WORLDGEN);
			}
			if (types.contains(BiomeDictionary.Type.SWAMP)) {
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
						TreeConfiguredFeatures.LYCHEE_WORLDGEN);
			}
		}
		//passionfruit
		if (EnableConfig.passionfruit_worldgen.get()) {
			if (types.contains(BiomeDictionary.Type.JUNGLE)) {
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
						TreeConfiguredFeatures.PASSIONFRUIT_WORLDGEN);
			}
			if (types.contains(BiomeDictionary.Type.OCEAN)) {
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
						TreeConfiguredFeatures.PASSIONFRUIT_WORLDGEN);
			}
			if (types.contains(BiomeDictionary.Type.SWAMP)) {
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
						TreeConfiguredFeatures.PASSIONFRUIT_WORLDGEN);
			}
		}
		//rambutan
		if (EnableConfig.rambutan_worldgen.get()) {
			if (types.contains(BiomeDictionary.Type.JUNGLE)) {
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
						TreeConfiguredFeatures.RAMBUTAN_WORLDGEN);
			}
			if (types.contains(BiomeDictionary.Type.OCEAN)) {
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
						TreeConfiguredFeatures.RAMBUTAN_WORLDGEN);
			}
			if (types.contains(BiomeDictionary.Type.SWAMP)) {
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
						TreeConfiguredFeatures.RAMBUTAN_WORLDGEN);
			}
		}
		//tamarind
		if (EnableConfig.tamarind_worldgen.get()) {
			if (types.contains(BiomeDictionary.Type.JUNGLE)) {
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
						TreeConfiguredFeatures.TAMARIND_WORLDGEN);
			}
			if (types.contains(BiomeDictionary.Type.OCEAN)) {
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
						TreeConfiguredFeatures.TAMARIND_WORLDGEN);
			}
			if (types.contains(BiomeDictionary.Type.SWAMP)) {
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
						TreeConfiguredFeatures.TAMARIND_WORLDGEN);
			}
		}
	}
}
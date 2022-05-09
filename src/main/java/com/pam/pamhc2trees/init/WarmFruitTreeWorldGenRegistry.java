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
			if (types.contains(BiomeDictionary.Type.JUNGLE))
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, WorldGenRegistry.ALMOND.placedFeatureHolder());
			if (types.contains(BiomeDictionary.Type.OCEAN))
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, WorldGenRegistry.ALMOND.placedFeatureHolder());
			if (types.contains(BiomeDictionary.Type.SWAMP))
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, WorldGenRegistry.ALMOND.placedFeatureHolder());
		}
		//apricot
		if (EnableConfig.apricot_worldgen.get()) {
			if (types.contains(BiomeDictionary.Type.JUNGLE))
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, WorldGenRegistry.APRICOT.placedFeatureHolder());
			if (types.contains(BiomeDictionary.Type.OCEAN))
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, WorldGenRegistry.APRICOT.placedFeatureHolder());
			if (types.contains(BiomeDictionary.Type.SWAMP))
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, WorldGenRegistry.APRICOT.placedFeatureHolder());
		}

		//banana
		if (EnableConfig.banana_worldgen.get()) {
			if (types.contains(BiomeDictionary.Type.JUNGLE))
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, WorldGenRegistry.BANANA.placedFeatureHolder());
			if (types.contains(BiomeDictionary.Type.OCEAN))
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, WorldGenRegistry.BANANA.placedFeatureHolder());
			if (types.contains(BiomeDictionary.Type.SWAMP))
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, WorldGenRegistry.BANANA.placedFeatureHolder());
		}
		//cashew
		if (EnableConfig.cashew_worldgen.get()) {
			if (types.contains(BiomeDictionary.Type.JUNGLE))
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, WorldGenRegistry.CASHEW.placedFeatureHolder());
			if (types.contains(BiomeDictionary.Type.OCEAN))
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, WorldGenRegistry.CASHEW.placedFeatureHolder());
			if (types.contains(BiomeDictionary.Type.SWAMP))
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, WorldGenRegistry.CASHEW.placedFeatureHolder());
		}
		//cinnamon
		if (EnableConfig.cinnamon_worldgen.get()) {
			if (types.contains(BiomeDictionary.Type.JUNGLE))
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, WorldGenRegistry.CINNAMON.placedFeatureHolder());
			if (types.contains(BiomeDictionary.Type.OCEAN))
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, WorldGenRegistry.CINNAMON.placedFeatureHolder());
			if (types.contains(BiomeDictionary.Type.SWAMP))
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, WorldGenRegistry.CINNAMON.placedFeatureHolder());
		}
		//coconut
		if (EnableConfig.coconut_worldgen.get()) {
			if (types.contains(BiomeDictionary.Type.JUNGLE))
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, WorldGenRegistry.COCONUT.placedFeatureHolder());
			if (types.contains(BiomeDictionary.Type.OCEAN))
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, WorldGenRegistry.COCONUT.placedFeatureHolder());
			if (types.contains(BiomeDictionary.Type.SWAMP))
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, WorldGenRegistry.COCONUT.placedFeatureHolder());
		}
		//date
		if (EnableConfig.date_worldgen.get()) {
			if (types.contains(BiomeDictionary.Type.JUNGLE))
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, WorldGenRegistry.DATE.placedFeatureHolder());
			if (types.contains(BiomeDictionary.Type.OCEAN))
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, WorldGenRegistry.DATE.placedFeatureHolder());
			if (types.contains(BiomeDictionary.Type.SWAMP))
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, WorldGenRegistry.DATE.placedFeatureHolder());
		}
		//dragonfruit
		if (EnableConfig.dragonfruit_worldgen.get()) {
			if (types.contains(BiomeDictionary.Type.JUNGLE))
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, WorldGenRegistry.DRAGONFRUIT.placedFeatureHolder());
			if (types.contains(BiomeDictionary.Type.OCEAN))
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, WorldGenRegistry.DRAGONFRUIT.placedFeatureHolder());
			if (types.contains(BiomeDictionary.Type.SWAMP))
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, WorldGenRegistry.DRAGONFRUIT.placedFeatureHolder());
		}
		//durian
		if (EnableConfig.durian_worldgen.get()) {
			if (types.contains(BiomeDictionary.Type.JUNGLE))
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, WorldGenRegistry.DURIAN.placedFeatureHolder());
			if (types.contains(BiomeDictionary.Type.OCEAN))
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, WorldGenRegistry.DURIAN.placedFeatureHolder());
			if (types.contains(BiomeDictionary.Type.SWAMP))
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, WorldGenRegistry.DURIAN.placedFeatureHolder());
		}
		//fig
		if (EnableConfig.fig_worldgen.get()) {
			if (types.contains(BiomeDictionary.Type.JUNGLE))
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, WorldGenRegistry.FIG.placedFeatureHolder());
			if (types.contains(BiomeDictionary.Type.OCEAN))
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, WorldGenRegistry.FIG.placedFeatureHolder());
			if (types.contains(BiomeDictionary.Type.SWAMP))
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, WorldGenRegistry.FIG.placedFeatureHolder());
		}
		//grapefruit
		if (EnableConfig.grapefruit_worldgen.get()) {
			if (types.contains(BiomeDictionary.Type.JUNGLE))
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, WorldGenRegistry.GRAPEFRUIT.placedFeatureHolder());
			if (types.contains(BiomeDictionary.Type.OCEAN))
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, WorldGenRegistry.GRAPEFRUIT.placedFeatureHolder());
			if (types.contains(BiomeDictionary.Type.SWAMP))
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, WorldGenRegistry.GRAPEFRUIT.placedFeatureHolder());
		}
		//lime
		if (EnableConfig.lime_worldgen.get()) {
			if (types.contains(BiomeDictionary.Type.JUNGLE))
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, WorldGenRegistry.LIME.placedFeatureHolder());
			if (types.contains(BiomeDictionary.Type.OCEAN))
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, WorldGenRegistry.LIME.placedFeatureHolder());
			if (types.contains(BiomeDictionary.Type.SWAMP))
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, WorldGenRegistry.LIME.placedFeatureHolder());
		}
		//mango
		if (EnableConfig.mango_worldgen.get()) {
			if (types.contains(BiomeDictionary.Type.JUNGLE))
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, WorldGenRegistry.MANGO.placedFeatureHolder());
			if (types.contains(BiomeDictionary.Type.OCEAN))
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, WorldGenRegistry.MANGO.placedFeatureHolder());
			if (types.contains(BiomeDictionary.Type.SWAMP))
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, WorldGenRegistry.MANGO.placedFeatureHolder());
		}
		//olive
		if (EnableConfig.olive_worldgen.get()) {
			if (types.contains(BiomeDictionary.Type.JUNGLE))
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, WorldGenRegistry.OLIVE.placedFeatureHolder());
			if (types.contains(BiomeDictionary.Type.OCEAN))
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, WorldGenRegistry.OLIVE.placedFeatureHolder());
			if (types.contains(BiomeDictionary.Type.SWAMP))
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, WorldGenRegistry.OLIVE.placedFeatureHolder());
		}
		//papaya
		if (EnableConfig.papaya_worldgen.get()) {
			if (types.contains(BiomeDictionary.Type.JUNGLE))
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, WorldGenRegistry.PAPAYA.placedFeatureHolder());
			if (types.contains(BiomeDictionary.Type.OCEAN))
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, WorldGenRegistry.PAPAYA.placedFeatureHolder());
			if (types.contains(BiomeDictionary.Type.SWAMP))
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, WorldGenRegistry.PAPAYA.placedFeatureHolder());
		}
		//paperbark
		if (EnableConfig.paperbark_worldgen.get()) {
			if (types.contains(BiomeDictionary.Type.JUNGLE))
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, WorldGenRegistry.PAPERBARK.placedFeatureHolder());
			if (types.contains(BiomeDictionary.Type.OCEAN))
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, WorldGenRegistry.PAPERBARK.placedFeatureHolder());
			if (types.contains(BiomeDictionary.Type.SWAMP))
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, WorldGenRegistry.PAPERBARK.placedFeatureHolder());
		}
		//pecan
		if (EnableConfig.pecan_worldgen.get()) {
			if (types.contains(BiomeDictionary.Type.JUNGLE))
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, WorldGenRegistry.PECAN.placedFeatureHolder());
			if (types.contains(BiomeDictionary.Type.OCEAN))
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, WorldGenRegistry.PECAN.placedFeatureHolder());
			if (types.contains(BiomeDictionary.Type.SWAMP))
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, WorldGenRegistry.PECAN.placedFeatureHolder());
		}
		//peppercorn
		if (EnableConfig.peppercorn_worldgen.get()) {
			if (types.contains(BiomeDictionary.Type.JUNGLE))
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, WorldGenRegistry.PEPPERCORN.placedFeatureHolder());
			if (types.contains(BiomeDictionary.Type.OCEAN))
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, WorldGenRegistry.PEPPERCORN.placedFeatureHolder());
			if (types.contains(BiomeDictionary.Type.SWAMP))
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, WorldGenRegistry.PEPPERCORN.placedFeatureHolder());
		}
		//persimmon
		if (EnableConfig.persimmon_worldgen.get()) {
			if (types.contains(BiomeDictionary.Type.JUNGLE))
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, WorldGenRegistry.PERSIMMON.placedFeatureHolder());
			if (types.contains(BiomeDictionary.Type.OCEAN))
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, WorldGenRegistry.PERSIMMON.placedFeatureHolder());
			if (types.contains(BiomeDictionary.Type.SWAMP))
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, WorldGenRegistry.PERSIMMON.placedFeatureHolder());
		}
		//pistachio
		if (EnableConfig.pistachio_worldgen.get()) {
			if (types.contains(BiomeDictionary.Type.JUNGLE))
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, WorldGenRegistry.PISTACHIO.placedFeatureHolder());
			if (types.contains(BiomeDictionary.Type.OCEAN))
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, WorldGenRegistry.PISTACHIO.placedFeatureHolder());
			if (types.contains(BiomeDictionary.Type.SWAMP))
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, WorldGenRegistry.PISTACHIO.placedFeatureHolder());
		}
		//pomegranate
		if (EnableConfig.pomegranate_worldgen.get()) {
			if (types.contains(BiomeDictionary.Type.JUNGLE))
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, WorldGenRegistry.POMEGRANATE.placedFeatureHolder());
			if (types.contains(BiomeDictionary.Type.OCEAN))
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, WorldGenRegistry.POMEGRANATE.placedFeatureHolder());
			if (types.contains(BiomeDictionary.Type.SWAMP))
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, WorldGenRegistry.POMEGRANATE.placedFeatureHolder());
		}
		//starfruit
		if (EnableConfig.starfruit_worldgen.get()) {
			if (types.contains(BiomeDictionary.Type.JUNGLE))
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, WorldGenRegistry.STARFRUIT.placedFeatureHolder());
			if (types.contains(BiomeDictionary.Type.OCEAN))
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, WorldGenRegistry.STARFRUIT.placedFeatureHolder());
			if (types.contains(BiomeDictionary.Type.SWAMP))
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, WorldGenRegistry.STARFRUIT.placedFeatureHolder());
		}
		//vanillabean
		if (EnableConfig.vanillabean_worldgen.get()) {
			if (types.contains(BiomeDictionary.Type.JUNGLE))
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, WorldGenRegistry.VANILLABEAN.placedFeatureHolder());
			if (types.contains(BiomeDictionary.Type.OCEAN))
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, WorldGenRegistry.VANILLABEAN.placedFeatureHolder());
			if (types.contains(BiomeDictionary.Type.SWAMP))
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, WorldGenRegistry.VANILLABEAN.placedFeatureHolder());
		}
		//breadfruit
		if (EnableConfig.breadfruit_worldgen.get()) {
			if (types.contains(BiomeDictionary.Type.JUNGLE))
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, WorldGenRegistry.BREADFRUIT.placedFeatureHolder());
			if (types.contains(BiomeDictionary.Type.OCEAN))
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, WorldGenRegistry.BREADFRUIT.placedFeatureHolder());
			if (types.contains(BiomeDictionary.Type.SWAMP))
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, WorldGenRegistry.BREADFRUIT.placedFeatureHolder());
		}
		//guava
		if (EnableConfig.guava_worldgen.get()) {
			if (types.contains(BiomeDictionary.Type.JUNGLE))
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, WorldGenRegistry.GUAVA.placedFeatureHolder());
			if (types.contains(BiomeDictionary.Type.OCEAN))
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, WorldGenRegistry.GUAVA.placedFeatureHolder());
			if (types.contains(BiomeDictionary.Type.SWAMP))
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, WorldGenRegistry.GUAVA.placedFeatureHolder());
		}
		//jackfruit
		if (EnableConfig.jackfruit_worldgen.get()) {
			if (types.contains(BiomeDictionary.Type.JUNGLE))
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, WorldGenRegistry.JACKFRUIT.placedFeatureHolder());
			if (types.contains(BiomeDictionary.Type.OCEAN))
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, WorldGenRegistry.JACKFRUIT.placedFeatureHolder());
			if (types.contains(BiomeDictionary.Type.SWAMP))
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, WorldGenRegistry.JACKFRUIT.placedFeatureHolder());
		}
		//lychee
		if (EnableConfig.lychee_worldgen.get()) {
			if (types.contains(BiomeDictionary.Type.JUNGLE))
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, WorldGenRegistry.LYCHEE.placedFeatureHolder());
			if (types.contains(BiomeDictionary.Type.OCEAN))
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, WorldGenRegistry.LYCHEE.placedFeatureHolder());
			if (types.contains(BiomeDictionary.Type.SWAMP))
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, WorldGenRegistry.LYCHEE.placedFeatureHolder());
		}
		//passionfruit
		if (EnableConfig.passionfruit_worldgen.get()) {
			if (types.contains(BiomeDictionary.Type.JUNGLE))
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, WorldGenRegistry.PASSIONFRUIT.placedFeatureHolder());
			if (types.contains(BiomeDictionary.Type.OCEAN))
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, WorldGenRegistry.PASSIONFRUIT.placedFeatureHolder());
			if (types.contains(BiomeDictionary.Type.SWAMP))
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, WorldGenRegistry.PASSIONFRUIT.placedFeatureHolder());
		}
		//rambutan
		if (EnableConfig.rambutan_worldgen.get()) {
			if (types.contains(BiomeDictionary.Type.JUNGLE))
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, WorldGenRegistry.RAMBUTAN.placedFeatureHolder());
			if (types.contains(BiomeDictionary.Type.OCEAN))
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, WorldGenRegistry.RAMBUTAN.placedFeatureHolder());
			if (types.contains(BiomeDictionary.Type.SWAMP))
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, WorldGenRegistry.RAMBUTAN.placedFeatureHolder());
		}
		//tamarind
		if (EnableConfig.tamarind_worldgen.get()) {
			if (types.contains(BiomeDictionary.Type.JUNGLE))
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, WorldGenRegistry.TAMARIND.placedFeatureHolder());
			if (types.contains(BiomeDictionary.Type.OCEAN))
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, WorldGenRegistry.TAMARIND.placedFeatureHolder());
			if (types.contains(BiomeDictionary.Type.SWAMP))
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, WorldGenRegistry.TAMARIND.placedFeatureHolder());
		}
	}
}
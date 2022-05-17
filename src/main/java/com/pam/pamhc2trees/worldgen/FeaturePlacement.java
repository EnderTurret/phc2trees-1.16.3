package com.pam.pamhc2trees.worldgen;

import static net.minecraftforge.common.BiomeDictionary.Type.*;

import java.util.Set;

import com.pam.pamhc2trees.config.EnableConfig;
import com.pam.pamhc2trees.init.WorldGenRegistry;
import com.pam.pamhc2trees.util.FeatureHolder;

import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.levelgen.GenerationStep.Decoration;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.event.world.BiomeLoadingEvent;

public class FeaturePlacement {

	public static void addTrees(BiomeLoadingEvent event) {
		Context ctx = Context.from(event);
		addCold(ctx);
		addTemperate(ctx);
		addWarm(ctx);
	}

	private static void addCold(Context ctx) {
		//maple
		if (EnableConfig.maple_worldgen.get())
			ctx.addIf(WorldGenRegistry.MAPLE, ctx.has(CONIFEROUS) || ctx.has(COLD) || ctx.hasAll(HILLS, COLD));
		//pinenut
		if (EnableConfig.pinenut_worldgen.get())
			ctx.addIf(WorldGenRegistry.PINENUT, ctx.has(CONIFEROUS) || ctx.has(COLD) || ctx.hasAll(HILLS, COLD));
	}

	private static void addTemperate(Context ctx) {
		if ((ctx.event().getClimate().temperature >= 1F || ctx.event().getClimate().temperature < 0.2F) && !ctx.has(SPOOKY))
			return;

		if (ctx.hasAny(FOREST, HILLS, SPOOKY)) {
			//apple
			ctx.addIf(WorldGenRegistry.APPLE, EnableConfig.apple_worldgen.get());
			//avocado
			ctx.addIf(WorldGenRegistry.AVOCADO, EnableConfig.avocado_worldgen.get());
			//candlenut
			ctx.addIf(WorldGenRegistry.CANDLENUT, EnableConfig.candlenut_worldgen.get());
			//cherry
			ctx.addIf(WorldGenRegistry.CHERRY, EnableConfig.cherry_worldgen.get());
			//chestnut
			ctx.addIf(WorldGenRegistry.CHESTNUT, EnableConfig.chestnut_worldgen.get());
			//gooseberry
			ctx.addIf(WorldGenRegistry.GOOSEBERRY, EnableConfig.gooseberry_worldgen.get());
			//lemon
			ctx.addIf(WorldGenRegistry.LEMON, EnableConfig.lemon_worldgen.get());
			//nutmeg
			ctx.addIf(WorldGenRegistry.NUTMEG, EnableConfig.nutmeg_worldgen.get());
			//orange
			ctx.addIf(WorldGenRegistry.ORANGE, EnableConfig.orange_worldgen.get());
			//peach
			ctx.addIf(WorldGenRegistry.PEACH, EnableConfig.peach_worldgen.get());
			//pear
			ctx.addIf(WorldGenRegistry.PEAR, EnableConfig.pear_worldgen.get());
			//plum
			ctx.addIf(WorldGenRegistry.PLUM, EnableConfig.plum_worldgen.get());
			//walnut
			ctx.addIf(WorldGenRegistry.WALNUT, EnableConfig.walnut_worldgen.get());
			//spiderweb
			ctx.addIf(WorldGenRegistry.SPIDERWEB, EnableConfig.avocado_worldgen.get());
			//hazelnut
			ctx.addIf(WorldGenRegistry.HAZELNUT, EnableConfig.hazelnut_worldgen.get());
			//pawpaw
			ctx.addIf(WorldGenRegistry.PAWPAW, EnableConfig.pawpaw_worldgen.get());
			//soursop
			ctx.addIf(WorldGenRegistry.SOURSOP, EnableConfig.soursop_worldgen.get());
		}
	}

	private static void addWarm(Context ctx) {
		if (ctx.hasAny(JUNGLE, OCEAN, SWAMP)) {
			//almond
			ctx.addIf(WorldGenRegistry.ALMOND, EnableConfig.almond_worldgen.get());
			//apricot
			ctx.addIf(WorldGenRegistry.APRICOT, EnableConfig.apricot_worldgen.get());
			//banana
			ctx.addIf(WorldGenRegistry.BANANA, EnableConfig.banana_worldgen.get());
			//cashew
			ctx.addIf(WorldGenRegistry.CASHEW, EnableConfig.cashew_worldgen.get());
			//cinnamon
			ctx.addIf(WorldGenRegistry.CINNAMON, EnableConfig.cinnamon_worldgen.get());
			//coconut
			ctx.addIf(WorldGenRegistry.COCONUT, EnableConfig.coconut_worldgen.get());
			//date
			ctx.addIf(WorldGenRegistry.DATE, EnableConfig.date_worldgen.get());
			//dragonfruit
			ctx.addIf(WorldGenRegistry.DRAGONFRUIT, EnableConfig.dragonfruit_worldgen.get());
			//durian
			ctx.addIf(WorldGenRegistry.DURIAN, EnableConfig.durian_worldgen.get());
			//fig
			ctx.addIf(WorldGenRegistry.FIG, EnableConfig.fig_worldgen.get());
			//grapefruit
			ctx.addIf(WorldGenRegistry.GRAPEFRUIT, EnableConfig.grapefruit_worldgen.get());
			//lime
			ctx.addIf(WorldGenRegistry.LIME, EnableConfig.lime_worldgen.get());
			//mango
			ctx.addIf(WorldGenRegistry.MANGO, EnableConfig.mango_worldgen.get());
			//olive
			ctx.addIf(WorldGenRegistry.OLIVE, EnableConfig.olive_worldgen.get());
			//papaya
			ctx.addIf(WorldGenRegistry.PAPAYA, EnableConfig.papaya_worldgen.get());
			//paperbark
			ctx.addIf(WorldGenRegistry.PAPERBARK, EnableConfig.paperbark_worldgen.get());
			//pecan
			ctx.addIf(WorldGenRegistry.PECAN, EnableConfig.pecan_worldgen.get());
			//peppercorn
			ctx.addIf(WorldGenRegistry.PEPPERCORN, EnableConfig.peppercorn_worldgen.get());
			//persimmon
			ctx.addIf(WorldGenRegistry.PERSIMMON, EnableConfig.persimmon_worldgen.get());
			//pistachio
			ctx.addIf(WorldGenRegistry.PISTACHIO, EnableConfig.pistachio_worldgen.get());
			//pomegranate
			ctx.addIf(WorldGenRegistry.POMEGRANATE, EnableConfig.pomegranate_worldgen.get());
			//starfruit
			ctx.addIf(WorldGenRegistry.STARFRUIT, EnableConfig.starfruit_worldgen.get());
			//vanillabean
			ctx.addIf(WorldGenRegistry.VANILLABEAN, EnableConfig.vanillabean_worldgen.get());
			//breadfruit
			ctx.addIf(WorldGenRegistry.BREADFRUIT, EnableConfig.breadfruit_worldgen.get());
			//guava
			ctx.addIf(WorldGenRegistry.GUAVA, EnableConfig.guava_worldgen.get());
			//jackfruit
			ctx.addIf(WorldGenRegistry.JACKFRUIT, EnableConfig.jackfruit_worldgen.get());
			//lychee
			ctx.addIf(WorldGenRegistry.LYCHEE, EnableConfig.lychee_worldgen.get());
			//passionfruit
			ctx.addIf(WorldGenRegistry.PASSIONFRUIT, EnableConfig.passionfruit_worldgen.get());
			//rambutan
			ctx.addIf(WorldGenRegistry.RAMBUTAN, EnableConfig.rambutan_worldgen.get());
			//tamarind
			ctx.addIf(WorldGenRegistry.TAMARIND, EnableConfig.tamarind_worldgen.get());
		}
	}

	private static record Context(Set<BiomeDictionary.Type> types, BiomeLoadingEvent event) {

		public static Context from(BiomeLoadingEvent event) {
			return new Context(BiomeDictionary.getTypes(ResourceKey.create(Registry.BIOME_REGISTRY, event.getName())), event);
		}

		public boolean has(BiomeDictionary.Type type) {
			return types.contains(type);
		}

		public boolean hasAny(BiomeDictionary.Type... types) {
			for (BiomeDictionary.Type type : types)
				if (has(type))
					return true;

			return false;
		}

		public boolean hasAll(BiomeDictionary.Type... types) {
			for (BiomeDictionary.Type type : types)
				if (!has(type))
					return false;

			return true;
		}

		public void add(FeatureHolder<?, ?> feature) {
			event.getGeneration().addFeature(Decoration.VEGETAL_DECORATION, feature.placedFeatureHolder());
		}

		public void addIf(FeatureHolder<?, ?> feature, boolean test) {
			if (test)
				add(feature);
		}
	}
}
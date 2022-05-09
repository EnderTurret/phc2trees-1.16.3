package com.pam.pamhc2trees.init;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

import com.pam.pamhc2trees.Pamhc2trees;
import com.pam.pamhc2trees.config.EnableConfig;
import com.pam.pamhc2trees.util.FeatureHolder;
import com.pam.pamhc2trees.worldgen.ColdFruitTreeFeature;
import com.pam.pamhc2trees.worldgen.ColdLogFruitTreeFeature;
import com.pam.pamhc2trees.worldgen.TemperateFruitTreeFeature;
import com.pam.pamhc2trees.worldgen.WarmFruitTreeFeature;
import com.pam.pamhc2trees.worldgen.WarmLogFruitTreeFeature;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.NoneFeatureConfiguration;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.IForgeRegistry;
import net.minecraftforge.registries.IForgeRegistryEntry;

public class WorldGenRegistry {

	private static final List<FeatureHolder<?, ?>> HOLDERS = new ArrayList<>();

	//Temperate Fruits
	public static final FeatureHolder<TemperateFruitTreeFeature, NoneFeatureConfiguration> APPLE = temperate("apple_worldgen");
	public static final FeatureHolder<TemperateFruitTreeFeature, NoneFeatureConfiguration> AVOCADO = temperate("avocado_worldgen");
	public static final FeatureHolder<TemperateFruitTreeFeature, NoneFeatureConfiguration> CANDLENUT = temperate("candlenut_worldgen");
	public static final FeatureHolder<TemperateFruitTreeFeature, NoneFeatureConfiguration> CHERRY = temperate("cherry_worldgen");
	public static final FeatureHolder<TemperateFruitTreeFeature, NoneFeatureConfiguration> CHESTNUT = temperate("chestnut_worldgen");
	public static final FeatureHolder<TemperateFruitTreeFeature, NoneFeatureConfiguration> GOOSEBERRY = temperate("gooseberry_worldgen");
	public static final FeatureHolder<TemperateFruitTreeFeature, NoneFeatureConfiguration> LEMON = temperate("lemon_worldgen");
	public static final FeatureHolder<TemperateFruitTreeFeature, NoneFeatureConfiguration> NUTMEG = temperate("nutmeg_worldgen");
	public static final FeatureHolder<TemperateFruitTreeFeature, NoneFeatureConfiguration> ORANGE = temperate("orange_worldgen");
	public static final FeatureHolder<TemperateFruitTreeFeature, NoneFeatureConfiguration> PEACH = temperate("peach_worldgen");
	public static final FeatureHolder<TemperateFruitTreeFeature, NoneFeatureConfiguration> PEAR = temperate("pear_worldgen");
	public static final FeatureHolder<TemperateFruitTreeFeature, NoneFeatureConfiguration> PLUM = temperate("plum_worldgen");
	public static final FeatureHolder<TemperateFruitTreeFeature, NoneFeatureConfiguration> WALNUT = temperate("walnut_worldgen");
	public static final FeatureHolder<TemperateFruitTreeFeature, NoneFeatureConfiguration> SPIDERWEB = temperate("spiderweb_worldgen");
	public static final FeatureHolder<TemperateFruitTreeFeature, NoneFeatureConfiguration> HAZELNUT = temperate("hazelnut_worldgen");
	public static final FeatureHolder<TemperateFruitTreeFeature, NoneFeatureConfiguration> PAWPAW = temperate("pawpaw_worldgen");
	public static final FeatureHolder<TemperateFruitTreeFeature, NoneFeatureConfiguration> SOURSOP = temperate("soursop_worldgen");
	//Warm Fruits
	public static final FeatureHolder<WarmFruitTreeFeature, NoneFeatureConfiguration> ALMOND = warm("almond_worldgen");
	public static final FeatureHolder<WarmFruitTreeFeature, NoneFeatureConfiguration> APRICOT = warm("apricot_worldgen");
	public static final FeatureHolder<WarmFruitTreeFeature, NoneFeatureConfiguration> BANANA = warm("banana_worldgen");
	public static final FeatureHolder<WarmFruitTreeFeature, NoneFeatureConfiguration> CASHEW = warm("cashew_worldgen");
	public static final FeatureHolder<WarmLogFruitTreeFeature, NoneFeatureConfiguration> CINNAMON = warmLog("cinnamon_worldgen");
	public static final FeatureHolder<WarmFruitTreeFeature, NoneFeatureConfiguration> COCONUT = warm("coconut_worldgen");
	public static final FeatureHolder<WarmFruitTreeFeature, NoneFeatureConfiguration> DATE = warm("date_worldgen");
	public static final FeatureHolder<WarmFruitTreeFeature, NoneFeatureConfiguration> DRAGONFRUIT = warm("dragonfruit_worldgen");
	public static final FeatureHolder<WarmFruitTreeFeature, NoneFeatureConfiguration> DURIAN = warm("durian_worldgen");
	public static final FeatureHolder<WarmFruitTreeFeature, NoneFeatureConfiguration> FIG = warm("fig_worldgen");
	public static final FeatureHolder<WarmFruitTreeFeature, NoneFeatureConfiguration> GRAPEFRUIT = warm("grapefruit_worldgen");
	public static final FeatureHolder<WarmFruitTreeFeature, NoneFeatureConfiguration> LIME = warm("lime_worldgen");
	public static final FeatureHolder<WarmFruitTreeFeature, NoneFeatureConfiguration> MANGO = warm("mango_worldgen");
	public static final FeatureHolder<WarmFruitTreeFeature, NoneFeatureConfiguration> OLIVE = warm("olive_worldgen");
	public static final FeatureHolder<WarmFruitTreeFeature, NoneFeatureConfiguration> PAPAYA = warm("papaya_worldgen");
	public static final FeatureHolder<WarmLogFruitTreeFeature, NoneFeatureConfiguration> PAPERBARK = warmLog("paperbark_worldgen");
	public static final FeatureHolder<WarmFruitTreeFeature, NoneFeatureConfiguration> PECAN = warm("pecan_worldgen");
	public static final FeatureHolder<WarmFruitTreeFeature, NoneFeatureConfiguration> PEPPERCORN = warm("peppercorn_worldgen");
	public static final FeatureHolder<WarmFruitTreeFeature, NoneFeatureConfiguration> PERSIMMON = warm("persimmon_worldgen");
	public static final FeatureHolder<WarmFruitTreeFeature, NoneFeatureConfiguration> PISTACHIO = warm("pistachio_worldgen");
	public static final FeatureHolder<WarmFruitTreeFeature, NoneFeatureConfiguration> POMEGRANATE = warm("pomegranate_worldgen");
	public static final FeatureHolder<WarmFruitTreeFeature, NoneFeatureConfiguration> STARFRUIT = warm("starfruit_worldgen");
	public static final FeatureHolder<WarmFruitTreeFeature, NoneFeatureConfiguration> VANILLABEAN = warm("vanillabean_worldgen");
	public static final FeatureHolder<WarmFruitTreeFeature, NoneFeatureConfiguration> BREADFRUIT = warm("breadfruit_worldgen");
	public static final FeatureHolder<WarmFruitTreeFeature, NoneFeatureConfiguration> GUAVA = warm("guava_worldgen");
	public static final FeatureHolder<WarmFruitTreeFeature, NoneFeatureConfiguration> JACKFRUIT = warm("jackfruit_worldgen");
	public static final FeatureHolder<WarmFruitTreeFeature, NoneFeatureConfiguration> LYCHEE = warm("lychee_worldgen");
	public static final FeatureHolder<WarmFruitTreeFeature, NoneFeatureConfiguration> PASSIONFRUIT = warm("passionfruit_worldgen");
	public static final FeatureHolder<WarmFruitTreeFeature, NoneFeatureConfiguration> RAMBUTAN = warm("rambutan_worldgen");
	public static final FeatureHolder<WarmFruitTreeFeature, NoneFeatureConfiguration> TAMARIND = warm("tamarind_worldgen");
	//Cold Fruits
	public static final FeatureHolder<ColdLogFruitTreeFeature, NoneFeatureConfiguration> MAPLE = coldLog("maple_worldgen");
	public static final FeatureHolder<ColdFruitTreeFeature, NoneFeatureConfiguration> PINENUT = cold("pinenut_worldgen");

	private static FeatureHolder<TemperateFruitTreeFeature, NoneFeatureConfiguration> temperate(String key) {
		return holder(key,
				() -> new TemperateFruitTreeFeature(NoneFeatureConfiguration.CODEC),
				() -> NoneFeatureConfiguration.INSTANCE);
	}

	private static FeatureHolder<WarmFruitTreeFeature, NoneFeatureConfiguration> warm(String key) {
		return holder(key,
				() -> new WarmFruitTreeFeature(NoneFeatureConfiguration.CODEC),
				() -> NoneFeatureConfiguration.INSTANCE);
	}

	private static FeatureHolder<WarmLogFruitTreeFeature, NoneFeatureConfiguration> warmLog(String key) {
		return holder(key,
				() -> new WarmLogFruitTreeFeature(NoneFeatureConfiguration.CODEC),
				() -> NoneFeatureConfiguration.INSTANCE);
	}

	private static FeatureHolder<ColdFruitTreeFeature, NoneFeatureConfiguration> cold(String key) {
		return holder(key,
				() -> new ColdFruitTreeFeature(NoneFeatureConfiguration.CODEC),
				() -> NoneFeatureConfiguration.INSTANCE);
	}

	private static FeatureHolder<ColdLogFruitTreeFeature, NoneFeatureConfiguration> coldLog(String key) {
		return holder(key,
				() -> new ColdLogFruitTreeFeature(NoneFeatureConfiguration.CODEC),
				() -> NoneFeatureConfiguration.INSTANCE);
	}

	private static <T extends Feature<C>, C extends FeatureConfiguration> FeatureHolder<T, C> holder(String key, Supplier<T> feature, Supplier<C> config) {
		final FeatureHolder<T, C> holder = new FeatureHolder<>(Pamhc2trees.getId(key),
				feature, config,
				() -> List.of());
		HOLDERS.add(holder);
		return holder;
	}

	public static void registerFeatures(RegistryEvent.Register<Feature<?>> event) {
		for (FeatureHolder<?, ?> holder : HOLDERS)
			holder.registerFeature();
	}

	public static void registerConfiguredFeatures() {
		for (FeatureHolder<?, ?> holder : HOLDERS)
			holder.registerConfiguredFeature();
	}

	public static void registerPlacedFeatures() {
		for (FeatureHolder<?, ?> holder : HOLDERS)
			holder.registerPlacedFeature();

		// We don't need them anymore.
		HOLDERS.clear();
	}
}

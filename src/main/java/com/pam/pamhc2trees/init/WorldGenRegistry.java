package com.pam.pamhc2trees.init;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

import com.pam.pamhc2trees.Pamhc2trees;
import com.pam.pamhc2trees.util.FeatureHolder;
import com.pam.pamhc2trees.worldgen.ColdFruitTreeFeature;
import com.pam.pamhc2trees.worldgen.ColdLogFruitTreeFeature;
import com.pam.pamhc2trees.worldgen.TemperateFruitTreeFeature;
import com.pam.pamhc2trees.worldgen.WarmFruitTreeFeature;
import com.pam.pamhc2trees.worldgen.WarmLogFruitTreeFeature;
import com.pam.pamhc2trees.worldgen.config.TreeConfig;

import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.placement.BiomeFilter;
import net.minecraft.world.level.levelgen.placement.InSquarePlacement;
import net.minecraftforge.event.RegistryEvent;

public class WorldGenRegistry {

	private static final List<FeatureHolder<?, ?>> HOLDERS = new ArrayList<>();

	//Temperate Fruits
	public static final FeatureHolder<TemperateFruitTreeFeature, TreeConfig> APPLE = temperate("apple_worldgen", BlockRegistry.pamapple);
	public static final FeatureHolder<TemperateFruitTreeFeature, TreeConfig> AVOCADO = temperate("avocado_worldgen", BlockRegistry.pamavocado);
	public static final FeatureHolder<TemperateFruitTreeFeature, TreeConfig> CANDLENUT = temperate("candlenut_worldgen", BlockRegistry.pamcandlenut);
	public static final FeatureHolder<TemperateFruitTreeFeature, TreeConfig> CHERRY = temperate("cherry_worldgen", BlockRegistry.pamcherry);
	public static final FeatureHolder<TemperateFruitTreeFeature, TreeConfig> CHESTNUT = temperate("chestnut_worldgen", BlockRegistry.pamchestnut);
	public static final FeatureHolder<TemperateFruitTreeFeature, TreeConfig> GOOSEBERRY = temperate("gooseberry_worldgen", BlockRegistry.pamgooseberry);
	public static final FeatureHolder<TemperateFruitTreeFeature, TreeConfig> LEMON = temperate("lemon_worldgen", BlockRegistry.pamlemon);
	public static final FeatureHolder<TemperateFruitTreeFeature, TreeConfig> NUTMEG = temperate("nutmeg_worldgen", BlockRegistry.pamnutmeg);
	public static final FeatureHolder<TemperateFruitTreeFeature, TreeConfig> ORANGE = temperate("orange_worldgen", BlockRegistry.pamorange);
	public static final FeatureHolder<TemperateFruitTreeFeature, TreeConfig> PEACH = temperate("peach_worldgen", BlockRegistry.pampeach);
	public static final FeatureHolder<TemperateFruitTreeFeature, TreeConfig> PEAR = temperate("pear_worldgen", BlockRegistry.pampear);
	public static final FeatureHolder<TemperateFruitTreeFeature, TreeConfig> PLUM = temperate("plum_worldgen", BlockRegistry.pamplum);
	public static final FeatureHolder<TemperateFruitTreeFeature, TreeConfig> WALNUT = temperate("walnut_worldgen", BlockRegistry.pamwalnut);
	public static final FeatureHolder<TemperateFruitTreeFeature, TreeConfig> SPIDERWEB = temperate("spiderweb_worldgen", BlockRegistry.pamspiderweb);
	public static final FeatureHolder<TemperateFruitTreeFeature, TreeConfig> HAZELNUT = temperate("hazelnut_worldgen", BlockRegistry.pamhazelnut);
	public static final FeatureHolder<TemperateFruitTreeFeature, TreeConfig> PAWPAW = temperate("pawpaw_worldgen", BlockRegistry.pampawpaw);
	public static final FeatureHolder<TemperateFruitTreeFeature, TreeConfig> SOURSOP = temperate("soursop_worldgen", BlockRegistry.pamsoursop);
	//Warm Fruits
	public static final FeatureHolder<WarmFruitTreeFeature, TreeConfig> ALMOND = warm("almond_worldgen", BlockRegistry.pamalmond);
	public static final FeatureHolder<WarmFruitTreeFeature, TreeConfig> APRICOT = warm("apricot_worldgen", BlockRegistry.pamapricot);
	public static final FeatureHolder<WarmFruitTreeFeature, TreeConfig> BANANA = warm("banana_worldgen", BlockRegistry.pambanana);
	public static final FeatureHolder<WarmFruitTreeFeature, TreeConfig> CASHEW = warm("cashew_worldgen", BlockRegistry.pamcashew);
	public static final FeatureHolder<WarmLogFruitTreeFeature, TreeConfig> CINNAMON = warmLog("cinnamon_worldgen", BlockRegistry.pamcinnamon);
	public static final FeatureHolder<WarmFruitTreeFeature, TreeConfig> COCONUT = warm("coconut_worldgen", BlockRegistry.pamcoconut);
	public static final FeatureHolder<WarmFruitTreeFeature, TreeConfig> DATE = warm("date_worldgen", BlockRegistry.pamdate);
	public static final FeatureHolder<WarmFruitTreeFeature, TreeConfig> DRAGONFRUIT = warm("dragonfruit_worldgen", BlockRegistry.pamdragonfruit);
	public static final FeatureHolder<WarmFruitTreeFeature, TreeConfig> DURIAN = warm("durian_worldgen", BlockRegistry.pamdurian);
	public static final FeatureHolder<WarmFruitTreeFeature, TreeConfig> FIG = warm("fig_worldgen", BlockRegistry.pamfig);
	public static final FeatureHolder<WarmFruitTreeFeature, TreeConfig> GRAPEFRUIT = warm("grapefruit_worldgen", BlockRegistry.pamgrapefruit);
	public static final FeatureHolder<WarmFruitTreeFeature, TreeConfig> LIME = warm("lime_worldgen", BlockRegistry.pamlime);
	public static final FeatureHolder<WarmFruitTreeFeature, TreeConfig> MANGO = warm("mango_worldgen", BlockRegistry.pammango);
	public static final FeatureHolder<WarmFruitTreeFeature, TreeConfig> OLIVE = warm("olive_worldgen", BlockRegistry.pamolive);
	public static final FeatureHolder<WarmFruitTreeFeature, TreeConfig> PAPAYA = warm("papaya_worldgen", BlockRegistry.pampapaya);
	public static final FeatureHolder<WarmLogFruitTreeFeature, TreeConfig> PAPERBARK = warmLog("paperbark_worldgen", BlockRegistry.pampaperbark);
	public static final FeatureHolder<WarmFruitTreeFeature, TreeConfig> PECAN = warm("pecan_worldgen", BlockRegistry.pampecan);
	public static final FeatureHolder<WarmFruitTreeFeature, TreeConfig> PEPPERCORN = warm("peppercorn_worldgen", BlockRegistry.pampeppercorn);
	public static final FeatureHolder<WarmFruitTreeFeature, TreeConfig> PERSIMMON = warm("persimmon_worldgen", BlockRegistry.pampersimmon);
	public static final FeatureHolder<WarmFruitTreeFeature, TreeConfig> PISTACHIO = warm("pistachio_worldgen", BlockRegistry.pampistachio);
	public static final FeatureHolder<WarmFruitTreeFeature, TreeConfig> POMEGRANATE = warm("pomegranate_worldgen", BlockRegistry.pampomegranate);
	public static final FeatureHolder<WarmFruitTreeFeature, TreeConfig> STARFRUIT = warm("starfruit_worldgen", BlockRegistry.pamstarfruit);
	public static final FeatureHolder<WarmFruitTreeFeature, TreeConfig> VANILLABEAN = warm("vanillabean_worldgen", BlockRegistry.pamvanillabean);
	public static final FeatureHolder<WarmFruitTreeFeature, TreeConfig> BREADFRUIT = warm("breadfruit_worldgen", BlockRegistry.pambreadfruit);
	public static final FeatureHolder<WarmFruitTreeFeature, TreeConfig> GUAVA = warm("guava_worldgen", BlockRegistry.pamguava);
	public static final FeatureHolder<WarmFruitTreeFeature, TreeConfig> JACKFRUIT = warm("jackfruit_worldgen", BlockRegistry.pamjackfruit);
	public static final FeatureHolder<WarmFruitTreeFeature, TreeConfig> LYCHEE = warm("lychee_worldgen", BlockRegistry.pamlychee);
	public static final FeatureHolder<WarmFruitTreeFeature, TreeConfig> PASSIONFRUIT = warm("passionfruit_worldgen", BlockRegistry.pampassionfruit);
	public static final FeatureHolder<WarmFruitTreeFeature, TreeConfig> RAMBUTAN = warm("rambutan_worldgen", BlockRegistry.pamrambutan);
	public static final FeatureHolder<WarmFruitTreeFeature, TreeConfig> TAMARIND = warm("tamarind_worldgen", BlockRegistry.pamtamarind);
	//Cold Fruits
	public static final FeatureHolder<ColdLogFruitTreeFeature, TreeConfig> MAPLE = coldLog("maple_worldgen", BlockRegistry.pammaple);
	public static final FeatureHolder<ColdFruitTreeFeature, TreeConfig> PINENUT = cold("pinenut_worldgen", BlockRegistry.pampinenut);

	private static FeatureHolder<TemperateFruitTreeFeature, TreeConfig> temperate(String key, Supplier<Block> fruit) {
		return holder(key,
				() -> new TemperateFruitTreeFeature(),
				() -> new TreeConfig(BlockStateProvider.simple(fruit.get().defaultBlockState())));
	}

	private static FeatureHolder<WarmFruitTreeFeature, TreeConfig> warm(String key, Supplier<Block> fruit) {
		return holder(key,
				() -> new WarmFruitTreeFeature(),
				() -> new TreeConfig(BlockStateProvider.simple(fruit.get().defaultBlockState())));
	}

	private static FeatureHolder<WarmLogFruitTreeFeature, TreeConfig> warmLog(String key, Supplier<Block> fruit) {
		return holder(key,
				() -> new WarmLogFruitTreeFeature(),
				() -> new TreeConfig(BlockStateProvider.simple(fruit.get().defaultBlockState())));
	}

	private static FeatureHolder<ColdFruitTreeFeature, TreeConfig> cold(String key, Supplier<Block> fruit) {
		return holder(key,
				() -> new ColdFruitTreeFeature(),
				() -> new TreeConfig(BlockStateProvider.simple(fruit.get().defaultBlockState())));
	}

	private static FeatureHolder<ColdLogFruitTreeFeature, TreeConfig> coldLog(String key, Supplier<Block> fruit) {
		return holder(key,
				() -> new ColdLogFruitTreeFeature(),
				() -> new TreeConfig(BlockStateProvider.simple(fruit.get().defaultBlockState())));
	}

	private static <T extends Feature<C>, C extends FeatureConfiguration> FeatureHolder<T, C> holder(String key, Supplier<T> feature, Supplier<C> config) {
		FeatureHolder<T, C> holder = new FeatureHolder<>(Pamhc2trees.getId(key),
				feature, config,
				() -> List.of(InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome(),
						PlacementUtils.filteredByBlockSurvival(BlockRegistry.almond_sapling.get())));
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
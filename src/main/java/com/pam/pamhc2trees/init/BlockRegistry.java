package com.pam.pamhc2trees.init;

import java.util.stream.Stream;

import com.pam.pamhc2trees.Pamhc2trees;
import com.pam.pamhc2trees.blocks.BlockPamColdLogSapling;
import com.pam.pamhc2trees.blocks.BlockPamColdSapling;
import com.pam.pamhc2trees.blocks.BlockPamFruit;
import com.pam.pamhc2trees.blocks.BlockPamLogFruit;
import com.pam.pamhc2trees.blocks.BlockPamTemperateSapling;
import com.pam.pamhc2trees.blocks.BlockPamWarmLogSapling;
import com.pam.pamhc2trees.blocks.BlockPamWarmSapling;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BlockRegistry {

	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, Pamhc2trees.MOD_ID);

	//Temperate Fruits
	public static RegistryObject<Block> pamapple = REGISTRY.register("pamapple", () -> new BlockPamFruit(fruit()));
	public static RegistryObject<Block> pamavocado = REGISTRY.register("pamavocado", () -> new BlockPamFruit(fruit()));
	public static RegistryObject<Block> pamcandlenut = REGISTRY.register("pamcandlenut", () -> new BlockPamFruit(fruit()));
	public static RegistryObject<Block> pamcherry = REGISTRY.register("pamcherry", () -> new BlockPamFruit(fruit()));
	public static RegistryObject<Block> pamchestnut = REGISTRY.register("pamchestnut", () -> new BlockPamFruit(fruit()));
	public static RegistryObject<Block> pamgooseberry = REGISTRY.register("pamgooseberry", () -> new BlockPamFruit(fruit()));
	public static RegistryObject<Block> pamlemon = REGISTRY.register("pamlemon", () -> new BlockPamFruit(fruit()));
	public static RegistryObject<Block> pamnutmeg = REGISTRY.register("pamnutmeg", () -> new BlockPamFruit(fruit()));
	public static RegistryObject<Block> pamorange = REGISTRY.register("pamorange", () -> new BlockPamFruit(fruit()));
	public static RegistryObject<Block> pampeach = REGISTRY.register("pampeach", () -> new BlockPamFruit(fruit()));
	public static RegistryObject<Block> pampear = REGISTRY.register("pampear", () -> new BlockPamFruit(fruit()));
	public static RegistryObject<Block> pamplum = REGISTRY.register("pamplum", () -> new BlockPamFruit(fruit()));
	public static RegistryObject<Block> pamwalnut = REGISTRY.register("pamwalnut", () -> new BlockPamFruit(fruit()));
	public static RegistryObject<Block> pamspiderweb = REGISTRY.register("pamspiderweb", () -> new BlockPamFruit(fruit()));
	public static RegistryObject<Block> pamhazelnut = REGISTRY.register("pamhazelnut", () -> new BlockPamFruit(fruit()));
	public static RegistryObject<Block> pampawpaw = REGISTRY.register("pampawpaw", () -> new BlockPamFruit(fruit()));
	public static RegistryObject<Block> pamsoursop = REGISTRY.register("pamsoursop", () -> new BlockPamFruit(fruit()));
	//Warm Fruits
	public static RegistryObject<Block> pamalmond = REGISTRY.register("pamalmond", () -> new BlockPamFruit(fruit()));
	public static RegistryObject<Block> pamapricot = REGISTRY.register("pamapricot", () -> new BlockPamFruit(fruit()));
	public static RegistryObject<Block> pambanana = REGISTRY.register("pambanana", () -> new BlockPamFruit(fruit()));
	public static RegistryObject<Block> pamcashew = REGISTRY.register("pamcashew", () -> new BlockPamFruit(fruit()));
	public static RegistryObject<Block> pamcinnamon = REGISTRY.register("pamcinnamon", () -> new BlockPamLogFruit(logFruit()));
	public static RegistryObject<Block> pamcoconut = REGISTRY.register("pamcoconut", () -> new BlockPamFruit(fruit()));
	public static RegistryObject<Block> pamdate = REGISTRY.register("pamdate", () -> new BlockPamFruit(fruit()));
	public static RegistryObject<Block> pamdragonfruit = REGISTRY.register("pamdragonfruit", () -> new BlockPamFruit(fruit()));
	public static RegistryObject<Block> pamdurian = REGISTRY.register("pamdurian", () -> new BlockPamFruit(fruit()));
	public static RegistryObject<Block> pamfig = REGISTRY.register("pamfig", () -> new BlockPamFruit(fruit()));
	public static RegistryObject<Block> pamgrapefruit = REGISTRY.register("pamgrapefruit", () -> new BlockPamFruit(fruit()));
	public static RegistryObject<Block> pamlime = REGISTRY.register("pamlime", () -> new BlockPamFruit(fruit()));
	public static RegistryObject<Block> pammango = REGISTRY.register("pammango", () -> new BlockPamFruit(fruit()));
	public static RegistryObject<Block> pamolive = REGISTRY.register("pamolive", () -> new BlockPamFruit(fruit()));
	public static RegistryObject<Block> pampapaya = REGISTRY.register("pampapaya", () -> new BlockPamFruit(fruit()));
	public static RegistryObject<Block> pampaperbark = REGISTRY.register("pampaperbark", () -> new BlockPamLogFruit(logFruit()));
	public static RegistryObject<Block> pampecan = REGISTRY.register("pampecan", () -> new BlockPamFruit(fruit()));
	public static RegistryObject<Block> pampeppercorn = REGISTRY.register("pampeppercorn", () -> new BlockPamFruit(fruit()));
	public static RegistryObject<Block> pampersimmon = REGISTRY.register("pampersimmon", () -> new BlockPamFruit(fruit()));
	public static RegistryObject<Block> pampistachio = REGISTRY.register("pampistachio", () -> new BlockPamFruit(fruit()));
	public static RegistryObject<Block> pampomegranate = REGISTRY.register("pampomegranate", () -> new BlockPamFruit(fruit()));
	public static RegistryObject<Block> pamstarfruit = REGISTRY.register("pamstarfruit", () -> new BlockPamFruit(fruit()));
	public static RegistryObject<Block> pamvanillabean = REGISTRY.register("pamvanillabean", () -> new BlockPamFruit(fruit()));
	public static RegistryObject<Block> pambreadfruit = REGISTRY.register("pambreadfruit", () -> new BlockPamFruit(fruit()));
	public static RegistryObject<Block> pamguava = REGISTRY.register("pamguava", () -> new BlockPamFruit(fruit()));
	public static RegistryObject<Block> pamjackfruit = REGISTRY.register("pamjackfruit", () -> new BlockPamFruit(fruit()));
	public static RegistryObject<Block> pamlychee = REGISTRY.register("pamlychee", () -> new BlockPamFruit(fruit()));
	public static RegistryObject<Block> pampassionfruit = REGISTRY.register("pampassionfruit", () -> new BlockPamFruit(fruit()));
	public static RegistryObject<Block> pamrambutan = REGISTRY.register("pamrambutan", () -> new BlockPamFruit(fruit()));
	public static RegistryObject<Block> pamtamarind = REGISTRY.register("pamtamarind", () -> new BlockPamFruit(fruit()));
	//Cold Fruits
	public static RegistryObject<Block> pammaple = REGISTRY.register("pammaple", () -> new BlockPamLogFruit(logFruit()));
	public static RegistryObject<Block> pampinenut = REGISTRY.register("pampinenut", () -> new BlockPamFruit(fruit()));

	//Temperate Saplings
	public static RegistryObject<Block> apple_sapling = REGISTRY.register("apple_sapling", () -> new BlockPamTemperateSapling(sapling(), WorldGenRegistry.APPLE));
	public static RegistryObject<Block> avocado_sapling = REGISTRY.register("avocado_sapling", () -> new BlockPamTemperateSapling(sapling(), WorldGenRegistry.AVOCADO));
	public static RegistryObject<Block> candlenut_sapling = REGISTRY.register("candlenut_sapling", () -> new BlockPamTemperateSapling(sapling(), WorldGenRegistry.CANDLENUT));
	public static RegistryObject<Block> cherry_sapling = REGISTRY.register("cherry_sapling", () -> new BlockPamTemperateSapling(sapling(), WorldGenRegistry.CHERRY));
	public static RegistryObject<Block> chestnut_sapling = REGISTRY.register("chestnut_sapling", () -> new BlockPamTemperateSapling(sapling(), WorldGenRegistry.CHESTNUT));
	public static RegistryObject<Block> gooseberry_sapling = REGISTRY.register("gooseberry_sapling", () -> new BlockPamTemperateSapling(sapling(), WorldGenRegistry.GOOSEBERRY));
	public static RegistryObject<Block> lemon_sapling = REGISTRY.register("lemon_sapling", () -> new BlockPamTemperateSapling(sapling(), WorldGenRegistry.LEMON));
	public static RegistryObject<Block> nutmeg_sapling = REGISTRY.register("nutmeg_sapling", () -> new BlockPamTemperateSapling(sapling(), WorldGenRegistry.NUTMEG));
	public static RegistryObject<Block> orange_sapling = REGISTRY.register("orange_sapling", () -> new BlockPamTemperateSapling(sapling(), WorldGenRegistry.ORANGE));
	public static RegistryObject<Block> peach_sapling = REGISTRY.register("peach_sapling", () -> new BlockPamTemperateSapling(sapling(), WorldGenRegistry.PEACH));
	public static RegistryObject<Block> pear_sapling = REGISTRY.register("pear_sapling", () -> new BlockPamTemperateSapling(sapling(), WorldGenRegistry.PEAR));
	public static RegistryObject<Block> plum_sapling = REGISTRY.register("plum_sapling", () -> new BlockPamTemperateSapling(sapling(), WorldGenRegistry.PLUM));
	public static RegistryObject<Block> walnut_sapling = REGISTRY.register("walnut_sapling", () -> new BlockPamTemperateSapling(sapling(), WorldGenRegistry.WALNUT));
	public static RegistryObject<Block> spiderweb_sapling = REGISTRY.register("spiderweb_sapling", () -> new BlockPamTemperateSapling(sapling(), WorldGenRegistry.SPIDERWEB));
	public static RegistryObject<Block> hazelnut_sapling = REGISTRY.register("hazelnut_sapling", () -> new BlockPamTemperateSapling(sapling(), WorldGenRegistry.HAZELNUT));
	public static RegistryObject<Block> pawpaw_sapling = REGISTRY.register("pawpaw_sapling", () -> new BlockPamTemperateSapling(sapling(), WorldGenRegistry.PAWPAW));
	public static RegistryObject<Block> soursop_sapling = REGISTRY.register("soursop_sapling", () -> new BlockPamTemperateSapling(sapling(), WorldGenRegistry.SOURSOP));
	//Warm Saplings
	public static RegistryObject<Block> almond_sapling = REGISTRY.register("almond_sapling", () -> new BlockPamWarmSapling(sapling(), WorldGenRegistry.ALMOND));
	public static RegistryObject<Block> apricot_sapling = REGISTRY.register("apricot_sapling", () -> new BlockPamWarmSapling(sapling(), WorldGenRegistry.APRICOT));
	public static RegistryObject<Block> banana_sapling = REGISTRY.register("banana_sapling", () -> new BlockPamWarmSapling(sapling(), WorldGenRegistry.BANANA));
	public static RegistryObject<Block> cashew_sapling = REGISTRY.register("cashew_sapling", () -> new BlockPamWarmSapling(sapling(), WorldGenRegistry.CASHEW));
	public static RegistryObject<Block> cinnamon_sapling = REGISTRY.register("cinnamon_sapling", () -> new BlockPamWarmLogSapling(sapling(), WorldGenRegistry.CINNAMON));
	public static RegistryObject<Block> coconut_sapling = REGISTRY.register("coconut_sapling", () -> new BlockPamWarmSapling(sapling(), WorldGenRegistry.COCONUT));
	public static RegistryObject<Block> date_sapling = REGISTRY.register("date_sapling", () -> new BlockPamWarmSapling(sapling(), WorldGenRegistry.DATE));
	public static RegistryObject<Block> dragonfruit_sapling = REGISTRY.register("dragonfruit_sapling", () -> new BlockPamWarmSapling(sapling(), WorldGenRegistry.DRAGONFRUIT));
	public static RegistryObject<Block> durian_sapling = REGISTRY.register("durian_sapling", () -> new BlockPamWarmSapling(sapling(), WorldGenRegistry.DURIAN));
	public static RegistryObject<Block> fig_sapling = REGISTRY.register("fig_sapling", () -> new BlockPamWarmSapling(sapling(), WorldGenRegistry.FIG));
	public static RegistryObject<Block> grapefruit_sapling = REGISTRY.register("grapefruit_sapling", () -> new BlockPamWarmSapling(sapling(), WorldGenRegistry.GRAPEFRUIT));
	public static RegistryObject<Block> lime_sapling = REGISTRY.register("lime_sapling", () -> new BlockPamWarmSapling(sapling(), WorldGenRegistry.LIME));
	public static RegistryObject<Block> mango_sapling = REGISTRY.register("mango_sapling", () -> new BlockPamWarmSapling(sapling(), WorldGenRegistry.MANGO));
	public static RegistryObject<Block> olive_sapling = REGISTRY.register("olive_sapling", () -> new BlockPamWarmSapling(sapling(), WorldGenRegistry.OLIVE));
	public static RegistryObject<Block> papaya_sapling = REGISTRY.register("papaya_sapling", () -> new BlockPamWarmSapling(sapling(), WorldGenRegistry.PAPAYA));
	public static RegistryObject<Block> paperbark_sapling = REGISTRY.register("paperbark_sapling", () -> new BlockPamWarmLogSapling(sapling(), WorldGenRegistry.PAPERBARK));
	public static RegistryObject<Block> pecan_sapling = REGISTRY.register("pecan_sapling", () -> new BlockPamWarmSapling(sapling(), WorldGenRegistry.PECAN));
	public static RegistryObject<Block> peppercorn_sapling = REGISTRY.register("peppercorn_sapling", () -> new BlockPamWarmSapling(sapling(), WorldGenRegistry.PEPPERCORN));
	public static RegistryObject<Block> persimmon_sapling = REGISTRY.register("persimmon_sapling", () -> new BlockPamWarmSapling(sapling(), WorldGenRegistry.PERSIMMON));
	public static RegistryObject<Block> pistachio_sapling = REGISTRY.register("pistachio_sapling", () -> new BlockPamWarmSapling(sapling(), WorldGenRegistry.PISTACHIO));
	public static RegistryObject<Block> pomegranate_sapling = REGISTRY.register("pomegranate_sapling", () -> new BlockPamWarmSapling(sapling(), WorldGenRegistry.POMEGRANATE));
	public static RegistryObject<Block> starfruit_sapling = REGISTRY.register("starfruit_sapling", () -> new BlockPamWarmSapling(sapling(), WorldGenRegistry.STARFRUIT));
	public static RegistryObject<Block> vanillabean_sapling = REGISTRY.register("vanillabean_sapling", () -> new BlockPamWarmSapling(sapling(), WorldGenRegistry.VANILLABEAN));
	public static RegistryObject<Block> breadfruit_sapling = REGISTRY.register("breadfruit_sapling", () -> new BlockPamWarmSapling(sapling(), WorldGenRegistry.BREADFRUIT));
	public static RegistryObject<Block> guava_sapling = REGISTRY.register("guava_sapling", () -> new BlockPamWarmSapling(sapling(), WorldGenRegistry.GUAVA));
	public static RegistryObject<Block> jackfruit_sapling = REGISTRY.register("jackfruit_sapling", () -> new BlockPamWarmSapling(sapling(), WorldGenRegistry.JACKFRUIT));
	public static RegistryObject<Block> lychee_sapling = REGISTRY.register("lychee_sapling", () -> new BlockPamWarmSapling(sapling(), WorldGenRegistry.LYCHEE));
	public static RegistryObject<Block> passionfruit_sapling = REGISTRY.register("passionfruit_sapling", () -> new BlockPamWarmSapling(sapling(), WorldGenRegistry.PASSIONFRUIT));
	public static RegistryObject<Block> rambutan_sapling = REGISTRY.register("rambutan_sapling", () -> new BlockPamWarmSapling(sapling(), WorldGenRegistry.RAMBUTAN));
	public static RegistryObject<Block> tamarind_sapling = REGISTRY.register("tamarind_sapling", () -> new BlockPamWarmSapling(sapling(), WorldGenRegistry.TAMARIND));
	//Cold Saplings
	public static RegistryObject<Block> maple_sapling = REGISTRY.register("maple_sapling", () -> new BlockPamColdLogSapling(sapling(), WorldGenRegistry.MAPLE));
	public static RegistryObject<Block> pinenut_sapling = REGISTRY.register("pinenut_sapling", () -> new BlockPamColdSapling(sapling(), WorldGenRegistry.PINENUT));

	private static Block.Properties fruit() {
		return Block.Properties.of(Material.PLANT).strength(5F)
				.noCollission().randomTicks().sound(SoundType.CROP);
	}

	private static Block.Properties logFruit() {
		return Block.Properties.of(Material.PLANT).strength(5F)
				.randomTicks().sound(SoundType.CROP);
	}

	private static Block.Properties sapling() {
		return Block.Properties.of(Material.PLANT)
				.noCollission().randomTicks().strength(0F).sound(SoundType.GRASS);
	}

	public static Stream<Block> fruits() {
		return REGISTRY.getEntries().stream()
				.map(RegistryObject::get)
				.filter(block -> block instanceof BlockPamFruit || block instanceof BlockPamLogFruit);
	}

	public static Stream<Block> saplings() {
		return REGISTRY.getEntries().stream()
				.map(RegistryObject::get)
				.filter(block -> block instanceof BlockPamColdLogSapling || block instanceof BlockPamColdSapling
						|| block instanceof BlockPamWarmLogSapling || block instanceof BlockPamWarmSapling
						|| block instanceof BlockPamTemperateSapling);
	}
}
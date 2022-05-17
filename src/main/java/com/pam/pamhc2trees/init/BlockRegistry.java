package com.pam.pamhc2trees.init;

import java.util.stream.Stream;

import com.pam.pamhc2trees.Pamhc2trees;
import com.pam.pamhc2trees.blocks.FruitBlock;
import com.pam.pamhc2trees.blocks.FruitSaplingBlock;
import com.pam.pamhc2trees.blocks.LogFruitBlock;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BlockRegistry {

	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, Pamhc2trees.MOD_ID);

	//Temperate Fruits
	public static RegistryObject<Block> pamapple = REGISTRY.register("pamapple", () -> new FruitBlock(fruit()));
	public static RegistryObject<Block> pamavocado = REGISTRY.register("pamavocado", () -> new FruitBlock(fruit()));
	public static RegistryObject<Block> pamcandlenut = REGISTRY.register("pamcandlenut", () -> new FruitBlock(fruit()));
	public static RegistryObject<Block> pamcherry = REGISTRY.register("pamcherry", () -> new FruitBlock(fruit()));
	public static RegistryObject<Block> pamchestnut = REGISTRY.register("pamchestnut", () -> new FruitBlock(fruit()));
	public static RegistryObject<Block> pamgooseberry = REGISTRY.register("pamgooseberry", () -> new FruitBlock(fruit()));
	public static RegistryObject<Block> pamlemon = REGISTRY.register("pamlemon", () -> new FruitBlock(fruit()));
	public static RegistryObject<Block> pamnutmeg = REGISTRY.register("pamnutmeg", () -> new FruitBlock(fruit()));
	public static RegistryObject<Block> pamorange = REGISTRY.register("pamorange", () -> new FruitBlock(fruit()));
	public static RegistryObject<Block> pampeach = REGISTRY.register("pampeach", () -> new FruitBlock(fruit()));
	public static RegistryObject<Block> pampear = REGISTRY.register("pampear", () -> new FruitBlock(fruit()));
	public static RegistryObject<Block> pamplum = REGISTRY.register("pamplum", () -> new FruitBlock(fruit()));
	public static RegistryObject<Block> pamwalnut = REGISTRY.register("pamwalnut", () -> new FruitBlock(fruit()));
	public static RegistryObject<Block> pamspiderweb = REGISTRY.register("pamspiderweb", () -> new FruitBlock(fruit()));
	public static RegistryObject<Block> pamhazelnut = REGISTRY.register("pamhazelnut", () -> new FruitBlock(fruit()));
	public static RegistryObject<Block> pampawpaw = REGISTRY.register("pampawpaw", () -> new FruitBlock(fruit()));
	public static RegistryObject<Block> pamsoursop = REGISTRY.register("pamsoursop", () -> new FruitBlock(fruit()));
	//Warm Fruits
	public static RegistryObject<Block> pamalmond = REGISTRY.register("pamalmond", () -> new FruitBlock(fruit()));
	public static RegistryObject<Block> pamapricot = REGISTRY.register("pamapricot", () -> new FruitBlock(fruit()));
	public static RegistryObject<Block> pambanana = REGISTRY.register("pambanana", () -> new FruitBlock(fruit()));
	public static RegistryObject<Block> pamcashew = REGISTRY.register("pamcashew", () -> new FruitBlock(fruit()));
	public static RegistryObject<Block> pamcinnamon = REGISTRY.register("pamcinnamon", () -> new LogFruitBlock(logFruit()));
	public static RegistryObject<Block> pamcoconut = REGISTRY.register("pamcoconut", () -> new FruitBlock(fruit()));
	public static RegistryObject<Block> pamdate = REGISTRY.register("pamdate", () -> new FruitBlock(fruit()));
	public static RegistryObject<Block> pamdragonfruit = REGISTRY.register("pamdragonfruit", () -> new FruitBlock(fruit()));
	public static RegistryObject<Block> pamdurian = REGISTRY.register("pamdurian", () -> new FruitBlock(fruit()));
	public static RegistryObject<Block> pamfig = REGISTRY.register("pamfig", () -> new FruitBlock(fruit()));
	public static RegistryObject<Block> pamgrapefruit = REGISTRY.register("pamgrapefruit", () -> new FruitBlock(fruit()));
	public static RegistryObject<Block> pamlime = REGISTRY.register("pamlime", () -> new FruitBlock(fruit()));
	public static RegistryObject<Block> pammango = REGISTRY.register("pammango", () -> new FruitBlock(fruit()));
	public static RegistryObject<Block> pamolive = REGISTRY.register("pamolive", () -> new FruitBlock(fruit()));
	public static RegistryObject<Block> pampapaya = REGISTRY.register("pampapaya", () -> new FruitBlock(fruit()));
	public static RegistryObject<Block> pampaperbark = REGISTRY.register("pampaperbark", () -> new LogFruitBlock(logFruit()));
	public static RegistryObject<Block> pampecan = REGISTRY.register("pampecan", () -> new FruitBlock(fruit()));
	public static RegistryObject<Block> pampeppercorn = REGISTRY.register("pampeppercorn", () -> new FruitBlock(fruit()));
	public static RegistryObject<Block> pampersimmon = REGISTRY.register("pampersimmon", () -> new FruitBlock(fruit()));
	public static RegistryObject<Block> pampistachio = REGISTRY.register("pampistachio", () -> new FruitBlock(fruit()));
	public static RegistryObject<Block> pampomegranate = REGISTRY.register("pampomegranate", () -> new FruitBlock(fruit()));
	public static RegistryObject<Block> pamstarfruit = REGISTRY.register("pamstarfruit", () -> new FruitBlock(fruit()));
	public static RegistryObject<Block> pamvanillabean = REGISTRY.register("pamvanillabean", () -> new FruitBlock(fruit()));
	public static RegistryObject<Block> pambreadfruit = REGISTRY.register("pambreadfruit", () -> new FruitBlock(fruit()));
	public static RegistryObject<Block> pamguava = REGISTRY.register("pamguava", () -> new FruitBlock(fruit()));
	public static RegistryObject<Block> pamjackfruit = REGISTRY.register("pamjackfruit", () -> new FruitBlock(fruit()));
	public static RegistryObject<Block> pamlychee = REGISTRY.register("pamlychee", () -> new FruitBlock(fruit()));
	public static RegistryObject<Block> pampassionfruit = REGISTRY.register("pampassionfruit", () -> new FruitBlock(fruit()));
	public static RegistryObject<Block> pamrambutan = REGISTRY.register("pamrambutan", () -> new FruitBlock(fruit()));
	public static RegistryObject<Block> pamtamarind = REGISTRY.register("pamtamarind", () -> new FruitBlock(fruit()));
	//Cold Fruits
	public static RegistryObject<Block> pammaple = REGISTRY.register("pammaple", () -> new LogFruitBlock(logFruit()));
	public static RegistryObject<Block> pampinenut = REGISTRY.register("pampinenut", () -> new FruitBlock(fruit()));

	//Temperate Saplings
	public static RegistryObject<Block> apple_sapling = REGISTRY.register("apple_sapling", () -> new FruitSaplingBlock(sapling(), WorldGenRegistry.APPLE));
	public static RegistryObject<Block> avocado_sapling = REGISTRY.register("avocado_sapling", () -> new FruitSaplingBlock(sapling(), WorldGenRegistry.AVOCADO));
	public static RegistryObject<Block> candlenut_sapling = REGISTRY.register("candlenut_sapling", () -> new FruitSaplingBlock(sapling(), WorldGenRegistry.CANDLENUT));
	public static RegistryObject<Block> cherry_sapling = REGISTRY.register("cherry_sapling", () -> new FruitSaplingBlock(sapling(), WorldGenRegistry.CHERRY));
	public static RegistryObject<Block> chestnut_sapling = REGISTRY.register("chestnut_sapling", () -> new FruitSaplingBlock(sapling(), WorldGenRegistry.CHESTNUT));
	public static RegistryObject<Block> gooseberry_sapling = REGISTRY.register("gooseberry_sapling", () -> new FruitSaplingBlock(sapling(), WorldGenRegistry.GOOSEBERRY));
	public static RegistryObject<Block> lemon_sapling = REGISTRY.register("lemon_sapling", () -> new FruitSaplingBlock(sapling(), WorldGenRegistry.LEMON));
	public static RegistryObject<Block> nutmeg_sapling = REGISTRY.register("nutmeg_sapling", () -> new FruitSaplingBlock(sapling(), WorldGenRegistry.NUTMEG));
	public static RegistryObject<Block> orange_sapling = REGISTRY.register("orange_sapling", () -> new FruitSaplingBlock(sapling(), WorldGenRegistry.ORANGE));
	public static RegistryObject<Block> peach_sapling = REGISTRY.register("peach_sapling", () -> new FruitSaplingBlock(sapling(), WorldGenRegistry.PEACH));
	public static RegistryObject<Block> pear_sapling = REGISTRY.register("pear_sapling", () -> new FruitSaplingBlock(sapling(), WorldGenRegistry.PEAR));
	public static RegistryObject<Block> plum_sapling = REGISTRY.register("plum_sapling", () -> new FruitSaplingBlock(sapling(), WorldGenRegistry.PLUM));
	public static RegistryObject<Block> walnut_sapling = REGISTRY.register("walnut_sapling", () -> new FruitSaplingBlock(sapling(), WorldGenRegistry.WALNUT));
	public static RegistryObject<Block> spiderweb_sapling = REGISTRY.register("spiderweb_sapling", () -> new FruitSaplingBlock(sapling(), WorldGenRegistry.SPIDERWEB));
	public static RegistryObject<Block> hazelnut_sapling = REGISTRY.register("hazelnut_sapling", () -> new FruitSaplingBlock(sapling(), WorldGenRegistry.HAZELNUT));
	public static RegistryObject<Block> pawpaw_sapling = REGISTRY.register("pawpaw_sapling", () -> new FruitSaplingBlock(sapling(), WorldGenRegistry.PAWPAW));
	public static RegistryObject<Block> soursop_sapling = REGISTRY.register("soursop_sapling", () -> new FruitSaplingBlock(sapling(), WorldGenRegistry.SOURSOP));
	//Warm Saplings
	public static RegistryObject<Block> almond_sapling = REGISTRY.register("almond_sapling", () -> new FruitSaplingBlock(sapling(), WorldGenRegistry.ALMOND));
	public static RegistryObject<Block> apricot_sapling = REGISTRY.register("apricot_sapling", () -> new FruitSaplingBlock(sapling(), WorldGenRegistry.APRICOT));
	public static RegistryObject<Block> banana_sapling = REGISTRY.register("banana_sapling", () -> new FruitSaplingBlock(sapling(), WorldGenRegistry.BANANA));
	public static RegistryObject<Block> cashew_sapling = REGISTRY.register("cashew_sapling", () -> new FruitSaplingBlock(sapling(), WorldGenRegistry.CASHEW));
	public static RegistryObject<Block> cinnamon_sapling = REGISTRY.register("cinnamon_sapling", () -> new FruitSaplingBlock(sapling(), WorldGenRegistry.CINNAMON));
	public static RegistryObject<Block> coconut_sapling = REGISTRY.register("coconut_sapling", () -> new FruitSaplingBlock(sapling(), WorldGenRegistry.COCONUT));
	public static RegistryObject<Block> date_sapling = REGISTRY.register("date_sapling", () -> new FruitSaplingBlock(sapling(), WorldGenRegistry.DATE));
	public static RegistryObject<Block> dragonfruit_sapling = REGISTRY.register("dragonfruit_sapling", () -> new FruitSaplingBlock(sapling(), WorldGenRegistry.DRAGONFRUIT));
	public static RegistryObject<Block> durian_sapling = REGISTRY.register("durian_sapling", () -> new FruitSaplingBlock(sapling(), WorldGenRegistry.DURIAN));
	public static RegistryObject<Block> fig_sapling = REGISTRY.register("fig_sapling", () -> new FruitSaplingBlock(sapling(), WorldGenRegistry.FIG));
	public static RegistryObject<Block> grapefruit_sapling = REGISTRY.register("grapefruit_sapling", () -> new FruitSaplingBlock(sapling(), WorldGenRegistry.GRAPEFRUIT));
	public static RegistryObject<Block> lime_sapling = REGISTRY.register("lime_sapling", () -> new FruitSaplingBlock(sapling(), WorldGenRegistry.LIME));
	public static RegistryObject<Block> mango_sapling = REGISTRY.register("mango_sapling", () -> new FruitSaplingBlock(sapling(), WorldGenRegistry.MANGO));
	public static RegistryObject<Block> olive_sapling = REGISTRY.register("olive_sapling", () -> new FruitSaplingBlock(sapling(), WorldGenRegistry.OLIVE));
	public static RegistryObject<Block> papaya_sapling = REGISTRY.register("papaya_sapling", () -> new FruitSaplingBlock(sapling(), WorldGenRegistry.PAPAYA));
	public static RegistryObject<Block> paperbark_sapling = REGISTRY.register("paperbark_sapling", () -> new FruitSaplingBlock(sapling(), WorldGenRegistry.PAPERBARK));
	public static RegistryObject<Block> pecan_sapling = REGISTRY.register("pecan_sapling", () -> new FruitSaplingBlock(sapling(), WorldGenRegistry.PECAN));
	public static RegistryObject<Block> peppercorn_sapling = REGISTRY.register("peppercorn_sapling", () -> new FruitSaplingBlock(sapling(), WorldGenRegistry.PEPPERCORN));
	public static RegistryObject<Block> persimmon_sapling = REGISTRY.register("persimmon_sapling", () -> new FruitSaplingBlock(sapling(), WorldGenRegistry.PERSIMMON));
	public static RegistryObject<Block> pistachio_sapling = REGISTRY.register("pistachio_sapling", () -> new FruitSaplingBlock(sapling(), WorldGenRegistry.PISTACHIO));
	public static RegistryObject<Block> pomegranate_sapling = REGISTRY.register("pomegranate_sapling", () -> new FruitSaplingBlock(sapling(), WorldGenRegistry.POMEGRANATE));
	public static RegistryObject<Block> starfruit_sapling = REGISTRY.register("starfruit_sapling", () -> new FruitSaplingBlock(sapling(), WorldGenRegistry.STARFRUIT));
	public static RegistryObject<Block> vanillabean_sapling = REGISTRY.register("vanillabean_sapling", () -> new FruitSaplingBlock(sapling(), WorldGenRegistry.VANILLABEAN));
	public static RegistryObject<Block> breadfruit_sapling = REGISTRY.register("breadfruit_sapling", () -> new FruitSaplingBlock(sapling(), WorldGenRegistry.BREADFRUIT));
	public static RegistryObject<Block> guava_sapling = REGISTRY.register("guava_sapling", () -> new FruitSaplingBlock(sapling(), WorldGenRegistry.GUAVA));
	public static RegistryObject<Block> jackfruit_sapling = REGISTRY.register("jackfruit_sapling", () -> new FruitSaplingBlock(sapling(), WorldGenRegistry.JACKFRUIT));
	public static RegistryObject<Block> lychee_sapling = REGISTRY.register("lychee_sapling", () -> new FruitSaplingBlock(sapling(), WorldGenRegistry.LYCHEE));
	public static RegistryObject<Block> passionfruit_sapling = REGISTRY.register("passionfruit_sapling", () -> new FruitSaplingBlock(sapling(), WorldGenRegistry.PASSIONFRUIT));
	public static RegistryObject<Block> rambutan_sapling = REGISTRY.register("rambutan_sapling", () -> new FruitSaplingBlock(sapling(), WorldGenRegistry.RAMBUTAN));
	public static RegistryObject<Block> tamarind_sapling = REGISTRY.register("tamarind_sapling", () -> new FruitSaplingBlock(sapling(), WorldGenRegistry.TAMARIND));
	//Cold Saplings
	public static RegistryObject<Block> maple_sapling = REGISTRY.register("maple_sapling", () -> new FruitSaplingBlock(sapling(), WorldGenRegistry.MAPLE));
	public static RegistryObject<Block> pinenut_sapling = REGISTRY.register("pinenut_sapling", () -> new FruitSaplingBlock(sapling(), WorldGenRegistry.PINENUT));

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
				.filter(block -> block instanceof FruitBlock || block instanceof LogFruitBlock);
	}

	public static Stream<Block> saplings() {
		return REGISTRY.getEntries().stream()
				.map(RegistryObject::get)
				.filter(block -> block instanceof FruitSaplingBlock);
	}
}
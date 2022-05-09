package com.pam.pamhc2trees.init;

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
	public static RegistryObject<Block> apple_sapling = REGISTRY.register("apple_sapling", () -> new BlockPamTemperateSapling(sapling(), 1));
	public static RegistryObject<Block> avocado_sapling = REGISTRY.register("avocado_sapling", () -> new BlockPamTemperateSapling(sapling(), 2));
	public static RegistryObject<Block> candlenut_sapling = REGISTRY.register("candlenut_sapling", () -> new BlockPamTemperateSapling(sapling(), 3));
	public static RegistryObject<Block> cherry_sapling = REGISTRY.register("cherry_sapling", () -> new BlockPamTemperateSapling(sapling(), 4));
	public static RegistryObject<Block> chestnut_sapling = REGISTRY.register("chestnut_sapling", () -> new BlockPamTemperateSapling(sapling(), 5));
	public static RegistryObject<Block> gooseberry_sapling = REGISTRY.register("gooseberry_sapling", () -> new BlockPamTemperateSapling(sapling(), 6));
	public static RegistryObject<Block> lemon_sapling = REGISTRY.register("lemon_sapling", () -> new BlockPamTemperateSapling(sapling(), 7));
	public static RegistryObject<Block> nutmeg_sapling = REGISTRY.register("nutmeg_sapling", () -> new BlockPamTemperateSapling(sapling(), 8));
	public static RegistryObject<Block> orange_sapling = REGISTRY.register("orange_sapling", () -> new BlockPamTemperateSapling(sapling(), 9));
	public static RegistryObject<Block> peach_sapling = REGISTRY.register("peach_sapling", () -> new BlockPamTemperateSapling(sapling(), 10));
	public static RegistryObject<Block> pear_sapling = REGISTRY.register("pear_sapling", () -> new BlockPamTemperateSapling(sapling(), 11));
	public static RegistryObject<Block> plum_sapling = REGISTRY.register("plum_sapling", () -> new BlockPamTemperateSapling(sapling(), 12));
	public static RegistryObject<Block> walnut_sapling = REGISTRY.register("walnut_sapling", () -> new BlockPamTemperateSapling(sapling(), 13));
	public static RegistryObject<Block> spiderweb_sapling = REGISTRY.register("spiderweb_sapling", () -> new BlockPamTemperateSapling(sapling(), 14));
	public static RegistryObject<Block> hazelnut_sapling = REGISTRY.register("hazelnut_sapling", () -> new BlockPamTemperateSapling(sapling(), 15));
	public static RegistryObject<Block> pawpaw_sapling = REGISTRY.register("pawpaw_sapling", () -> new BlockPamTemperateSapling(sapling(), 16));
	public static RegistryObject<Block> soursop_sapling = REGISTRY.register("soursop_sapling", () -> new BlockPamTemperateSapling(sapling(), 17));
	//Warm Saplings
	public static RegistryObject<Block> almond_sapling = REGISTRY.register("almond_sapling", () -> new BlockPamWarmSapling(sapling(), 1));
	public static RegistryObject<Block> apricot_sapling = REGISTRY.register("apricot_sapling", () -> new BlockPamWarmSapling(sapling(), 2));
	public static RegistryObject<Block> banana_sapling = REGISTRY.register("banana_sapling", () -> new BlockPamWarmSapling(sapling(), 3));
	public static RegistryObject<Block> cashew_sapling = REGISTRY.register("cashew_sapling", () -> new BlockPamWarmSapling(sapling(), 4));
	public static RegistryObject<Block> cinnamon_sapling = REGISTRY.register("cinnamon_sapling", () -> new BlockPamWarmLogSapling(sapling(), 1));
	public static RegistryObject<Block> coconut_sapling = REGISTRY.register("coconut_sapling", () -> new BlockPamWarmSapling(sapling(), 5));
	public static RegistryObject<Block> date_sapling = REGISTRY.register("date_sapling", () -> new BlockPamWarmSapling(sapling(), 6));
	public static RegistryObject<Block> dragonfruit_sapling = REGISTRY.register("dragonfruit_sapling", () -> new BlockPamWarmSapling(sapling(), 7));
	public static RegistryObject<Block> durian_sapling = REGISTRY.register("durian_sapling", () -> new BlockPamWarmSapling(sapling(), 8));
	public static RegistryObject<Block> fig_sapling = REGISTRY.register("fig_sapling", () -> new BlockPamWarmSapling(sapling(), 9));
	public static RegistryObject<Block> grapefruit_sapling = REGISTRY.register("grapefruit_sapling", () -> new BlockPamWarmSapling(sapling(), 10));
	public static RegistryObject<Block> lime_sapling = REGISTRY.register("lime_sapling", () -> new BlockPamWarmSapling(sapling(), 11));
	public static RegistryObject<Block> mango_sapling = REGISTRY.register("mango_sapling", () -> new BlockPamWarmSapling(sapling(), 12));
	public static RegistryObject<Block> olive_sapling = REGISTRY.register("olive_sapling", () -> new BlockPamWarmSapling(sapling(), 13));
	public static RegistryObject<Block> papaya_sapling = REGISTRY.register("papaya_sapling", () -> new BlockPamWarmSapling(sapling(), 14));
	public static RegistryObject<Block> paperbark_sapling = REGISTRY.register("paperbark_sapling", () -> new BlockPamWarmLogSapling(sapling(), 2));
	public static RegistryObject<Block> pecan_sapling = REGISTRY.register("pecan_sapling", () -> new BlockPamWarmSapling(sapling(), 15));
	public static RegistryObject<Block> peppercorn_sapling = REGISTRY.register("peppercorn_sapling", () -> new BlockPamWarmSapling(sapling(), 16));
	public static RegistryObject<Block> persimmon_sapling = REGISTRY.register("persimmon_sapling", () -> new BlockPamWarmSapling(sapling(), 17));
	public static RegistryObject<Block> pistachio_sapling = REGISTRY.register("pistachio_sapling", () -> new BlockPamWarmSapling(sapling(), 18));
	public static RegistryObject<Block> pomegranate_sapling = REGISTRY.register("pomegranate_sapling", () -> new BlockPamWarmSapling(sapling(), 19));
	public static RegistryObject<Block> starfruit_sapling = REGISTRY.register("starfruit_sapling", () -> new BlockPamWarmSapling(sapling(), 20));
	public static RegistryObject<Block> vanillabean_sapling = REGISTRY.register("vanillabean_sapling", () -> new BlockPamWarmSapling(sapling(), 21));
	public static RegistryObject<Block> breadfruit_sapling = REGISTRY.register("breadfruit_sapling", () -> new BlockPamWarmSapling(sapling(), 22));
	public static RegistryObject<Block> guava_sapling = REGISTRY.register("guava_sapling", () -> new BlockPamWarmSapling(sapling(), 23));
	public static RegistryObject<Block> jackfruit_sapling = REGISTRY.register("jackfruit_sapling", () -> new BlockPamWarmSapling(sapling(), 24));
	public static RegistryObject<Block> lychee_sapling = REGISTRY.register("lychee_sapling", () -> new BlockPamWarmSapling(sapling(), 25));
	public static RegistryObject<Block> passionfruit_sapling = REGISTRY.register("passionfruit_sapling", () -> new BlockPamWarmSapling(sapling(), 26));
	public static RegistryObject<Block> rambutan_sapling = REGISTRY.register("rambutan_sapling", () -> new BlockPamWarmSapling(sapling(), 27));
	public static RegistryObject<Block> tamarind_sapling = REGISTRY.register("tamarind_sapling", () -> new BlockPamWarmSapling(sapling(), 28));
	//Cold Saplings
	public static RegistryObject<Block> maple_sapling = REGISTRY.register("maple_sapling", () -> new BlockPamColdLogSapling(sapling(), 1));
	public static RegistryObject<Block> pinenut_sapling = REGISTRY.register("pinenut_sapling", () -> new BlockPamColdSapling(sapling(), 1));

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
}
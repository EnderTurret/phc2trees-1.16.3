package com.pam.pamhc2trees.init;

import java.util.stream.Stream;

import com.pam.pamhc2trees.Pamhc2trees;
import com.pam.pamhc2trees.items.FruitItem;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemRegistry {

	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, Pamhc2trees.MOD_ID);

	//Temperate Fruit Items
	public static RegistryObject<Item> avocadoitem = REGISTRY.register("avocadoitem", () -> new FruitItem(properties().food(FoodBuilderRegistry.AVOCADOITEM)));
	public static RegistryObject<Item> candlenutitem = REGISTRY.register("candlenutitem", () -> new FruitItem(properties().food(FoodBuilderRegistry.CANDLENUTITEM)));
	public static RegistryObject<Item> cherryitem = REGISTRY.register("cherryitem", () -> new FruitItem(properties().food(FoodBuilderRegistry.CHERRYITEM)));
	public static RegistryObject<Item> chestnutitem = REGISTRY.register("chestnutitem", () -> new FruitItem(properties().food(FoodBuilderRegistry.CHESTNUTITEM)));
	public static RegistryObject<Item> gooseberryitem = REGISTRY.register("gooseberryitem", () -> new FruitItem(properties().food(FoodBuilderRegistry.GOOSEBERRYITEM)));
	public static RegistryObject<Item> lemonitem = REGISTRY.register("lemonitem", () -> new FruitItem(properties().food(FoodBuilderRegistry.LEMONITEM)));
	public static RegistryObject<Item> nutmegitem = REGISTRY.register("nutmegitem", () -> new FruitItem(properties()));
	public static RegistryObject<Item> orangeitem = REGISTRY.register("orangeitem", () -> new FruitItem(properties().food(FoodBuilderRegistry.ORANGEITEM)));
	public static RegistryObject<Item> peachitem = REGISTRY.register("peachitem", () -> new FruitItem(properties().food(FoodBuilderRegistry.PEACHITEM)));
	public static RegistryObject<Item> pearitem = REGISTRY.register("pearitem", () -> new FruitItem(properties().food(FoodBuilderRegistry.PEARITEM)));
	public static RegistryObject<Item> plumitem = REGISTRY.register("plumitem", () -> new FruitItem(properties().food(FoodBuilderRegistry.PLUMITEM)));
	public static RegistryObject<Item> walnutitem = REGISTRY.register("walnutitem", () -> new FruitItem(properties().food(FoodBuilderRegistry.WALNUTITEM)));
	public static RegistryObject<Item> hazelnutitem = REGISTRY.register("hazelnutitem", () -> new FruitItem(properties().food(FoodBuilderRegistry.HAZELNUTITEM)));
	public static RegistryObject<Item> pawpawitem = REGISTRY.register("pawpawitem", () -> new FruitItem(properties().food(FoodBuilderRegistry.PAWPAWITEM)));
	public static RegistryObject<Item> soursopitem = REGISTRY.register("soursopitem", () -> new FruitItem(properties().food(FoodBuilderRegistry.SOURSOPITEM)));
	//Warm Fruit Items
	public static RegistryObject<Item> almonditem = REGISTRY.register("almonditem", () -> new FruitItem(properties().food(FoodBuilderRegistry.ALMONDITEM)));
	public static RegistryObject<Item> apricotitem = REGISTRY.register("apricotitem", () -> new FruitItem(properties().food(FoodBuilderRegistry.APRICOTITEM)));
	public static RegistryObject<Item> bananaitem = REGISTRY.register("bananaitem", () -> new FruitItem(properties().food(FoodBuilderRegistry.BANANAITEM)));
	public static RegistryObject<Item> cashewitem = REGISTRY.register("cashewitem", () -> new FruitItem(properties().food(FoodBuilderRegistry.CASHEWITEM)));
	public static RegistryObject<Item> cinnamonitem = REGISTRY.register("cinnamonitem", () -> new FruitItem(properties()));
	public static RegistryObject<Item> coconutitem = REGISTRY.register("coconutitem", () -> new FruitItem(properties().food(FoodBuilderRegistry.COCONUTITEM)));
	public static RegistryObject<Item> dateitem = REGISTRY.register("dateitem", () -> new FruitItem(properties().food(FoodBuilderRegistry.DATEITEM)));
	public static RegistryObject<Item> dragonfruititem = REGISTRY.register("dragonfruititem", () -> new FruitItem(properties().food(FoodBuilderRegistry.DRAGONFRUITITEM)));
	public static RegistryObject<Item> durianitem = REGISTRY.register("durianitem", () -> new FruitItem(properties().food(FoodBuilderRegistry.DURIANITEM)));
	public static RegistryObject<Item> figitem = REGISTRY.register("figitem", () -> new FruitItem(properties().food(FoodBuilderRegistry.FIGITEM)));
	public static RegistryObject<Item> grapefruititem = REGISTRY.register("grapefruititem", () -> new FruitItem(properties().food(FoodBuilderRegistry.GRAPEFRUITITEM)));
	public static RegistryObject<Item> limeitem = REGISTRY.register("limeitem", () -> new FruitItem(properties().food(FoodBuilderRegistry.LIMEITEM)));
	public static RegistryObject<Item> mangoitem = REGISTRY.register("mangoitem", () -> new FruitItem(properties().food(FoodBuilderRegistry.MANGOITEM)));
	public static RegistryObject<Item> oliveitem = REGISTRY.register("oliveitem", () -> new FruitItem(properties().food(FoodBuilderRegistry.OLIVEITEM)));
	public static RegistryObject<Item> papayaitem = REGISTRY.register("papayaitem", () -> new FruitItem(properties().food(FoodBuilderRegistry.PAPAYAITEM)));
	public static RegistryObject<Item> pecanitem = REGISTRY.register("pecanitem", () -> new FruitItem(properties().food(FoodBuilderRegistry.PECANITEM)));
	public static RegistryObject<Item> peppercornitem = REGISTRY.register("peppercornitem", () -> new FruitItem(properties()));
	public static RegistryObject<Item> persimmonitem = REGISTRY.register("persimmonitem", () -> new FruitItem(properties().food(FoodBuilderRegistry.PERSIMMONITEM)));
	public static RegistryObject<Item> pistachioitem = REGISTRY.register("pistachioitem", () -> new FruitItem(properties().food(FoodBuilderRegistry.PISTACHIOITEM)));
	public static RegistryObject<Item> pomegranateitem = REGISTRY.register("pomegranateitem", () -> new FruitItem(properties().food(FoodBuilderRegistry.POMEGRANATEITEM)));
	public static RegistryObject<Item> starfruititem = REGISTRY.register("starfruititem", () -> new FruitItem(properties().food(FoodBuilderRegistry.STARFRUITITEM)));
	public static RegistryObject<Item> vanillabeanitem = REGISTRY.register("vanillabeanitem", () -> new FruitItem(properties()));
	public static RegistryObject<Item> breadfruititem = REGISTRY.register("breadfruititem", () -> new FruitItem(properties().food(FoodBuilderRegistry.BREADFRUITITEM)));
	public static RegistryObject<Item> guavaitem = REGISTRY.register("guavaitem", () -> new FruitItem(properties().food(FoodBuilderRegistry.GUAVAITEM)));
	public static RegistryObject<Item> jackfruititem = REGISTRY.register("jackfruititem", () -> new FruitItem(properties().food(FoodBuilderRegistry.JACKFRUITITEM)));
	public static RegistryObject<Item> lycheeitem = REGISTRY.register("lycheeitem", () -> new FruitItem(properties().food(FoodBuilderRegistry.LYCHEEITEM)));
	public static RegistryObject<Item> passionfruititem = REGISTRY.register("passionfruititem", () -> new FruitItem(properties().food(FoodBuilderRegistry.PASSIONFRUITITEM)));
	public static RegistryObject<Item> rambutanitem = REGISTRY.register("rambutanitem", () -> new FruitItem(properties().food(FoodBuilderRegistry.RAMBUTANITEM)));
	public static RegistryObject<Item> tamarinditem = REGISTRY.register("tamarinditem", () -> new FruitItem(properties().food(FoodBuilderRegistry.TAMARINDITEM)));
	//Cold Fruit Items
	public static RegistryObject<Item> maplesyrupitem = REGISTRY.register("maplesyrupitem", () -> new FruitItem(properties().food(FoodBuilderRegistry.MAPLESYRUPITEM)));
	public static RegistryObject<Item> pinenutitem = REGISTRY.register("pinenutitem", () -> new FruitItem(properties().food(FoodBuilderRegistry.PINENUTITEM)));

	//Roasted Nuts
	public static RegistryObject<Item> roastedchestnutitem = REGISTRY.register("roastedchestnutitem", () -> new Item(properties().food(FoodBuilderRegistry.ROASTEDCHESTNUTITEM)));
	public static RegistryObject<Item> roastedhazelnutitem = REGISTRY.register("roastedhazelnutitem", () -> new Item(properties().food(FoodBuilderRegistry.ROASTEDHAZELNUTITEM)));
	public static RegistryObject<Item> roastedwalnutitem = REGISTRY.register("roastedwalnutitem", () -> new Item(properties().food(FoodBuilderRegistry.ROASTEDWALNUTITEM)));

	public static RegistryObject<Item> roastedalmonditem = REGISTRY.register("roastedalmonditem", () -> new Item(properties().food(FoodBuilderRegistry.ROASTEDALMONDITEM)));
	public static RegistryObject<Item> roastedcashewitem = REGISTRY.register("roastedcashewitem", () -> new Item(properties().food(FoodBuilderRegistry.ROASTEDCASHEWITEM)));
	public static RegistryObject<Item> roastedpecanitem = REGISTRY.register("roastedpecanitem", () -> new Item(properties().food(FoodBuilderRegistry.ROASTEDPECANITEM)));
	public static RegistryObject<Item> roastedpistachioitem = REGISTRY.register("roastedpistachioitem", () -> new Item(properties().food(FoodBuilderRegistry.ROASTEDPISTACHIOITEM)));

	public static RegistryObject<Item> roastedpinenutitem = REGISTRY.register("roastedpinenutitem", () -> new Item(properties().food(FoodBuilderRegistry.ROASTEDPINENUTITEM)));

	private static Item.Properties properties() {
		return new Item.Properties().tab(Pamhc2trees.ITEM_GROUP);
	}

	public static void registerBlockItems() {
		for (RegistryObject<Block> block : BlockRegistry.REGISTRY.getEntries())
			REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), properties()));
	}

	public static Stream<Item> fruits() {
		return REGISTRY.getEntries().stream()
				.map(RegistryObject::get)
				.filter(block -> block instanceof FruitItem);
	}
}
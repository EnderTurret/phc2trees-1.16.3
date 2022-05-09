package com.pam.pamhc2trees.init;

import com.pam.pamhc2trees.Pamhc2trees;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemRegistry {

	//Temperate Fruit Items
	public static Item avocadoitem;
	public static Item candlenutitem;
	public static Item cherryitem;
	public static Item chestnutitem;
	public static Item gooseberryitem;
	public static Item lemonitem;
	public static Item nutmegitem;
	public static Item orangeitem;
	public static Item peachitem;
	public static Item pearitem;
	public static Item plumitem;
	public static Item walnutitem;
	public static Item hazelnutitem;
	public static Item pawpawitem;
	public static Item soursopitem;
	//Warm Fruit Items
	public static Item almonditem;
	public static Item apricotitem;
	public static Item bananaitem;
	public static Item cashewitem;
	public static Item cinnamonitem;
	public static Item coconutitem;
	public static Item dateitem;
	public static Item dragonfruititem;
	public static Item durianitem;
	public static Item figitem;
	public static Item grapefruititem;
	public static Item limeitem;
	public static Item mangoitem;
	public static Item oliveitem;
	public static Item papayaitem;
	public static Item pecanitem;
	public static Item peppercornitem;
	public static Item persimmonitem;
	public static Item pistachioitem;
	public static Item pomegranateitem;
	public static Item starfruititem;
	public static Item vanillabeanitem;
	public static Item breadfruititem;
	public static Item guavaitem;
	public static Item jackfruititem;
	public static Item lycheeitem;
	public static Item passionfruititem;
	public static Item rambutanitem;
	public static Item tamarinditem;
	//Cold Fruit Items
	public static Item maplesyrupitem;
	public static Item pinenutitem;

	//Roasted Nuts
	public static Item roastedchestnutitem;
	public static Item roastedhazelnutitem;
	public static Item roastedwalnutitem;

	public static Item roastedalmonditem;
	public static Item roastedcashewitem;
	public static Item roastedpecanitem;
	public static Item roastedpistachioitem;

	public static Item roastedpinenutitem;

	private static Item.Properties properties() {
		return new Item.Properties().tab(Pamhc2trees.ITEM_GROUP);
	}

	public static void registerBlockItems(RegistryEvent.Register<Item> event) {
		for (RegistryObject<Block> block : BlockRegistry.REGISTRY.getEntries())
			event.getRegistry().register(new BlockItem(block.get(), properties()).setRegistryName(block.getId()));
	}

	public static void registerAll(RegistryEvent.Register<Item> event) {
		if (!event.getName().equals(ForgeRegistries.ITEMS.getRegistryName()))
			return;

		registerBlockItems(event);

		//Temperate Fruit Items
		avocadoitem = register("avocadoitem", new Item((new Item.Properties()).tab(Pamhc2trees.ITEM_GROUP).food(FoodBuilderRegistry.AVOCADOITEM)));
		candlenutitem = register("candlenutitem", new Item((new Item.Properties()).tab(Pamhc2trees.ITEM_GROUP).food(FoodBuilderRegistry.CANDLENUTITEM)));
		cherryitem = register("cherryitem", new Item((new Item.Properties()).tab(Pamhc2trees.ITEM_GROUP).food(FoodBuilderRegistry.CHERRYITEM)));
		chestnutitem = register("chestnutitem", new Item((new Item.Properties()).tab(Pamhc2trees.ITEM_GROUP).food(FoodBuilderRegistry.CHESTNUTITEM)));
		gooseberryitem = register("gooseberryitem", new Item((new Item.Properties()).tab(Pamhc2trees.ITEM_GROUP).food(FoodBuilderRegistry.GOOSEBERRYITEM)));
		lemonitem = register("lemonitem", new Item((new Item.Properties()).tab(Pamhc2trees.ITEM_GROUP).food(FoodBuilderRegistry.LEMONITEM)));
		nutmegitem = register("nutmegitem", new Item((new Item.Properties()).tab(Pamhc2trees.ITEM_GROUP)));
		orangeitem = register("orangeitem", new Item((new Item.Properties()).tab(Pamhc2trees.ITEM_GROUP).food(FoodBuilderRegistry.ORANGEITEM)));
		peachitem = register("peachitem", new Item((new Item.Properties()).tab(Pamhc2trees.ITEM_GROUP).food(FoodBuilderRegistry.PEACHITEM)));
		pearitem = register("pearitem", new Item((new Item.Properties()).tab(Pamhc2trees.ITEM_GROUP).food(FoodBuilderRegistry.PEARITEM)));
		plumitem = register("plumitem", new Item((new Item.Properties()).tab(Pamhc2trees.ITEM_GROUP).food(FoodBuilderRegistry.PLUMITEM)));
		walnutitem = register("walnutitem", new Item((new Item.Properties()).tab(Pamhc2trees.ITEM_GROUP).food(FoodBuilderRegistry.WALNUTITEM)));
		hazelnutitem = register("hazelnutitem", new Item((new Item.Properties()).tab(Pamhc2trees.ITEM_GROUP).food(FoodBuilderRegistry.HAZELNUTITEM)));
		pawpawitem = register("pawpawitem", new Item((new Item.Properties()).tab(Pamhc2trees.ITEM_GROUP).food(FoodBuilderRegistry.PAWPAWITEM)));
		soursopitem = register("soursopitem", new Item((new Item.Properties()).tab(Pamhc2trees.ITEM_GROUP).food(FoodBuilderRegistry.SOURSOPITEM)));
		//Warm Fruit Items
		almonditem = register("almonditem", new Item((new Item.Properties()).tab(Pamhc2trees.ITEM_GROUP).food(FoodBuilderRegistry.ALMONDITEM)));
		apricotitem = register("apricotitem", new Item((new Item.Properties()).tab(Pamhc2trees.ITEM_GROUP).food(FoodBuilderRegistry.APRICOTITEM)));
		bananaitem = register("bananaitem", new Item((new Item.Properties()).tab(Pamhc2trees.ITEM_GROUP).food(FoodBuilderRegistry.BANANAITEM)));
		cashewitem = register("cashewitem", new Item((new Item.Properties()).tab(Pamhc2trees.ITEM_GROUP).food(FoodBuilderRegistry.CASHEWITEM)));
		cinnamonitem = register("cinnamonitem", new Item((new Item.Properties()).tab(Pamhc2trees.ITEM_GROUP)));
		coconutitem = register("coconutitem", new Item((new Item.Properties()).tab(Pamhc2trees.ITEM_GROUP).food(FoodBuilderRegistry.COCONUTITEM)));
		dateitem = register("dateitem", new Item((new Item.Properties()).tab(Pamhc2trees.ITEM_GROUP).food(FoodBuilderRegistry.DATEITEM)));
		dragonfruititem = register("dragonfruititem", new Item((new Item.Properties()).tab(Pamhc2trees.ITEM_GROUP).food(FoodBuilderRegistry.DRAGONFRUITITEM)));
		durianitem = register("durianitem", new Item((new Item.Properties()).tab(Pamhc2trees.ITEM_GROUP).food(FoodBuilderRegistry.DURIANITEM)));
		figitem = register("figitem", new Item((new Item.Properties()).tab(Pamhc2trees.ITEM_GROUP).food(FoodBuilderRegistry.FIGITEM)));
		grapefruititem = register("grapefruititem", new Item((new Item.Properties()).tab(Pamhc2trees.ITEM_GROUP).food(FoodBuilderRegistry.GRAPEFRUITITEM)));
		limeitem = register("limeitem", new Item((new Item.Properties()).tab(Pamhc2trees.ITEM_GROUP).food(FoodBuilderRegistry.LIMEITEM)));
		mangoitem = register("mangoitem", new Item((new Item.Properties()).tab(Pamhc2trees.ITEM_GROUP).food(FoodBuilderRegistry.MANGOITEM)));
		oliveitem = register("oliveitem", new Item((new Item.Properties()).tab(Pamhc2trees.ITEM_GROUP).food(FoodBuilderRegistry.OLIVEITEM)));
		papayaitem = register("papayaitem", new Item((new Item.Properties()).tab(Pamhc2trees.ITEM_GROUP).food(FoodBuilderRegistry.PAPAYAITEM)));
		pecanitem = register("pecanitem", new Item((new Item.Properties()).tab(Pamhc2trees.ITEM_GROUP).food(FoodBuilderRegistry.PECANITEM)));
		peppercornitem = register("peppercornitem", new Item((new Item.Properties()).tab(Pamhc2trees.ITEM_GROUP)));
		persimmonitem = register("persimmonitem", new Item((new Item.Properties()).tab(Pamhc2trees.ITEM_GROUP).food(FoodBuilderRegistry.PERSIMMONITEM)));
		pistachioitem = register("pistachioitem", new Item((new Item.Properties()).tab(Pamhc2trees.ITEM_GROUP).food(FoodBuilderRegistry.PISTACHIOITEM)));
		pomegranateitem = register("pomegranateitem", new Item((new Item.Properties()).tab(Pamhc2trees.ITEM_GROUP).food(FoodBuilderRegistry.POMEGRANATEITEM)));
		starfruititem = register("starfruititem", new Item((new Item.Properties()).tab(Pamhc2trees.ITEM_GROUP).food(FoodBuilderRegistry.STARFRUITITEM)));
		vanillabeanitem = register("vanillabeanitem", new Item((new Item.Properties()).tab(Pamhc2trees.ITEM_GROUP)));
		breadfruititem = register("breadfruititem", new Item((new Item.Properties()).tab(Pamhc2trees.ITEM_GROUP).food(FoodBuilderRegistry.BREADFRUITITEM)));
		guavaitem = register("guavaitem", new Item((new Item.Properties()).tab(Pamhc2trees.ITEM_GROUP).food(FoodBuilderRegistry.GUAVAITEM)));
		jackfruititem = register("jackfruititem", new Item((new Item.Properties()).tab(Pamhc2trees.ITEM_GROUP).food(FoodBuilderRegistry.JACKFRUITITEM)));
		lycheeitem = register("lycheeitem", new Item((new Item.Properties()).tab(Pamhc2trees.ITEM_GROUP).food(FoodBuilderRegistry.LYCHEEITEM)));
		passionfruititem = register("passionfruititem", new Item((new Item.Properties()).tab(Pamhc2trees.ITEM_GROUP).food(FoodBuilderRegistry.PASSIONFRUITITEM)));
		rambutanitem = register("rambutanitem", new Item((new Item.Properties()).tab(Pamhc2trees.ITEM_GROUP).food(FoodBuilderRegistry.RAMBUTANITEM)));
		tamarinditem = register("tamarinditem", new Item((new Item.Properties()).tab(Pamhc2trees.ITEM_GROUP).food(FoodBuilderRegistry.TAMARINDITEM)));
		//Cold Fruit Items
		maplesyrupitem = register("maplesyrupitem", new Item((new Item.Properties()).tab(Pamhc2trees.ITEM_GROUP).food(FoodBuilderRegistry.MAPLESYRUPITEM)));
		pinenutitem = register("pinenutitem", new Item((new Item.Properties()).tab(Pamhc2trees.ITEM_GROUP).food(FoodBuilderRegistry.PINENUTITEM)));

		//Roasted Nuts
		roastedchestnutitem = register("roastedchestnutitem", new Item((new Item.Properties()).tab(Pamhc2trees.ITEM_GROUP).food(FoodBuilderRegistry.ROASTEDCHESTNUTITEM)));
		roastedhazelnutitem = register("roastedhazelnutitem", new Item((new Item.Properties()).tab(Pamhc2trees.ITEM_GROUP).food(FoodBuilderRegistry.ROASTEDHAZELNUTITEM)));
		roastedwalnutitem = register("roastedwalnutitem", new Item((new Item.Properties()).tab(Pamhc2trees.ITEM_GROUP).food(FoodBuilderRegistry.ROASTEDWALNUTITEM)));

		roastedalmonditem = register("roastedalmonditem", new Item((new Item.Properties()).tab(Pamhc2trees.ITEM_GROUP).food(FoodBuilderRegistry.ROASTEDALMONDITEM)));
		roastedcashewitem = register("roastedcashewitem", new Item((new Item.Properties()).tab(Pamhc2trees.ITEM_GROUP).food(FoodBuilderRegistry.ROASTEDCASHEWITEM)));
		roastedpecanitem = register("roastedpecanitem", new Item((new Item.Properties()).tab(Pamhc2trees.ITEM_GROUP).food(FoodBuilderRegistry.ROASTEDPECANITEM)));
		roastedpistachioitem = register("roastedpistachioitem", new Item((new Item.Properties()).tab(Pamhc2trees.ITEM_GROUP).food(FoodBuilderRegistry.ROASTEDPISTACHIOITEM)));

		roastedpinenutitem = register("roastedpinenutitem", new Item((new Item.Properties()).tab(Pamhc2trees.ITEM_GROUP).food(FoodBuilderRegistry.ROASTEDPINENUTITEM)));
	}

	private static <T extends Item> T register(String name, T item) {
		ResourceLocation id = Pamhc2trees.getId(name);
		item.setRegistryName(id);
		ForgeRegistries.ITEMS.register(item);
		return item;
	}
}
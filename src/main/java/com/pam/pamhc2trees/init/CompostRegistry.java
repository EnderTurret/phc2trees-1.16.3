package com.pam.pamhc2trees.init;

import net.minecraft.world.level.block.ComposterBlock;

public class CompostRegistry {

	public static void register() {
		//Temperate Fruits
		ComposterBlock.COMPOSTABLES.put(ItemRegistry.avocadoitem, 0.65F);
		ComposterBlock.COMPOSTABLES.put(ItemRegistry.candlenutitem, 0.65F);
		ComposterBlock.COMPOSTABLES.put(ItemRegistry.cherryitem, 0.65F);
		ComposterBlock.COMPOSTABLES.put(ItemRegistry.chestnutitem, 0.65F);
		ComposterBlock.COMPOSTABLES.put(ItemRegistry.gooseberryitem, 0.65F);
		ComposterBlock.COMPOSTABLES.put(ItemRegistry.lemonitem, 0.65F);
		ComposterBlock.COMPOSTABLES.put(ItemRegistry.nutmegitem, 0.65F);
		ComposterBlock.COMPOSTABLES.put(ItemRegistry.orangeitem, 0.65F);
		ComposterBlock.COMPOSTABLES.put(ItemRegistry.peachitem, 0.65F);
		ComposterBlock.COMPOSTABLES.put(ItemRegistry.pearitem, 0.65F);
		ComposterBlock.COMPOSTABLES.put(ItemRegistry.plumitem, 0.65F);
		ComposterBlock.COMPOSTABLES.put(ItemRegistry.walnutitem, 0.65F);
		ComposterBlock.COMPOSTABLES.put(ItemRegistry.hazelnutitem, 0.65F);
		ComposterBlock.COMPOSTABLES.put(ItemRegistry.pawpawitem, 0.65F);
		ComposterBlock.COMPOSTABLES.put(ItemRegistry.soursopitem, 0.65F);
		//Warm Fruits
		ComposterBlock.COMPOSTABLES.put(ItemRegistry.almonditem, 0.65F);
		ComposterBlock.COMPOSTABLES.put(ItemRegistry.apricotitem, 0.65F);
		ComposterBlock.COMPOSTABLES.put(ItemRegistry.bananaitem, 0.65F);
		ComposterBlock.COMPOSTABLES.put(ItemRegistry.cashewitem, 0.65F);
		ComposterBlock.COMPOSTABLES.put(ItemRegistry.cinnamonitem, 0.65F);
		ComposterBlock.COMPOSTABLES.put(ItemRegistry.coconutitem, 0.65F);
		ComposterBlock.COMPOSTABLES.put(ItemRegistry.dateitem, 0.65F);
		ComposterBlock.COMPOSTABLES.put(ItemRegistry.dragonfruititem, 0.65F);
		ComposterBlock.COMPOSTABLES.put(ItemRegistry.durianitem, 0.65F);
		ComposterBlock.COMPOSTABLES.put(ItemRegistry.figitem, 0.65F);
		ComposterBlock.COMPOSTABLES.put(ItemRegistry.grapefruititem, 0.65F);
		ComposterBlock.COMPOSTABLES.put(ItemRegistry.limeitem, 0.65F);
		ComposterBlock.COMPOSTABLES.put(ItemRegistry.mangoitem, 0.65F);
		ComposterBlock.COMPOSTABLES.put(ItemRegistry.oliveitem, 0.65F);
		ComposterBlock.COMPOSTABLES.put(ItemRegistry.papayaitem, 0.65F);
		ComposterBlock.COMPOSTABLES.put(ItemRegistry.pecanitem, 0.65F);
		ComposterBlock.COMPOSTABLES.put(ItemRegistry.peppercornitem, 0.65F);
		ComposterBlock.COMPOSTABLES.put(ItemRegistry.persimmonitem, 0.65F);
		ComposterBlock.COMPOSTABLES.put(ItemRegistry.pistachioitem, 0.65F);
		ComposterBlock.COMPOSTABLES.put(ItemRegistry.pomegranateitem, 0.65F);
		ComposterBlock.COMPOSTABLES.put(ItemRegistry.starfruititem, 0.65F);
		ComposterBlock.COMPOSTABLES.put(ItemRegistry.vanillabeanitem, 0.65F);
		ComposterBlock.COMPOSTABLES.put(ItemRegistry.breadfruititem, 0.65F);
		ComposterBlock.COMPOSTABLES.put(ItemRegistry.guavaitem, 0.65F);
		ComposterBlock.COMPOSTABLES.put(ItemRegistry.jackfruititem, 0.65F);
		ComposterBlock.COMPOSTABLES.put(ItemRegistry.lycheeitem, 0.65F);
		ComposterBlock.COMPOSTABLES.put(ItemRegistry.passionfruititem, 0.65F);
		ComposterBlock.COMPOSTABLES.put(ItemRegistry.rambutanitem, 0.65F);
		ComposterBlock.COMPOSTABLES.put(ItemRegistry.tamarinditem, 0.65F);
		//Cold Fruits
		ComposterBlock.COMPOSTABLES.put(ItemRegistry.maplesyrupitem, 0.65F);
		ComposterBlock.COMPOSTABLES.put(ItemRegistry.pinenutitem, 0.65F);

		BlockRegistry.saplings().forEach(sapling -> ComposterBlock.COMPOSTABLES.put(sapling, 0.3F));
	}
}
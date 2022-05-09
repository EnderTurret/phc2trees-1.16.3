package com.pam.pamhc2trees.init;

import net.minecraft.world.level.block.ComposterBlock;

public class CompostRegistry {

	public static void register() {
		ItemRegistry.fruits().forEach(fruit -> ComposterBlock.COMPOSTABLES.put(fruit, 0.65F));
		BlockRegistry.saplings().forEach(sapling -> ComposterBlock.COMPOSTABLES.put(sapling, 0.3F));
	}
}
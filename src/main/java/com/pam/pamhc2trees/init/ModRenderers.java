package com.pam.pamhc2trees.init;

import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;

public class ModRenderers {

	public static void registerBlockLayers() {
		BlockRegistry.fruits().forEach(fruit -> ItemBlockRenderTypes.setRenderLayer(fruit, RenderType.cutout()));
		BlockRegistry.saplings().forEach(sapling -> ItemBlockRenderTypes.setRenderLayer(sapling, RenderType.cutout()));
	}
}
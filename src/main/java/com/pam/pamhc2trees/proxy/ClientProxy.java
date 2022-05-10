package com.pam.pamhc2trees.proxy;

import com.pam.pamhc2trees.init.ModRenderers;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

public final class ClientProxy implements Proxy {

	public ClientProxy() {
		FMLJavaModLoadingContext.get().getModEventBus().addListener(ClientProxy::clientSetup);
	}

	private static void clientSetup(FMLClientSetupEvent event) {
		ModRenderers.registerBlockLayers();
	}
}
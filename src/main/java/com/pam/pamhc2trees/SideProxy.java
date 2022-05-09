package com.pam.pamhc2trees;

import com.pam.pamhc2trees.config.Config;
import com.pam.pamhc2trees.events.EventSetup;
import com.pam.pamhc2trees.init.BlockRegistry;
import com.pam.pamhc2trees.init.ColdFruitTreeWorldGenRegistry;
import com.pam.pamhc2trees.init.CompostRegistry;
import com.pam.pamhc2trees.init.ItemRegistry;
import com.pam.pamhc2trees.init.ModRenderers;
import com.pam.pamhc2trees.init.TemperateFruitTreeWorldGenRegistry;
import com.pam.pamhc2trees.init.WarmFruitTreeWorldGenRegistry;
import com.pam.pamhc2trees.init.WorldGenRegistry;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLDedicatedServerSetupEvent;
import net.minecraftforge.fml.event.lifecycle.InterModEnqueueEvent;
import net.minecraftforge.fml.event.lifecycle.InterModProcessEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.loading.FMLPaths;

public class SideProxy {
	SideProxy() {
		ModLoadingContext.get().registerConfig(ModConfig.Type.SERVER, Config.CONFIG, "pamhc2trees.toml");

		final IEventBus modBus = FMLJavaModLoadingContext.get().getModEventBus();

		modBus.addListener(SideProxy::commonSetup);
		BlockRegistry.REGISTRY.register(modBus);

		modBus.addGenericListener(Item.class, ItemRegistry::registerAll);
		modBus.addGenericListener(Feature.class, WorldGenRegistry::registerFeatures);

		Config.loadConfig(Config.CONFIG, FMLPaths.CONFIGDIR.get().resolve("pamhc2trees.toml").toString());

		MinecraftForge.EVENT_BUS.addListener(SideProxy::onBiomeLoad);
	}

	private static void commonSetup(FMLCommonSetupEvent event) {
		EventSetup.setupEvents();

		// Must do in enqueue work as registering to vanilla registries is not thread safe as many of the maps are not a synchronized map.
		event.enqueueWork(() -> {
			WorldGenRegistry.registerConfiguredFeatures();
			WorldGenRegistry.registerPlacedFeatures();
			CompostRegistry.register();
		});
	}

	private static void onBiomeLoad(BiomeLoadingEvent event) {
		TemperateFruitTreeWorldGenRegistry.addToBiome(event);
		WarmFruitTreeWorldGenRegistry.addToBiomes(event);
		ColdFruitTreeWorldGenRegistry.addToBiomes(event);
	}

	static class Client extends SideProxy {
		Client() {
			FMLJavaModLoadingContext.get().getModEventBus().addListener(Client::clientSetup);
		}

		private static void clientSetup(FMLClientSetupEvent event) {
			ModRenderers.registerBlocks();
		}
	}

	static class Server extends SideProxy {
		Server() {}
	}
}
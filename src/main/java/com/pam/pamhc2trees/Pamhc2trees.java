package com.pam.pamhc2trees;

import javax.annotation.Nonnull;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.pam.pamhc2trees.config.Config;
import com.pam.pamhc2trees.events.EventSetup;
import com.pam.pamhc2trees.init.BlockRegistry;
import com.pam.pamhc2trees.init.ColdFruitTreeWorldGenRegistry;
import com.pam.pamhc2trees.init.CompostRegistry;
import com.pam.pamhc2trees.init.ItemRegistry;
import com.pam.pamhc2trees.init.TemperateFruitTreeWorldGenRegistry;
import com.pam.pamhc2trees.init.WarmFruitTreeWorldGenRegistry;
import com.pam.pamhc2trees.init.WorldGenRegistry;
import com.pam.pamhc2trees.proxy.ClientProxy;
import com.pam.pamhc2trees.proxy.ServerProxy;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.loading.FMLPaths;

@Mod("pamhc2trees")
public class Pamhc2trees {

	public static final String MOD_ID = "pamhc2trees";
	public static final Logger LOGGER = LogManager.getLogger();

	public static final CreativeModeTab ITEM_GROUP = new CreativeModeTab("pamhc2trees") {
		@Override
		public ItemStack makeIcon() {
			return new ItemStack(BlockRegistry.apple_sapling.get());
		}
	};

	public Pamhc2trees() {
		DistExecutor.safeRunForDist(() -> ClientProxy::new, () -> ServerProxy::new);

		ModLoadingContext.get().registerConfig(ModConfig.Type.SERVER, Config.CONFIG, "pamhc2trees.toml");
		Config.loadConfig(Config.CONFIG, FMLPaths.CONFIGDIR.get().resolve("pamhc2trees.toml"));

		final IEventBus modBus = FMLJavaModLoadingContext.get().getModEventBus();

		BlockRegistry.REGISTRY.register(modBus);

		modBus.addGenericListener(Item.class, ItemRegistry::registerAll);
		modBus.addGenericListener(Feature.class, WorldGenRegistry::registerFeatures);

		modBus.addListener(Pamhc2trees::commonSetup);
		MinecraftForge.EVENT_BUS.addListener(Pamhc2trees::onBiomeLoad);
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

	@Nonnull
	public static ResourceLocation getId(String path) {
		return new ResourceLocation(MOD_ID, path);
	}
}
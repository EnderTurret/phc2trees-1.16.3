package com.pam.pamhc2trees.events;

import com.pam.pamhc2trees.events.harvest.FruitHarvest;

import net.minecraftforge.common.MinecraftForge;


public class EventSetup {

	public static void setupEvents() {
		MinecraftForge.EVENT_BUS.register(new TemptationTask());
		MinecraftForge.EVENT_BUS.register(new FruitHarvest());
	}
}
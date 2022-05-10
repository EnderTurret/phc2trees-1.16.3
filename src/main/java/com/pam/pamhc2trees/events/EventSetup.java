package com.pam.pamhc2trees.events;

import net.minecraftforge.common.MinecraftForge;

public class EventSetup {

	public static void setupEvents() {
		MinecraftForge.EVENT_BUS.register(new TemptationTask());
	}
}
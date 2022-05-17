package com.pam.pamhc2trees.config;

import java.nio.file.Path;

import com.electronwill.nightconfig.core.file.CommentedFileConfig;
import com.electronwill.nightconfig.core.io.WritingMode;

import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.fml.common.Mod;

public class Config {

	public static final ForgeConfigSpec CONFIG;

	static {
		ForgeConfigSpec.Builder builder = new ForgeConfigSpec.Builder();

		builder.push("Tweak World Generation Rates");
		ChanceConfig.init(builder);
		builder.pop();

		builder.push("Enable/Disable Garden World Generation");
		EnableConfig.init(builder);
		builder.pop();

		builder.push("Dimensions Settings");
		DimensionConfig.init(builder);
		builder.pop();

		CONFIG = builder.build();
	}

	/*public static void loadConfig(ForgeConfigSpec config, Path path) {
		CommentedFileConfig file = CommentedFileConfig.builder(path).sync().autosave().writingMode(WritingMode.REPLACE)
				.build();
		file.load();
		config.setConfig(file);
	}*/
}
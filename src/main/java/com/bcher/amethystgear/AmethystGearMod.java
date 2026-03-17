package com.bcher.amethystgear;

import com.bcher.amethystgear.item.ModItemGroups;
import com.bcher.amethystgear.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import net.fabricmc.api.ModInitializer;

public class AmethystGearMod implements ModInitializer {
	public static final String MOD_ID = "amethystgear";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.initialize();
		ModItemGroups.initialize();
		LOGGER.info("Loaded {}", MOD_ID);
	}
}

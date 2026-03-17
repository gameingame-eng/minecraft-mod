package com.bcher.amethystgear.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.world.item.CreativeModeTabs;

public final class ModItemGroups {
	public static void initialize() {
		ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.COMBAT).register(entries -> {
			entries.accept(ModItems.AMETHYST_SWORD);
			entries.accept(ModItems.AMETHYST_HELMET);
			entries.accept(ModItems.AMETHYST_CHESTPLATE);
			entries.accept(ModItems.AMETHYST_LEGGINGS);
			entries.accept(ModItems.AMETHYST_BOOTS);
		});

		ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.TOOLS_AND_UTILITIES).register(entries -> {
			entries.accept(ModItems.AMETHYST_PICKAXE);
			entries.accept(ModItems.AMETHYST_AXE);
			entries.accept(ModItems.AMETHYST_SHOVEL);
			entries.accept(ModItems.AMETHYST_HOE);
		});
	}

	private ModItemGroups() {
	}
}

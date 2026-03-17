package com.bcher.amethystgear.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;

public final class ModItemGroups {
	private static final RegistryKey<ItemGroup> COMBAT_GROUP = RegistryKey.of(RegistryKeys.ITEM_GROUP, Identifier.ofVanilla("combat"));
	private static final RegistryKey<ItemGroup> TOOLS_GROUP = RegistryKey.of(RegistryKeys.ITEM_GROUP, Identifier.ofVanilla("tools"));

	public static void initialize() {
		ItemGroupEvents.modifyEntriesEvent(COMBAT_GROUP).register(entries -> {
			entries.add(ModItems.AMETHYST_SWORD);
			entries.add(ModItems.AMETHYST_HELMET);
			entries.add(ModItems.AMETHYST_CHESTPLATE);
			entries.add(ModItems.AMETHYST_LEGGINGS);
			entries.add(ModItems.AMETHYST_BOOTS);
		});

		ItemGroupEvents.modifyEntriesEvent(TOOLS_GROUP).register(entries -> {
			entries.add(ModItems.AMETHYST_PICKAXE);
			entries.add(ModItems.AMETHYST_AXE);
			entries.add(ModItems.AMETHYST_SHOVEL);
			entries.add(ModItems.AMETHYST_HOE);
		});
	}

	private ModItemGroups() {
	}
}

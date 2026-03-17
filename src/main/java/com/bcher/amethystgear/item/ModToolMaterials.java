package com.bcher.amethystgear.item;

import net.minecraft.item.ToolMaterial;
import net.minecraft.registry.tag.BlockTags;

public final class ModToolMaterials {
	public static final ToolMaterial AMETHYST = new ToolMaterial(
		BlockTags.INCORRECT_FOR_DIAMOND_TOOL,
		1561,
		8.0F,
		3.0F,
		18,
		ModArmorMaterials.REPAIRS_AMETHYST_GEAR
	);

	private ModToolMaterials() {
	}
}

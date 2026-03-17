package com.bcher.amethystgear.item;

import com.bcher.amethystgear.AmethystGearMod;
import java.util.Map;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.equipment.ArmorType;
import net.minecraft.world.item.equipment.EquipmentAsset;
import net.minecraft.world.item.equipment.EquipmentAssets;

public final class ModArmorMaterials {
	public static final int BASE_DURABILITY = 28;
	public static final TagKey<Item> REPAIRS_AMETHYST_GEAR = TagKey.create(
		BuiltInRegistries.ITEM.key(),
		ResourceLocation.fromNamespaceAndPath(AmethystGearMod.MOD_ID, "repairs_amethyst_gear")
	);
	public static final ResourceKey<EquipmentAsset> AMETHYST_ASSET = ResourceKey.create(
		EquipmentAssets.ROOT_ID,
		ResourceLocation.fromNamespaceAndPath(AmethystGearMod.MOD_ID, "amethyst")
	);
	public static final ArmorMaterial AMETHYST = new ArmorMaterial(
		BASE_DURABILITY,
		Map.of(
			ArmorType.HELMET, 3,
			ArmorType.CHESTPLATE, 8,
			ArmorType.LEGGINGS, 6,
			ArmorType.BOOTS, 3
		),
		18,
		SoundEvents.ARMOR_EQUIP_DIAMOND,
		2.0F,
		0.0F,
		REPAIRS_AMETHYST_GEAR,
		AMETHYST_ASSET
	);

	private ModArmorMaterials() {
	}
}

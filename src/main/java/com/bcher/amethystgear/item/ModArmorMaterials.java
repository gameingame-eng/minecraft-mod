package com.bcher.amethystgear.item;

import com.bcher.amethystgear.AmethystGearMod;
import java.util.Map;
import net.minecraft.item.Item;
import net.minecraft.item.equipment.EquipmentAsset;
import net.minecraft.item.equipment.EquipmentAssetKeys;
import net.minecraft.item.equipment.EquipmentType;
import net.minecraft.item.equipment.ArmorMaterial;
import net.minecraft.registry.Registries;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;

public final class ModArmorMaterials {
	public static final int BASE_DURABILITY = 28;
	public static final TagKey<Item> REPAIRS_AMETHYST_GEAR = TagKey.of(
		Registries.ITEM.getKey(),
		Identifier.of(AmethystGearMod.MOD_ID, "repairs_amethyst_gear")
	);
	public static final RegistryKey<EquipmentAsset> AMETHYST_ASSET = RegistryKey.of(
		EquipmentAssetKeys.REGISTRY_KEY,
		Identifier.of(AmethystGearMod.MOD_ID, "amethyst")
	);
	public static final ArmorMaterial AMETHYST = new ArmorMaterial(
		BASE_DURABILITY,
		Map.of(
			EquipmentType.HELMET, 3,
			EquipmentType.CHESTPLATE, 8,
			EquipmentType.LEGGINGS, 6,
			EquipmentType.BOOTS, 3
		),
		18,
		SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND,
		2.0F,
		0.0F,
		REPAIRS_AMETHYST_GEAR,
		AMETHYST_ASSET
	);

	private ModArmorMaterials() {
	}
}

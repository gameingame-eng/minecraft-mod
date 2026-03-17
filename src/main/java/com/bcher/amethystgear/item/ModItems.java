package com.bcher.amethystgear.item;

import com.bcher.amethystgear.AmethystGearMod;
import java.util.function.Function;
import net.minecraft.item.Item;
import net.minecraft.item.equipment.EquipmentType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;

public final class ModItems {
	public static final Item AMETHYST_SWORD = register(
		"amethyst_sword",
		Item::new,
		new Item.Settings().sword(ModToolMaterials.AMETHYST, 3.0F, -2.4F)
	);
	public static final Item AMETHYST_PICKAXE = register(
		"amethyst_pickaxe",
		Item::new,
		new Item.Settings().pickaxe(ModToolMaterials.AMETHYST, 1.0F, -2.8F)
	);
	public static final Item AMETHYST_AXE = register(
		"amethyst_axe",
		Item::new,
		new Item.Settings().axe(ModToolMaterials.AMETHYST, 5.0F, -3.0F)
	);
	public static final Item AMETHYST_SHOVEL = register(
		"amethyst_shovel",
		Item::new,
		new Item.Settings().shovel(ModToolMaterials.AMETHYST, 1.5F, -3.0F)
	);
	public static final Item AMETHYST_HOE = register(
		"amethyst_hoe",
		Item::new,
		new Item.Settings().hoe(ModToolMaterials.AMETHYST, -4.0F, 0.0F)
	);

	public static final Item AMETHYST_HELMET = register(
		"amethyst_helmet",
		Item::new,
		new Item.Settings()
			.armor(ModArmorMaterials.AMETHYST, EquipmentType.HELMET)
			.maxDamage(EquipmentType.HELMET.getMaxDamage(ModArmorMaterials.BASE_DURABILITY))
	);
	public static final Item AMETHYST_CHESTPLATE = register(
		"amethyst_chestplate",
		Item::new,
		new Item.Settings()
			.armor(ModArmorMaterials.AMETHYST, EquipmentType.CHESTPLATE)
			.maxDamage(EquipmentType.CHESTPLATE.getMaxDamage(ModArmorMaterials.BASE_DURABILITY))
	);
	public static final Item AMETHYST_LEGGINGS = register(
		"amethyst_leggings",
		Item::new,
		new Item.Settings()
			.armor(ModArmorMaterials.AMETHYST, EquipmentType.LEGGINGS)
			.maxDamage(EquipmentType.LEGGINGS.getMaxDamage(ModArmorMaterials.BASE_DURABILITY))
	);
	public static final Item AMETHYST_BOOTS = register(
		"amethyst_boots",
		Item::new,
		new Item.Settings()
			.armor(ModArmorMaterials.AMETHYST, EquipmentType.BOOTS)
			.maxDamage(EquipmentType.BOOTS.getMaxDamage(ModArmorMaterials.BASE_DURABILITY))
	);

	private static Item register(String id, Function<Item.Settings, Item> factory, Item.Settings settings) {
		Identifier resourceLocation = Identifier.of(AmethystGearMod.MOD_ID, id);
		RegistryKey<Item> key = RegistryKey.of(Registries.ITEM.getKey(), resourceLocation);
		Item.Settings keyedSettings = settings.registryKey(key);
		return Registry.register(Registries.ITEM, key, factory.apply(keyedSettings));
	}

	public static void initialize() {
	}
}

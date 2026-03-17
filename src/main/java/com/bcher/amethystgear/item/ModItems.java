package com.bcher.amethystgear.item;

import com.bcher.amethystgear.AmethystGearMod;
import java.util.function.Function;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;

public final class ModItems {
	public static final Item AMETHYST_SWORD = register(
		"amethyst_sword",
		Item::new,
		new Item.Properties().sword(ModToolMaterials.AMETHYST, 3.0F, -2.4F)
	);
	public static final Item AMETHYST_PICKAXE = register(
		"amethyst_pickaxe",
		Item::new,
		new Item.Properties().pickaxe(ModToolMaterials.AMETHYST, 1.0F, -2.8F)
	);
	public static final Item AMETHYST_AXE = register(
		"amethyst_axe",
		Item::new,
		new Item.Properties().axe(ModToolMaterials.AMETHYST, 5.0F, -3.0F)
	);
	public static final Item AMETHYST_SHOVEL = register(
		"amethyst_shovel",
		Item::new,
		new Item.Properties().shovel(ModToolMaterials.AMETHYST, 1.5F, -3.0F)
	);
	public static final Item AMETHYST_HOE = register(
		"amethyst_hoe",
		Item::new,
		new Item.Properties().hoe(ModToolMaterials.AMETHYST, -4.0F, 0.0F)
	);

	public static final Item AMETHYST_HELMET = register(
		"amethyst_helmet",
		Item::new,
		new Item.Properties()
			.humanoidArmor(ModArmorMaterials.AMETHYST, ArmorItem.Type.HELMET)
			.durability(ArmorItem.Type.HELMET.getDurability(ModArmorMaterials.BASE_DURABILITY))
	);
	public static final Item AMETHYST_CHESTPLATE = register(
		"amethyst_chestplate",
		Item::new,
		new Item.Properties()
			.humanoidArmor(ModArmorMaterials.AMETHYST, ArmorItem.Type.CHESTPLATE)
			.durability(ArmorItem.Type.CHESTPLATE.getDurability(ModArmorMaterials.BASE_DURABILITY))
	);
	public static final Item AMETHYST_LEGGINGS = register(
		"amethyst_leggings",
		Item::new,
		new Item.Properties()
			.humanoidArmor(ModArmorMaterials.AMETHYST, ArmorItem.Type.LEGGINGS)
			.durability(ArmorItem.Type.LEGGINGS.getDurability(ModArmorMaterials.BASE_DURABILITY))
	);
	public static final Item AMETHYST_BOOTS = register(
		"amethyst_boots",
		Item::new,
		new Item.Properties()
			.humanoidArmor(ModArmorMaterials.AMETHYST, ArmorItem.Type.BOOTS)
			.durability(ArmorItem.Type.BOOTS.getDurability(ModArmorMaterials.BASE_DURABILITY))
	);

	private static Item register(String id, Function<Item.Properties, Item> factory, Item.Properties properties) {
		ResourceLocation resourceLocation = ResourceLocation.fromNamespaceAndPath(AmethystGearMod.MOD_ID, id);
		ResourceKey<Item> key = ResourceKey.create(BuiltInRegistries.ITEM.key(), resourceLocation);
		Item.Properties keyedProperties = properties.setId(key);
		return Registry.register(BuiltInRegistries.ITEM, key, factory.apply(keyedProperties));
	}

	public static void initialize() {
	}
}

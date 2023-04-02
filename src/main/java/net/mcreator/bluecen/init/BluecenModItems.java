
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.bluecen.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.bluecen.item.IronBluecenGreatBladeItem;
import net.mcreator.bluecen.item.DiamondBluecenGreatBladeItem;
import net.mcreator.bluecen.item.BluecenItem;
import net.mcreator.bluecen.item.BlueIronSwordItem;
import net.mcreator.bluecen.item.BlueIronShovelItem;
import net.mcreator.bluecen.item.BlueIronPickaxeItem;
import net.mcreator.bluecen.item.BlueIronIngotItem;
import net.mcreator.bluecen.item.BlueIronHoeItem;
import net.mcreator.bluecen.item.BlueIronAxeItem;
import net.mcreator.bluecen.item.BlueIronArmorItem;
import net.mcreator.bluecen.BluecenMod;

public class BluecenModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, BluecenMod.MODID);
	public static final RegistryObject<Item> BLUECEN_BLOCK = block(BluecenModBlocks.BLUECEN_BLOCK, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> BLUECEN = REGISTRY.register("bluecen", () -> new BluecenItem());
	public static final RegistryObject<Item> DEEPSLATE_BLUECEN_ORE = block(BluecenModBlocks.DEEPSLATE_BLUECEN_ORE, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> BLUECEN_ORE = block(BluecenModBlocks.BLUECEN_ORE, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> IRON_BLUECEN_BLOCK = block(BluecenModBlocks.IRON_BLUECEN_BLOCK, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> GOLD_BLUECEN_BLOCK = block(BluecenModBlocks.GOLD_BLUECEN_BLOCK, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> EMERALD_BLUECEN_BLOCK = block(BluecenModBlocks.EMERALD_BLUECEN_BLOCK, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> DIAMOND_BLUECEN_BLOCK = block(BluecenModBlocks.DIAMOND_BLUECEN_BLOCK, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> NETHERITE_BLUECEN_BLOCK = block(BluecenModBlocks.NETHERITE_BLUECEN_BLOCK, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> BLUE_IRON_INGOT = REGISTRY.register("blue_iron_ingot", () -> new BlueIronIngotItem());
	public static final RegistryObject<Item> BLUE_IRON_BLOCK = block(BluecenModBlocks.BLUE_IRON_BLOCK, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> BLUE_IRON_SWORD = REGISTRY.register("blue_iron_sword", () -> new BlueIronSwordItem());
	public static final RegistryObject<Item> BLUE_IRON_PICKAXE = REGISTRY.register("blue_iron_pickaxe", () -> new BlueIronPickaxeItem());
	public static final RegistryObject<Item> BLUE_IRON_AXE = REGISTRY.register("blue_iron_axe", () -> new BlueIronAxeItem());
	public static final RegistryObject<Item> BLUE_IRON_SHOVEL = REGISTRY.register("blue_iron_shovel", () -> new BlueIronShovelItem());
	public static final RegistryObject<Item> BLUE_IRON_HOE = REGISTRY.register("blue_iron_hoe", () -> new BlueIronHoeItem());
	public static final RegistryObject<Item> BLUE_IRON_ARMOR_HELMET = REGISTRY.register("blue_iron_armor_helmet", () -> new BlueIronArmorItem.Helmet());
	public static final RegistryObject<Item> BLUE_IRON_ARMOR_CHESTPLATE = REGISTRY.register("blue_iron_armor_chestplate", () -> new BlueIronArmorItem.Chestplate());
	public static final RegistryObject<Item> BLUE_IRON_ARMOR_LEGGINGS = REGISTRY.register("blue_iron_armor_leggings", () -> new BlueIronArmorItem.Leggings());
	public static final RegistryObject<Item> BLUE_IRON_ARMOR_BOOTS = REGISTRY.register("blue_iron_armor_boots", () -> new BlueIronArmorItem.Boots());
	public static final RegistryObject<Item> BLUECEN_GREAT_SWORD_SOCKEL = block(BluecenModBlocks.BLUECEN_GREAT_SWORD_SOCKEL, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> IRON_BLUECEN_GREAT_BLADE = REGISTRY.register("iron_bluecen_great_blade", () -> new IronBluecenGreatBladeItem());
	public static final RegistryObject<Item> IRON_BLUECEN_GREAT_BLADE_BLOCK = block(BluecenModBlocks.IRON_BLUECEN_GREAT_BLADE_BLOCK, null);
	public static final RegistryObject<Item> DIAMOND_BLUECEN_GREAT_BLADE = REGISTRY.register("diamond_bluecen_great_blade", () -> new DiamondBluecenGreatBladeItem());
	public static final RegistryObject<Item> DIAMOND_BLUECEN_GREAT_BLADE_BLOCK = block(BluecenModBlocks.DIAMOND_BLUECEN_GREAT_BLADE_BLOCK, null);
	public static final RegistryObject<Item> BLUECEN_ANCHOR = block(BluecenModBlocks.BLUECEN_ANCHOR, CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> ENDLESS_CAVE_PORTAL = block(BluecenModBlocks.ENDLESS_CAVE_PORTAL, null);
	public static final RegistryObject<Item> ENDLESS_STONE = block(BluecenModBlocks.ENDLESS_STONE, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> MOSSY_ENDLESS_STONE = block(BluecenModBlocks.MOSSY_ENDLESS_STONE, CreativeModeTab.TAB_DECORATIONS);

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}

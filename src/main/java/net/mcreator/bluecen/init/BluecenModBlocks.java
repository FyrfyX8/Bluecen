
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.bluecen.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.bluecen.block.NetheriteBluecenBlockBlock;
import net.mcreator.bluecen.block.IronBluecenGreatBladeBlockBlock;
import net.mcreator.bluecen.block.IronBluecenBlockBlock;
import net.mcreator.bluecen.block.GoldBluecenBlockBlock;
import net.mcreator.bluecen.block.EndlessCavePortalBlock;
import net.mcreator.bluecen.block.EmeraldBluecenBlockBlock;
import net.mcreator.bluecen.block.DiamondBluecenGreatBladeBlockBlock;
import net.mcreator.bluecen.block.DiamondBluecenBlockBlock;
import net.mcreator.bluecen.block.DeepslateBluecenOreBlock;
import net.mcreator.bluecen.block.BluecenOreBlock;
import net.mcreator.bluecen.block.BluecenGreatSwordSockelBlock;
import net.mcreator.bluecen.block.BluecenBlockBlock;
import net.mcreator.bluecen.block.BluecenAnchorBlock;
import net.mcreator.bluecen.block.BlueIronBlockBlock;
import net.mcreator.bluecen.BluecenMod;

public class BluecenModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, BluecenMod.MODID);
	public static final RegistryObject<Block> BLUECEN_BLOCK = REGISTRY.register("bluecen_block", () -> new BluecenBlockBlock());
	public static final RegistryObject<Block> DEEPSLATE_BLUECEN_ORE = REGISTRY.register("deepslate_bluecen_ore", () -> new DeepslateBluecenOreBlock());
	public static final RegistryObject<Block> BLUECEN_ORE = REGISTRY.register("bluecen_ore", () -> new BluecenOreBlock());
	public static final RegistryObject<Block> IRON_BLUECEN_BLOCK = REGISTRY.register("iron_bluecen_block", () -> new IronBluecenBlockBlock());
	public static final RegistryObject<Block> GOLD_BLUECEN_BLOCK = REGISTRY.register("gold_bluecen_block", () -> new GoldBluecenBlockBlock());
	public static final RegistryObject<Block> EMERALD_BLUECEN_BLOCK = REGISTRY.register("emerald_bluecen_block", () -> new EmeraldBluecenBlockBlock());
	public static final RegistryObject<Block> DIAMOND_BLUECEN_BLOCK = REGISTRY.register("diamond_bluecen_block", () -> new DiamondBluecenBlockBlock());
	public static final RegistryObject<Block> NETHERITE_BLUECEN_BLOCK = REGISTRY.register("netherite_bluecen_block", () -> new NetheriteBluecenBlockBlock());
	public static final RegistryObject<Block> BLUE_IRON_BLOCK = REGISTRY.register("blue_iron_block", () -> new BlueIronBlockBlock());
	public static final RegistryObject<Block> BLUECEN_GREAT_SWORD_SOCKEL = REGISTRY.register("bluecen_great_sword_sockel", () -> new BluecenGreatSwordSockelBlock());
	public static final RegistryObject<Block> IRON_BLUECEN_GREAT_BLADE_BLOCK = REGISTRY.register("iron_bluecen_great_blade_block", () -> new IronBluecenGreatBladeBlockBlock());
	public static final RegistryObject<Block> DIAMOND_BLUECEN_GREAT_BLADE_BLOCK = REGISTRY.register("diamond_bluecen_great_blade_block", () -> new DiamondBluecenGreatBladeBlockBlock());
	public static final RegistryObject<Block> BLUECEN_ANCHOR = REGISTRY.register("bluecen_anchor", () -> new BluecenAnchorBlock());
	public static final RegistryObject<Block> ENDLESS_CAVE_PORTAL = REGISTRY.register("endless_cave_portal", () -> new EndlessCavePortalBlock());
}

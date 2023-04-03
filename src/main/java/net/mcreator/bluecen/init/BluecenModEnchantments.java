
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.bluecen.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.enchantment.Enchantment;

import net.mcreator.bluecen.enchantment.RecoveryEnchantment;
import net.mcreator.bluecen.BluecenMod;

public class BluecenModEnchantments {
	public static final DeferredRegister<Enchantment> REGISTRY = DeferredRegister.create(ForgeRegistries.ENCHANTMENTS, BluecenMod.MODID);
	public static final RegistryObject<Enchantment> RECOVERY = REGISTRY.register("recovery", () -> new RecoveryEnchantment());
}

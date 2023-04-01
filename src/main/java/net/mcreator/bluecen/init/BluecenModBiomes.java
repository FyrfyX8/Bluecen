
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.bluecen.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.biome.Biome;

import net.mcreator.bluecen.world.biome.EndlessCavesBiome;
import net.mcreator.bluecen.BluecenMod;

public class BluecenModBiomes {
	public static final DeferredRegister<Biome> REGISTRY = DeferredRegister.create(ForgeRegistries.BIOMES, BluecenMod.MODID);
	public static final RegistryObject<Biome> ENDLESS_CAVES = REGISTRY.register("endless_caves", EndlessCavesBiome::createBiome);
}

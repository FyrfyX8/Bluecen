
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.bluecen.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.bluecen.BluecenMod;

public class BluecenModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, BluecenMod.MODID);
	public static final RegistryObject<SoundEvent> BLOCK_BLUECEN_ANCHOR_ACTIVATED = REGISTRY.register("block.bluecen_anchor.activated", () -> new SoundEvent(new ResourceLocation("bluecen", "block.bluecen_anchor.activated")));
	public static final RegistryObject<SoundEvent> BLOCK_BLUECEN_ANCHOR_POWERD = REGISTRY.register("block.bluecen_anchor.powerd", () -> new SoundEvent(new ResourceLocation("bluecen", "block.bluecen_anchor.powerd")));
	public static final RegistryObject<SoundEvent> BLOCK_MOSSY_ENDLESS_STONE_SCRAPE = REGISTRY.register("block.mossy_endless_stone.scrape", () -> new SoundEvent(new ResourceLocation("bluecen", "block.mossy_endless_stone.scrape")));
}

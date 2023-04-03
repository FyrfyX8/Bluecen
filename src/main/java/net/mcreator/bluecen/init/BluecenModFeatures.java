
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.bluecen.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.levelgen.feature.Feature;

import net.mcreator.bluecen.world.features.plants.EndlessMossRootsFeature;
import net.mcreator.bluecen.world.features.ores.StoneWithRiftFeature;
import net.mcreator.bluecen.world.features.ores.EndlessStoneWithRiftFeature;
import net.mcreator.bluecen.world.features.ores.EndlessBluecenOreFeature;
import net.mcreator.bluecen.world.features.ores.EndlessBlueIronOreFeature;
import net.mcreator.bluecen.world.features.ores.DeepslateBluecenOreFeature;
import net.mcreator.bluecen.world.features.ores.BluecenOreFeature;
import net.mcreator.bluecen.world.features.BluecenShrineFeature;
import net.mcreator.bluecen.BluecenMod;

@Mod.EventBusSubscriber
public class BluecenModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, BluecenMod.MODID);
	public static final RegistryObject<Feature<?>> DEEPSLATE_BLUECEN_ORE = REGISTRY.register("deepslate_bluecen_ore", DeepslateBluecenOreFeature::feature);
	public static final RegistryObject<Feature<?>> BLUECEN_ORE = REGISTRY.register("bluecen_ore", BluecenOreFeature::feature);
	public static final RegistryObject<Feature<?>> BLUECEN_SHRINE = REGISTRY.register("bluecen_shrine", BluecenShrineFeature::feature);
	public static final RegistryObject<Feature<?>> STONE_WITH_RIFT = REGISTRY.register("stone_with_rift", StoneWithRiftFeature::feature);
	public static final RegistryObject<Feature<?>> ENDLESS_BLUECEN_ORE = REGISTRY.register("endless_bluecen_ore", EndlessBluecenOreFeature::feature);
	public static final RegistryObject<Feature<?>> ENDLESS_BLUE_IRON_ORE = REGISTRY.register("endless_blue_iron_ore", EndlessBlueIronOreFeature::feature);
	public static final RegistryObject<Feature<?>> ENDLESS_STONE_WITH_RIFT = REGISTRY.register("endless_stone_with_rift", EndlessStoneWithRiftFeature::feature);
	public static final RegistryObject<Feature<?>> ENDLESS_MOSS_ROOTS = REGISTRY.register("endless_moss_roots", EndlessMossRootsFeature::feature);
}

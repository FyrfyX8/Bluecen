
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.bluecen.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import net.mcreator.bluecen.block.entity.EndlessCavePortalBlockEntity;
import net.mcreator.bluecen.block.entity.BluecenAnchorBlockEntity;
import net.mcreator.bluecen.BluecenMod;

public class BluecenModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, BluecenMod.MODID);
	public static final RegistryObject<BlockEntityType<?>> BLUECEN_ANCHOR = register("bluecen_anchor", BluecenModBlocks.BLUECEN_ANCHOR, BluecenAnchorBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> ENDLESS_CAVE_PORTAL = register("endless_cave_portal", BluecenModBlocks.ENDLESS_CAVE_PORTAL, EndlessCavePortalBlockEntity::new);

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block, BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}

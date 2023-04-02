package net.mcreator.bluecen.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplate;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructurePlaceSettings;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.Registry;
import net.minecraft.core.BlockPos;

import net.mcreator.bluecen.init.BluecenModItems;
import net.mcreator.bluecen.init.BluecenModBlocks;

import java.util.Comparator;

public class BluecenAnchorUpdateTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		BlockState PortalBlock = Blocks.AIR.defaultBlockState();
		Entity NerestItem = null;
		if ((world.getBlockState(new BlockPos(x + 1, y, z))).getBlock() == BluecenModBlocks.BLUE_IRON_BLOCK.get() && (world.getBlockState(new BlockPos(x + 1, y, z + 1))).getBlock() == BluecenModBlocks.BLUECEN_BLOCK.get()
				&& (world.getBlockState(new BlockPos(x, y, z + 1))).getBlock() == BluecenModBlocks.BLUE_IRON_BLOCK.get() && (world.getBlockState(new BlockPos(x - 1, y, z + 1))).getBlock() == BluecenModBlocks.BLUECEN_BLOCK.get()
				&& (world.getBlockState(new BlockPos(x - 1, y, z))).getBlock() == BluecenModBlocks.BLUE_IRON_BLOCK.get() && (world.getBlockState(new BlockPos(x - 1, y, z - 1))).getBlock() == BluecenModBlocks.BLUECEN_BLOCK.get()
				&& (world.getBlockState(new BlockPos(x, y, z - 1))).getBlock() == BluecenModBlocks.BLUE_IRON_BLOCK.get() && (world.getBlockState(new BlockPos(x + 1, y, z - 1))).getBlock() == BluecenModBlocks.BLUECEN_BLOCK.get()
				&& (world.getBlockState(new BlockPos(x + 2, y + 1, z))).getBlock() == BluecenModBlocks.BLUE_IRON_BLOCK.get() && (world.getBlockState(new BlockPos(x + 2, y + 1, z + 1))).getBlock() == BluecenModBlocks.BLUECEN_BLOCK.get()
				&& (world.getBlockState(new BlockPos(x + 1, y + 1, z + 2))).getBlock() == BluecenModBlocks.BLUECEN_BLOCK.get() && (world.getBlockState(new BlockPos(x, y + 1, z + 2))).getBlock() == BluecenModBlocks.BLUE_IRON_BLOCK.get()
				&& (world.getBlockState(new BlockPos(x - 1, y + 1, z + 2))).getBlock() == BluecenModBlocks.BLUECEN_BLOCK.get() && (world.getBlockState(new BlockPos(x - 2, y + 1, z + 1))).getBlock() == BluecenModBlocks.BLUECEN_BLOCK.get()
				&& (world.getBlockState(new BlockPos(x - 2, y + 1, z))).getBlock() == BluecenModBlocks.BLUE_IRON_BLOCK.get() && (world.getBlockState(new BlockPos(x - 2, y + 1, z - 1))).getBlock() == BluecenModBlocks.BLUECEN_BLOCK.get()
				&& (world.getBlockState(new BlockPos(x - 1, y + 1, z - 2))).getBlock() == BluecenModBlocks.BLUECEN_BLOCK.get() && (world.getBlockState(new BlockPos(x, y + 1, z - 2))).getBlock() == BluecenModBlocks.BLUE_IRON_BLOCK.get()
				&& (world.getBlockState(new BlockPos(x + 1, y + 1, z - 2))).getBlock() == BluecenModBlocks.BLUECEN_BLOCK.get() && (world.getBlockState(new BlockPos(x + 2, y + 1, z - 1))).getBlock() == BluecenModBlocks.BLUECEN_BLOCK.get()
				&& (world.getBlockState(new BlockPos(x + 1, y + 1, z))).getFluidState().isSource() && (world.getBlockState(new BlockPos(x + 1, y + 1, z))).getBlock() == Blocks.WATER
				&& (world.getBlockState(new BlockPos(x + 1, y + 1, z + 1))).getFluidState().isSource() && (world.getBlockState(new BlockPos(x + 1, y + 1, z + 1))).getBlock() == Blocks.WATER
				&& (world.getBlockState(new BlockPos(x, y + 1, z + 1))).getFluidState().isSource() && (world.getBlockState(new BlockPos(x, y + 1, z + 1))).getBlock() == Blocks.WATER
				&& (world.getBlockState(new BlockPos(x - 1, y + 1, z + 1))).getFluidState().isSource() && (world.getBlockState(new BlockPos(x - 1, y + 1, z + 1))).getBlock() == Blocks.WATER
				&& (world.getBlockState(new BlockPos(x - 1, y + 1, z))).getFluidState().isSource() && (world.getBlockState(new BlockPos(x - 1, y + 1, z))).getBlock() == Blocks.WATER
				&& (world.getBlockState(new BlockPos(x - 1, y + 1, z - 1))).getFluidState().isSource() && (world.getBlockState(new BlockPos(x - 1, y + 1, z - 1))).getBlock() == Blocks.WATER
				&& (world.getBlockState(new BlockPos(x, y + 1, z - 1))).getFluidState().isSource() && (world.getBlockState(new BlockPos(x, y + 1, z - 1))).getBlock() == Blocks.WATER
				&& (world.getBlockState(new BlockPos(x + 1, y + 1, z - 1))).getFluidState().isSource() && (world.getBlockState(new BlockPos(x + 1, y + 1, z - 1))).getBlock() == Blocks.WATER
				&& (world.getBlockState(new BlockPos(x, y + 1, z))).getFluidState().isSource() && (world.getBlockState(new BlockPos(x, y + 1, z))).getBlock() == Blocks.WATER
				&& ((world instanceof Level _lvl ? _lvl.dimension() : Level.OVERWORLD) == (Level.OVERWORLD)
						|| (world instanceof Level _lvl ? _lvl.dimension() : Level.OVERWORLD) == (ResourceKey.create(Registry.DIMENSION_REGISTRY, new ResourceLocation("bluecen:endless_cave"))))) {
			NerestItem = (Entity) world.getEntitiesOfClass(ItemEntity.class, AABB.ofSize(new Vec3((x + 0.5), (y + 1.5), (z + 0.5)), 1, 1, 1), e -> true).stream().sorted(new Object() {
				Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
					return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
				}
			}.compareDistOf((x + 0.5), (y + 1.5), (z + 0.5))).findFirst().orElse(null);
			if ((NerestItem instanceof ItemEntity _itemEnt ? _itemEnt.getItem() : ItemStack.EMPTY).getItem() == BluecenModItems.BLUECEN.get()) {
				if (!NerestItem.level.isClientSide())
					NerestItem.discard();
				PortalBlock = BluecenModBlocks.ENDLESS_CAVE_PORTAL.get().defaultBlockState();
				world.setBlock(new BlockPos(x + 1, y + 1, z), PortalBlock, 3);
				world.setBlock(new BlockPos(x + 1, y + 1, z + 1), PortalBlock, 3);
				world.setBlock(new BlockPos(x, y + 1, z + 1), PortalBlock, 3);
				world.setBlock(new BlockPos(x - 1, y + 1, z + 1), PortalBlock, 3);
				world.setBlock(new BlockPos(x - 1, y + 1, z), PortalBlock, 3);
				world.setBlock(new BlockPos(x - 1, y + 1, z - 1), PortalBlock, 3);
				world.setBlock(new BlockPos(x, y + 1, z - 1), PortalBlock, 3);
				world.setBlock(new BlockPos(x + 1, y + 1, z - 1), PortalBlock, 3);
				world.setBlock(new BlockPos(x, y + 1, z), PortalBlock, 3);
				if (!world.isClientSide()) {
					BlockPos _bp = new BlockPos(x, y, z);
					BlockEntity _blockEntity = world.getBlockEntity(_bp);
					BlockState _bs = world.getBlockState(_bp);
					if (_blockEntity != null)
						_blockEntity.getPersistentData().putBoolean("PortalOpen", (true));
					if (world instanceof Level _level)
						_level.sendBlockUpdated(_bp, _bs, _bs, 3);
				}
				if ((world instanceof Level _lvl ? _lvl.dimension() : Level.OVERWORLD) == (Level.OVERWORLD)) {
					if (world instanceof ServerLevel _origLevel) {
						LevelAccessor _worldorig = world;
						world = _origLevel.getServer().getLevel(ResourceKey.create(Registry.DIMENSION_REGISTRY, new ResourceLocation("bluecen:endless_cave")));
						if (world != null) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("bluecen", "endless_cave_portal"));
								if (template != null) {
									template.placeInWorld(_serverworld, new BlockPos(x - 3, y - 2, z - 3), new BlockPos(x - 3, y - 2, z - 3), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						}
						world = _worldorig;
					}
				} else {
					if (world instanceof ServerLevel _origLevel) {
						LevelAccessor _worldorig = world;
						world = _origLevel.getServer().getLevel(Level.OVERWORLD);
						if (world != null) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("bluecen", "endless_cave_portal"));
								if (template != null) {
									template.placeInWorld(_serverworld, new BlockPos(x - 3, y - 2, z - 3), new BlockPos(x - 3, y - 2, z - 3), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						}
						world = _worldorig;
					}
				}
			}
		} else if ((new Object() {
			public boolean getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getPersistentData().getBoolean(tag);
				return false;
			}
		}.getValue(world, new BlockPos(x, y, z), "PortalOpen")) == true && !((world.getBlockState(new BlockPos(x + 1, y, z))).getBlock() == BluecenModBlocks.BLUE_IRON_BLOCK.get()
				&& (world.getBlockState(new BlockPos(x + 1, y, z + 1))).getBlock() == BluecenModBlocks.BLUECEN_BLOCK.get() && (world.getBlockState(new BlockPos(x, y, z + 1))).getBlock() == BluecenModBlocks.BLUE_IRON_BLOCK.get()
				&& (world.getBlockState(new BlockPos(x - 1, y, z + 1))).getBlock() == BluecenModBlocks.BLUECEN_BLOCK.get() && (world.getBlockState(new BlockPos(x - 1, y, z))).getBlock() == BluecenModBlocks.BLUE_IRON_BLOCK.get()
				&& (world.getBlockState(new BlockPos(x - 1, y, z - 1))).getBlock() == BluecenModBlocks.BLUECEN_BLOCK.get() && (world.getBlockState(new BlockPos(x, y, z - 1))).getBlock() == BluecenModBlocks.BLUE_IRON_BLOCK.get()
				&& (world.getBlockState(new BlockPos(x + 1, y, z - 1))).getBlock() == BluecenModBlocks.BLUECEN_BLOCK.get() && (world.getBlockState(new BlockPos(x + 2, y + 1, z))).getBlock() == BluecenModBlocks.BLUE_IRON_BLOCK.get()
				&& (world.getBlockState(new BlockPos(x + 2, y + 1, z + 1))).getBlock() == BluecenModBlocks.BLUECEN_BLOCK.get() && (world.getBlockState(new BlockPos(x + 1, y + 1, z + 2))).getBlock() == BluecenModBlocks.BLUECEN_BLOCK.get()
				&& (world.getBlockState(new BlockPos(x, y + 1, z + 2))).getBlock() == BluecenModBlocks.BLUE_IRON_BLOCK.get() && (world.getBlockState(new BlockPos(x - 1, y + 1, z + 2))).getBlock() == BluecenModBlocks.BLUECEN_BLOCK.get()
				&& (world.getBlockState(new BlockPos(x - 2, y + 1, z + 1))).getBlock() == BluecenModBlocks.BLUECEN_BLOCK.get() && (world.getBlockState(new BlockPos(x - 2, y + 1, z))).getBlock() == BluecenModBlocks.BLUE_IRON_BLOCK.get()
				&& (world.getBlockState(new BlockPos(x - 2, y + 1, z - 1))).getBlock() == BluecenModBlocks.BLUECEN_BLOCK.get() && (world.getBlockState(new BlockPos(x - 1, y + 1, z - 2))).getBlock() == BluecenModBlocks.BLUECEN_BLOCK.get()
				&& (world.getBlockState(new BlockPos(x, y + 1, z - 2))).getBlock() == BluecenModBlocks.BLUE_IRON_BLOCK.get() && (world.getBlockState(new BlockPos(x + 1, y + 1, z - 2))).getBlock() == BluecenModBlocks.BLUECEN_BLOCK.get()
				&& (world.getBlockState(new BlockPos(x + 2, y + 1, z - 1))).getBlock() == BluecenModBlocks.BLUECEN_BLOCK.get() && (world.getBlockState(new BlockPos(x + 1, y + 1, z))).getBlock() == BluecenModBlocks.ENDLESS_CAVE_PORTAL.get()
				&& (world.getBlockState(new BlockPos(x + 1, y + 1, z + 1))).getBlock() == BluecenModBlocks.ENDLESS_CAVE_PORTAL.get() && (world.getBlockState(new BlockPos(x, y + 1, z + 1))).getBlock() == BluecenModBlocks.ENDLESS_CAVE_PORTAL.get()
				&& (world.getBlockState(new BlockPos(x - 1, y + 1, z + 1))).getBlock() == BluecenModBlocks.ENDLESS_CAVE_PORTAL.get() && (world.getBlockState(new BlockPos(x - 1, y + 1, z))).getBlock() == BluecenModBlocks.ENDLESS_CAVE_PORTAL.get()
				&& (world.getBlockState(new BlockPos(x - 1, y + 1, z - 1))).getBlock() == BluecenModBlocks.ENDLESS_CAVE_PORTAL.get() && (world.getBlockState(new BlockPos(x, y + 1, z - 1))).getBlock() == BluecenModBlocks.ENDLESS_CAVE_PORTAL.get()
				&& (world.getBlockState(new BlockPos(x + 1, y + 1, z - 1))).getBlock() == BluecenModBlocks.ENDLESS_CAVE_PORTAL.get() && (world.getBlockState(new BlockPos(x, y + 1, z))).getBlock() == BluecenModBlocks.ENDLESS_CAVE_PORTAL.get())) {
			if (!world.isClientSide()) {
				BlockPos _bp = new BlockPos(x, y, z);
				BlockEntity _blockEntity = world.getBlockEntity(_bp);
				BlockState _bs = world.getBlockState(_bp);
				if (_blockEntity != null)
					_blockEntity.getPersistentData().putBoolean("PortalOpen", (false));
				if (world instanceof Level _level)
					_level.sendBlockUpdated(_bp, _bs, _bs, 3);
			}
			world.destroyBlock(new BlockPos(x + 1, y + 1, z), false);
			world.destroyBlock(new BlockPos(x + 1, y + 1, z + 1), false);
			world.destroyBlock(new BlockPos(x, y + 1, z + 1), false);
			world.destroyBlock(new BlockPos(x - 1, y + 1, z + 1), false);
			world.destroyBlock(new BlockPos(x - 1, y + 1, z), false);
			world.destroyBlock(new BlockPos(x - 1, y + 1, z - 1), false);
			world.destroyBlock(new BlockPos(x, y + 1, z - 1), false);
			world.destroyBlock(new BlockPos(x + 1, y + 1, z - 1), false);
			world.destroyBlock(new BlockPos(x, y + 1, z), false);
		}
	}
}

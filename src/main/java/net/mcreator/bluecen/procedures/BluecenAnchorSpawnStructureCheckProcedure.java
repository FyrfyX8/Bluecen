package net.mcreator.bluecen.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplate;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructurePlaceSettings;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

public class BluecenAnchorSpawnStructureCheckProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (new Object() {
			public double getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getPersistentData().getDouble(tag);
				return -1;
			}
		}.getValue(world, new BlockPos(x, y, z), "Stage") >= 5) {
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("bluecen:block.bluecen_anchor.activated")), SoundSource.NEUTRAL, 1, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("bluecen:block.bluecen_anchor.activated")), SoundSource.NEUTRAL, 1, 1, false);
				}
			}
			if (Math.random() < 0.7) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("bluecen", "shrine_entrance_v1"));
					if (template != null) {
						template.placeInWorld(_serverworld, new BlockPos(x - 3, y - 20, z - 3), new BlockPos(x - 3, y - 20, z - 3), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			} else {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("bluecen", "shrine_entrance_v2"));
					if (template != null) {
						template.placeInWorld(_serverworld, new BlockPos(x - 3, y - 20, z - 3), new BlockPos(x - 3, y - 20, z - 3), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			}
			if (Math.random() < 0.7) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("bluecen", "shrine_main_room_v2"));
					if (template != null) {
						template.placeInWorld(_serverworld, new BlockPos(x - 7, y - 21, z - 7), new BlockPos(x - 7, y - 21, z - 7), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			} else {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("bluecen", "shrine_main_room_v2"));
					if (template != null) {
						template.placeInWorld(_serverworld, new BlockPos(x - 7, y - 21, z - 7), new BlockPos(x - 7, y - 21, z - 7), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			}
			if (Math.random() < 0.75) {
				if (Math.random() < 0.75) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("bluecen", "shrine_corridor_v4"));
						if (template != null) {
							template.placeInWorld(_serverworld, new BlockPos(x - 15, y - 21, z - 3), new BlockPos(x - 15, y - 21, z - 3), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
				} else if (Math.random() < 0.5) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("bluecen", "shrine_corridor_v1"));
						if (template != null) {
							template.placeInWorld(_serverworld, new BlockPos(x - 15, y - 21, z - 3), new BlockPos(x - 15, y - 21, z - 3), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
				} else if (Math.random() < 0.25) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("bluecen", "shrine_corridor_v2"));
						if (template != null) {
							template.placeInWorld(_serverworld, new BlockPos(x - 15, y - 21, z - 3), new BlockPos(x - 15, y - 21, z - 3), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
				} else {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("bluecen", "shrine_corridor_v3"));
						if (template != null) {
							template.placeInWorld(_serverworld, new BlockPos(x - 15, y - 21, z - 3), new BlockPos(x - 15, y - 21, z - 3), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
				}
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("bluecen", "shrine_loot_room_v5"));
					if (template != null) {
						template.placeInWorld(_serverworld, new BlockPos(x - 25, y - 21, z - 5), new BlockPos(x - 25, y - 21, z - 5), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			}
			if (Math.random() < 0.5) {
				if (Math.random() < 0.75) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("bluecen", "shrine_corridor_v2"));
						if (template != null) {
							template.placeInWorld(_serverworld, new BlockPos(x + 3, y - 21, z + 7), new BlockPos(x + 3, y - 21, z + 7), new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
				} else if (Math.random() < 0.5) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("bluecen", "shrine_corridor_v4"));
						if (template != null) {
							template.placeInWorld(_serverworld, new BlockPos(x + 3, y - 21, z + 7), new BlockPos(x + 3, y - 21, z + 7), new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
				} else if (Math.random() < 0.25) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("bluecen", "shrine_corridor_v3"));
						if (template != null) {
							template.placeInWorld(_serverworld, new BlockPos(x + 3, y - 21, z + 7), new BlockPos(x + 3, y - 21, z + 7), new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
				} else {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("bluecen", "shrine_corridor_v1"));
						if (template != null) {
							template.placeInWorld(_serverworld, new BlockPos(x + 3, y - 21, z + 7), new BlockPos(x + 3, y - 21, z + 7), new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
				}
				if (Math.random() < 0.5) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("bluecen", "shrine_loot_room_v4"));
						if (template != null) {
							template.placeInWorld(_serverworld, new BlockPos(x - 5, y - 21, z + 25), new BlockPos(x - 5, y - 21, z + 25),
									new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				} else {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("bluecen", "shrine_loot_room_v5"));
						if (template != null) {
							template.placeInWorld(_serverworld, new BlockPos(x - 5, y - 21, z + 25), new BlockPos(x - 5, y - 21, z + 25),
									new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
			}
			if (Math.random() < 0.1) {
				if (Math.random() < 0.75) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("bluecen", "shrine_corridor_v4"));
						if (template != null) {
							template.placeInWorld(_serverworld, new BlockPos(x + 3, y - 21, z - 15), new BlockPos(x + 3, y - 21, z - 15), new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
				} else if (Math.random() < 0.5) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("bluecen", "shrine_corridor_v2"));
						if (template != null) {
							template.placeInWorld(_serverworld, new BlockPos(x + 3, y - 21, z - 15), new BlockPos(x + 3, y - 21, z - 15), new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
				} else if (Math.random() < 0.25) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("bluecen", "shrine_corridor_v1"));
						if (template != null) {
							template.placeInWorld(_serverworld, new BlockPos(x + 3, y - 21, z - 15), new BlockPos(x + 3, y - 21, z - 15), new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
				} else {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("bluecen", "shrine_corridor_v3"));
						if (template != null) {
							template.placeInWorld(_serverworld, new BlockPos(x + 3, y - 21, z - 15), new BlockPos(x + 3, y - 21, z - 15), new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
				}
				if (Math.random() < 0.1) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("bluecen", "shrine_loot_room_v3"));
						if (template != null) {
							template.placeInWorld(_serverworld, new BlockPos(x + 5, y - 21, z - 25), new BlockPos(x + 5, y - 21, z - 25), new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
				} else {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("bluecen", "shrine_loot_room_v5"));
						if (template != null) {
							template.placeInWorld(_serverworld, new BlockPos(x + 5, y - 21, z - 25), new BlockPos(x + 5, y - 21, z - 25), new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
				}
			}
			if (Math.random() < 0.75) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("bluecen", "shrine_corridor_v3"));
					if (template != null) {
						template.placeInWorld(_serverworld, new BlockPos(x + 7, y - 21, z - 3), new BlockPos(x + 7, y - 21, z - 3), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			} else if (Math.random() < 0.5) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("bluecen", "shrine_corridor_v2"));
					if (template != null) {
						template.placeInWorld(_serverworld, new BlockPos(x + 7, y - 21, z - 3), new BlockPos(x + 7, y - 21, z - 3), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			} else if (Math.random() < 0.25) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("bluecen", "shrine_corridor_v1"));
					if (template != null) {
						template.placeInWorld(_serverworld, new BlockPos(x + 7, y - 21, z - 3), new BlockPos(x + 7, y - 21, z - 3), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			} else {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("bluecen", "shrine_corridor_v4"));
					if (template != null) {
						template.placeInWorld(_serverworld, new BlockPos(x + 7, y - 21, z - 3), new BlockPos(x + 7, y - 21, z - 3), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			}
			if (Math.random() < 0.1) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("bluecen", "shrine_loot_room_v2"));
					if (template != null) {
						template.placeInWorld(_serverworld, new BlockPos(x + 25, y - 21, z + 5), new BlockPos(x + 25, y - 21, z + 5), new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			} else {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("bluecen", "shrine_loot_room_v1"));
					if (template != null) {
						template.placeInWorld(_serverworld, new BlockPos(x + 25, y - 21, z + 5), new BlockPos(x + 25, y - 21, z + 5), new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			}
		} else {
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("bluecen:block.bluecen_anchor.powerd")), SoundSource.NEUTRAL, 1, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("bluecen:block.bluecen_anchor.powerd")), SoundSource.NEUTRAL, 1, 1, false);
				}
			}
		}
	}
}

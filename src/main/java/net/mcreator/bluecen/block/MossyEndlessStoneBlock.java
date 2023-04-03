
package net.mcreator.bluecen.block;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.level.block.state.BlockBehaviour.Properties;
import net.minecraft.world.level.material.Material;

public class MossyEndlessStoneBlock extends Block {
	public MossyEndlessStoneBlock() {
		super(BlockBehaviour.Properties
				.of(Material.STONE).sound(new ForgeSoundType(1.0f, 1.0f, () -> new SoundEvent(new ResourceLocation("block.stone.break")), () -> new SoundEvent(new ResourceLocation("block.moss.step")),
						() -> new SoundEvent(new ResourceLocation("block.stone.place")), () -> new SoundEvent(new ResourceLocation("block.moss_carpet.hit")), () -> new SoundEvent(new ResourceLocation("block.moss.fall"))))
				.strength(1.75f, 5f).requiresCorrectToolForDrops().speedFactor(1.1f));
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 15;
	}

	@Override
	public boolean canHarvestBlock(BlockState state, BlockGetter world, BlockPos pos, Player player) {
		if (player.getInventory().getSelected().getItem() instanceof PickaxeItem tieredItem)
			return tieredItem.getTier().getLevel() >= 1;
		return false;
	}
}
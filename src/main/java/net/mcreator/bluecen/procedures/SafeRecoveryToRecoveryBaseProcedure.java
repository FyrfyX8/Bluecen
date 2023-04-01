package net.mcreator.bluecen.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;
import net.minecraft.core.BlockPos;

import net.mcreator.bluecen.network.BluecenModVariables;
import net.mcreator.bluecen.init.BluecenModEnchantments;
import net.mcreator.bluecen.init.BluecenModBlocks;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class SafeRecoveryToRecoveryBaseProcedure {
	@SubscribeEvent
	public static void onRightClickBlock(PlayerInteractEvent.RightClickBlock event) {
		if (event.getHand() != event.getEntity().getUsedItemHand())
			return;
		execute(event, event.getLevel(), event.getPos().getX(), event.getPos().getY(), event.getPos().getZ(), event.getEntity());
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		execute(null, world, x, y, z, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == BluecenModBlocks.BLUECEN_ANCHOR.get() && entity.isShiftKeyDown()
				&& EnchantmentHelper.getItemEnchantmentLevel(BluecenModEnchantments.RECOVERY.get(), (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) != 0) {
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().getBoolean("RecoveryActive") == false
					&& !((entity.getCapability(BluecenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new BluecenModVariables.PlayerVariables())).ItemsSafed >= 6)) {
				(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().putBoolean("RecoveryActive", (true));
				((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY))
						.setHoverName(Component.literal(("\u00A7r" + "Re:" + ((((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getDisplayName().getString()).replace("]", "")).replace("[", "")))));
				{
					double _setval = (entity.getCapability(BluecenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new BluecenModVariables.PlayerVariables())).ItemsSafed + 1;
					entity.getCapability(BluecenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.ItemsSafed = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				if (6 - Math.round((entity.getCapability(BluecenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new BluecenModVariables.PlayerVariables())).ItemsSafed) == 1) {
					if (entity instanceof Player _player && !_player.level.isClientSide())
						_player.displayClientMessage(Component.literal("Added to Recovery, 1 slot Left"), (true));
				} else if (6 - Math.round((entity.getCapability(BluecenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new BluecenModVariables.PlayerVariables())).ItemsSafed) <= 0) {
					if (entity instanceof Player _player && !_player.level.isClientSide())
						_player.displayClientMessage(Component.literal("Added to Recovery, no slots left!"), (true));
				} else {
					if (entity instanceof Player _player && !_player.level.isClientSide())
						_player.displayClientMessage(Component.literal(
								("Added to Recovery, " + (6 - Math.round((entity.getCapability(BluecenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new BluecenModVariables.PlayerVariables())).ItemsSafed)) + " slots left!")), (true));
				}
			} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().getBoolean("RecoveryActive") == true) {
				(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().putBoolean("RecoveryActive", (false));
				((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY))
						.setHoverName(Component.literal(("\u00A7r" + (((((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getDisplayName().getString()).replace("]", "")).replace("[", "")).replace("Re:", "")))));
				{
					double _setval = (entity.getCapability(BluecenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new BluecenModVariables.PlayerVariables())).ItemsSafed - 1;
					entity.getCapability(BluecenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.ItemsSafed = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				if (6 - Math.round((entity.getCapability(BluecenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new BluecenModVariables.PlayerVariables())).ItemsSafed) == 1) {
					if (entity instanceof Player _player && !_player.level.isClientSide())
						_player.displayClientMessage(Component.literal("Removed from Recovery, 1 slot Left"), (true));
				} else if (6 - Math.round((entity.getCapability(BluecenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new BluecenModVariables.PlayerVariables())).ItemsSafed) <= 0) {
					if (entity instanceof Player _player && !_player.level.isClientSide())
						_player.displayClientMessage(Component.literal("Removed from Recovery, no slots left!"), (true));
				} else {
					if (entity instanceof Player _player && !_player.level.isClientSide())
						_player.displayClientMessage(
								Component.literal(
										("Removed from Recovery, " + (6 - Math.round((entity.getCapability(BluecenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new BluecenModVariables.PlayerVariables())).ItemsSafed)) + " slots left!")),
								(true));
				}
			} else {
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(Component.literal("no slots left!"), (true));
			}
		}
	}
}

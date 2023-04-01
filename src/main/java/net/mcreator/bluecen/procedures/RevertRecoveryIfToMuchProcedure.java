package net.mcreator.bluecen.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.player.EntityItemPickupEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

import net.mcreator.bluecen.network.BluecenModVariables;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class RevertRecoveryIfToMuchProcedure {
	@SubscribeEvent
	public static void onPickup(EntityItemPickupEvent event) {
		execute(event, event.getEntity(), event.getItem().getItem());
	}

	public static void execute(Entity entity, ItemStack itemstack) {
		execute(null, entity, itemstack);
	}

	private static void execute(@Nullable Event event, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (itemstack.getOrCreateTag().getBoolean("RecoveryActive") == true && entity instanceof Player
				&& (entity.getCapability(BluecenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new BluecenModVariables.PlayerVariables())).ItemsSafed == 6) {
			if (entity instanceof Player _player && !_player.level.isClientSide())
				_player.displayClientMessage(Component.literal(("No Slots left: " + "Reverted back to normal item")), (true));
			(itemstack).setHoverName(Component.literal(("\u00A7r" + (((itemstack.getDisplayName().getString()).replace("]", "")).replace("[", "")).replace("Re:", ""))));
			itemstack.getOrCreateTag().putBoolean("RecoveryActive", (false));
		} else if (itemstack.getOrCreateTag().getBoolean("RecoveryActive") == true && entity instanceof Player) {
			{
				double _setval = (entity.getCapability(BluecenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new BluecenModVariables.PlayerVariables())).ItemsSafed + 1;
				entity.getCapability(BluecenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.ItemsSafed = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			if (entity instanceof Player _player && !_player.level.isClientSide())
				_player.displayClientMessage(
						Component.literal(("Collected Item, " + (6 - Math.round((entity.getCapability(BluecenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new BluecenModVariables.PlayerVariables())).ItemsSafed)) + " Places left!")), (true));
		}
	}
}

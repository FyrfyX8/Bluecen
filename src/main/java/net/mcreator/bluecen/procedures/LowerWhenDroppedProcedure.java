package net.mcreator.bluecen.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.item.ItemTossEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import net.mcreator.bluecen.network.BluecenModVariables;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class LowerWhenDroppedProcedure {
	@SubscribeEvent
	public static void onGemDropped(ItemTossEvent event) {
		execute(event, event.getPlayer(), event.getEntity().getItem());
	}

	public static void execute(Entity entity, ItemStack itemstack) {
		execute(null, entity, itemstack);
	}

	private static void execute(@Nullable Event event, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (itemstack.getOrCreateTag().getBoolean("RecoveryActive") == true && entity instanceof Player
				&& (entity.getCapability(BluecenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new BluecenModVariables.PlayerVariables())).ItemsSafed == 6) {
			{
				double _setval = (entity.getCapability(BluecenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new BluecenModVariables.PlayerVariables())).ItemsSafed - 1;
				entity.getCapability(BluecenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.ItemsSafed = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
	}
}

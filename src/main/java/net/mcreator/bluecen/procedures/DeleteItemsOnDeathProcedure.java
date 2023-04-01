package net.mcreator.bluecen.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingDeathEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import net.mcreator.bluecen.network.BluecenModVariables;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class DeleteItemsOnDeathProcedure {
	@SubscribeEvent
	public static void onEntityDeath(LivingDeathEvent event) {
		if (event != null && event.getEntity() != null) {
			execute(event, event.getEntity());
		}
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof Player _player) {
			ItemStack _stktoremove = ((entity.getCapability(BluecenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new BluecenModVariables.PlayerVariables())).Slot_1);
			_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
		}
		if (entity instanceof Player _player) {
			ItemStack _stktoremove = ((entity.getCapability(BluecenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new BluecenModVariables.PlayerVariables())).Slot_2);
			_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
		}
		if (entity instanceof Player _player) {
			ItemStack _stktoremove = ((entity.getCapability(BluecenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new BluecenModVariables.PlayerVariables())).Slot_3);
			_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
		}
		if (entity instanceof Player _player) {
			ItemStack _stktoremove = ((entity.getCapability(BluecenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new BluecenModVariables.PlayerVariables())).Slot_4);
			_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
		}
		if (entity instanceof Player _player) {
			ItemStack _stktoremove = ((entity.getCapability(BluecenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new BluecenModVariables.PlayerVariables())).Slot_5);
			_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
		}
		if (entity instanceof Player _player) {
			ItemStack _stktoremove = ((entity.getCapability(BluecenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new BluecenModVariables.PlayerVariables())).Slot_6);
			_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
		}
	}
}

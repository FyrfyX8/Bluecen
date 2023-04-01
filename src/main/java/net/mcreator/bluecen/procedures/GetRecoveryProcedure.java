package net.mcreator.bluecen.procedures;

import net.minecraftforge.items.ItemHandlerHelper;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.player.PlayerEvent;

import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;

import net.mcreator.bluecen.network.BluecenModVariables;
import net.mcreator.bluecen.init.BluecenModEnchantments;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class GetRecoveryProcedure {
	@SubscribeEvent
	public static void onPlayerRespawned(PlayerEvent.PlayerRespawnEvent event) {
		execute(event, event.getEntity());
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		ItemStack ActiveItem = ItemStack.EMPTY;
		ActiveItem = ((entity.getCapability(BluecenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new BluecenModVariables.PlayerVariables())).Slot_1);
		if (EnchantmentHelper.getItemEnchantmentLevel(BluecenModEnchantments.RECOVERY.get(), ActiveItem) == 1) {
			{
				ItemStack _ist = ActiveItem;
				if (_ist.hurt((int) ((ActiveItem).getMaxDamage() / 2), RandomSource.create(), null)) {
					_ist.shrink(1);
					_ist.setDamageValue(0);
				}
			}
		} else if (EnchantmentHelper.getItemEnchantmentLevel(BluecenModEnchantments.RECOVERY.get(), ActiveItem) == 2) {
			{
				ItemStack _ist = ActiveItem;
				if (_ist.hurt((int) ((ActiveItem).getMaxDamage() / 3), RandomSource.create(), null)) {
					_ist.shrink(1);
					_ist.setDamageValue(0);
				}
			}
		} else if (EnchantmentHelper.getItemEnchantmentLevel(BluecenModEnchantments.RECOVERY.get(), ActiveItem) == 3) {
			{
				ItemStack _ist = ActiveItem;
				if (_ist.hurt((int) ((ActiveItem).getMaxDamage() / 4), RandomSource.create(), null)) {
					_ist.shrink(1);
					_ist.setDamageValue(0);
				}
			}
		}
		if (!((ActiveItem).getDamageValue() <= 1)) {
			if (entity instanceof Player _player) {
				ItemStack _setstack = ActiveItem;
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
		} else {
			if ((entity.getCapability(BluecenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new BluecenModVariables.PlayerVariables())).ItemsSafed == 6) {
				{
					double _setval = (entity.getCapability(BluecenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new BluecenModVariables.PlayerVariables())).ItemsSafed - 1;
					entity.getCapability(BluecenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.ItemsSafed = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
		}
		ActiveItem = ((entity.getCapability(BluecenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new BluecenModVariables.PlayerVariables())).Slot_2);
		if (EnchantmentHelper.getItemEnchantmentLevel(BluecenModEnchantments.RECOVERY.get(), ActiveItem) == 1) {
			{
				ItemStack _ist = ActiveItem;
				if (_ist.hurt((int) ((ActiveItem).getMaxDamage() / 2), RandomSource.create(), null)) {
					_ist.shrink(1);
					_ist.setDamageValue(0);
				}
			}
		} else if (EnchantmentHelper.getItemEnchantmentLevel(BluecenModEnchantments.RECOVERY.get(), ActiveItem) == 2) {
			{
				ItemStack _ist = ActiveItem;
				if (_ist.hurt((int) ((ActiveItem).getMaxDamage() / 3), RandomSource.create(), null)) {
					_ist.shrink(1);
					_ist.setDamageValue(0);
				}
			}
		} else if (EnchantmentHelper.getItemEnchantmentLevel(BluecenModEnchantments.RECOVERY.get(), ActiveItem) == 3) {
			{
				ItemStack _ist = ActiveItem;
				if (_ist.hurt((int) ((ActiveItem).getMaxDamage() / 4), RandomSource.create(), null)) {
					_ist.shrink(1);
					_ist.setDamageValue(0);
				}
			}
		}
		if (!((ActiveItem).getDamageValue() <= 1)) {
			if (entity instanceof Player _player) {
				ItemStack _setstack = ActiveItem;
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
		} else {
			if ((entity.getCapability(BluecenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new BluecenModVariables.PlayerVariables())).ItemsSafed == 6) {
				{
					double _setval = (entity.getCapability(BluecenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new BluecenModVariables.PlayerVariables())).ItemsSafed - 1;
					entity.getCapability(BluecenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.ItemsSafed = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
		}
		ActiveItem = ((entity.getCapability(BluecenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new BluecenModVariables.PlayerVariables())).Slot_3);
		if (EnchantmentHelper.getItemEnchantmentLevel(BluecenModEnchantments.RECOVERY.get(), ActiveItem) == 1) {
			{
				ItemStack _ist = ActiveItem;
				if (_ist.hurt((int) ((ActiveItem).getMaxDamage() / 2), RandomSource.create(), null)) {
					_ist.shrink(1);
					_ist.setDamageValue(0);
				}
			}
		} else if (EnchantmentHelper.getItemEnchantmentLevel(BluecenModEnchantments.RECOVERY.get(), ActiveItem) == 2) {
			{
				ItemStack _ist = ActiveItem;
				if (_ist.hurt((int) ((ActiveItem).getMaxDamage() / 3), RandomSource.create(), null)) {
					_ist.shrink(1);
					_ist.setDamageValue(0);
				}
			}
		} else if (EnchantmentHelper.getItemEnchantmentLevel(BluecenModEnchantments.RECOVERY.get(), ActiveItem) == 3) {
			{
				ItemStack _ist = ActiveItem;
				if (_ist.hurt((int) ((ActiveItem).getMaxDamage() / 4), RandomSource.create(), null)) {
					_ist.shrink(1);
					_ist.setDamageValue(0);
				}
			}
		}
		if (!((ActiveItem).getDamageValue() <= 1)) {
			if (entity instanceof Player _player) {
				ItemStack _setstack = ActiveItem;
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
		} else {
			if ((entity.getCapability(BluecenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new BluecenModVariables.PlayerVariables())).ItemsSafed == 6) {
				{
					double _setval = (entity.getCapability(BluecenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new BluecenModVariables.PlayerVariables())).ItemsSafed - 1;
					entity.getCapability(BluecenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.ItemsSafed = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
		}
		ActiveItem = ((entity.getCapability(BluecenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new BluecenModVariables.PlayerVariables())).Slot_4);
		if (EnchantmentHelper.getItemEnchantmentLevel(BluecenModEnchantments.RECOVERY.get(), ActiveItem) == 1) {
			{
				ItemStack _ist = ActiveItem;
				if (_ist.hurt((int) ((ActiveItem).getMaxDamage() / 2), RandomSource.create(), null)) {
					_ist.shrink(1);
					_ist.setDamageValue(0);
				}
			}
		} else if (EnchantmentHelper.getItemEnchantmentLevel(BluecenModEnchantments.RECOVERY.get(), ActiveItem) == 2) {
			{
				ItemStack _ist = ActiveItem;
				if (_ist.hurt((int) ((ActiveItem).getMaxDamage() / 3), RandomSource.create(), null)) {
					_ist.shrink(1);
					_ist.setDamageValue(0);
				}
			}
		} else if (EnchantmentHelper.getItemEnchantmentLevel(BluecenModEnchantments.RECOVERY.get(), ActiveItem) == 3) {
			{
				ItemStack _ist = ActiveItem;
				if (_ist.hurt((int) ((ActiveItem).getMaxDamage() / 4), RandomSource.create(), null)) {
					_ist.shrink(1);
					_ist.setDamageValue(0);
				}
			}
		}
		if (!((ActiveItem).getDamageValue() <= 1)) {
			if (entity instanceof Player _player) {
				ItemStack _setstack = ActiveItem;
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
		} else {
			if ((entity.getCapability(BluecenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new BluecenModVariables.PlayerVariables())).ItemsSafed == 6) {
				{
					double _setval = (entity.getCapability(BluecenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new BluecenModVariables.PlayerVariables())).ItemsSafed - 1;
					entity.getCapability(BluecenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.ItemsSafed = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
		}
		ActiveItem = ((entity.getCapability(BluecenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new BluecenModVariables.PlayerVariables())).Slot_5);
		if (EnchantmentHelper.getItemEnchantmentLevel(BluecenModEnchantments.RECOVERY.get(), ActiveItem) == 1) {
			{
				ItemStack _ist = ActiveItem;
				if (_ist.hurt((int) ((ActiveItem).getMaxDamage() / 2), RandomSource.create(), null)) {
					_ist.shrink(1);
					_ist.setDamageValue(0);
				}
			}
		} else if (EnchantmentHelper.getItemEnchantmentLevel(BluecenModEnchantments.RECOVERY.get(), ActiveItem) == 2) {
			{
				ItemStack _ist = ActiveItem;
				if (_ist.hurt((int) ((ActiveItem).getMaxDamage() / 3), RandomSource.create(), null)) {
					_ist.shrink(1);
					_ist.setDamageValue(0);
				}
			}
		} else if (EnchantmentHelper.getItemEnchantmentLevel(BluecenModEnchantments.RECOVERY.get(), ActiveItem) == 3) {
			{
				ItemStack _ist = ActiveItem;
				if (_ist.hurt((int) ((ActiveItem).getMaxDamage() / 4), RandomSource.create(), null)) {
					_ist.shrink(1);
					_ist.setDamageValue(0);
				}
			}
		}
		if (!((ActiveItem).getDamageValue() <= 1)) {
			if (entity instanceof Player _player) {
				ItemStack _setstack = ActiveItem;
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
		} else {
			if ((entity.getCapability(BluecenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new BluecenModVariables.PlayerVariables())).ItemsSafed == 6) {
				{
					double _setval = (entity.getCapability(BluecenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new BluecenModVariables.PlayerVariables())).ItemsSafed - 1;
					entity.getCapability(BluecenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.ItemsSafed = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
		}
		ActiveItem = ((entity.getCapability(BluecenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new BluecenModVariables.PlayerVariables())).Slot_6);
		if (EnchantmentHelper.getItemEnchantmentLevel(BluecenModEnchantments.RECOVERY.get(), ActiveItem) == 1) {
			{
				ItemStack _ist = ActiveItem;
				if (_ist.hurt((int) ((ActiveItem).getMaxDamage() / 2), RandomSource.create(), null)) {
					_ist.shrink(1);
					_ist.setDamageValue(0);
				}
			}
		} else if (EnchantmentHelper.getItemEnchantmentLevel(BluecenModEnchantments.RECOVERY.get(), ActiveItem) == 2) {
			{
				ItemStack _ist = ActiveItem;
				if (_ist.hurt((int) ((ActiveItem).getMaxDamage() / 3), RandomSource.create(), null)) {
					_ist.shrink(1);
					_ist.setDamageValue(0);
				}
			}
		} else if (EnchantmentHelper.getItemEnchantmentLevel(BluecenModEnchantments.RECOVERY.get(), ActiveItem) == 3) {
			{
				ItemStack _ist = ActiveItem;
				if (_ist.hurt((int) ((ActiveItem).getMaxDamage() / 4), RandomSource.create(), null)) {
					_ist.shrink(1);
					_ist.setDamageValue(0);
				}
			}
		}
		if (!((ActiveItem).getDamageValue() <= 1)) {
			if (entity instanceof Player _player) {
				ItemStack _setstack = ActiveItem;
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
		} else {
			if ((entity.getCapability(BluecenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new BluecenModVariables.PlayerVariables())).ItemsSafed == 6) {
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
}

package net.mcreator.bluecen.procedures;

import org.checkerframework.checker.units.qual.Current;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import net.minecraftforge.common.capabilities.ForgeCapabilities;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import net.mcreator.bluecen.network.BluecenModVariables;

import javax.annotation.Nullable;

import java.util.concurrent.atomic.AtomicReference;

@Mod.EventBusSubscriber
public class SafeRecoveryFromDeathProcedure {
	@SubscribeEvent
	public static void onEntityAttacked(LivingHurtEvent event) {
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
		double ItemsNumber = 0;
		double ItemArray = 0;
		ItemStack Current = ItemStack.EMPTY;
		{
			ItemStack _setval = new ItemStack(Blocks.AIR);
			entity.getCapability(BluecenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.Slot_1 = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		{
			ItemStack _setval = new ItemStack(Blocks.AIR);
			entity.getCapability(BluecenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.Slot_2 = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		{
			ItemStack _setval = new ItemStack(Blocks.AIR);
			entity.getCapability(BluecenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.Slot_3 = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		{
			ItemStack _setval = new ItemStack(Blocks.AIR);
			entity.getCapability(BluecenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.Slot_4 = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		{
			ItemStack _setval = new ItemStack(Blocks.AIR);
			entity.getCapability(BluecenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.Slot_5 = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		{
			ItemStack _setval = new ItemStack(Blocks.AIR);
			entity.getCapability(BluecenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.Slot_6 = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		ItemsNumber = 0;
		ItemArray = 0;
		if (entity instanceof Player) {
			for (int index0 = 0; index0 < (int) (45); index0++) {
				Current = (new Object() {
					public ItemStack getItemStack(int sltid, Entity entity) {
						AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
						entity.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
							_retval.set(capability.getStackInSlot(sltid).copy());
						});
						return _retval.get();
					}
				}.getItemStack((int) ItemArray, entity));
				if (Current.getOrCreateTag().getBoolean("RecoveryActive") == true) {
					ItemsNumber = ItemsNumber + 1;
					if (ItemsNumber == 1) {
						{
							ItemStack _setval = Current;
							entity.getCapability(BluecenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.Slot_1 = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
					} else if (ItemsNumber == 2) {
						{
							ItemStack _setval = Current;
							entity.getCapability(BluecenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.Slot_2 = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
					} else if (ItemsNumber == 3) {
						{
							ItemStack _setval = Current;
							entity.getCapability(BluecenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.Slot_3 = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
					} else if (ItemsNumber == 4) {
						{
							ItemStack _setval = Current;
							entity.getCapability(BluecenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.Slot_4 = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
					} else if (ItemsNumber == 5) {
						{
							ItemStack _setval = Current;
							entity.getCapability(BluecenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.Slot_5 = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
					} else if (ItemsNumber == 6) {
						{
							ItemStack _setval = Current;
							entity.getCapability(BluecenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.Slot_6 = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
					}
				}
				ItemArray = ItemArray + 1;
			}
		}
	}
}

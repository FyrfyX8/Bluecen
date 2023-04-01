package net.mcreator.bluecen.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.bluecen.network.BluecenModVariables;

public class OverlayActiveProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		return (entity.getCapability(BluecenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new BluecenModVariables.PlayerVariables())).ItemsSafed > 6;
	}
}

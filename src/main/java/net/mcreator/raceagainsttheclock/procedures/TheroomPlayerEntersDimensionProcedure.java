package net.mcreator.raceagainsttheclock.procedures;

import net.minecraft.entity.Entity;

import net.mcreator.raceagainsttheclock.RaceAgainstTheClockModElements;

import java.util.Map;

@RaceAgainstTheClockModElements.ModElement.Tag
public class TheroomPlayerEntersDimensionProcedure extends RaceAgainstTheClockModElements.ModElement {
	public TheroomPlayerEntersDimensionProcedure(RaceAgainstTheClockModElements instance) {
		super(instance, 1);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				System.err.println("Failed to load dependency entity for procedure TheroomPlayerEntersDimension!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		{
			Entity _ent = entity;
			if (!_ent.world.isRemote && _ent.world.getServer() != null) {
				_ent.world.getServer().getCommandManager().handleCommand(_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
						"/title @s title {\"text\":\"good luck\", \"bold\":true, \"italic\":true, \"color\":\"red\"}");
			}
		}
		{
			Entity _ent = entity;
			if (!_ent.world.isRemote && _ent.world.getServer() != null) {
				_ent.world.getServer().getCommandManager().handleCommand(_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
						"/say @s once you have found a near by room type the command /the_room ROOM start");
			}
		}
	}
}

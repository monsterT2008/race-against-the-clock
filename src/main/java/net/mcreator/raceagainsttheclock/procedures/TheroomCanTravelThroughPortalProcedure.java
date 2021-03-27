package net.mcreator.raceagainsttheclock.procedures;

import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;

import net.mcreator.raceagainsttheclock.item.OffreItem;
import net.mcreator.raceagainsttheclock.RaceAgainstTheClockModElements;

import java.util.Map;

@RaceAgainstTheClockModElements.ModElement.Tag
public class TheroomCanTravelThroughPortalProcedure extends RaceAgainstTheClockModElements.ModElement {
	public TheroomCanTravelThroughPortalProcedure(RaceAgainstTheClockModElements instance) {
		super(instance, 2);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				System.err.println("Failed to load dependency entity for procedure TheroomCanTravelThroughPortal!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof PlayerEntity) {
			ItemStack _stktoremove = new ItemStack(OffreItem.block, (int) (1));
			((PlayerEntity) entity).inventory.clearMatchingItems(p -> _stktoremove.getItem() == p.getItem(), (int) 1);
		}
	}
}

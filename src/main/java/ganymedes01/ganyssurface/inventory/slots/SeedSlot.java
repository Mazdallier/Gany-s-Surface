package ganymedes01.ganyssurface.inventory.slots;

import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.IPlantable;

/**
 * Gany's Surface
 * 
 * @author ganymedes01
 * 
 */

public class SeedSlot extends Slot {

	public SeedSlot(IInventory inventory, int slot, int posX, int posY) {
		super(inventory, slot, posX, posY);
	}

	@Override
	public boolean isItemValid(ItemStack stack) {
		return stack.getItem() instanceof IPlantable;
	}
}
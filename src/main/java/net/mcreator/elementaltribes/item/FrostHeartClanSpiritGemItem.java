
package net.mcreator.elementaltribes.item;

import net.mcreator.elementaltribes.procedures.FrostHeartClanSpiritGemWhileBaubleIsEquippedTickProcedure;

public class FrostHeartClanSpiritGemItem extends Item implements ICurioItem {
	public FrostHeartClanSpiritGemItem() {
		super(new Item.Properties().stacksTo(1).rarity(Rarity.EPIC));
	}

	@Override
	public void curioTick(SlotContext slotContext, ItemStack stack) {
		FrostHeartClanSpiritGemWhileBaubleIsEquippedTickProcedure.execute();
	}
}

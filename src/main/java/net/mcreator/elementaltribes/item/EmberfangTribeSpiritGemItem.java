
package net.mcreator.elementaltribes.item;

import net.mcreator.elementaltribes.procedures.EmberfangTribeSpiritGemWhileBaubleIsEquippedTickProcedure;

public class EmberfangTribeSpiritGemItem extends Item implements ICurioItem {
	public EmberfangTribeSpiritGemItem() {
		super(new Item.Properties().stacksTo(1).fireResistant().rarity(Rarity.EPIC));
	}

	@Override
	public void curioTick(SlotContext slotContext, ItemStack stack) {
		EmberfangTribeSpiritGemWhileBaubleIsEquippedTickProcedure.execute(slotContext.entity());
	}
}

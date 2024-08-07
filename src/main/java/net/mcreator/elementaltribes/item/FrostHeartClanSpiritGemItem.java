
package net.mcreator.elementaltribes.item;

import top.theillusivec4.curios.api.type.capability.ICurioItem;
import top.theillusivec4.curios.api.SlotContext;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

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

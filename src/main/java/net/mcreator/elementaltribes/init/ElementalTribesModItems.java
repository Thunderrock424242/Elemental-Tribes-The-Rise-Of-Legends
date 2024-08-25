
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.elementaltribes.init;

import net.mcreator.elementaltribes.item.FrostHeartClanSpiritGemItem;
import net.mcreator.elementaltribes.item.EmberfangTribeSpiritGemItem;
import net.mcreator.elementaltribes.ElementalTribesMod;

public class ElementalTribesModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(BuiltInRegistries.ITEM, ElementalTribesMod.MODID);
	public static final DeferredHolder<Item, Item> EMBERFANG_TRIBE_SPIRIT_GEM = REGISTRY.register("emberfang_tribe_spirit_gem", EmberfangTribeSpiritGemItem::new);
	public static final DeferredHolder<Item, Item> FROST_HEART_CLAN_SPIRIT_GEM = REGISTRY.register("frost_heart_clan_spirit_gem", FrostHeartClanSpiritGemItem::new);
	// Start of user code block custom items
	// End of user code block custom items
}

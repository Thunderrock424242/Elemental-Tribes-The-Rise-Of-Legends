
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.elementaltribes.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.core.registries.Registries;

import net.mcreator.elementaltribes.ElementalTribesMod;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public class ElementalTribesModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ElementalTribesMod.MODID);

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.SPAWN_EGGS) {
			tabData.accept(ElementalTribesModItems.EMBERFANG_TRIBE_SPIRIT_GEM.get());
			tabData.accept(ElementalTribesModItems.FROST_HEART_CLAN_SPIRIT_GEM.get());
		}
	}
}

package net.mcreator.elementaltribes.init;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public class ElementalTribesModCuriosSlots {
	@SubscribeEvent
	public static void enqueueIMC(final InterModEnqueueEvent event) {
		InterModComms.sendTo(CuriosApi.MODID, SlotTypeMessage.REGISTER_TYPE, () -> SlotTypePreset.CHARM.getMessageBuilder().size(1).build());
	}
}

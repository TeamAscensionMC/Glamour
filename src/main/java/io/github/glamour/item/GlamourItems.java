package io.github.glamour.item;

import io.github.glamour.Glamour;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class GlamourItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(Glamour.MODID);

    public static final DeferredItem<Item> KINTSUGIUM_INGOT = ITEMS.register("kintsugium_ingot",
            ()-> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}

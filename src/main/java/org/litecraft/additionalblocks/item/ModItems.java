package org.litecraft.additionalblocks.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.litecraft.additionalblocks.AdditionalBlocks;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, AdditionalBlocks.MOD_ID);

    public static final RegistryObject<Item> CLAY_BRICK = ITEMS.register("clay_brick",
            () -> new Item(new Item.Properties().tab(ModCreativeModTab.ADDITIONAL_BLOCKS_TAB)));

    public static final RegistryObject<Item> CLAY_POT = ITEMS.register("clay_pot",
            () -> new Item(new Item.Properties().tab(ModCreativeModTab.ADDITIONAL_BLOCKS_TAB)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}

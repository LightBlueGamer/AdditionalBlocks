package org.litecraft.additionalblocks.item;

import net.minecraft.world.item.BucketItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.litecraft.additionalblocks.AdditionalBlocks;
import org.litecraft.additionalblocks.fluid.ModFluids;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, AdditionalBlocks.MOD_ID);

    public static final RegistryObject<Item> CLAY_BRICK = ITEMS.register("clay_brick",
            () -> new Item(new Item.Properties().tab(ModCreativeModTab.ADDITIONAL_BLOCKS_TAB)));

    public static final RegistryObject<Item> CLAY_POT = ITEMS.register("clay_pot",
            () -> new Item(new Item.Properties().tab(ModCreativeModTab.ADDITIONAL_BLOCKS_TAB)));

    public static final RegistryObject<Item> CLAY_MOLD = ITEMS.register("clay_mold",
            () -> new Item(new Item.Properties().tab(ModCreativeModTab.ADDITIONAL_BLOCKS_TAB)));

    public static final RegistryObject<Item> FIRED_CLAY_MOLD = ITEMS.register("fired_clay_mold",
            () -> new Item(new Item.Properties().tab(ModCreativeModTab.ADDITIONAL_BLOCKS_TAB)));

    public static final RegistryObject<Item> MOLTEN_IRON_BUCKET = ITEMS.register("molten_iron_bucket",
            () -> new BucketItem(ModFluids.SOURCE_MOLTEN_IRON, new Item.Properties().tab(ModCreativeModTab.ADDITIONAL_BLOCKS_TAB)
                    .craftRemainder(Items.BUCKET).stacksTo(1)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}

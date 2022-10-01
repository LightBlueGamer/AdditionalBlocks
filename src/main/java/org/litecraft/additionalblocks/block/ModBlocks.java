package org.litecraft.additionalblocks.block;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.litecraft.additionalblocks.AdditionalBlocks;
import org.litecraft.additionalblocks.fluid.ModFluids;
import org.litecraft.additionalblocks.item.ModCreativeModTab;
import org.litecraft.additionalblocks.item.ModItems;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, AdditionalBlocks.MOD_ID);

    public static final RegistryObject<Block> CLAY_BRICKS = registerBlock("clay_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.CLAY)
                    ), ModCreativeModTab.ADDITIONAL_BLOCKS_TAB);

    public static final RegistryObject<Block> CLAY_BRICK_STAIRS = registerBlock("clay_brick_stairs",
            () -> new StairBlock(() -> ModBlocks.CLAY_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.CLAY)
            ), ModCreativeModTab.ADDITIONAL_BLOCKS_TAB);

    public static final RegistryObject<Block> CLAY_BRICK_SLAB = registerBlock("clay_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.CLAY)
            ), ModCreativeModTab.ADDITIONAL_BLOCKS_TAB);

    public static final RegistryObject<Block> CLAY_BRICK_WALL = registerBlock("clay_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.CLAY)
            ), ModCreativeModTab.ADDITIONAL_BLOCKS_TAB);

    public static final RegistryObject<LiquidBlock> MOLTEN_IRON_BLOCK = BLOCKS.register("molten_iron_block",
            () -> new LiquidBlock(ModFluids.SOURCE_MOLTEN_IRON, BlockBehaviour.Properties.copy(Blocks.LAVA)));

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block,
                                                                            CreativeModeTab tab) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}

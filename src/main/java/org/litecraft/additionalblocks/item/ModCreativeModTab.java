package org.litecraft.additionalblocks.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModTab {
    public static final CreativeModeTab ADDITIONAL_BLOCKS_TAB = new CreativeModeTab("additional_blocks_tab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.CLAY_BRICK.get());
        }
    };
}

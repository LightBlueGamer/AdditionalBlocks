package org.litecraft.additionalblocks.fluid;

import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.world.level.material.Fluid;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fluids.ForgeFlowingFluid;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.litecraft.additionalblocks.AdditionalBlocks;
import org.litecraft.additionalblocks.block.ModBlocks;
import org.litecraft.additionalblocks.item.ModItems;

public class ModFluids {
    public static final DeferredRegister<Fluid> FLUIDS =
            DeferredRegister.create(ForgeRegistries.FLUIDS, AdditionalBlocks.MOD_ID);

    public static final RegistryObject<FlowingFluid> SOURCE_MOLTEN_IRON = FLUIDS.register("molten_iron_fluid",
            () -> new ForgeFlowingFluid.Source(ModFluids.MOLTEN_IRON_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_MOLTEN_IRON = FLUIDS.register("flowing_molten_iron",
            () -> new ForgeFlowingFluid.Flowing(ModFluids.MOLTEN_IRON_FLUID_PROPERTIES));


    public static final ForgeFlowingFluid.Properties MOLTEN_IRON_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            ModFluidTypes.MOLTEN_IRON_FLUID_TYPE, SOURCE_MOLTEN_IRON, FLOWING_MOLTEN_IRON)
            .slopeFindDistance(2).levelDecreasePerBlock(2)
            .bucket(ModItems.MOLTEN_IRON_BUCKET);


    public static void register(IEventBus eventBus) {
        FLUIDS.register(eventBus);
    }
}

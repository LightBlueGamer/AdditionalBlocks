package org.litecraft.additionalblocks.fluid;

import com.mojang.math.Vector3f;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraftforge.common.SoundAction;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fluids.FluidType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.litecraft.additionalblocks.AdditionalBlocks;

public class ModFluidTypes {
    public static final ResourceLocation WATER_STILL_RL = new ResourceLocation("block/water_still");
    public static final ResourceLocation WATER_FLOWING_RL = new ResourceLocation("block/water_flow");
    public static final ResourceLocation IRON_OVERLAY_RL = new ResourceLocation(AdditionalBlocks.MOD_ID, "misc/in_molten_iron");

    public static final DeferredRegister<FluidType> FLUID_TYPES =
            DeferredRegister.create(ForgeRegistries.Keys.FLUID_TYPES, AdditionalBlocks.MOD_ID);

    public static final RegistryObject<FluidType> MOLTEN_IRON_FLUID_TYPE = register("molten_iron_fluid",
            FluidType.Properties.create().lightLevel(2).density(5).viscosity(5).sound(SoundAction.get("drink"),
                    SoundEvents.HONEY_DRINK));

    private static RegistryObject<FluidType> register(String name, FluidType.Properties properties) {
        return FLUID_TYPES.register(name, () -> new BaseFluidType(WATER_STILL_RL, WATER_FLOWING_RL, IRON_OVERLAY_RL,
                0xFFB5332E, new Vector3f(181f / 255f, 51f / 255f, 46f / 255f), properties));
    }

    public static void register(IEventBus eventBus) {
        FLUID_TYPES.register(eventBus);
    }

}

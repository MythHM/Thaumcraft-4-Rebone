package com.mythhm.thaumcraft4rebone.registry;

import net.minecraft.core.Registry;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.minecraft.world.item.CreativeModeTab;

import static com.mythhm.thaumcraft4rebone.Thaumcraft4Rebone.MODID;

public class ModCreativeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MODID);

    public static final RegistryObject<CreativeModeTab> creative_mode_tabs = CREATIVE_MODE_TABS.register("creative_mode_tabs",
            () -> CreativeModeTab.builder()
                    .title(Component.translatable("itemGroup." + MODID + ".creative_mode_tabs")) // 更新键值
                    .icon(() -> new ItemStack(ModItems.GREAT_WOOD_LOG.get()))
                    .displayItems((params, output) -> {
                        output.accept(ModItems.GREAT_WOOD_LOG.get());
                        output.accept(ModItems.GREAT_WOOD_PLANKS.get());
                        output.accept(ModItems.SILVER_WOOD_LOG.get());
                        output.accept(ModItems.SILVER_WOOD_PLANKS.get());
                        output.accept(ModItems.AIR_ORE.get());
                        output.accept(ModItems.FIRE_ORE.get());
                        output.accept(ModItems.EARTH_ORE.get());
                        output.accept(ModItems.ORDER_ORE.get());
                        output.accept(ModItems.ENTROPY_ORE.get());
                        output.accept(ModItems.WATER_ORE.get());
                    })
                    .build());
}


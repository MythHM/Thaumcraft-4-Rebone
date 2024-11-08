package com.mythhm.thaumcraft4rebone.datagen;

import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import static com.mythhm.thaumcraft4rebone.Thaumcraft4Rebone.MODID;

@Mod.EventBusSubscriber(modid = MODID ,bus = Mod.EventBusSubscriber.Bus.MOD)
public class DataGenerators {
    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        PackOutput packOutput = generator.getPackOutput();
        ExistingFileHelper helper = event.getExistingFileHelper();

        generator.addProvider(true,new ModItemModelProvider(packOutput,helper));
        generator.addProvider(true,new ModBlockStateProvider(packOutput,helper));
        generator.addProvider(true,ModLootTableProvider.create(packOutput));
        generator.addProvider(true,new ModRecipeProvider(packOutput));
    }
}

package com.mythhm.thaumcraft4rebone.datagen;

import com.mythhm.thaumcraft4rebone.Thaumcraft4Rebone;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;


@Mod.EventBusSubscriber(modid = Thaumcraft4Rebone.MODID ,bus = Mod.EventBusSubscriber.Bus.MOD)
public class DataGenerators {
    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        PackOutput packOutput = generator.getPackOutput();
        ExistingFileHelper helper = event.getExistingFileHelper();
        var lookupProvider = event.getLookupProvider();

        generator.addProvider(true,new ModItemModelProvider(packOutput,helper));
        generator.addProvider(true,new ModBlockStateProvider(packOutput,helper));
        generator.addProvider(true,ModLootTableProvider.create(packOutput));
        generator.addProvider(true,new ModRecipeProvider(packOutput));

        generator.addProvider(event.includeServer(), new ModWorldGenProvider(packOutput, lookupProvider));
    }
}

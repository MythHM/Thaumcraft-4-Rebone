package com.mythhm.thaumcraft4rebone.datagen;

import com.mythhm.thaumcraft4rebone.registry.ModConfiguredFeatures;
import com.mythhm.thaumcraft4rebone.registry.ModPlacedFeatures;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.Registry;
import net.minecraft.core.RegistrySetBuilder;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.DatapackBuiltinEntriesProvider;

import java.util.Set;
import java.util.concurrent.CompletableFuture;

import static com.mythhm.thaumcraft4rebone.Thaumcraft4Rebone.MODID;

public class ModWorldGenProvider extends DatapackBuiltinEntriesProvider {

    public static final RegistrySetBuilder BUILDER = new RegistrySetBuilder()
            .add(Registries.CONFIGURED_FEATURE, ModConfiguredFeatures::bootstrap)
            .add(Registries.PLACED_FEATURE, ModPlacedFeatures::bootstrap);

    public ModWorldGenProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output,registries,BUILDER,Set.of(MODID));
    }
}

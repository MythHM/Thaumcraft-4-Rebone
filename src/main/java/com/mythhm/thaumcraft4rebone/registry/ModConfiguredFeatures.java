package com.mythhm.thaumcraft4rebone.registry;

import com.mythhm.thaumcraft4rebone.registry.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.core.Registry;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.structure.templatesystem.BlockMatchTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.TagMatchTest;

import java.util.List;

import static com.mythhm.thaumcraft4rebone.Thaumcraft4Rebone.MODID;

public class ModConfiguredFeatures {
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_AIR_ORE_KEY = resourceKey("air_ore");

    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_FIRE_ORE_KEY = resourceKey("fire_ore");

    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_EARTH_ORE_KEY = resourceKey("earth_ore");

    public static void bootstrap(BootstapContext<ConfiguredFeature<?, ?>> context) {
        RuleTest stoneReplace = new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES);
        RuleTest deepslateReplace = new TagMatchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);
        RuleTest netherrackReplace = new BlockMatchTest(Blocks.NETHERRACK);
        RuleTest endstoneReplace = new BlockMatchTest(Blocks.END_STONE);

        List<OreConfiguration.TargetBlockState> overworldBlockAirOres = List
                .of(OreConfiguration.target(stoneReplace, ModBlocks.AIR_ORE.get().defaultBlockState()),
                        OreConfiguration.target(deepslateReplace, ModBlocks.EARTH_ORE.get().defaultBlockState()));
        register(context,OVERWORLD_AIR_ORE_KEY,Feature.ORE,
                new OreConfiguration(overworldBlockAirOres,9));

    }

    private static ResourceKey<ConfiguredFeature<?, ?>> resourceKey(String name){
        return ResourceKey.create(Registries.CONFIGURED_FEATURE, new ResourceLocation(MODID, name));

    }

    private static <FC extends FeatureConfiguration,F extends Feature<FC>> void register(BootstapContext<ConfiguredFeature<?, ?>> context,
                                                                                          ResourceKey<ConfiguredFeature<?, ?>> key,
                                                                                          F feature,FC configuration){
        context.register(key , new ConfiguredFeature<>(feature, configuration));
    }
}
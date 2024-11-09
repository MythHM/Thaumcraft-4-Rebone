package com.mythhm.thaumcraft4rebone.registry;

import net.minecraft.core.Holder;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.*;

import java.util.List;

import static com.mythhm.thaumcraft4rebone.Thaumcraft4Rebone.MODID;

public class ModPlacedFeatures {

    public static final ResourceKey<PlacedFeature> OVERWORLD_AIR_ORE_KEY = createKey("air_ore_placed");

    public static final ResourceKey<PlacedFeature> OVERWORLD_FIRE_ORE_KEY = createKey("fire_ore_placed");

    public static final ResourceKey<PlacedFeature> OVERWORLD_WATER_ORE_KEY = createKey("water_ore_placed");

    public static final ResourceKey<PlacedFeature> OVERWORLD_EARTH_ORE_KEY = createKey("earth_ore_placed");

    public static final ResourceKey<PlacedFeature> OVERWORLD_ORDER_ORE_KEY = createKey("order_ore_placed");

    public static final ResourceKey<PlacedFeature> OVERWORLD_ENTROPY_ORE_KEY = createKey("entropy_ore_placed");

    // 注册放置特征的bootstrap方法
    public static void bootstrap(BootstapContext<PlacedFeature> context) {
        var configured = context.lookup(Registries.CONFIGURED_FEATURE);
        register(context, OVERWORLD_AIR_ORE_KEY,
                configured.getOrThrow(ModConfiguredFeatures.OVERWORLD_AIR_ORE_KEY),
                ModOrePlacement.commonOrePlacement(6,
                        HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(-60), VerticalAnchor.absolute(40))));

        register(context, OVERWORLD_FIRE_ORE_KEY,
                configured.getOrThrow(ModConfiguredFeatures.OVERWORLD_FIRE_ORE_KEY),
                ModOrePlacement.commonOrePlacement(6,
                        HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(-60), VerticalAnchor.absolute(40))));

        register(context, OVERWORLD_WATER_ORE_KEY,
                configured.getOrThrow(ModConfiguredFeatures.OVERWORLD_WATER_ORE_KEY),
                ModOrePlacement.commonOrePlacement(6,
                        HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(-60), VerticalAnchor.absolute(40))));

        register(context, OVERWORLD_ORDER_ORE_KEY,
                configured.getOrThrow(ModConfiguredFeatures.OVERWORLD_ORDER_ORE_KEY),
                ModOrePlacement.commonOrePlacement(6,
                        HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(-60), VerticalAnchor.absolute(40))));

        register(context, OVERWORLD_ENTROPY_ORE_KEY,
                configured.getOrThrow(ModConfiguredFeatures.OVERWORLD_ENTROPY_ORE_KEY),
                ModOrePlacement.commonOrePlacement(6,
                        HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(-60), VerticalAnchor.absolute(40))));

        register(context, OVERWORLD_EARTH_ORE_KEY,
                configured.getOrThrow(ModConfiguredFeatures.OVERWORLD_EARTH_ORE_KEY),
                ModOrePlacement.commonOrePlacement(6,
                        HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(-60), VerticalAnchor.absolute(40))));


    }

    private static ResourceKey<PlacedFeature> createKey(String name) {
        return ResourceKey.create(Registries.PLACED_FEATURE, new ResourceLocation(MODID, name));
    }

    private static void register(BootstapContext<PlacedFeature> context, ResourceKey<PlacedFeature> key,
                                 Holder<ConfiguredFeature<?, ?>> configured, List<PlacementModifier> modifiers) {
        context.register(key, new PlacedFeature(configured, List.copyOf(modifiers)));
    }

    // 内部类，处理矿石的放置
    static class ModOrePlacement {



        private static List<PlacementModifier> orePlacement(PlacementModifier modifier, PlacementModifier modifier1) {
            return List.of(modifier, InSquarePlacement.spread(), modifier1, BiomeFilter.biome());
        }

        //一个区块内有多少簇
        private static List<PlacementModifier> commonOrePlacement(int count, PlacementModifier modifier) {
            return orePlacement(CountPlacement.of(count), modifier);
        }

        private static List<PlacementModifier> rareOrePlacement(int rarity, PlacementModifier modifier) {
            return orePlacement(RarityFilter.onAverageOnceEvery(rarity), modifier);
        }
    }
}

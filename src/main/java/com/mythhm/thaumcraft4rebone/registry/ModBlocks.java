package com.mythhm.thaumcraft4rebone.registry;

import com.mythhm.thaumcraft4rebone.block.ElementalOreBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import static com.mythhm.thaumcraft4rebone.Thaumcraft4Rebone.MODID;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS,MODID);

    //宏伟原木
    public static final RegistryObject<Block> GREAT_WOOD_LOG = BLOCKS.register("great_wood_log",
            ()-> new RotatedPillarBlock(BlockBehaviour.Properties.of().strength(1.0f).sound(SoundType.WOOD)));

    //宏伟木板
    public static final RegistryObject<Block> GREAT_WOOD_PLANKS = BLOCKS.register("great_wood_planks",
            ()-> new Block(BlockBehaviour.Properties.of().strength(1.0f).sound(SoundType.WOOD)));

    //宏伟原木
    public static final RegistryObject<Block> SILVER_WOOD_LOG = BLOCKS.register("silver_wood_log",
            ()-> new RotatedPillarBlock(BlockBehaviour.Properties.of().strength(1.0f).sound(SoundType.WOOD)));

    //宏伟木板
    public static final RegistryObject<Block> SILVER_WOOD_PLANKS = BLOCKS.register("silver_wood_planks",
            ()-> new Block(BlockBehaviour.Properties.of().strength(1.0f).sound(SoundType.WOOD)));


    //矿石方块
    public static final RegistryObject<Block> AIR_ORE = BLOCKS.register("air_ore", () -> new ElementalOreBlock("Air"));
    public static final RegistryObject<Block> FIRE_ORE = BLOCKS.register("fire_ore", () -> new ElementalOreBlock("Fire"));
    public static final RegistryObject<Block> EARTH_ORE = BLOCKS.register("earth_ore", () -> new ElementalOreBlock("Earth"));
    public static final RegistryObject<Block> ORDER_ORE = BLOCKS.register("order_ore", () -> new ElementalOreBlock("Order"));
    public static final RegistryObject<Block> ENTROPY_ORE = BLOCKS.register("entropy_ore", () -> new ElementalOreBlock("Entropy"));

}

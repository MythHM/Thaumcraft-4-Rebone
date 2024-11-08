package com.mythhm.thaumcraft4rebone;

import com.mojang.logging.LogUtils;
import com.mythhm.thaumcraft4rebone.registry.ModBlocks;
import com.mythhm.thaumcraft4rebone.registry.ModCreativeTabs;
import com.mythhm.thaumcraft4rebone.registry.ModItems;
import net.minecraft.client.Minecraft;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

// 此处的值应与 META-INF/mods.toml 文件中的条目匹配
@Mod(Thaumcraft4Rebone.MODID)
public class Thaumcraft4Rebone
{
    // 在公共位置定义 mod id 以供所有地方引用
    public static final String MODID = "thaumcraft4rebone";
    // 直接引用一个 slf4j 记录器
    private static final Logger LOGGER = LogUtils.getLogger();

    /*
    // 创建一个延迟注册来保存方块（Block），所有方块都将注册在 "examplemod" 命名空间下
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MODID);
    // 创建一个延迟注册来保存物品（Item），所有物品都将注册在 "examplemod" 命名空间下
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MODID);
    // 创建一个延迟注册来保存创意模式标签（CreativeModeTab），所有标签都将注册在 "examplemod" 命名空间下
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MODID);

    // 创建一个 ID 为 "examplemod:example_block" 的新方块，将命名空间和路径组合在一起
    public static final RegistryObject<Block> EXAMPLE_BLOCK = BLOCKS.register("example_block", () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.STONE)));
    // 创建一个 ID 为 "examplemod:example_block" 的新方块物品，将命名空间和路径组合在一起
    public static final RegistryObject<Item> EXAMPLE_BLOCK_ITEM = ITEMS.register("example_block", () -> new BlockItem(EXAMPLE_BLOCK.get(), new Item.Properties()));

    // 创建一个 ID 为 "examplemod:example_item" 的新食物物品，具有 1 点营养值和 2 的饱和度
    public static final RegistryObject<Item> EXAMPLE_ITEM = ITEMS.register("example_item", () -> new Item(new Item.Properties().food(new FoodProperties.Builder()
            .alwaysEat().nutrition(1).saturationMod(2f).build())));

    // 创建一个 ID 为 "examplemod:example_tab" 的创意标签，用于 example_item，放置在战斗标签之后
    public static final RegistryObject<CreativeModeTab> EXAMPLE_TAB = CREATIVE_MODE_TABS.register("example_tab", () -> CreativeModeTab.builder()
            .withTabsBefore(CreativeModeTabs.COMBAT)
            .icon(() -> EXAMPLE_ITEM.get().getDefaultInstance())
            .displayItems((parameters, output) -> {
                output.accept(EXAMPLE_ITEM.get()); // 将 example_item 添加到标签中。对于自定义标签，推荐使用此方法而不是事件
            }).build());*/

    public Thaumcraft4Rebone(FMLJavaModLoadingContext context)
    {
        IEventBus modEventBus = context.getModEventBus();

        ModItems.ITEMS.register(modEventBus);

        ModBlocks.BLOCKS.register(modEventBus);

        ModCreativeTabs.CREATIVE_MODE_TABS.register(modEventBus);

        /*
        // 注册 mod 加载的 commonSetup 方法
        modEventBus.addListener(this::commonSetup);



        // 将延迟注册绑定到 mod 事件总线，以便方块能够注册
        BLOCKS.register(modEventBus);
        // 将延迟注册绑定到 mod 事件总线，以便物品能够注册
        ITEMS.register(modEventBus);
        // 将延迟注册绑定到 mod 事件总线，以便标签能够注册
        CREATIVE_MODE_TABS.register(modEventBus);

        // 注册服务器和其他游戏事件，我们对此类事件感兴趣
        MinecraftForge.EVENT_BUS.register(this);

        // 将物品注册到创意标签中
        modEventBus.addListener(this::addCreative);

        // 注册 mod 的 ForgeConfigSpec，以便 Forge 为我们创建和加载配置文件
        context.registerConfig(ModConfig.Type.COMMON, Config.SPEC);

         */
    }
/*
    private void commonSetup(final FMLCommonSetupEvent event)
    {
        // 一些通用设置代码
        LOGGER.info("来自通用设置的问候");

        if (Config.logDirtBlock)
            LOGGER.info("泥土方块 >> {}", ForgeRegistries.BLOCKS.getKey(Blocks.DIRT));

        LOGGER.info(Config.magicNumberIntroduction + Config.magicNumber);

        Config.items.forEach((item) -> LOGGER.info("物品 >> {}", item.toString()));
    }

    // 将示例方块物品添加到建筑方块标签中
    private void addCreative(BuildCreativeModeTabContentsEvent event)
    {
        if (event.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS)
            event.accept(EXAMPLE_BLOCK_ITEM);
    }

    // 您可以使用 @SubscribeEvent，让事件总线发现需要调用的方法
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event)
    {
        // 当服务器启动时执行某些操作
        LOGGER.info("来自服务器启动的问候");
    }*/

    // 您可以使用 EventBusSubscriber 自动注册该类中所有带有 @SubscribeEvent 注解的静态方法
    @Mod.EventBusSubscriber(modid = MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents
    {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event)
        {
            // 一些客户端设置代码
            LOGGER.info("来自客户端设置的问候");
            LOGGER.info("MINECRAFT 用户名 >> {}", Minecraft.getInstance().getUser().getName());
        }
    }



}



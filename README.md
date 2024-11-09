# Thaumcraft-4-Rebone

Thaumcraft 4 移植到高版本项目

目前版本为Minecraft 1.20.1


项目结构
```plaintext
D:\THAUMCRAFT-4-REBONE\SRC
└───main
    ├───java
    │   └───com
    │       └───mythhm
    │           └───thaumcraft4rebone
    │               │   Config.java
    │               │   Thaumcraft4Rebone.java
    │               │
    │               ├───datagen (数据生成)
    │               │       DataGenerators.java
    │               │       ModBlockLootTables.java
    │               │       ModBlockStateProvider.java
    │               │       ModItemModelProvider.java
    │               │       ModLootTableProvider.java
    │               │       ModRecipeProvider.java
    │               │       ModWorldGenProvider.java
    │               │
    │               ├───entity
    │               ├───event
    │               ├───registry (注册)
    │               │       ModBlocks.java (注册方块)
    │               │       ModConfiguredFeatures.java (世界生成配置)
    │               │       ModCreativeTabs.java (创造模式物品栏)
    │               │       ModItems.java (注册物品)
    │               │       ModPlacedFeatures.java (世界生成)
    │               │
    │               └───world
    └───resources
        │   pack.mcmeta
        │
        ├───.cache
        │       103d9f3f36b01595f1aa5172191e60eff02e6924
        │       160f05c947ce782b278377cae662d3b70620cbe8
        │       59eb3dbb5f86130e09b3c62d89b9525ee01cf52d
        │       9fb1092f32d4fcbf9e061ffd718d4ec689c6c95e
        │       a41a15e8abf3fd7e0d24de2f6cd7298f55e113f2
        │
        ├───assets
        │   └───thaumcraft4rebone
        │       ├───blockstates
        │       │       air_ore.json
        │       │       earth_ore.json
        │       │       entropy_ore.json
        │       │       fire_ore.json
        │       │       great_wood_log.json
        │       │       great_wood_planks.json
        │       │       order_ore.json
        │       │       silver_wood_log.json
        │       │       silver_wood_planks.json
        │       │       water_ore.json
        │       │
        │       ├───lang
        │       │       en_us.json
        │       │       zh_cn.json
        │       │
        │       ├───models
        │       │   ├───block
        │       │   │       air_ore.json
        │       │   │       earth_ore.json
        │       │   │       entropy_ore.json
        │       │   │       fire_ore.json
        │       │   │       great_wood_log.json
        │       │   │       great_wood_log_horizontal.json
        │       │   │       great_wood_planks.json
        │       │   │       order_ore.json
        │       │   │       silver_wood_log.json
        │       │   │       silver_wood_log_horizontal.json
        │       │   │       silver_wood_planks.json
        │       │   │       water_ore.json
        │       │   │
        │       │   └───item
        │       │           air_ore.json
        │       │           air_shard.json
        │       │           balanced_shard.json
        │       │           earth_ore.json
        │       │           earth_shard.json
        │       │           entropy_ore.json
        │       │           entropy_shard.json
        │       │           fire_ore.json
        │       │           fire_shard.json
        │       │           great_wood_log.json
        │       │           great_wood_planks.json
        │       │           order_ore.json
        │       │           order_shard.json
        │       │           silver_wood_log.json
        │       │           silver_wood_planks.json
        │       │           water_ore.json
        │       │           water_shard.json
        │       │
        │       └───textures
        │           ├───block
        │           │       air_ore.png
        │           │       earth_ore.png
        │           │       entropy_ore.png
        │           │       fire_ore.png
        │           │       great_wood_log.png
        │           │       great_wood_planks - Copy.png
        │           │       great_wood_planks.png
        │           │       log_greatwood.png
        │           │       log_greatwood_top.png
        │           │       log_silverwood.png
        │           │       log_silverwood_top.png
        │           │       order_ore.png
        │           │       silver_wood_planks.png
        │           │       water_ore.png
        │           │
        │           └───item
        │                   air_ore.png
        │                   air_shard.png
        │                   balanced_shard.png
        │                   balanced_shard.png.mcmeta
        │                   earth_ore.png
        │                   earth_shard.png
        │                   entropy_ore.png
        │                   entropy_shard.png
        │                   fire_ore.png
        │                   fire_shard.png
        │                   order_ore.png
        │                   order_shard.png
        │                   water_ore.png
        │                   water_shard.png
        │
        ├───data
        │   ├───minecraft
        │   │   └───tags
        │   │       ├───blocks
        │   │       │   │   needs_diamond_tool.json
        │   │       │   │   needs_iron_tool.json
        │   │       │   │   needs_stone_tool.json
        │   │       │   │
        │   │       │   └───mineable
        │   │       │           axe.json
        │   │       │           hoe.json
        │   │       │           pickaxe.json
        │   │       │           shovel.json
        │   │       │
        │   │       └───items
        │   │               logs.json
        │   │               planks.json
        │   │
        │   └───thaumcraft4rebone
        │       ├───forge
        │       │   └───biome_modifier
        │       │           overword_air_ore.json
        │       │           overword_earth_ore.json
        │       │           overword_entropy_ore.json
        │       │           overword_fire_ore.json
        │       │           overword_order_ore.json
        │       │           overword_water_ore.json
        │       │
        │       ├───loot_tables
        │       │   └───blocks
        │       │           air_ore.json
        │       │           entropy_ore.json
        │       │           fire_ore.json
        │       │           order_ore.json
        │       │           silver_wood_planks.json
        │       │           water_ore.json
        │       │
        │       ├───recipes
        │       │       great_wood_planks.json
        │       │       silver_wood_planks.json
        │       │
        │       ├───tags
        │       │   └───items
        │       │           great_wood_log.json
        │       │           silver_wood_planks.json
        │       │
        │       └───worldgen
        │           ├───configured_feature
        │           │       air_ore.json
        │           │       earth_ore.json
        │           │       entropy_ore.json
        │           │       fire_ore.json
        │           │       order_ore.json
        │           │       water_ore.json
        │           │
        │           └───placed_feature
        │                   air_ore_placed.json
        │                   earth_ore_placed.json
        │                   entropy_ore_placed.json
        │                   fire_ore_placed.json
        │                   order_ore_placed.json
        │                   water_ore_placed.json
        │
        └───META-INF
                mods.toml
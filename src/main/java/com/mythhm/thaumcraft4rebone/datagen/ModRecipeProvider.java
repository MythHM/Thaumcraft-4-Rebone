package com.mythhm.thaumcraft4rebone.datagen;

import com.mythhm.thaumcraft4rebone.registry.ModBlocks;
import com.mythhm.thaumcraft4rebone.registry.ModItems;
import net.minecraft.advancements.CriterionTriggerInstance;
import net.minecraft.advancements.critereon.ItemPredicate;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ItemLike;

import java.util.function.Consumer;

import static com.mythhm.thaumcraft4rebone.Thaumcraft4Rebone.MODID;
import static net.minecraft.data.recipes.SimpleCookingRecipeBuilder.smelting;

public class ModRecipeProvider extends RecipeProvider {
    public ModRecipeProvider(PackOutput output) {
        super(output);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> consumer) {
        smeltingRecipes(consumer);
        craftingRecipes(consumer);
    }


    protected void craftingRecipes(Consumer<FinishedRecipe> consumer) {
        /*
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.GREAT_WOOD_PLANKS.get())
                .pattern("sss")
                .pattern("sps")
                .pattern("sss")
                .define('s',ModItems.GREAT_WOOD_PLANKS.get())
                .unlockedBy("has_great_wood_log", hasItem(ModItems.GREAT_WOOD_PLANKS.get()))
                .save(consumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GREAT_WOOD_LOG.get())
                .requires(ModItems.GREAT_WOOD_PLANKS.get())
                .unlockedBy("has_great_wood_log", hasItem(ModBlocks.GREAT_WOOD_LOG.get()))
                .save(consumer);
        */
    }

    private void smeltingRecipes(Consumer<FinishedRecipe> consumer) {
        /*
        smelting(Items.BEEF, RecipeCategory.MISC, Items.COOKED_BEEF, 0.5f, 200)
                .save(consumer, new ResourceLocation(MODID, "cook_beef").toString()
                        + "_from_smelting");

         */
    }

    private SimpleCookingRecipeBuilder smelting(ItemLike item, RecipeCategory category, ItemLike result, float xp, int time) {
        return SimpleCookingRecipeBuilder.smelting(Ingredient.of(item),
                category,result,xp,time);
    }


    private SimpleCookingRecipeBuilder blasting(ItemLike item, RecipeCategory category, ItemLike result, float xp, int time) {
        return SimpleCookingRecipeBuilder.blasting(Ingredient.of(item),
                category,result,xp,time);
    }



    private CriterionTriggerInstance hasItem(ItemLike item) {
        return inventoryTrigger(ItemPredicate.Builder.item().of(item).build());
    }
}

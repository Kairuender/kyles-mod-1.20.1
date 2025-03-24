package net.kairuender.abyssdow.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.kairuender.abyssdow.block.ModBlocks;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {

        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.DEEPSLATE_VOID_ORE)
                .add(ModBlocks.VOID_BLOCK)
                .add(ModBlocks.DEEPSLATE_PALE_ORE)
                .add(ModBlocks.PALE_BLOCK);


        getOrCreateTagBuilder(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.PALE_BLOCK)
                .add(ModBlocks.VOID_BLOCK);

        getOrCreateTagBuilder(BlockTags.AXE_MINEABLE)
                .add(ModBlocks.SHADOW_PLANKS)
                .add(ModBlocks.SHADOW_LOG)
                .add(ModBlocks.SHADOW_WOOD)
                .add(ModBlocks.STRIPPED_SHADOW_LOG)
                .add(ModBlocks.STRIPPED_SHADOW_WOOD);



        getOrCreateTagBuilder(TagKey.of(RegistryKeys.BLOCK, new Identifier("fabric", "needs_tool_level_4")))
                .add(ModBlocks.DEEPSLATE_PALE_ORE)
                .add(ModBlocks.DEEPSLATE_VOID_ORE);

        getOrCreateTagBuilder(BlockTags.LOGS_THAT_BURN)
                .add(ModBlocks.SHADOW_LOG)
                .add(ModBlocks.SHADOW_WOOD)
                .add(ModBlocks.STRIPPED_SHADOW_LOG)
                .add(ModBlocks.STRIPPED_SHADOW_WOOD);

        getOrCreateTagBuilder(BlockTags.FENCES)
                .add(ModBlocks.SHADOW_Fence);

        getOrCreateTagBuilder(BlockTags.FENCE_GATES)
                .add(ModBlocks.SHADOW_Fence_gate);
        getOrCreateTagBuilder(BlockTags.LOGS)
                .add(ModBlocks.SHADOW_LOG);
    }
}

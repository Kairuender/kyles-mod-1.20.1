package net.kairuender.abyssdow.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.kairuender.abyssdow.block.ModBlocks;
import net.kairuender.abyssdow.item.ModItems;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PALE_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DEEPSLATE_PALE_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.VOID_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DEEPSLATE_VOID_ORE);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.Void_Iron_Block);

        blockStateModelGenerator.registerLog(ModBlocks.SHADOW_LOG).log(ModBlocks.SHADOW_LOG).wood(ModBlocks.SHADOW_WOOD);
        blockStateModelGenerator.registerLog(ModBlocks.STRIPPED_SHADOW_LOG).log(ModBlocks.STRIPPED_SHADOW_LOG).wood(ModBlocks.STRIPPED_SHADOW_WOOD);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SHADOW_LEAVES);

        BlockStateModelGenerator.BlockTexturePool shadow_pool =  blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.SHADOW_PLANKS);
        shadow_pool.family(ModBlocks.Shadow_Family);
        shadow_pool.stairs(ModBlocks.SHADOW_Stairs);
        shadow_pool.slab(ModBlocks.SHADOW_Slab);
        shadow_pool.button(ModBlocks.SHADOW_Button);
        shadow_pool.pressurePlate(ModBlocks.SHADOW_Pressure_Plate);
        shadow_pool.fence(ModBlocks.SHADOW_Fence);
        shadow_pool.fenceGate(ModBlocks.SHADOW_Fence_gate);

        blockStateModelGenerator.registerDoor(ModBlocks.SHADOW_Door);
        blockStateModelGenerator.registerTrapdoor(ModBlocks.SHADOW_Trapdoor);


        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.SHADOW_SAPLING, ModBlocks.POTTED_SHADOW_SAPLING, BlockStateModelGenerator.TintType.NOT_TINTED);

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.Pale_Ingot, Models.GENERATED);
        itemModelGenerator.register(ModItems.Void_Shard, Models.GENERATED);

        itemModelGenerator.register(ModItems.Descending_Dark, Models.GENERATED);
        itemModelGenerator.register(ModItems.Long_Nail, Models.GENERATED);

        itemModelGenerator.register(ModItems.SNAP, Models.GENERATED);
        itemModelGenerator.register(ModItems.DUMMYS, Models.GENERATED);
        itemModelGenerator.register(ModItems.FRIENDS, Models.GENERATED);
        itemModelGenerator.register(ModItems.HAVE_ONE, Models.GENERATED);
        itemModelGenerator.register(ModItems.HEHIMS, Models.GENERATED);
        itemModelGenerator.register(ModItems.WWS, Models.GENERATED);

        itemModelGenerator.register(ModItems.Void_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.Void_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.Void_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.Void_HOE, Models.HANDHELD);

        itemModelGenerator.register(ModItems.Hanging_Shadow_Sign, Models.GENERATED);

        itemModelGenerator.register(ModItems.Shadow_Boat, Models.GENERATED);
        itemModelGenerator.register(ModItems.Shadow_Chest_Boat, Models.GENERATED);

        itemModelGenerator.register(ModItems.Pure_Nail, Models.HANDHELD);
        itemModelGenerator.register(( ModItems.Hornet_Nail), Models.HANDHELD);
        itemModelGenerator.register(( ModItems.Void_Upgrade_Smithing_Template), Models.HANDHELD);
        itemModelGenerator.register(( ModItems.Spoon_Upgrade_Smithing_Template), Models.HANDHELD);

    }
}

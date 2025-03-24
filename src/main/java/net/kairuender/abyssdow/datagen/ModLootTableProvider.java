package net.kairuender.abyssdow.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.kairuender.abyssdow.block.ModBlocks;
import net.kairuender.abyssdow.item.ModItems;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.PALE_BLOCK);
        addDrop(ModBlocks.VOID_BLOCK);

        addDrop(ModBlocks.Void_Iron_Block);

        addDrop(ModBlocks.DEEPSLATE_PALE_ORE, oreDrops(ModBlocks.DEEPSLATE_PALE_ORE, ModItems.Pale_Ingot));
        addDrop(ModBlocks.DEEPSLATE_VOID_ORE, oreDrops(ModBlocks.DEEPSLATE_VOID_ORE, ModItems.Void_Shard));

        addDrop(ModBlocks.SHADOW_LOG);
        addDrop(ModBlocks.SHADOW_WOOD);
        addDrop(ModBlocks.STRIPPED_SHADOW_LOG);
        addDrop(ModBlocks.STRIPPED_SHADOW_WOOD);
        addDrop(ModBlocks.SHADOW_PLANKS);
        addDrop(ModBlocks.SHADOW_SAPLING);
        addPottedPlantDrops(ModBlocks.POTTED_SHADOW_SAPLING);

        addDrop(ModBlocks.SHADOW_Stairs);
        addDrop(ModBlocks.SHADOW_Button);
        addDrop(ModBlocks.SHADOW_Pressure_Plate);
        addDrop(ModBlocks.SHADOW_Fence);
        addDrop(ModBlocks.SHADOW_Fence_gate);
        addDrop(ModBlocks.SHADOW_Trapdoor);

        addDrop(ModBlocks.SHADOW_Door, doorDrops(ModBlocks.SHADOW_Door));
        addDrop(ModBlocks.SHADOW_Slab, slabDrops(ModBlocks.SHADOW_Slab));

        addDrop(ModBlocks.SHADOW_LOG, leavesDrops(ModBlocks.SHADOW_LEAVES, ModBlocks.SHADOW_SAPLING, 0.025F));
    }
}

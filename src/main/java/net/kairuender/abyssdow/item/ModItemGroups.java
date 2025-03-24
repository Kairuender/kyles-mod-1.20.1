package net.kairuender.abyssdow.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.kairuender.abyssdow.KylesMod;
import net.kairuender.abyssdow.block.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;


public class ModItemGroups {
    public static final ItemGroup VOID_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(KylesMod.MOD_ID, "void_"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.void"))
                    .icon(() -> new ItemStack(ModItems.Void_Shard)).entries((displayContext, entries) -> {
                        entries.add(ModBlocks.SHADOW_SAPLING);
                        entries.add(ModBlocks.SHADOW_LOG);
                        entries.add(ModBlocks.SHADOW_WOOD);
                        entries.add(ModBlocks.STRIPPED_SHADOW_LOG);
                        entries.add(ModBlocks.STRIPPED_SHADOW_WOOD);
                        entries.add(ModBlocks.SHADOW_LEAVES);
                        entries.add(ModBlocks.SHADOW_PLANKS);

                        entries.add(ModBlocks.SHADOW_Button);
                        entries.add(ModBlocks.SHADOW_Pressure_Plate);

                        entries.add(ModBlocks.SHADOW_Stairs);
                        entries.add(ModBlocks.SHADOW_Slab);

                        entries.add(ModBlocks.SHADOW_Fence);
                        entries.add(ModBlocks.SHADOW_Fence_gate);

                        entries.add(ModBlocks.SHADOW_Door);
                        entries.add(ModBlocks.SHADOW_Trapdoor);

                        entries.add(ModItems.Shadow_Sign);
                        entries.add(ModItems.Hanging_Shadow_Sign);

                        entries.add(ModItems.Shadow_Boat);
                        entries.add(ModItems.Shadow_Chest_Boat);

                        entries.add(ModItems.SNAP);
                        entries.add(ModItems.DUMMYS);
                        entries.add(ModItems.FRIENDS);
                        entries.add(ModItems.HAVE_ONE);
                        entries.add(ModItems.HEHIMS);
                        entries.add(ModItems.WWS);

                        entries.add(ModBlocks.DEEPSLATE_VOID_ORE);
                        entries.add(ModBlocks.DEEPSLATE_PALE_ORE);

                        entries.add(ModItems.Void_Shard);
                        entries.add(ModItems.Pale_Ingot);

                        entries.add(ModBlocks.VOID_BLOCK);
                        entries.add(ModBlocks.PALE_BLOCK);

                        entries.add(ModBlocks.Void_Iron_Block);

                        entries.add(ModItems.Descending_Dark);
                        entries.add(ModItems.Long_Nail);
                        entries.add(ModItems.Void_Upgrade_Smithing_Template);
                        entries.add(ModItems.Spoon_Upgrade_Smithing_Template);

                        entries.add(ModItems.Hollow_Mask);
                        entries.add(ModItems.Void_ChestPlate);
                        entries.add(ModItems.Void_Leggings);
                        entries.add(ModItems.Void_Boots);

                        entries.add(ModItems.Void_PICKAXE);
                        entries.add(ModItems.Void_AXE);
                        entries.add(ModItems.Void_SHOVEL);
                        entries.add(ModItems.Void_HOE);

                        entries.add(ModItems.Pure_Nail);
                        entries.add(ModItems.Hornet_Nail);

                        entries.add(KylesMod.Silver_Spoon);
                        entries.add(KylesMod.Gold_Spoon);
                    }).build());

    public static void registerItemGroups() {
        KylesMod.LOGGER.info("Registering Item Groups for " +KylesMod.MOD_ID);
    }
}

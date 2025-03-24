package net.kairuender.abyssdow.block;

import com.terraformersmc.terraform.sign.block.TerraformHangingSignBlock;
import com.terraformersmc.terraform.sign.block.TerraformSignBlock;
import com.terraformersmc.terraform.sign.block.TerraformWallHangingSignBlock;
import com.terraformersmc.terraform.sign.block.TerraformWallSignBlock;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.kairuender.abyssdow.KylesMod;
import net.kairuender.abyssdow.world.tree.ShadowSaplingGenerator;
import net.minecraft.block.*;
import net.minecraft.data.family.BlockFamilies;
import net.minecraft.data.family.BlockFamily;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;

public class ModBlocks {
    public static final Block VOID_BLOCK = registerBlock("void_block",
            new Block(FabricBlockSettings.copyOf(Blocks.NETHERITE_BLOCK).strength(30.0f, 1200.0f)));
    public static final Block PALE_BLOCK = registerBlock("pale_block",
            new Block(FabricBlockSettings.copyOf(Blocks.NETHERITE_BLOCK).strength(30.0f, 1200.0f)));
    public static final Block DEEPSLATE_PALE_ORE = registerBlock("deepslate_pale_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.DEEPSLATE).strength(10.0f, 1200.0f), UniformIntProvider.create(2, 8)));
    public static final Block DEEPSLATE_VOID_ORE = registerBlock("deepslate_void_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.DEEPSLATE).strength(10.0f, 1200.0f), UniformIntProvider.create(2, 8)));

    public static final Block Void_Iron_Block = registerBlock("void_iron_block",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).strength(10.0f, 20.0f)));

    public static final Block SHADOW_LOG = registerBlock("shadow_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.CHERRY_LOG).strength(4f)));
    public static final Block SHADOW_WOOD  = registerBlock("shadow_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.CHERRY_WOOD).strength(4f)));
    public static final Block STRIPPED_SHADOW_LOG = registerBlock("stripped_shadow_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_CHERRY_LOG).strength(4f)));
    public static final Block STRIPPED_SHADOW_WOOD = registerBlock("stripped_shadow_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_CHERRY_WOOD).strength(4f)));

    public static final Block SHADOW_PLANKS = registerBlock("shadow_planks",
            new Block(FabricBlockSettings.copyOf(Blocks.CHERRY_PLANKS).strength(4f)));
    public static final Block SHADOW_LEAVES = registerBlock("shadow_leaves",
            new LeavesBlock(FabricBlockSettings.copyOf(Blocks.CHERRY_LEAVES).strength(4f).nonOpaque()));

    public static final Block SHADOW_SAPLING = registerBlock("shadow_sapling",
            new SaplingBlock(new ShadowSaplingGenerator(),FabricBlockSettings.copyOf(Blocks.CHERRY_SAPLING)));
    public static final Block POTTED_SHADOW_SAPLING = Registry.register(Registries.BLOCK, new Identifier(KylesMod.MOD_ID, "potted_shadow_sapling"),
            new FlowerPotBlock(SHADOW_SAPLING, FabricBlockSettings.copyOf(Blocks.POTTED_CHERRY_SAPLING).nonOpaque()));

    public static final Block SHADOW_Stairs = registerBlock("shadow_stairs",
            new StairsBlock(ModBlocks.SHADOW_PLANKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.CHERRY_STAIRS)));
    public static final Block SHADOW_Slab = registerBlock("shadow_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.CHERRY_SLAB)));

    public static final Block SHADOW_Button = registerBlock("shadow_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.CHERRY_BUTTON), BlockSetType.CHERRY, 10, true));
    public static final Block SHADOW_Pressure_Plate = registerBlock("shadow_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING,FabricBlockSettings.copyOf(Blocks.CHERRY_PRESSURE_PLATE), BlockSetType.CHERRY));

    public static final Block SHADOW_Fence = registerBlock("shadow_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.CHERRY_FENCE)));
    public static final Block SHADOW_Fence_gate = registerBlock("shadow_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.CHERRY_FENCE_GATE), WoodType.CHERRY));

    public static final Block SHADOW_Door = registerBlock("shadow_door",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.CHERRY_DOOR), BlockSetType.CHERRY));
    public static final Block SHADOW_Trapdoor = registerBlock("shadow_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.CHERRY_TRAPDOOR), BlockSetType.CHERRY));

    public static final Identifier Shadow_Sign_Texture = new Identifier(KylesMod.MOD_ID, "entity/signs/shadow");
    public static final Identifier Shadow_Hanging_Sign_Texture = new Identifier(KylesMod.MOD_ID, "entity/signs/hanging/shadow");
    public static final Identifier Shadow_Hanging_Gui_Sign_Texture = new Identifier(KylesMod.MOD_ID, "textures/gui/hanging_signs/shadow");

    public static final Block Standing_Shadow_Sign = Registry.register(Registries.BLOCK, new Identifier(KylesMod.MOD_ID,"shadow_standing_sign"),
            new TerraformSignBlock(Shadow_Sign_Texture,FabricBlockSettings.copyOf(Blocks.CHERRY_SIGN)));
    public static final Block Wall_Shadow_Sign = Registry.register(Registries.BLOCK, new Identifier(KylesMod.MOD_ID,"shadow_wall_sign"),
            new TerraformWallSignBlock(Shadow_Sign_Texture,FabricBlockSettings.copyOf(Blocks.CHERRY_WALL_SIGN)));
    public static final Block Hanging_Shadow_Sign = Registry.register(Registries.BLOCK, new Identifier(KylesMod.MOD_ID,"shadow_hanging_sign"),
            new TerraformHangingSignBlock(Shadow_Hanging_Sign_Texture, Shadow_Hanging_Gui_Sign_Texture,FabricBlockSettings.copyOf(Blocks.CHERRY_HANGING_SIGN)));
    public static final Block Wall_Hanging_Shadow_Sign = Registry.register(Registries.BLOCK, new Identifier(KylesMod.MOD_ID,"shadow_wall_hanging_sign"),
            new TerraformWallHangingSignBlock(Shadow_Hanging_Sign_Texture, Shadow_Hanging_Gui_Sign_Texture,FabricBlockSettings.copyOf(Blocks.CHERRY_WALL_HANGING_SIGN)));

    public static final BlockFamily Shadow_Family = BlockFamilies.register(ModBlocks.SHADOW_PLANKS)
            .sign(ModBlocks.Standing_Shadow_Sign, ModBlocks.Wall_Shadow_Sign)
            .group("wooden").unlockCriterionName("has_planks").build();




    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(KylesMod.MOD_ID, name), block);
    }
    private static Item registerBlockItem(String name, Block block){
        return Registry.register(Registries.ITEM, new Identifier(KylesMod.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }
    public static void registerModBlocks() {
        KylesMod.LOGGER.info("Registering ModBlocks for " + KylesMod.MOD_ID);
    }
}

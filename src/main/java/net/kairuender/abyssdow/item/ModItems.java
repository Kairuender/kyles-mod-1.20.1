package net.kairuender.abyssdow.item;

import com.terraformersmc.terraform.boat.api.item.TerraformBoatItemHelper;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.kairuender.abyssdow.KylesMod;
import net.kairuender.abyssdow.block.ModBlocks;
import net.kairuender.abyssdow.entity.ModBoats;
import net.kairuender.abyssdow.item.custom.DescendingDarkItem;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item Void_Shard =
            registerItem("void_shard", new Item(new FabricItemSettings()));
    public static final Item Pale_Ingot =
            registerItem("pale_ingot", new Item(new FabricItemSettings()));

    public static final Item Descending_Dark =
            registerItem("descending_dark", new DescendingDarkItem(new FabricItemSettings().maxCount(1)));
    public static final Item Long_Nail =
            registerItem("long_nail", new Item(new FabricItemSettings()));

    public static final Item Void_And_Pale =
            registerItem("void_and_pale", new FlintAndSteelItem(new FabricItemSettings()));

    public static final Item SNAP =
            registerItem("snap", new Item(new FabricItemSettings().food(ModFoodComponents.SNAP)));
    public static final Item DUMMYS =
            registerItem("dummys", new Item(new FabricItemSettings().food(ModFoodComponents.DUMMYS)));
    public static final Item FRIENDS =
            registerItem("friends", new Item(new FabricItemSettings().food(ModFoodComponents.FRIENDS)));
    public static final Item HAVE_ONE =
            registerItem("have_one", new Item(new FabricItemSettings().food(ModFoodComponents.HAVE_ONE)));
    public static final Item HEHIMS =
            registerItem("hehims", new Item(new FabricItemSettings().food(ModFoodComponents.HEHIMS)));
    public static final Item WWS =
            registerItem("wws", new Item(new FabricItemSettings().food(ModFoodComponents.WWS)));

    public static final Item Void_PICKAXE =
            registerItem("void_pickaxe", new PickaxeItem(ModToolMaterial.VOID, 2, 2f,new FabricItemSettings()));
    public static final Item Void_AXE =
            registerItem("void_axe", new AxeItem(ModToolMaterial.VOID, 7, 1f, new FabricItemSettings()));
    public static final Item Void_SHOVEL =
            registerItem("void_shovel", new ShovelItem(ModToolMaterial.VOID, 2, 1.4f,new FabricItemSettings()));
    public static final Item Void_HOE =
            registerItem("void_hoe", new HoeItem(ModToolMaterial.VOID, 1, 4f,new FabricItemSettings()));
    public static final Item Pure_Nail =
            registerItem("pure_nail", new SwordItem(ModToolMaterial.PALE, 12, 1.6f,new FabricItemSettings()));
    public static final Item Hornet_Nail =
            registerItem("hornet_nail", new SwordItem(ModToolMaterial.PALE, 10, 6f,new FabricItemSettings()));

    public static final Item Hollow_Mask =
            registerItem ("hollow_mask", new ArmorItem(ModArmorMaterials.MASK, ArmorItem.Type.HELMET,new FabricItemSettings()));
    public static final Item Void_ChestPlate =
            registerItem ("void_chestplate", new ArmorItem(ModArmorMaterials.VOID, ArmorItem.Type.CHESTPLATE,new FabricItemSettings()));
    public static final Item Void_Leggings =
            registerItem ("void_leggings", new ArmorItem(ModArmorMaterials.VOID, ArmorItem.Type.LEGGINGS,new FabricItemSettings()));
    public static final Item Void_Boots =
            registerItem ("void_boots", new ArmorItem(ModArmorMaterials.VOID, ArmorItem.Type.BOOTS,new FabricItemSettings()));

    public static final Item Void_Upgrade_Smithing_Template =
            registerItem("void_upgrade_smithing_template", new Item(new FabricItemSettings()));

    public static final Item Shadow_Sign =
            registerItem("shadow_sign", new SignItem(new FabricItemSettings().maxCount(16), ModBlocks.Standing_Shadow_Sign, ModBlocks.Wall_Shadow_Sign));

    public static final Item Hanging_Shadow_Sign =
            registerItem("shadow_hanging_sign", new HangingSignItem( ModBlocks.Hanging_Shadow_Sign, ModBlocks.Wall_Hanging_Shadow_Sign, new FabricItemSettings().maxCount(16)));

    public static final Item Shadow_Boat = TerraformBoatItemHelper.registerBoatItem(ModBoats.Shadow_Boat_ID, ModBoats.Shadow_Boat_Key, false);
    public static final Item Shadow_Chest_Boat = TerraformBoatItemHelper.registerBoatItem(ModBoats.Shadow_Chest_Boat_ID, ModBoats.Shadow_Boat_Key, true);

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(KylesMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        KylesMod.LOGGER.info("Registering Mod Items for " + KylesMod.MOD_ID);

    }
}

package net.kairuender.abyssdow.entity;

import com.terraformersmc.terraform.boat.api.TerraformBoatType;
import com.terraformersmc.terraform.boat.api.TerraformBoatTypeRegistry;
import net.kairuender.abyssdow.KylesMod;
import net.kairuender.abyssdow.block.ModBlocks;
import net.kairuender.abyssdow.item.ModItems;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;

public class ModBoats {
    public static final Identifier Shadow_Boat_ID = new Identifier(KylesMod.MOD_ID, "shadow_boat");
    public static final Identifier Shadow_Chest_Boat_ID = new Identifier(KylesMod.MOD_ID, "shadow_chest_boat");

    public static final RegistryKey<TerraformBoatType> Shadow_Boat_Key = TerraformBoatTypeRegistry.createKey(Shadow_Boat_ID);

    public static void registerBoats() {
        TerraformBoatType shadowBoat = new TerraformBoatType.Builder()
                .item(ModItems.Shadow_Boat)
                .chestItem(ModItems.Shadow_Chest_Boat)
                .planks(ModBlocks.SHADOW_PLANKS.asItem())
                .build();

        Registry.register(TerraformBoatTypeRegistry.INSTANCE, Shadow_Boat_Key, shadowBoat);
    }
}

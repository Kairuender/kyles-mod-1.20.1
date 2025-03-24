package net.kairuender.abyssdow.util;

import net.fabricmc.fabric.api.loot.v2.LootTableEvents;
import net.kairuender.abyssdow.item.ModItems;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.condition.RandomChanceLootCondition;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.util.Identifier;

public class ModLootTableModifiers {
        private static final Identifier Ancient_city_ID =
                new Identifier("minecraft", "chests/ancient_city");

    public static void modifyLootTables(){
        LootTableEvents.MODIFY.register((resourceManager, lootManager, identifier, builder, lootTableSource) -> {
            if (Ancient_city_ID.equals(identifier)){
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(.1f))
                        .with(ItemEntry.builder(ModItems.Void_Upgrade_Smithing_Template))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f,2.0f)).build());

                builder.pool(poolBuilder.build());
            }
            if (Ancient_city_ID.equals(identifier)){
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(.1f))
                        .with(ItemEntry.builder(ModItems.Spoon_Upgrade_Smithing_Template))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f,2.0f)).build());

                builder.pool(poolBuilder.build());
            }


        });
    }
}

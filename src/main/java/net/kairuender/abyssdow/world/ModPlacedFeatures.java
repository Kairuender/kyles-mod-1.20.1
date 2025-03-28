package net.kairuender.abyssdow.world;

import net.kairuender.abyssdow.KylesMod;
import net.kairuender.abyssdow.block.ModBlocks;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.PlacedFeature;
import net.minecraft.world.gen.feature.PlacedFeatures;
import net.minecraft.world.gen.feature.VegetationPlacedFeatures;
import net.minecraft.world.gen.placementmodifier.HeightRangePlacementModifier;
import net.minecraft.world.gen.placementmodifier.PlacementModifier;

import java.util.List;

public class ModPlacedFeatures {
    public static final RegistryKey<PlacedFeature> Deepslate_Void_Ore_Placed_Key = registryKey("deepslate_void_ore_placed");
    public static final RegistryKey<PlacedFeature> Deepslate_Pale_Ore_Placed_Key = registryKey("deepslate_pale_ore_placed");

    public static final RegistryKey<PlacedFeature> Shadow_Placed_Key = registryKey("shadow_placed");

    public static void bootstrap (Registerable<PlacedFeature> context){
        var configuredFeatureRegistryEntryLookup = context.getRegistryLookup(RegistryKeys.CONFIGURED_FEATURE);

        register(context, Deepslate_Void_Ore_Placed_Key, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.Deepslate_Void_Ore_Key),
                ModOrePlacement.modifiersWithCount(2, HeightRangePlacementModifier.trapezoid(YOffset.fixed(-80), YOffset.fixed(0))));

        register(context, Deepslate_Pale_Ore_Placed_Key, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.Deepslate_Pale_Ore_Key),
                ModOrePlacement.modifiersWithCount(2, HeightRangePlacementModifier.trapezoid(YOffset.fixed(-80), YOffset.fixed(0))));

    }

    public static RegistryKey<PlacedFeature> registryKey(String name) {
        return RegistryKey.of(RegistryKeys.PLACED_FEATURE, new Identifier(KylesMod.MOD_ID, name));
    }

    private static void register(Registerable<PlacedFeature> context, RegistryKey<PlacedFeature> key,
                                 RegistryEntry<ConfiguredFeature<?, ?>> configuration, List<PlacementModifier> modifiers) {
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }
}

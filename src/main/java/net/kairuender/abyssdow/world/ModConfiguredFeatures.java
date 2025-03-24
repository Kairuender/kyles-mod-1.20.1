package net.kairuender.abyssdow.world;

import net.kairuender.abyssdow.KylesMod;
import net.kairuender.abyssdow.block.ModBlocks;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.structure.rule.RuleTest;
import net.minecraft.structure.rule.TagMatchRuleTest;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.feature.*;


import java.util.List;

public class ModConfiguredFeatures {
    public static final RegistryKey<ConfiguredFeature<?, ?>> Deepslate_Void_Ore_Key = registerKey("deepslate_void_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> Deepslate_Pale_Ore_Key = registerKey("deepslate_pale_ore");

    public static final RegistryKey<ConfiguredFeature<?, ?>> Shadow_Key = registerKey("shadow");

    public static void bootstrap(Registerable<ConfiguredFeature<?, ?>> context){
        RuleTest deepslateReplacables = new TagMatchRuleTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);

        List<OreFeatureConfig.Target> overworldPaleOres =
                List.of(OreFeatureConfig.createTarget(deepslateReplacables, ModBlocks.DEEPSLATE_PALE_ORE.getDefaultState()));
        List<OreFeatureConfig.Target> overworldVoidOres =
                List.of(OreFeatureConfig.createTarget(deepslateReplacables, ModBlocks.DEEPSLATE_VOID_ORE.getDefaultState()));


        register(context, Deepslate_Void_Ore_Key, Feature.ORE, new OreFeatureConfig(overworldVoidOres, 5));
        register(context, Deepslate_Pale_Ore_Key, Feature.ORE, new OreFeatureConfig(overworldPaleOres, 5));


    }









    public static RegistryKey<ConfiguredFeature<?, ?>> registerKey(String name){
        return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, new Identifier(KylesMod.MOD_ID, name));
    }

    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<ConfiguredFeature<?, ?>> context,
                                                                                   RegistryKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration){
        context.register(key,new ConfiguredFeature<>(feature,configuration));
    }
}

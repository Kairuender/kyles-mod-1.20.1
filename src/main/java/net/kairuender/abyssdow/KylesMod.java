package net.kairuender.abyssdow;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.entity.event.v1.ServerLivingEntityEvents;
import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;
import net.kairuender.abyssdow.block.ModBlocks;
import net.kairuender.abyssdow.effect.FallImmunityEffect;
import net.kairuender.abyssdow.entity.ModBoats;
import net.kairuender.abyssdow.item.ModItemGroups;
import net.kairuender.abyssdow.item.ModItems;
import net.kairuender.abyssdow.item.custom.SpoonItem;
import net.kairuender.abyssdow.util.ModCustomTrades;
import net.kairuender.abyssdow.util.ModLootTableModifiers;
import net.kairuender.abyssdow.world.gen.ModWorldGeneration;
import net.minecraft.entity.damage.DamageTypes;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class KylesMod implements ModInitializer {
	public static final String MOD_ID = "abyssdow";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
	public static final StatusEffect FALL_IMMUNITY = new FallImmunityEffect();
	public static final Item Silver_Spoon = new SpoonItem(new Item.Settings());
	public static final Item Gold_Spoon = new SpoonItem(new Item.Settings());

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModLootTableModifiers.modifyLootTables();
		ModCustomTrades.registerCustomTrades();
		Registry.register(Registries.STATUS_EFFECT,
				new Identifier("abyssdow", "fall_immunity"),
				FALL_IMMUNITY);

		ServerLivingEntityEvents.ALLOW_DAMAGE.register((entity, source, amount) -> {
			if (entity instanceof PlayerEntity && source.isOf(DamageTypes.FALL)) {
				return !entity.hasStatusEffect(FALL_IMMUNITY);
			}
			return true;
		});
		StrippableBlockRegistry.register(ModBlocks.SHADOW_LOG, ModBlocks.STRIPPED_SHADOW_LOG);
		StrippableBlockRegistry.register(ModBlocks.SHADOW_WOOD, ModBlocks.STRIPPED_SHADOW_WOOD);

		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.SHADOW_LOG, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.SHADOW_WOOD, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STRIPPED_SHADOW_LOG, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STRIPPED_SHADOW_WOOD, 5, 5);

		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.SHADOW_PLANKS, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.SHADOW_LEAVES, 30, 60);

		ModBoats.registerBoats();
		ModWorldGeneration.generateModWorldGen();

		}
	}

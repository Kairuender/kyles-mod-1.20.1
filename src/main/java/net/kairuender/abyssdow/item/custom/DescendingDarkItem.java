package net.kairuender.abyssdow.item.custom;

import net.kairuender.abyssdow.KylesMod;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.text.Text;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;


import java.util.List;

public class DescendingDarkItem extends Item {
    public DescendingDarkItem(Item.Settings settings) {
        super(settings);
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        if (!world.isClient) {
            pushNearbyEntities(world, user);
            user.getItemCooldownManager().set(this, 20); // 1 second cooldown

            // Add fall immunity
            user.addStatusEffect(new StatusEffectInstance(
                    KylesMod.FALL_IMMUNITY,
                    10, // 1 second duration (20 ticks)
                    0,
                    false, // No particles
                    false, // No icon
                    false  // No ambient
            ));


        }
        return TypedActionResult.success(user.getStackInHand(hand));
    }

    private void pushNearbyEntities(World world, PlayerEntity player) {
        List<Entity> nearbyEntities = world.getEntitiesByClass(Entity.class, player.getBoundingBox().expand(4.0),
                entity -> entity != player && entity instanceof MobEntity);

        for (Entity entity : nearbyEntities) {
            LivingEntity mob = (LivingEntity) entity;

            mob.damage(player.getDamageSources().playerAttack(player), 15.0f);


            Vec3d pushVector = entity.getPos().subtract(player.getPos()).normalize();
            entity.addVelocity(pushVector.x, 0.5, pushVector.z);
            entity.velocityModified = true;

            for (int i = 0; i < 20; i++) {
                double offsetX = world.random.nextGaussian() * 0.02D;
                double offsetY = world.random.nextGaussian() * 0.02D;
                double offsetZ = world.random.nextGaussian() * 0.02D;
                ((ServerWorld) world).spawnParticles(ParticleTypes.SMOKE,
                        entity.getX() + offsetX,
                        entity.getY() + 1.0 + offsetY,
                        entity.getZ() + offsetZ,
                        1, 0, 0, 0, 0.1);
            }
        }

        for (int i = 0; i < 40; i++) {
            double offsetX = world.random.nextGaussian() * 0.02D;
            double offsetY = world.random.nextGaussian() * 0.02D;
            double offsetZ = world.random.nextGaussian() * 0.02D;
            ((ServerWorld) world).spawnParticles(ParticleTypes.SMOKE,
                    player.getX() + offsetX,
                    player.getY() + 1.0 + offsetY,
                    player.getZ() + offsetZ,
                    1, 0, 0, 0, 0.1);
        }
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        tooltip.add(Text.translatable("tooltip.abyssdow.descending_dark.tooltip"));
        super.appendTooltip(stack, world, tooltip, context);
    }
}

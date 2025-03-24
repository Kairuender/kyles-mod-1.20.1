package net.kairuender.abyssdow.item.custom;

import net.minecraft.entity.LivingEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.network.packet.s2c.play.EntityVelocityUpdateS2CPacket;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.util.math.Vec3d;

public class SpoonItem extends Item {
    public SpoonItem(Settings settings) {
        super(settings);
    }

    @Override
    public boolean postHit(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        // Calculate the knockback direction
        Vec3d knockbackDirection = target.getPos().subtract(attacker.getPos()).normalize();

        // Apply 5x knockback
        double knockbackStrength = 1.0 * 5;
        target.addVelocity(
                knockbackDirection.x * knockbackStrength,
                0.1 * knockbackStrength, // Vertical knockback
                knockbackDirection.z * knockbackStrength
        );

        // Sync the target's velocity to the client
        if (target instanceof ServerPlayerEntity) {
            ((ServerPlayerEntity) target).networkHandler.sendPacket(new EntityVelocityUpdateS2CPacket(target));
        }

        return super.postHit(stack, target, attacker);
    }
}

package net.kairuender.abyssdow.effect;

import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;

public class FallImmunityEffect extends StatusEffect {
    public FallImmunityEffect() {
        super(
                StatusEffectCategory.BENEFICIAL,
                0xFFFFFF // Transparent color
        );
    }
}
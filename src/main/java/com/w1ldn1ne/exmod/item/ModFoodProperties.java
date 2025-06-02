package com.w1ldn1ne.exmod.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoodProperties {
    public static final FoodProperties BANANA = new FoodProperties.Builder().nutrition(3).saturationModifier(0.25f)
            .effect(new MobEffectInstance(MobEffects.JUMP, 400, 1), 0.2f).build();
}

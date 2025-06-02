package com.w1ldn1ne.exmod.item;

import com.w1ldn1ne.exmod.TutorialMod;
import com.w1ldn1ne.exmod.item.custom.ChiselItem;
import com.w1ldn1ne.exmod.item.custom.FuelItem;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.List;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, TutorialMod.MOD_ID);

    public static final RegistryObject<Item> COSM_CRYSTAL = ITEMS.register("cosm_crystal",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_COSM_CRYSTAL = ITEMS.register("cosm_crystal_raw",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> CHISEL = ITEMS.register("chisel",
            () -> new ChiselItem(new Item.Properties().durability(32)));

    public static final RegistryObject<Item> BANANA = ITEMS.register("banana",
            () -> new Item(new Item.Properties().food(ModFoodProperties.BANANA)) {
                @Override
                public void appendHoverText(ItemStack pStack, TooltipContext pContext, List<Component> pTooltipComponents, TooltipFlag pTooltipFlag) {
                    pTooltipComponents.add(Component.translatable("tooltip.tutorialmod.banana"));

                    super.appendHoverText(pStack, pContext, pTooltipComponents, pTooltipFlag);
                }
            });

    public static final RegistryObject<Item> SUPER_FUEL = ITEMS.register("super_fuel",
            () -> new FuelItem(new Item.Properties(), 1200));


    public static void register (IEventBus eventBus) {
        ITEMS.register(eventBus);
    }


}

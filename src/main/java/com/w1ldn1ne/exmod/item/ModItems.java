package com.w1ldn1ne.exmod.item;

import com.w1ldn1ne.exmod.TutorialMod;
import com.w1ldn1ne.exmod.item.custom.ChiselItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, TutorialMod.MOD_ID);

    public static final RegistryObject<Item> COSM_CRYSTAL = ITEMS.register("cosm_crystal",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_COSM_CRYSTAL = ITEMS.register("cosm_crystal_raw",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> CHISEL = ITEMS.register("chisel",
            () -> new ChiselItem(new Item.Properties().durability(32)));


    public static void register (IEventBus eventBus) {
        ITEMS.register(eventBus);
    }


}

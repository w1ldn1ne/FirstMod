package com.w1ldn1ne.exmod.item;

import com.w1ldn1ne.exmod.TutorialMod;
import com.w1ldn1ne.exmod.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, TutorialMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> COSM_ITEMS_TAB = CREATIVE_MODE_TABS.register("cosm_items_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.RAW_COSM_CRYSTAL.get()))
                    .title(Component.translatable("creativetab.tutorialmod.cosm_items"))
                    .displayItems(new CreativeModeTab.DisplayItemsGenerator() {
                        @Override
                        public void accept(CreativeModeTab.ItemDisplayParameters pParameters, CreativeModeTab.Output pOutput) {
                            pOutput.accept((ModItems.RAW_COSM_CRYSTAL.get()));
                            pOutput.accept((ModItems.COSM_CRYSTAL.get()));
                        }
                    })
                    .build());
    public static final RegistryObject<CreativeModeTab> COSM_BLOCKS_TAB = CREATIVE_MODE_TABS.register("cosm_blocks_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.COSM_CRYSTAL_ORE.get()))
                    .withTabsBefore(COSM_ITEMS_TAB.getId())
                    .title(Component.translatable("creativetab.tutorialmod.cosm_blocks"))
                    .displayItems(new CreativeModeTab.DisplayItemsGenerator() {
                        @Override
                        public void accept(CreativeModeTab.ItemDisplayParameters pParameters, CreativeModeTab.Output pOutput) {
                            pOutput.accept((ModBlocks.COSM_CRYSTAL_ORE.get()));
                            pOutput.accept((ModBlocks.COSM_CRYSTAL_BLOCK.get()));
                            pOutput.accept((ModBlocks.MAGIC_BLOCK.get()));
                        }
                    })
                    .build());
    public static final RegistryObject<CreativeModeTab> COSM_TOOLS_TAB = CREATIVE_MODE_TABS.register("cosm_tools_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.CHISEL.get()))
                    .withTabsBefore(COSM_ITEMS_TAB.getId())
                    .title(Component.translatable("creativetab.tutorialmod.cosm_tools"))
                    .displayItems(new CreativeModeTab.DisplayItemsGenerator() {
                        @Override
                        public void accept(CreativeModeTab.ItemDisplayParameters pParameters, CreativeModeTab.Output pOutput) {
                            pOutput.accept((ModItems.CHISEL.get()));
                        }
                    })
                    .build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}

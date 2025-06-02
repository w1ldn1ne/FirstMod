package com.w1ldn1ne.exmod.block;

import com.w1ldn1ne.exmod.TutorialMod;
import com.w1ldn1ne.exmod.block.custom.MagicBlock;
import com.w1ldn1ne.exmod.item.ModItems;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, TutorialMod.MOD_ID);

    public static final RegistryObject<Block> COSM_CRYSTAL_BLOCK = registerBlock("cosm_crystal_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(3f).requiresCorrectToolForDrops().sound(SoundType.AMETHYST)));

    public static final RegistryObject<Block> COSM_CRYSTAL_ORE = registerBlock("cosm_crystal_ore",
            () -> new DropExperienceBlock(UniformInt.of(2, 4), (BlockBehaviour.Properties.of()
            .strength(3f).requiresCorrectToolForDrops())));

    public static final RegistryObject<Block> MAGIC_BLOCK = registerBlock("magic_block",
            () -> new MagicBlock(BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops().sound(SoundType.AMETHYST)));

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, RegistryObject<T> block) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}

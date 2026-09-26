package io.github.glamour.block;

import io.github.glamour.Glamour;
import io.github.glamour.item.GlamourItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import javax.naming.Name;
import java.util.function.Supplier;

public class GlamourBlocks {
    public static final DeferredRegister.Blocks BLOCKS =
            DeferredRegister.createBlocks(Glamour.MODID);

    public static final DeferredBlock<Block> AGATE_BLOCK = registerBlock("agate_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.AMETHYST)
                    .strength(1.5f)
            ));



    private static <T extends Block> DeferredBlock<T> registerBlock(String name, Supplier<T> block) {
        DeferredBlock<T> toreturn = BLOCKS.register(name, block);
        registerBlockItem(name, toreturn);
        return toreturn;
    }

    private static <T extends Block> void registerBlockItem(String name, DeferredBlock<T> block) {
        GlamourItems.ITEMS.register(name, ()-> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}

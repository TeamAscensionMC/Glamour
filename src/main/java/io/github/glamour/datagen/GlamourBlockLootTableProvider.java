package io.github.glamour.datagen;

import io.github.glamour.block.GlamourBlocks;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;

import java.util.Set;

public class GlamourBlockLootTableProvider extends BlockLootSubProvider {
    protected GlamourBlockLootTableProvider(HolderLookup.Provider registries) {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags(), registries);
    }

    @Override
    protected void generate() {
        dropSelf(GlamourBlocks.AGATE_BLOCK.get());
        // dropSelf(GlamourBlocks.MAGIC_BLOCK.get());
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return GlamourBlocks.BLOCKS.getEntries().stream().map(Holder::value)::iterator;
    }
}

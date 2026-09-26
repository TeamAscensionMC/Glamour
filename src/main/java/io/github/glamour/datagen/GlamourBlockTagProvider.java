package io.github.glamour.datagen;

import io.github.glamour.Glamour;
import io.github.glamour.block.GlamourBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class GlamourBlockTagProvider extends BlockTagsProvider {
    public GlamourBlockTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, Glamour.MODID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        tag(BlockTags.CRYSTAL_SOUND_BLOCKS)
                .add(GlamourBlocks.AGATE_BLOCK.get());
        tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(GlamourBlocks.AGATE_BLOCK.get());
        tag(BlockTags.VIBRATION_RESONATORS)
                .add(GlamourBlocks.AGATE_BLOCK.get());
    }
}

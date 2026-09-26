package io.github.glamour.datagen;

import io.github.glamour.Glamour;
import io.github.glamour.block.GlamourBlocks;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredBlock;

public class GlamourBlockstateProvider extends BlockStateProvider {
    public GlamourBlockstateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, Glamour.MODID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        blockWithItem(GlamourBlocks.AGATE_BLOCK);
    }

    private void blockWithItem(DeferredBlock<?> deferredBlock) {
        simpleBlockItem(deferredBlock.get(), cubeAll(deferredBlock.get()));
    }
}

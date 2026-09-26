package io.github.glamour.datagen;

import io.github.glamour.Glamour;
import io.github.glamour.item.GlamourItems;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

public class GlamourItemModelProvider extends ItemModelProvider {
    public GlamourItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, Glamour.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        basicItem(GlamourItems.AGATE_SHARD.get());
        basicItem(GlamourItems.KINTSUGIUM_INGOT.get());
    }
}

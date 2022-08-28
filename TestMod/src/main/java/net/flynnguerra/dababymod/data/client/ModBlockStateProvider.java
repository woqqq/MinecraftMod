package net.flynnguerra.dababymod.data.client;

import net.flynnguerra.dababymod.DaBabyMod;
import net.flynnguerra.dababymod.setup.ModBlocks;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(DataGenerator gen, ExistingFileHelper exFileHelper) {
        super(gen, DaBabyMod.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        simpleBlock(ModBlocks.SILVER_BLOCk.get());
        simpleBlock(ModBlocks.SILVER_ORE.get());
    }
}

package com.topraktunca.element.init;

import com.topraktunca.element.element_t;
import com.topraktunca.element.util.RegistryHandler;
import com.topraktunca.element.world.biomes.TBiome;
import net.minecraft.block.Blocks;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilder;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilderConfig;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.common.BiomeDictionary.Type;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BiomeInit {
    public static final DeferredRegister<Biome> BIOMES = new DeferredRegister<>(ForgeRegistries.BIOMES, element_t.MOD_ID);

    public static final RegistryObject<Biome> T_BIOME = BIOMES.register("t_biome", () -> new TBiome(new Biome.Builder().precipitation(Biome.RainType.SNOW).scale(0.05F).temperature(0.5f)
            .waterColor(4356756)
            .waterFogColor(4362891)
            .surfaceBuilder(SurfaceBuilder.DEFAULT,
                    new SurfaceBuilderConfig(RegistryHandler.T_GRASS_BLOCK.get().getDefaultState(),
                            Blocks.DIRT.getDefaultState(),
                            Blocks.BIRCH_PLANKS.getDefaultState()))
            .category(Biome.Category.PLAINS)
            .downfall(0.5f)
            .depth(0.12f)
            .parent(null)));

    public static void registerBiome() {
        registerBiome(T_BIOME.get(), Type.OVERWORLD);
    }

    private static void registerBiome(Biome biome, Type...types) {
        BiomeDictionary.addTypes(biome, types);
        BiomeManager.addSpawnBiome(biome);
        BiomeManager.addBiome(BiomeManager.BiomeType.COOL, new BiomeManager.BiomeEntry(biome, 100));
    }
}

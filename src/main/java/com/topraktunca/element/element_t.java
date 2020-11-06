package com.topraktunca.element;

import com.topraktunca.element.init.BiomeInit;
import com.topraktunca.element.util.RegistryHandler;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod("element_t")
@Mod.EventBusSubscriber(modid = element_t.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class element_t
{
    private static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "element_t";


    public element_t() {
        final IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::doClientStuff);

        BiomeInit.BIOMES.register(modEventBus);

        RegistryHandler.init();

        MinecraftForge.EVENT_BUS.register(this);
    }

    @SubscribeEvent
    public static void onRegisterBiomes(final RegistryEvent.Register<Biome> event) {
        BiomeInit.registerBiome();
    }

    private void setup(final FMLCommonSetupEvent event) {}

    private void doClientStuff(final FMLClientSetupEvent event) {}

    public static final ItemGroup TAB = new ItemGroup("element_t_tab") {

        @Override public ItemStack createIcon() {
            return new ItemStack(RegistryHandler.ELEMENT_T.get());

        }
    };
}

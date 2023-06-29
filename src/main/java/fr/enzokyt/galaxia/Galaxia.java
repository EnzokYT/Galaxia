package fr.enzokyt.galaxia;

import com.mojang.logging.LogUtils;
import fr.enzokyt.galaxia.block.ModBlocks;
import fr.enzokyt.galaxia.item.ModCreativeTabs;
import fr.enzokyt.galaxia.item.ModItems;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(Galaxia.MOD_ID)
public class Galaxia {
    public static final String MOD_ID = "galaxia";
    private static final Logger LOGGER = LogUtils.getLogger();
    public Galaxia()
    {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);

        modEventBus.addListener(this::commonSetup);

        MinecraftForge.EVENT_BUS.register(this);

        modEventBus.addListener(this::addCreative);

    }

    private void commonSetup(final FMLCommonSetupEvent event) {

    }

    private void addCreative(CreativeModeTabEvent.BuildContents event) {
        if(event.getTab() == ModCreativeTabs.GALAXIA_ITEMS_TAB) {
            event.accept(ModItems.GALAXIUM_FRAGMENT);
            event.accept(ModItems.GALAXIUM);
            event.accept(ModItems.BISMUTH);
        }
        if(event.getTab() == ModCreativeTabs.GALAXIA_BLOCKS_TAB) {
            event.accept(ModBlocks.GALAXIUM_BLOCK);
            event.accept(ModBlocks.GALAXIUM_ORE);
            event.accept(ModBlocks.BISMUTH_BLOCK);
            event.accept(ModBlocks.BISMUTH_ORE);

            event.accept(ModBlocks.MOON_STONE);
            event.accept(ModBlocks.MOON_COBBLE);
            event.accept(ModBlocks.END_BLOCK);
        }

        if(event.getTab() == ModCreativeTabs.GALAXIA_ARMOR) {
            event.accept(ModItems.GALAXIUM_HELMET);
            event.accept(ModItems.GALAXIUM_CHESTPLATE);
            event.accept(ModItems.GALAXIUM_LEGGINGS);
            event.accept(ModItems.GALAXIUM_BOOTS);
        }

        if(event.getTab() == ModCreativeTabs.GALAXIA_TOOLS) {
            event.accept(ModItems.IRON_STICK);
            event.accept(ModItems.DIAMOND_STICK);
            event.accept(ModItems.MOON_STICK);
        }
    }

    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {

        }
    }
}

package fr.enzokyt.galaxia.item;

import fr.enzokyt.galaxia.Galaxia;
import fr.enzokyt.galaxia.block.ModBlocks;
import fr.enzokyt.galaxia.item.custom.GalaxiumArmorItem;
import fr.enzokyt.galaxia.item.custom.GemInfuserItem;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Galaxia.MOD_ID);

    // --- [ GALAXIUM ] ---
    public static final RegistryObject<Item> GALAXIUM_FRAGMENT = ITEMS.register("galaxium_fragment",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> GALAXIUM = ITEMS.register("galaxium",
            () -> new Item(new Item.Properties()));

    // --- [ GALAXIUM ARMOR ] ---
    public static final RegistryObject<Item> GALAXIUM_HELMET = ITEMS.register("galaxium_helmet",
            () -> new GalaxiumArmorItem(ModArmorMaterials.GALAXIUM, ArmorItem.Type.HELMET, new Item.Properties()));

    public static final RegistryObject<Item> GALAXIUM_CHESTPLATE = ITEMS.register("galaxium_chestplate",
            () -> new GalaxiumArmorItem(ModArmorMaterials.GALAXIUM, ArmorItem.Type.CHESTPLATE, new Item.Properties()));

    public static final RegistryObject<Item> GALAXIUM_LEGGINGS = ITEMS.register("galaxium_leggings",
            () -> new GalaxiumArmorItem(ModArmorMaterials.GALAXIUM, ArmorItem.Type.LEGGINGS, new Item.Properties()));

    public static final RegistryObject<Item> GALAXIUM_BOOTS = ITEMS.register("galaxium_boots",
            () -> new GalaxiumArmorItem(ModArmorMaterials.GALAXIUM, ArmorItem.Type.BOOTS, new Item.Properties()));

    // --- [ BISMUTH ] ---

    public static final RegistryObject<Item> BISMUTH = ITEMS.register("bismuth",
            () -> new Item(new Item.Properties()));

    // --- [ BISMUTH ARMOR ] ---


    // --- [ STICKS ] ---
    public static final RegistryObject<Item> IRON_STICK = ITEMS.register("iron_stick",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> DIAMOND_STICK = ITEMS.register("diamond_stick",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> MOON_STICK = ITEMS.register("moon_stick",
            () -> new Item(new Item.Properties()));

    // --- [ ANIMATED ITEM ] ---
    public static final RegistryObject<Item> GEM_INFUSER_ITEM = ITEMS.register("gem_infuser",
            () -> new GemInfuserItem(ModBlocks.GEM_INFUSER.get(),new Item.Properties()));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}

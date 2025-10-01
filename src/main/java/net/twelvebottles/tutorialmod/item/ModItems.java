package net.twelvebottles.tutorialmod.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.twelvebottles.tutorialmod.TutorialMod;
import net.twelvebottles.tutorialmod.item.custom.ChiselItem;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, TutorialMod.MOD_ID);

    public static final RegistryObject<Item> TESTITE = ITEMS.register("testite",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_TESTITE = ITEMS.register("raw_testite",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TESTITE_NUGGET = ITEMS.register("testite_nugget",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> CHISEL = ITEMS.register("chisel",
            () -> new ChiselItem(new Item.Properties().durability(128)));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}

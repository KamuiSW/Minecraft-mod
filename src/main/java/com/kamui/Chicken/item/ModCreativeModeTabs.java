package com.kamui.Chicken.item;

import com.kamui.Chicken.Chicken;
import com.kamui.Chicken.block.ModBlocks;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
        DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Chicken.MODID);

    public static final RegistryObject<CreativeModeTab> CHICKEN_TAB = CREATIVE_MODE_TABS.register("chicken_tab", 
        () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.dark_flame.get()))
            .title(Component.translatable("creativetab.chicken_tab"))
            .displayItems((pParameters, pOutput) ->{
                pOutput.accept(ModItems.dark_flame.get());
                pOutput.accept(ModBlocks.TEST_BLOCK.get());

                pOutput.accept(Items.DIAMOND);


            })
            .build());
        
    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TABS.register(eventBus);
    }
}

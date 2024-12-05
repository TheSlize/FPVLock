package com.fpvlock;

import net.minecraft.client.Minecraft;
import net.minecraft.client.settings.KeyBinding;
import net.minecraftforge.client.event.EntityViewRenderEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod(
        modid = FPVMain.MOD_ID,
        name = FPVMain.MOD_NAME,
        version = FPVMain.VERSION
)
public class FPVMain {

    public static final String MOD_ID = "fpvlock";
    public static final String MOD_NAME = "FPV Lock";
    public static final String VERSION = "1.12.2-1.0";

    @Mod.Instance(MOD_ID)
    public static FPVMain INSTANCE;

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        MinecraftForge.EVENT_BUS.register(this);
    }

    @SubscribeEvent
    public void onPerspectiveChange(EntityViewRenderEvent.CameraSetup event) {
        if (event.getEntity().getEntityWorld().isRemote && event.getEntity() == net.minecraft.client.Minecraft.getMinecraft().player) {
            net.minecraft.client.Minecraft.getMinecraft().gameSettings.thirdPersonView = 0;
        }
    }
}

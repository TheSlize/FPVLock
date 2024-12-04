package com.fpvlock;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

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
    public void preinit(FMLPreInitializationEvent event) {
    }
    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
    }

    @Mod.EventHandler
    public void postinit(FMLPostInitializationEvent event) {
    }
}

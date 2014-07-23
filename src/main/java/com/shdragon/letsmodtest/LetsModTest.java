package com.shdragon.letsmodtest;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid="LetsModTest", name="Lets Mod Test", version="1.7.2-1.0")
public class LetsModTest
{
    @Mod.Instance("LetsModTest")
    public static LetsModTest instance;


    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        // initialize items and blocks.
    }

    @Mod.EventHandler
    public void init( FMLInitializationEvent event )
    {
        // GUIs, event handlers, recipes.
    }

    @Mod.EventHandler
    public void postInit( FMLPostInitializationEvent event )
    {

    }
}

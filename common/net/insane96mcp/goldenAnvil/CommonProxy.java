package net.insane96mcp.goldenAnvil;

import net.insane96mcp.goldenAnvil.init.ModBlocks;
import net.insane96mcp.goldenAnvil.lib.GoldenAnvilGuiHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;

public class CommonProxy {
	public void PreInit(FMLPreInitializationEvent event) {
		ModBlocks.Init();
	}
	
	public void Init(FMLInitializationEvent event) {
		ModBlocks.PostInit();
		NetworkRegistry.INSTANCE.registerGuiHandler(GoldenAnvil.instance, new GoldenAnvilGuiHandler());
	}
	
	public void PostInit(FMLPostInitializationEvent event) {
		
	}
}

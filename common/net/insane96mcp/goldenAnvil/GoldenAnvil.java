package net.insane96mcp.goldenAnvil;

import java.util.Random;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = GoldenAnvil.MOD_ID, name = GoldenAnvil.MOD_NAME, version = GoldenAnvil.VERSION)
public class GoldenAnvil {
	
	public static final String MOD_ID = "goldenanvil";
	public static final String MOD_NAME = "Golden Anvil";
	public static final String VERSION = "1.0.0";
	public static final String RESOURCE_PREFIX = MOD_ID.toLowerCase() + ":";

	public static Random random = new Random();
	
	@Instance(MOD_ID)
	public static GoldenAnvil instance;
	
	@SidedProxy(clientSide = "net.insane96mcp.goldenAnvil.ClientProxy", serverSide = "net.insane96mcp.goldenAnvil.ServerProxy")
	public static CommonProxy proxy;
	
	@EventHandler
	public void PreInit(FMLPreInitializationEvent event) {
		proxy.PreInit(event);
	}
	
	@EventHandler
	public void Init(FMLInitializationEvent event) {
		proxy.Init(event);
	}
	
	@EventHandler
	public void PostInit(FMLPostInitializationEvent event) {
		proxy.PostInit(event);
	}
}

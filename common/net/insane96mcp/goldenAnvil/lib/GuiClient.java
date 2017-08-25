package net.insane96mcp.goldenAnvil.lib;

import net.minecraft.client.gui.GuiRepair;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.world.World;

public class GuiClient extends GuiRepair{

	public GuiClient(InventoryPlayer inventoryIn, World worldIn) {
		super(inventoryIn, worldIn);
	}
	
}

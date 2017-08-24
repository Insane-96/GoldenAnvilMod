package net.insane96mcp.goldenAnvil.lib;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;

public class GuiHandler implements IGuiHandler{

	public static final int GOLDEN_ANVIL_GUI_ID = 0;
	
	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		if (ID == GOLDEN_ANVIL_GUI_ID)
            return new GuiServer(new InventoryPlayer(player), world, new BlockPos(x, y, z), player);

        return null;
	}

	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		if (ID == GOLDEN_ANVIL_GUI_ID)
            return new GuiClient(new InventoryPlayer(player), world);

        return null;
	}
	
}

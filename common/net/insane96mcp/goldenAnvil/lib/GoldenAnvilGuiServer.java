package net.insane96mcp.goldenAnvil.lib;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.ContainerRepair;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class GoldenAnvilGuiServer extends ContainerRepair{

	public GoldenAnvilGuiServer(InventoryPlayer playerInventory, World worldIn, BlockPos blockPosIn,
			EntityPlayer player) {
		super(playerInventory, worldIn, blockPosIn, player);
	}
	
	@Override
	public boolean canInteractWith(EntityPlayer playerIn) {
		return false;
	}

}

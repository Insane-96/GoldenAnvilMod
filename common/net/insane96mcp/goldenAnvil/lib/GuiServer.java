package net.insane96mcp.goldenAnvil.lib;

import net.insane96mcp.goldenAnvil.init.ModBlocks;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.inventory.ContainerRepair;
import net.minecraft.inventory.Slot;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class GuiServer extends ContainerRepair{

	private World world;
	private BlockPos blockPos;

	public GuiServer(InventoryPlayer playerInventory, World worldIn, BlockPos blockPosIn, EntityPlayer player) {
		super(playerInventory, worldIn, blockPosIn, player);
		this.world = worldIn;
		this.blockPos = blockPosIn;
	}
	
	@Override
	public boolean canInteractWith(EntityPlayer playerIn) {
		return this.world.getBlockState(this.blockPos).getBlock() != ModBlocks.goldenAnvilBlock ? false : playerIn.getDistanceSq((double)this.blockPos.getX() + 0.5D, (double)this.blockPos.getY() + 0.5D, (double)this.blockPos.getZ() + 0.5D) <= 64.0D;
	}

}

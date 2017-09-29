package net.insane96mcp.goldenAnvil.block;

import net.insane96mcp.goldenAnvil.GoldenAnvil;
import net.insane96mcp.goldenAnvil.lib.GuiHandler;
import net.insane96mcp.goldenAnvil.lib.Names;
import net.minecraft.block.Block;
import net.minecraft.block.BlockAnvil;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class BlockGoldenAnvil extends BlockAnvil{

	public BlockGoldenAnvil() {
		super();
		
	}
	
	@Override
	public String getUnlocalizedName() {
		return "tile." + GoldenAnvil.RESOURCE_PREFIX + Names.GOLDEN_ANVIL;
	}
	
	@Override
	public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ)
    {
        //if (!worldIn.isRemote)
        //{
            playerIn.openGui(GoldenAnvil.instance, GuiHandler.GOLDEN_ANVIL_GUI_ID, worldIn, pos.getX(), pos.getY(), pos.getZ());
        //}

        return true;
    }
}

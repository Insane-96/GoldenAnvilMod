package net.insane96mcp.goldenAnvil.init;

import net.insane96mcp.goldenAnvil.GoldenAnvil;
import net.insane96mcp.goldenAnvil.block.BlockGoldenAnvil;
import net.insane96mcp.goldenAnvil.block.BlockGoldenAnvil;
import net.insane96mcp.goldenAnvil.lib.Names;
import net.minecraft.client.renderer.ItemModelMesher;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ModBlocks {
	
	public static BlockGoldenAnvil goldenAnvilBlock;
	public static void Init() {
		ResourceLocation location = new ResourceLocation(GoldenAnvil.MOD_ID, Names.GOLDEN_ANVIL);
		goldenAnvilBlock = new BlockGoldenAnvil();
		goldenAnvilBlock.setRegistryName(location);
		goldenAnvilBlock.setCreativeTab(CreativeTabs.DECORATIONS);
		goldenAnvilBlock.setHardness(10.0f);
		goldenAnvilBlock.setResistance(20f);
		goldenAnvilBlock.setHarvestLevel("pickaxe", 2);
		GameRegistry.register(goldenAnvilBlock);
		GameRegistry.register(new ItemBlock(goldenAnvilBlock), location);
	}
	
	public static void PostInit() {
		GameRegistry.addRecipe(new ItemStack(goldenAnvilBlock, 1), "bbb", " i ", "iii", 'x', Blocks.GOLD_BLOCK, 'i', Items.GOLD_INGOT);
	}
	
	@SideOnly(Side.CLIENT)
	public static void InitClient(ItemModelMesher mesher) {
		Item item = Item.getItemFromBlock(goldenAnvilBlock);
		ModelResourceLocation model = new ModelResourceLocation(GoldenAnvil.RESOURCE_PREFIX + Names.GOLDEN_ANVIL);
		ModelLoader.registerItemVariants(item, model);
		mesher.register(item, 0, model);
	}
}

package net.insane96mcp.goldenAnvil.lib;

import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class MaterialHandler {
	public static ToolMaterial Vulcanite = EnumHelper.addToolMaterial("vulcanite", 3, 859, 7f, 2.5f, 16);
	public static ArmorMaterial vulcaniteArmorMaterial = EnumHelper.addArmorMaterial("vulcanite", "vulcanite:vulcanite_armor", 24, new int[]{3, 5, 4, 2}, 17, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 0f);
}

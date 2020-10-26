package net.oriondev.mattocks;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ToolMaterials;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.oriondev.mattocks.mattock.Mattock;

public class Mattocks implements ModInitializer {
	public static final Mattock NETHERITE_MATTOCK = new Mattock(6, -3, ToolMaterials.NETHERITE, new Item.Settings().group(ItemGroup.TOOLS));
	public static final Mattock DIAMOND_MATTOCK = new Mattock(3, -3, ToolMaterials.DIAMOND, new Item.Settings().group(ItemGroup.TOOLS));
	public static final Mattock IRON_MATTOCK = new Mattock(3, -3, ToolMaterials.IRON, new Item.Settings().group(ItemGroup.TOOLS));
	public static final Mattock STONE_MATTOCK = new Mattock(3, -3, ToolMaterials.STONE, new Item.Settings().group(ItemGroup.TOOLS));
	public static final Mattock WOODEN_MATTOCK = new Mattock(2, -3, ToolMaterials.WOOD, new Item.Settings().group(ItemGroup.TOOLS));
	public static final Mattock GOLDEN_MATTOCK = new Mattock(3, -3, ToolMaterials.GOLD, new Item.Settings().group(ItemGroup.TOOLS));
	@Override
	public void onInitialize() {
		Registry.register(Registry.ITEM, new Identifier("mattocks", "netherite_mattock"), NETHERITE_MATTOCK);
		Registry.register(Registry.ITEM, new Identifier("mattocks", "diamond_mattock"), DIAMOND_MATTOCK);
		Registry.register(Registry.ITEM, new Identifier("mattocks", "iron_mattock"), IRON_MATTOCK);
		Registry.register(Registry.ITEM, new Identifier("mattocks", "stone_mattock"), STONE_MATTOCK);
		Registry.register(Registry.ITEM, new Identifier("mattocks", "wooden_mattock"), WOODEN_MATTOCK);
		Registry.register(Registry.ITEM, new Identifier("mattocks", "golden_mattock"), GOLDEN_MATTOCK);
	}
}

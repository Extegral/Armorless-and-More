package com.integral.armorless.enchantments;

import com.integral.armorless.ArmorlessMod;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentType;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.CrossbowItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.IItemProvider;
import net.minecraft.util.ResourceLocation;

public class SharpshooterEnchantment extends Enchantment {
	public SharpshooterEnchantment(final EquipmentSlotType... slots) {
		super(Enchantment.Rarity.RARE, EnchantmentType.CROSSBOW, slots);
		this.setRegistryName(new ResourceLocation(ArmorlessMod.MODID, "sharpshooter"));
	}

	@Override
	public int getMinLevel() {
		return 1;
	}

	@Override
	public int getMaxLevel() {
		return 5;
	}

	@Override
	protected boolean canApplyTogether(final Enchantment ench) {
		return ench != Enchantments.MULTISHOT && ench != Enchantments.PIERCING;
	}

	@Override
	public boolean canApplyAtEnchantingTable(final ItemStack stack) {
		return stack.getItem() instanceof CrossbowItem;
	}

	@Override
	public boolean isTreasureEnchantment() {
		return false;
	}

	@Override
	public boolean isCurse() {
		return false;
	}

	@Override
	public boolean isAllowedOnBooks() {
		return true;
	}
}

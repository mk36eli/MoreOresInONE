package me.KG20.moreoresinone.Tools;

import me.KG20.moreoresinone.Init.RegisterTools;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.IItemTier;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;

public class Sword extends SwordItem {

    public Sword(IItemTier material, Properties properties) {
        super(material, 3, -2.4F, properties);
    }


}
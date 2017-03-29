package me.jasper.anticacti;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;

/**
 * Created by Jasper on 28-3-2017.
 */
public class Hooks {
    public static boolean cactusDoesDamage(Entity entity)
    {
        return !(entity instanceof EntityPlayer);
    }
}

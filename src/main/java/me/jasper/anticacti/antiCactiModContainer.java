package me.jasper.anticacti;

import com.google.common.eventbus.EventBus;
import net.minecraftforge.fml.common.DummyModContainer;
import net.minecraftforge.fml.common.LoadController;
import net.minecraftforge.fml.common.ModMetadata;


import java.util.Arrays;

public class antiCactiModContainer extends DummyModContainer
{
    public antiCactiModContainer()
    {
        super(new ModMetadata());
        ModMetadata meta = getMetadata();
        meta.modId = "anticacti";
        meta.name = "AntiCacti";
        meta.description = "Stops Cactus Damage";
        meta.version = "1.11.2";
        meta.authorList = Arrays.asList("KingJasper");
    }

    @Override
    public boolean registerBus(EventBus bus, LoadController controller)
    {
        bus.register(this);
        return true;
    }
}
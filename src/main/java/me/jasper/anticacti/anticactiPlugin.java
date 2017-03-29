package me.jasper.anticacti;

import net.minecraftforge.fml.relauncher.IFMLLoadingPlugin;



@IFMLLoadingPlugin.MCVersion("1.11.2")
@IFMLLoadingPlugin.TransformerExclusions({"me.jasper.anticacti"})
public class anticactiPlugin implements IFMLLoadingPlugin {
    public anticactiPlugin() {
    }

    @Override
    public java.lang.String[] getASMTransformerClass() {

        return new String[]{"me.jasper.anticacti.AntiCactiClassTransformer"};


    }

    @Override
    public String getModContainerClass() {
        return "me.jasper.anticacti.antiCactiModContainer";
    }

    @Override
    public String getSetupClass() {
        return null;
    }

    @Override
    public void injectData(java.util.Map<java.lang.String, java.lang.Object> data) {

    }

    @Override
    public String getAccessTransformerClass() {
        return null;
    }
}

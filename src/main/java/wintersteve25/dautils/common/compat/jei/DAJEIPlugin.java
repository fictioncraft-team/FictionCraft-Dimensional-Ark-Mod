package wintersteve25.dautils.common.compat.jei;

import mezz.jei.api.*;
import mezz.jei.api.recipe.IRecipeCategoryRegistration;
import wintersteve25.dautils.common.compat.jei.forge_anvil_jei.JEIForgeAnvilCategory;
import wintersteve25.dautils.common.compat.jei.forge_anvil_jei.JEIForgeAnvilHandler;
import wintersteve25.dautils.common.compat.jei.smeltery_jei.JEISmelteryCategory;
import wintersteve25.dautils.common.compat.jei.smeltery_jei.JEISmelteryHandler;
import wintersteve25.dautils.common.compat.jei.smeltery_jei.JEISmelteryWrapper;

@JEIPlugin
public class DAJEIPlugin implements IModPlugin {
    public static final String FORGEANVILPLUGINID = "dautils.forge_anvil";
    public static final String SMELTERYPLUGINID = "dautils.smeltery";

    @Override
    public void register(IModRegistry registry) {
        JEIForgeAnvilHandler.handler(registry);
        JEISmelteryHandler.handler(registry);
    }

    @Override
    public void registerCategories(IRecipeCategoryRegistration registry) {
        IJeiHelpers jeiHelper = registry.getJeiHelpers();
        IGuiHelper iGuiHelper = jeiHelper.getGuiHelper();
        registry.addRecipeCategories(new JEIForgeAnvilCategory(iGuiHelper));
        registry.addRecipeCategories(new JEISmelteryCategory(iGuiHelper));
    }
}

package online.meowcorp.meowcorpmod.items;

import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import static online.meowcorp.meowcorpmod.MeowcorpMod.modid;
import static online.meowcorp.meowcorpmod.items.Items.IDK;

public class ItemRegistry {
    public static void register() {
        Registry.register(Registry.ITEM, new Identifier(modid, "idk"), IDK);
    }
}

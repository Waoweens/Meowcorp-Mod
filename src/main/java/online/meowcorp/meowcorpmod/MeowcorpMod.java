package online.meowcorp.meowcorpmod;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.minecraft.block.Blocks;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

import online.meowcorp.meowcorpmod.items.ItemRegistry;

public class MeowcorpMod implements ModInitializer {

    public static String modid = "meowcorpmod";

    public static final ItemGroup MEOWCORP_GROUP = FabricItemGroupBuilder.build(
            new Identifier(modid, "meowcorp_group"),
            () -> new ItemStack(Blocks.BEDROCK)
    );

    @Override
    public void onInitialize() {
        ItemRegistry.register();
    }
}

package online.meowcorp.meowcorpmod;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.block.Blocks;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import online.meowcorp.meowcorpmod.entities.StuckVillagerEntity;
import online.meowcorp.meowcorpmod.items.ItemRegistry;

public class MeowcorpMod implements ModInitializer {

    public static String modid = "meowcorpmod";

    public static final ItemGroup MEOWCORP_GROUP = FabricItemGroupBuilder.build(
            new Identifier(modid, "meowcorp_group"),
            () -> new ItemStack(Blocks.BEDROCK)
    );

    public static final EntityType<StuckVillagerEntity> STUCK_VILLAGER = Registry.register(
            Registry.ENTITY_TYPE,
            new Identifier(modid, "stuck_villager"),
            FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, StuckVillagerEntity::new).dimensions(EntityDimensions.fixed(0.75f, 0.75f)).build()
    );

    @Override
    public void onInitialize() {
        FabricDefaultAttributeRegistry.register(STUCK_VILLAGER, StuckVillagerEntity.createLivingAttributes().add(EntityAttributes.GENERIC_FOLLOW_RANGE, 0));

        ItemRegistry.register();
    }
}

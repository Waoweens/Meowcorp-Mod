package online.meowcorp.meowcorpmod;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.rendereregistry.v1.EntityRendererRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.util.Identifier;
import online.meowcorp.meowcorpmod.entities.StuckVillagerEntityModel;
import online.meowcorp.meowcorpmod.entities.StuckVillagerEntityRenderer;

import static online.meowcorp.meowcorpmod.MeowcorpMod.modid;

@Environment(EnvType.CLIENT)
public class MeowcorpModClient implements ClientModInitializer {

    public static final EntityModelLayer MODEL_STUCK_VILLAGER_LAYER = new EntityModelLayer(new Identifier(modid, "stuck_villager"), "main");

    @Override
    public void onInitializeClient() {
        EntityRendererRegistry.INSTANCE.register(MeowcorpMod.STUCK_VILLAGER, (context) -> {
            return new StuckVillagerEntityRenderer(context);
        });

        EntityModelLayerRegistry.registerModelLayer(MODEL_STUCK_VILLAGER_LAYER, StuckVillagerEntityModel::getTexturedModelData);
    }
}

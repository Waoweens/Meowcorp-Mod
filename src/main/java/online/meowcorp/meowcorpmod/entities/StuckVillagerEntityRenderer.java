package online.meowcorp.meowcorpmod.entities;

import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.LivingEntityRenderer;
import net.minecraft.client.render.entity.feature.HeadFeatureRenderer;
import net.minecraft.client.render.entity.feature.VillagerClothingFeatureRenderer;
import net.minecraft.client.render.entity.feature.VillagerHeldItemFeatureRenderer;
import net.minecraft.client.render.entity.model.EntityModelLayers;
import net.minecraft.client.render.entity.model.VillagerResemblingModel;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.passive.VillagerEntity;
import net.minecraft.util.Identifier;
import online.meowcorp.meowcorpmod.MeowcorpModClient;

import static online.meowcorp.meowcorpmod.MeowcorpMod.modid;

public class StuckVillagerEntityRenderer extends LivingEntityRenderer<StuckVillagerEntity, StuckVillagerEntityModel> {

//    public StuckVillagerEntityRenderer(EntityRendererFactory.Context context) {
//        super(context, new StuckVillagerEntityModel(context.getPart(MeowcorpModClient.MODEL_STUCK_VILLAGER_LAYER)), 0.5f);
//
//    }

    public StuckVillagerEntityRenderer(EntityRendererFactory.Context context) {
        super(context, new StuckVillagerEntityModel(context.getPart(MeowcorpModClient.MODEL_STUCK_VILLAGER_LAYER)), 0.5F);
        this.addFeature(new HeadFeatureRenderer(this, context.getModelLoader()));
        this.addFeature(new VillagerClothingFeatureRenderer(this, context.getResourceManager(), "villager"));
        this.addFeature(new VillagerHeldItemFeatureRenderer(this));
    }

    @Override
    public Identifier getTexture(StuckVillagerEntity entity) {
        return new Identifier(modid, "textures/entity/stuck_villager/villager.png");
    }
}

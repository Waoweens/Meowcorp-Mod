package online.meowcorp.meowcorpmod.entities;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.ai.pathing.Path;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.entity.mob.PathAwareEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Arm;
import net.minecraft.world.World;

public class StuckVillagerEntity extends MobEntity {
    public StuckVillagerEntity(EntityType<? extends MobEntity> entityType, World world) {
        super(entityType, world);
    }
}

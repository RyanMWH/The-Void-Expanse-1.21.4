package com.eclipsense.astralexpanse.init;

import com.eclipsense.astralexpanse.AstralExpanse;
import com.eclipsense.astralexpanse.entity.custom.EnderWispEntity;
import com.eclipsense.astralexpanse.entity.custom.VoidProwlerEntity;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class AstralEntities {

    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(BuiltInRegistries.ENTITY_TYPE, AstralExpanse.MODID);

    public static final Supplier<EntityType<EnderWispEntity>> ENDER_WISP =
            ENTITY_TYPES.register("ender_wisp",
                    () -> EntityType.Builder.of(EnderWispEntity::new, MobCategory.CREATURE)
                            .sized(0.25f, 0.25f).build(ResourceKey.create(Registries.ENTITY_TYPE, ResourceLocation.fromNamespaceAndPath("astralexpanse","ender_wisp"))));

    public static final Supplier<EntityType<VoidProwlerEntity>> VOID_PROWLER =
            ENTITY_TYPES.register("void_prowler",
                    () -> EntityType.Builder.of(VoidProwlerEntity::new, MobCategory.MONSTER)
                            .sized(0.25f, 0.25f).build(ResourceKey.create(Registries.ENTITY_TYPE, ResourceLocation.fromNamespaceAndPath("astralexpanse","void_prowler"))));



    public static void register(IEventBus eventBus){
        ENTITY_TYPES.register(eventBus);
    }
}

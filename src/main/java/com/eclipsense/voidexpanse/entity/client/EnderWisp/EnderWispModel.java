package com.eclipsense.voidexpanse.entity.client.EnderWisp;

import com.eclipsense.voidexpanse.entity.client.EnderWisp.EnderWispAnimations;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.resources.ResourceLocation;

public class EnderWispModel extends EntityModel<EnderWispRenderState> {
    public static final ModelLayerLocation LAYER_LOCATION =
            new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath("voidexpanse", "ender_wisp"), "main");

    private final ModelPart body;

    public EnderWispModel(ModelPart body) {
        super(body, RenderType::entityTranslucent); // Use translucent for wisp effect
        this.body = body.getChild("body");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();

        PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create()
                        .texOffs(0, 0).addBox(0.0F, -2.0F, -2.0F, 0.0F, 4.0F, 4.0F, new CubeDeformation(0.0F))
                        .texOffs(0, 16).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offset(0.0F, 17.0F, 0.0F));

        body.addOrReplaceChild("cube_r1", CubeListBuilder.create()
                        .texOffs(8, 0).addBox(0.0F, -3.0F, -2.0F, 0.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, 1.0F, 0.0F, 0.0F, -1.6144F, 0.0F));

        body.addOrReplaceChild("cube_r2", CubeListBuilder.create()
                        .texOffs(0, 8).addBox(0.0F, -3.0F, -2.0F, 0.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, 1.0F, 0.0F, 0.0F, -0.7854F, 0.0F));

        body.addOrReplaceChild("cube_r3", CubeListBuilder.create()
                        .texOffs(8, 8).addBox(0.0F, -3.0F, -2.0F, 0.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, 1.0F, 0.0F, 0.0F, 0.7854F, 0.0F));

        return LayerDefinition.create(meshdefinition, 32, 32);
    }

    @Override
    public void setupAnim(EnderWispRenderState renderState) {
        super.setupAnim(renderState);

        // Apply animations using the render state
        this.animate(renderState.idleAnimationState, EnderWispAnimations.ANIM_ENDER_WISP_IDLE, renderState.ageInTicks);
    }
}
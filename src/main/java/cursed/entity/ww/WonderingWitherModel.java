package cursed.entity.ww;

import net.minecraft.client.model.ModelPart;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.Entity;

public class WonderingWitherModel extends EntityModel<WonderingWitherEntity> {
    private final ModelPart core;
    private final ModelPart floatersa;
    private final ModelPart floatersb;

    public WonderingWitherModel() {
        textureWidth = 256;
        textureHeight = 256;

        core = new ModelPart(this);
        core.setPivot(26.6F, -17.0F, -51.4F);
        core.setTextureOffset(0, 0).addCuboid(-42.6F, 9.0F, 30.4F, 32.0F, 32.0F, 32.0F, 0.0F, false);

        floatersa = new ModelPart(this);
        floatersa.setPivot(-26.6F, 41.0F, 29.4F);
        core.addChild(floatersa);
        floatersa.setTextureOffset(64, 64).addCuboid(-7.0F, -57.0F, 53.8F, 16.0F, 16.0F, 16.0F, 0.0F, false);
        floatersa.setTextureOffset(128, 64).addCuboid(22.0F, -57.0F, 18.8F, 16.0F, 16.0F, 16.0F, 0.0F, false);
        floatersa.setTextureOffset(0, 64).addCuboid(-24.0F, 15.6F, -23.3F, 16.0F, 16.0F, 16.0F, 0.0F, false);

        floatersb = new ModelPart(this);
        floatersb.setPivot(0.0F, 0.0F, 0.0F);
        core.addChild(floatersb);
        floatersb.setTextureOffset(128, 0).addCuboid(-51.5F, -16.0F, 0.0F, 16.0F, 16.0F, 16.0F, 0.0F, false);
        floatersb.setTextureOffset(128, 64).addCuboid(10.4F, 34.0F, 48.2F, 16.0F, 16.0F, 16.0F, 0.0F, false);
        floatersb.setTextureOffset(0, 96).addCuboid(-26.6F, 56.7F, 87.8F, 16.0F, 16.0F, 16.0F, 0.0F, false);
    }

    @Override
    public void setAngles(WonderingWitherEntity entity, float limbAngle, float limbDistance, float animationProgress, float headYaw, float headPitch) {

    }

    @Override
    public void render(MatrixStack matrixStack, VertexConsumer buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
        core.render(matrixStack, buffer, packedLight, packedOverlay);
    }

}
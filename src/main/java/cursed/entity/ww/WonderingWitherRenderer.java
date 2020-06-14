package cursed.entity.ww;

import cursed.Cursed;
import net.minecraft.client.render.entity.EntityRenderDispatcher;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.util.Identifier;

public class WonderingWitherRenderer extends MobEntityRenderer<WonderingWitherEntity, WonderingWitherModel> {

    public WonderingWitherRenderer(EntityRenderDispatcher entityRenderDispatcher) {
        super(entityRenderDispatcher, new WonderingWitherModel(), 1f);
    }

    @Override
    public Identifier getTexture(WonderingWitherEntity entity) {
        return Cursed.identifier("textures/entity/wondering_wither.png");
    }
}

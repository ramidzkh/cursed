package cursed.client;

import cursed.Cursed;
import cursed.entity.ww.WonderingWitherRenderer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.rendereregistry.v1.EntityRendererRegistry;

@Environment(EnvType.CLIENT)
public interface Client {

    static void initialize() {
        EntityRendererRegistry.INSTANCE.register(Cursed.WONDERING_WITHER, (dispatcher, context) -> new WonderingWitherRenderer(dispatcher));
    }

}

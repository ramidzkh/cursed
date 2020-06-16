package cursed.biome;

import cursed.Cursed;
import cursed.item.Items;
import net.fabricmc.fabric.api.biomes.v1.NetherBiomes;
import net.fabricmc.fabric.api.event.server.ServerTickCallback;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.biome.Biome;

public interface Biomes {

    Biome WITHERED_WASTELAND = register("withered_wasteland", new WitheredWasteland());

    static Biome register(String name, Biome biome) {
        return Registry.register(Registry.BIOME, Cursed.identifier(name), biome);
    }

    static void initialize() {
        NetherBiomes.addNetherBiome(WITHERED_WASTELAND);
        ServerTickCallback.EVENT.register(minecraftServer -> {
            if (minecraftServer.getTicks() % 20 == 0) {
                minecraftServer.getPlayerManager().getPlayerList().forEach(serverPlayerEntity -> {
                    if(serverPlayerEntity.getStackInHand(Hand.MAIN_HAND).getItem() == Items.WITHERED_FRAGMENT) return;
                    if(serverPlayerEntity.getStackInHand(Hand.OFF_HAND).getItem() == Items.WITHERED_FRAGMENT) return;
                    if (serverPlayerEntity.world.getBiome(new BlockPos(serverPlayerEntity.getPos())) == WITHERED_WASTELAND) {
                        serverPlayerEntity.addStatusEffect(new StatusEffectInstance(StatusEffects.BLINDNESS, 300, 1, false, true, true));
                        serverPlayerEntity.addStatusEffect(new StatusEffectInstance(StatusEffects.SLOWNESS, 300, 1, false, true, true));
                    }
                });
            }
        });
    }
}

package cursed.biome;

import cursed.Cursed;
import net.fabricmc.fabric.api.biomes.v1.NetherBiomes;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.biome.Biome;

public interface Biomes {

    Biome WITHERED_WASTELAND = register("withered_wasteland", new WitheredWasteland());

    static Biome register(String name, Biome biome) {
        return Registry.register(Registry.BIOME, Cursed.identifier(name), biome);
    }

    static void initialize() {
        NetherBiomes.addNetherBiome(WITHERED_WASTELAND);
    }
}

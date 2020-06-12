package cursed.biome;

import com.google.common.collect.ImmutableList;
import net.minecraft.client.sound.MusicType;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.sound.BiomeAdditionsSound;
import net.minecraft.sound.BiomeMoodSound;
import net.minecraft.sound.SoundEvents;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeEffects;
import net.minecraft.world.biome.BiomeParticleConfig;
import net.minecraft.world.gen.surfacebuilder.SurfaceBuilder;

public class WitheredWasteland extends Biome {

    protected WitheredWasteland() {
        super(new Biome.Settings()
                .configureSurfaceBuilder(SurfaceBuilder.SOUL_SAND_VALLEY, SurfaceBuilder.SOUL_SAND_CONFIG)
                .precipitation(Biome.Precipitation.NONE)
                .category(Biome.Category.NETHER)
                .depth(0.1F)
                .scale(0.2F)
                .temperature(2.0F)
                .downfall(0.0F)
                .effects(new BiomeEffects.Builder()
                        .waterColor(0x3F76E4)
                        .waterFogColor(0x50533)
                        .fogColor(0x355040)
                        .particleConfig(new BiomeParticleConfig(ParticleTypes.ANGRY_VILLAGER, 0.00625F))
                        .loopSound(SoundEvents.AMBIENT_BASALT_DELTAS_MOOD)
                        .moodSound(new BiomeMoodSound(SoundEvents.AMBIENT_SOUL_SAND_VALLEY_MOOD, 6000, 8, 2.0D))
                        .additionsSound(new BiomeAdditionsSound(SoundEvents.AMBIENT_SOUL_SAND_VALLEY_ADDITIONS, 1 / 90D))
                        .music(MusicType.method_27283(SoundEvents.MUSIC_NETHER_SOUL_SAND_VALLEY))
                        .build())
                .parent(null)
                .noises(ImmutableList.of(new Biome.MixedNoisePoint(0.0F, -0.5F, 0.0F, 0.0F, 0.0F))));
    }
}

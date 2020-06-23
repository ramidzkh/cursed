plugins {
    id("fabric-loom") version "0.4-SNAPSHOT"
}

group = "me.ramidzkh"
version = "1.0.0-SNAPSHOT"

java {
    sourceCompatibility = JavaVersion.VERSION_1_8
    targetCompatibility = JavaVersion.VERSION_1_8
}

repositories {
    maven { url = uri("https://jitpack.io") }
    maven { url = uri("https://www.curseforge.com/api/maven") }
    maven { url = uri("https://server.bbkr.space/artifactory/libs-release") }
    maven { url = uri("https://maven.modmuss50.me") }
    maven { url = uri("https://mod-buildcraft.com/maven") }
    maven { url = uri("https://dl.bintray.com/ladysnake/libs") }
    maven { url = uri("https://cdn.hrzn.studio/maven") }
}

dependencies {
    minecraft("net.minecraft", "minecraft", "1.16-rc1")
    mappings("net.fabricmc", "yarn", "1.16-rc1+build.4", classifier = "v2")
    modCompile("net.fabricmc", "fabric-loader", "0.8.8+build.202")

    modImplementation("net.fabricmc.fabric-api", "fabric-api", "0.12.5+build.367-1.16")

//    modImplementation("io.github.onyxstudios.Cardinal-Components-API:cardinal-components-base:2.4.0-nightly.1.16-pre5")
//    modImplementation("io.github.onyxstudios.Cardinal-Components-API:cardinal-components-block:2.4.0-nightly.1.16-pre5")
//    modImplementation("io.github.onyxstudios.Cardinal-Components-API:cardinal-components-item:2.4.0-nightly.1.16-pre5")

//    modImplementation("com.github.StellarHorizons", "Galacticraft-Rewoven", "master")
}

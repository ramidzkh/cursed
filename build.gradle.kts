plugins {
    id("fabric-loom") version "0.4.24"
}

group = "me.ramidzkh"
version = "1.0.0-SNAPSHOT"

java {
    sourceCompatibility = JavaVersion.VERSION_1_8
    targetCompatibility = JavaVersion.VERSION_1_8
}

dependencies {
    minecraft("net.minecraft", "minecraft", "1.16-pre4")
    mappings("net.fabricmc", "yarn", "1.16-pre4+build.1", classifier = "v2")
    modCompile("net.fabricmc", "fabric-loader", "0.8.7+build.201")

    modImplementation("net.fabricmc.fabric-api", "fabric-api", "0.11.10+build.359-1.16")
}

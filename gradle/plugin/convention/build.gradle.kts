plugins {
    `kotlin-dsl`
}

group = "com.multiverse.plugins"

java {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
}

dependencies {
    compileOnly(multiverseLibs.android.gradlePlugin)
    compileOnly(multiverseLibs.kotlin.gradlePlugin)
}

gradlePlugin {
    plugins {
        create("multiverseApplication") {
            id = "multiverse.app"
            implementationClass = "com.multiverse.plugin.convention.ApplicationConventionPlugin"
        }
        create("multiverseAndroidLibrary") {
            id = "multiverse.android.library"
            implementationClass = "com.multiverse.plugin.convention.AndroidConventionPlugin"
        }
        create("multiverseKotlinLibrary") {
            id = "multiverse.kotlin.library"
            implementationClass = "com.multiverse.plugin.convention.KotlinConventionPlugin"
        }
        create("multiverseCompose") {
            id = "multiverse.compose"
            implementationClass = "com.multiverse.plugin.convention.ComposeConventionPlugin"
        }
        create("multiverseKsp") {
            id = "multiverse.ksp"
            implementationClass = "com.multiverse.plugin.convention.KspConventionPlugin"
        }
        create("multiverseHilt") {
            id = "multiverse.hilt"
            implementationClass = "com.multiverse.plugin.convention.HiltConventionPlugin"
        }
    }
}

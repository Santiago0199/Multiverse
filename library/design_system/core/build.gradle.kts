plugins {
    id("multiverse.android.library")
    id("multiverse.compose")
}

android {
    namespace = "com.multiverse.design.system.core"
    resourcePrefix = "design_system_core_"
}

dependencies {
    implementation(libs.compose.material3)
}

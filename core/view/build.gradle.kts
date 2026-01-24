plugins {
    id("multiverse.android.library")
    id("multiverse.compose")
}

android {
    namespace = "com.multiverse.core.view"
    resourcePrefix = "core_view_"
}

dependencies {
    implementation(libs.activity.compose)
    implementation(libs.navigation.compose)
}

plugins {
    id("multiverse.android.library")
}

android {
    namespace = "com.multiverse.core.view"
    resourcePrefix = "core_view_"
}

dependencies {
    implementation(libs.androidx.activity.compose)
}

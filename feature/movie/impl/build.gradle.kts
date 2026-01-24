plugins {
    id("multiverse.android.library")
    id("multiverse.compose")
    id("multiverse.ksp")
    id("multiverse.hilt")
}

android {
    namespace = "com.multiverse.movie.impl"
    resourcePrefix = "movie_impl_"
}

dependencies {
    implementation(project(":core:view"))
    implementation(project(":core:viewmodel"))
    implementation(project(":core:coroutines"))
    implementation(project(":library:design_system:core"))

    implementation(libs.compose.material3)
    implementation(libs.compose.navigation)
    implementation(libs.activity.compose)
    implementation(libs.navigation.compose)
}

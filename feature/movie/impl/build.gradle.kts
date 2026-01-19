plugins {
    id("multiverse.android.library")
    id("multiverse.compose")
}

android {
    namespace = "com.multiverse.movie.impl"
    resourcePrefix = "movie_impl_"
}

dependencies {
    implementation(project(":core:view"))
    implementation(project(":library:design_system:core"))

    implementation(libs.compose.material3)
    implementation(libs.androidx.activity.compose)
}

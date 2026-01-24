plugins {
    id("multiverse.android.library")
}

android {
    namespace = "com.multiverse.core.viewmodel"
    resourcePrefix = "core_viewmodel_"
}

dependencies {
    implementation(project(":core:coroutines"))

    implementation(libs.lifecycle.viewmodel.ktx)
}

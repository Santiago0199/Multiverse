package com.multiverse.plugin.convention

import com.multiverse.plugin.convention.extension.libs
import com.multiverse.plugin.convention.extension.plugin
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.dependencies
import org.jetbrains.kotlin.gradle.utils.IMPLEMENTATION

class HiltConventionPlugin : Plugin<Project> {

    override fun apply(target: Project) {
        with(target) {
            pluginManager.apply(libs.plugin("hilt").pluginId)

            dependencies {
                add(IMPLEMENTATION, libs.findLibrary("dagger-hilt-android").get())
                add("ksp", libs.findLibrary("dagger-hilt-compiler").get())
            }
        }
    }
}

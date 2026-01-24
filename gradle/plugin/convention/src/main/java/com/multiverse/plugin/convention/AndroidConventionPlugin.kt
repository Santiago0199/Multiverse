package com.multiverse.plugin.convention

import com.android.build.gradle.LibraryExtension
import com.multiverse.plugin.convention.extension.libs
import com.multiverse.plugin.convention.extension.plugin
import com.multiverse.plugin.convention.extension.setKotlinAndroid
import com.multiverse.plugin.convention.extension.setKotlinJvm
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.configure

class AndroidConventionPlugin : Plugin<Project> {

    override fun apply(target: Project) {
        with(target) {
            pluginManager.apply(libs.plugin("android.library").pluginId)
            pluginManager.apply(libs.plugin("kotlin.android").pluginId)

            extensions.configure<LibraryExtension> {
                setKotlinAndroid(this)
                setKotlinJvm()
            }
        }
    }
}

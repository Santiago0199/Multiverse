package com.multiverse.plugin.convention

import com.android.build.api.dsl.CommonExtension
import com.multiverse.plugin.convention.extension.library
import com.multiverse.plugin.convention.extension.libs
import com.multiverse.plugin.convention.extension.plugin
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.dependencies
import org.jetbrains.kotlin.gradle.utils.IMPLEMENTATION

class ComposeConventionPlugin: Plugin<Project> {

    override fun apply(target: Project) {
        with(target) {
            pluginManager.apply(target.libs.plugin("kotlin.compose").pluginId)

            extensions.getByType(CommonExtension::class.java).apply {
                buildFeatures {
                    compose = true
                }

                dependencies {
                    add(IMPLEMENTATION, platform(libs.library("compose.bom")))
                    add(IMPLEMENTATION, libs.library("compose.ui"))
                    add(IMPLEMENTATION, libs.library("compose.ui.tooling"))
                    add(IMPLEMENTATION, libs.library("compose.ui.tooling.preview"))
                }
            }
        }
    }
}

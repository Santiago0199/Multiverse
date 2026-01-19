package com.multiverse.plugin.convention

import com.multiverse.plugin.convention.extension.libs
import com.multiverse.plugin.convention.extension.plugin
import com.multiverse.plugin.convention.extension.setJavaVersion
import com.multiverse.plugin.convention.extension.setKotlinJvm
import org.gradle.api.Plugin
import org.gradle.api.Project

class KotlinConventionPlugin : Plugin<Project> {

    override fun apply(target: Project) {
        with(target) {
            pluginManager.apply(libs.plugin("kotlin.jvm").pluginId)

            setJavaVersion()
            setKotlinJvm()

            // pluginManager.apply("jacoco")
        }
    }
}

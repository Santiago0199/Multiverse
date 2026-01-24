package com.multiverse.plugin.convention

import com.multiverse.plugin.convention.extension.libs
import com.multiverse.plugin.convention.extension.plugin
import org.gradle.api.Plugin
import org.gradle.api.Project

class KspConventionPlugin : Plugin<Project> {

    override fun apply(target: Project) {
        with(target) {
            pluginManager.apply(libs.plugin("ksp").pluginId)
        }
    }
}

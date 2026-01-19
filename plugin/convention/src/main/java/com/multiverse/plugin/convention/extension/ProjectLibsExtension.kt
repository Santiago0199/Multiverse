package com.multiverse.plugin.convention.extension

import org.gradle.api.Project
import org.gradle.api.artifacts.MinimalExternalModuleDependency
import org.gradle.api.artifacts.VersionCatalog
import org.gradle.api.artifacts.VersionCatalogsExtension
import org.gradle.kotlin.dsl.getByType
import org.gradle.plugin.use.PluginDependency

val Project.libs
    get(): VersionCatalog = extensions.getByType<VersionCatalogsExtension>().named("libs")

internal fun VersionCatalog.library(library: String): MinimalExternalModuleDependency =
    findLibraryOrThrow(library).get()

internal fun VersionCatalog.plugin(plugin: String): PluginDependency =
    findPluginOrThrow(plugin).get()

internal fun VersionCatalog.stringVersion(version: String): String =
    findVersionOrThrow(version)

internal fun VersionCatalog.intVersion(version: String): Int =
    findVersionOrThrow(version).toInt()

private fun VersionCatalog.findLibraryOrThrow(name: String) = findLibrary(name)
    .orElseThrow { NoSuchElementException("Library $name not found in version catalog") }

private fun VersionCatalog.findPluginOrThrow(name: String) = findPlugin(name)
    .orElseThrow { NoSuchElementException("Plugin $name not found in version catalog") }

private fun VersionCatalog.findVersionOrThrow(name: String) = findVersion(name)
    .orElseThrow { NoSuchElementException("Version $name not found in version catalog") }
    .requiredVersion

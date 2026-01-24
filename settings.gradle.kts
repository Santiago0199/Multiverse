pluginManagement {
    includeBuild("gradle/plugin/convention")
    repositories {
        gradlePluginPortal()
        mavenCentral()
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
    }
}

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "Multiverse"

include(":app")

// Core
apply { from("core/core-settings.gradle.kts") }

// Library
apply { from("library/design_system/design-system-settings.gradle.kts") }

// Movie
include(":feature:movie:api")
include(":feature:movie:impl")

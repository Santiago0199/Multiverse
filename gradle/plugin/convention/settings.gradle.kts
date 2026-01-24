rootProject.name = "convention-plugin"

dependencyResolutionManagement {

    repositories {
        google()
        mavenCentral()
    }

    versionCatalogs {
        create("multiverseLibs") {
            from(files("../../libs.versions.toml"))
        }
    }
}

include(":convention")
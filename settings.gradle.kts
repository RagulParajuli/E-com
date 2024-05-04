import org.gradle.api.initialization.Settings

pluginManagement {
    repositories {
        google()
        gradlePluginPortal()
        maven("https://jitpack.io") // Add the repository for Dagger Hilt plugin here
    }
}

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "E-com"
include(":app")

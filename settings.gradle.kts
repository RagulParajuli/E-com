pluginManagement {
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        mavenCentral()
        google()
        gradlePluginPortal()
        //noinspection JcenterRepositoryObsolete
        jcenter()
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

rootProject.name = "E-Commerce"
include(":app")

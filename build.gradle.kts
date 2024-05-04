
buildscript {
    dependencies {
        classpath ("com.google.dagger:hilt-android-gradle-plugin:2.40.1")
        classpath ("com.google.gms:google-services:4.3.13")

        val nav_version = "2.5.2"
        classpath ("androidx.navigation:navigation-safe-args-gradle-plugin:$nav_version")
    }
}

plugins {
    alias(libs.plugins.androidApplication) apply false
    alias(libs.plugins.jetbrainsKotlinAndroid) apply false
}
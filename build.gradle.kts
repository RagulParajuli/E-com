
buildscript {
    repositories {
        google()
        mavenCentral()
        maven ("https://jitpack.io")
    }
    dependencies {
        classpath(libs.kotlin.gradle.plugin)
        classpath(libs.google.services)
        classpath ("com.android.tools.build:gradle:3.6.0")
    }
}


plugins {
    alias(libs.plugins.androidApplication) apply false
    alias(libs.plugins.jetbrainsKotlinAndroid) apply false
    id("com.google.dagger.hilt.android") version "2.44" apply false
}
plugins {
    alias(libs.plugins.androidApplication)
    alias(libs.plugins.jetbrainsKotlinAndroid)
// Apply the Hilt Android Gradle plugin
    id("kotlin-android")
    id("kotlin-kapt")
    id("dagger.hilt.android.plugin")
    id("com.google.gms.google-services")
//    id("com.android.application")
}

android {
    namespace = "com.example.e_commerce"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.e_commerce"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }

    buildFeatures {
        viewBinding = true
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
}
// TODO
// Add this block to apply the Google Services plugin
// Update the path here
// Configure Google Services plugin

googleServices {
//    val path = """E:\AndroidProjects\Using Kotlin\Kotlin with xml\E_com\app\google-services.json"""
    val googleServicesJson = null
    googleServicesJson?.set()
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)

    // Navigation component
    implementation(libs.navigation.fragment.ktx)
    implementation(libs.navigation.ui.ktx)

    //loading button
    implementation(libs.loading.button.android) // 2.2.0

    //Glide
    implementation(libs.glide)

    //circular image
    implementation(libs.circleimageview)

    //viewpager2 indicator
    implementation(libs.viewpagerindicator)

    //stepView
    implementation(libs.stepview)

    //Android Ktx
    implementation(libs.androidx.navigation.fragment.ktx.v277)

    //Dagger hilt
    implementation(libs.hilt.android)
    kapt(libs.hilt.android.compiler)
    implementation(libs.androidx.hilt.lifecycle.viewmodel)
    kapt(libs.androidx.hilt.compiler)

    //Firebase
    implementation(libs.firebase.auth)

    //Coroutines with Firebase
    implementation(libs.kotlinx.coroutines.play.services)

//    TODO
//    implementation (libs.library)
}

fun Nothing?.set() {
}

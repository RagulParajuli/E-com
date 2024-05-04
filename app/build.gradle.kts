import org.jetbrains.kotlin.gradle.dsl.KotlinCompile

plugins {
    id("com.android.application")
    id("kotlin-android")
    id("kotlin-parcelize")
    id("androidx.navigation.safeargs.kotlin")
    id("dagger.hilt.android.plugin") version "2.44.0"
    id("com.google.gms.google-services")
}

android {
    compileSdkVersion = 33

    defaultConfig {
        applicationId = "com.example.ecommerce"
        minSdk = 21
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }


    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }

    buildFeatures {
        viewBinding = true
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }

    kotlinOptions {
        jvmTarget = "11"
    }

    tasks.withType<KotlinCompile> {
        kotlinOptions {
            jvmTarget = "11"
        }
    }

    // Add this block to apply the Google Services plugin
    GoogleServicesPlugin.config.project {
        googleServicesJson.set(file("https://console.firebase.google.com/u/1/project/e-commerce-d4a29/overview"))
    }
}

dependencies {
    implementation("androidx.core:core-ktx:1.7.0")
    implementation("androidx.appcompat:appcompat:1.4.2")
    implementation("com.google.android.material:material:1.6.1")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    implementation("com.google.firebase:firebase-firestore-ktx:24.2.1")
    implementation("com.google.firebase:firebase-storage:20.1.0")
    implementation(libs.androidx.activity)
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.3")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.4.0")

    // Navigation component
    val nav_version = "2.5.2"
    implementation("androidx.navigation:navigation-fragment-ktx:$nav_version")
    implementation("androidx.navigation:navigation-ui-ktx:$nav_version")


    //loading button
    implementation("br.com.simplepass:loading-button-android:2.2.0")

    //Glide
    implementation("com.github.bumptech.glide:glide:4.13.0")

    //circular image
    implementation("de.hdodenhof:circleimageview:3.1.0")

    //viewpager2 indicator
    implementation("io.github.vejei.viewpagerindicator:viewpagerindicator:1.0.0-alpha.1")

    //stepView
    implementation("com.shuhart.stepview:stepview:1.5.1")

    //Android Ktx
    implementation("androidx.navigation:navigation-fragment-ktx:2.4.2")

    //Dagger hilt
    implementation("com.google.dagger:hilt-android:2.44.0")
    kapt("com.google.dagger:hilt-compiler:2.44.0")

    //Firebase
    implementation("com.google.firebase:firebase-auth:21.0.6")

    //Coroutines with Firebase
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-play-services:1.5.1")
}

repositories {
    google()
    mavenCentral()
}

plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.acerolla.thingsapp"
    compileSdk = com.earl.buildsrc.AppVersions.compileSdk

    defaultConfig {
        applicationId = "com.acerolla.thingsapp"
        minSdk = com.earl.buildsrc.AppVersions.minSdk
        targetSdk = com.earl.buildsrc.AppVersions.targetSdk
        versionCode = com.earl.buildsrc.AppVersions.versionCode
        versionName = com.earl.buildsrc.AppVersions.versionName

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
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
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.4.3"
    }
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {

    implementation(libs.core.ktx)
    implementation(platform(libs.androidx.compose.bom))
    implementation(libs.androidx.compose.ui.tooling.preview)
    implementation(libs.material3)
    implementation(libs.androidx.activity.compose)
    implementation(libs.androidx.compose.runtime)
    testImplementation(libs.junit)
    androidTestImplementation(libs.junit.ktx)
    androidTestImplementation(libs.espresso)
    androidTestImplementation(platform(libs.androidx.compose.bom))
    androidTestImplementation(libs.androidx.compose.ui.test)
    debugImplementation(libs.androidx.compose.ui.tooling)
    debugImplementation(libs.androidx.compose.ui.testManifest)
}
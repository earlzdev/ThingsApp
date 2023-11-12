@Suppress("DSL_SCOPE_VIOLATION") // TODO: Remove once KTIJ-19369 is fixed
plugins {
    alias(libs.plugins.com.android.library)
    alias(libs.plugins.org.jetbrains.kotlin.android)
}

android {
    namespace = "com.earl.design_system"
    compileSdk = com.earl.buildsrc.AppVersions.compileSdk

    defaultConfig {
        minSdk = com.earl.buildsrc.AppVersions.minSdk

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        consumerProguardFiles("consumer-rules.pro")
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
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.4.3"
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {

    implementation(libs.core.ktx)
    implementation(libs.appcompat)
    implementation(libs.material)
    implementation(platform(libs.androidx.compose.bom))
    implementation(libs.androidx.compose.ui.tooling.preview)
    implementation(libs.material3)
    implementation(libs.androidx.activity.compose)
    implementation(libs.androidx.compose.runtime)
    testImplementation(libs.junit)
    androidTestImplementation(libs.junit.android)
    androidTestImplementation(libs.espresso)
}
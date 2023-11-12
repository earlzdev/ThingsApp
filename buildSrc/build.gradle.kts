plugins {
    `kotlin-dsl`
    `kotlin-dsl-precompiled-script-plugins`
}

repositories {
    google()
    mavenCentral()
}

dependencies {
//    implementation(libs.android.gradlePlugin)
//    implementation(libs.kotlin.gradlePlugin)

    implementation(kotlin("script-runtime"))
}
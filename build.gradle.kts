// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.jetbrains.kotlin.android) apply false
    alias(libs.plugins.android.library) apply false
    /*id("io.github.gradle-nexus.publish-plugin") version "1.1.0"*/
}
/*
apply {
    from("${rootDir}/scripts/publish-root.gradle")
}*/

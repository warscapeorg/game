pluginManagement {
    repositories {
        gradlePluginPortal()
        mavenLocal()
        google()
        maven { url = uri("https://plugins.gradle.org/m2/") }
        mavenCentral()
    }
    plugins {
        kotlin("multiplatform") version "1.7.20-Beta"
        id("com.soywiz.korge") version "3.0.0"
    }
}

dependencyResolutionManagement {
    repositories {
        google()
        mavenCentral()
        maven("https://jitpack.io")
        maven("https://maven.y9vad9.com")
    }
}

rootProject.name = "warscape"

includeBuild("build-logic/dependencies")
includeBuild("build-logic/configuration")

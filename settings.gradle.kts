println("gradle in root settings.gradle.kts - start")

rootProject.name = "my-project"

pluginManagement {
    println("gradle in root settings.gradle.kts - pluginManagement start")
    repositories {
        gradlePluginPortal()
    }
    includeBuild("./buildlogic")
    println("gradle in root settings.gradle.kts - pluginManagement end")
}


plugins {

}

dependencyResolutionManagement {
    println("gradle in root settings.gradle.kts - dependencyResolutionManagement start")
    repositories {
        mavenCentral()
    }
    includeBuild("./subproject")
    println("gradle in root settings.gradle.kts - dependencyResolutionManagement end")
}

include("business")
include("model")
include("app")

println("gradle in root settings.gradle.kts - end")

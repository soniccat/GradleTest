println("gradle in buildlogic settings.gradle.kts - start")

dependencyResolutionManagement {
    println("gradle in buildlogic settings.gradle.kts - dependencyResolutionManagement start")
    repositories {
        gradlePluginPortal()
    }
    println("gradle in buildlogic settings.gradle.kts - dependencyResolutionManagement end")
}

include("java-plugins")

println("gradle in buildlogic settings.gradle.kts - end")
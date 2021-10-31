println("gradle in business build.gradle.kts - start")

plugins {
    id("my-java-library")
}

dependencies {
    implementation(project(":model"))
    implementation("org.apache.commons:commons-lang3:3.9")
}

println("gradle in business build.gradle.kts - end")
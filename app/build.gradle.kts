println("gradle in app build.gradle.kts - start")

plugins {
    id("my-java-app")
}

myExtension {
//    fileName.set("myFileOut")
    println("gradle in app build.gradle.kts - myExtension start")
    dataToWrite.set("Hello Extension")
    println("gradle in app build.gradle.kts - myExtension end")

}

application {
    mainClass.set("MainKt")
}

dependencies {
    implementation(project(":business"))
}

println("gradle in app build.gradle.kts - end")
import tasks.MyExtension
import tasks.MyTask

println("gradle in my-java-base.gradle.kts - start")

plugins {
    kotlin("jvm")
    id("checkstyle")
}

val ex = extensions.create<MyExtension>("myExtension")
//ex.dataToWrite.set("abc2")

tasks.register<MyTask>("myTask") {
    println("gradle in my-java-base.gradle.kts - register-MyTask start")
    fileData.convention(ex.dataToWrite)
    outFile.set(layout.buildDirectory.file("myTaskOut.txt"))
    println("gradle in my-java-base.gradle.kts - register-MyTask end")
}

val myDisplayGroup = "my project build"
tasks.named<TaskReportTask>("tasks") {
    displayGroup = myDisplayGroup
}

tasks.build {
    group = myDisplayGroup
}

tasks.check {
    group = myDisplayGroup
}

tasks.register("qualityCheck") {
    group = myDisplayGroup
    description = "Awesome qualityCheck"
    dependsOn(tasks.classes, tasks.checkstyleMain)
}

java {
    toolchain.languageVersion.set(JavaLanguageVersion.of(11))
}

println("gradle in my-java-base.gradle.kts - end")
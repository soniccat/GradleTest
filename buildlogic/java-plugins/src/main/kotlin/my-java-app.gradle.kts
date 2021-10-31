println("gradle in my-java-app.gradle.kts - start")

plugins {
    id("application")
    id("my-java-base")
}

val myDisplayGroup = "my project build"

tasks.run {
    group = myDisplayGroup
}

tasks.register<Zip>("makeMyZip") {
    from(layout.projectDirectory) {
        into("appOut")
    }

    destinationDirectory.set(layout.projectDirectory.dir("outZip"))
    archiveFileName.set("myGreatZip.zip")
}

tasks.getByName("makeMyZip") {
    group = myDisplayGroup
    description = "make zip with app directory"
}

println("gradle in my-java-app.gradle.kts - end")
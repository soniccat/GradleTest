package tasks

import org.gradle.api.DefaultTask
import org.gradle.api.file.RegularFileProperty
import org.gradle.api.provider.Property
import org.gradle.api.tasks.Input
import org.gradle.api.tasks.OutputFile
import org.gradle.api.tasks.TaskAction

abstract class MyTask: DefaultTask() {
//    @get:Input
//    abstract var fileName: Property<String>

    @get:Input
    abstract val fileData: Property<String>

    @get:OutputFile
    abstract val outFile: RegularFileProperty

    @TaskAction
    fun run() {
        println("gradle in MyTask run - start")
        val out = outFile.get().asFile
        out.writeText(fileData.get())
        println("gradle in MyTask run - end")
    }
}


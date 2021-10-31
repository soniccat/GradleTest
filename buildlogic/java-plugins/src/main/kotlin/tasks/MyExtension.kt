package tasks

import org.gradle.api.provider.Property

interface MyExtension {
//    val fileName: Property<String>
    val dataToWrite: Property<String>
}
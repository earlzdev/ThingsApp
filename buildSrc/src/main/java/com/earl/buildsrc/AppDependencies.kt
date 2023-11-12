package com.earl.buildsrc

import org.gradle.api.artifacts.dsl.DependencyHandler

object AppDependencies {

    fun DependencyHandler.implementationProject(list: List<String>) {
        list.forEach { path ->
            add("implementation", project(mapOf("path" to path)))
        }
    }
}
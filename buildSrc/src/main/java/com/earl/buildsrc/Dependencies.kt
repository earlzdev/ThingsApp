package com.earl.buildsrc

import com.earl.buildsrc.AppDependencies.implementationProject
import org.gradle.kotlin.dsl.DependencyHandlerScope

object Dependencies {

    object AuthFeature {

        private val authModules = listOf(
            Modules.AUTH_NETWORKING_API
        )

        fun DependencyHandlerScope.authDependencies() {
            implementationProject(authModules)
        }
    }
}
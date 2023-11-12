pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "ThingsApp"
include(":app")
include(":features")
include(":features:auth")
include(":features:profile")
include(":features:things")
include(":data")
include(":data:networking")
include(":data:networking:auth-api")
include(":data:networking:networking-utils")
include(":data:database")
include(":data:datastore")
include(":data:networking:profile-api")
include(":core")
include(":core:design-system")

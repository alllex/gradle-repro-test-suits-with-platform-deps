rootProject.name = "reproducer-project"

dependencyResolutionManagement {
    versionCatalogs {
        create("libs") {
            fun lib(group: String, artifact: String, alias: String = artifact) = library(alias, group, artifact)
            val junit = version("junit5", "5.9.2")
            lib("org.junit", "junit-bom").versionRef(junit)
            lib("org.junit.jupiter", "junit-jupiter").versionRef(junit)
        }
    }
}
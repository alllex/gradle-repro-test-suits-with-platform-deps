plugins {
    java
}

repositories {
    mavenCentral()
}

java.toolchain.languageVersion = JavaLanguageVersion.of(17)

testing.suites {
    val test by getting(JvmTestSuite::class) {
        useJUnitJupiter()
        dependencies {
            implementation(platform(libs.junit.bom))
            implementation(libs.junit.jupiter)
        }
    }
}
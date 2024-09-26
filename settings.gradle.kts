rootProject.name = "manuscript"

include("manuscript-controller")
include("manuscript-service")
include("manuscript-repository")

pluginManagement {
    plugins {
        id("org.springframework.boot") version "3.3.4"
        id("io.spring.dependency-management") version "1.1.6"
    }

    repositories {
        mavenCentral()
    }
}
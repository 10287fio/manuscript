plugins {
    id("convention")
    alias(libs.plugins.springBoot)
    alias(libs.plugins.dependencyManagement)
}

group = "fragranceia.manuscript.controller"
version = "0.0.1"

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(21));
    }
}

dependencies {
    implementation(libs.springBootStarterWeb)
    compileOnly(libs.lombok)
    annotationProcessor(libs.lombok)
}
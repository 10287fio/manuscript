plugins {
    id("org.springframework.boot")
}

group = "fragranceia.manuscript.data"
version = "0.0.1"

dependencies {
    implementation("org.postgresql:postgresql")
    implementation("org.springframework.boot:spring-boot-starter-data-jpa")
}
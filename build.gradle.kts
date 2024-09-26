plugins {
    id("java")
    id("io.spring.dependency-management")
}

subprojects {
    apply(plugin = "java")
    apply(plugin = "io.spring.dependency-management")

    repositories {
        mavenCentral()
    }

    dependencyManagement {
        dependencies {
            dependency("org.springframework.boot:spring-boot-starter-web:3.3.4")
            dependency("org.projectlombok:lombok:1.18.34")
        }
    }

    dependencies{
        implementation("org.springframework.boot:spring-boot-starter-web")
        compileOnly("org.projectlombok:lombok")
        annotationProcessor("org.projectlombok:lombok")
    }
}

repositories {
    mavenCentral()
}
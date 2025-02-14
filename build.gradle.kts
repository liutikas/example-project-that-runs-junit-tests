 plugins {
    kotlin("jvm") version "2.0.21"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("junit:junit:4.13")
}

kotlin {
    jvmToolchain(21)
}

 tasks.withType<Test>().configureEach {
     reports.junitXml.required = true
 }

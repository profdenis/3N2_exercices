plugins {
    kotlin("jvm") version "2.0.0"
}

group = "denis.rinfret"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
    testImplementation("org.testng:testng:7.1.0")
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(21)
}
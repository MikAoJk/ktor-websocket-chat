import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

val ktor_version: String by project
val kotlin_version: String by project
val logback_version: String by project
val jvm_version: String by project
val junit_version: String by project

plugins {
    kotlin("jvm") version "2.1.20"
}

repositories {
    mavenCentral()
}

allprojects {
    group = "no.taule.kartveit"
    version = properties["version"] ?: "local-build"

    apply(plugin = "org.jetbrains.kotlin.jvm")

    repositories {
        mavenCentral()
    }

    dependencies {
        implementation("ch.qos.logback:logback-classic:$logback_version")

        testImplementation("io.ktor:ktor-server-tests-jvm:$ktor_version")
        testImplementation("org.junit.jupiter:junit-jupiter:$junit_version")
    }

    tasks {

        compileKotlin {
        kotlinOptions.jvmTarget = jvm_version.toString()
    }
        compileTestKotlin {
        kotlinOptions.jvmTarget = jvm_version.toString()
    }

    }

}

subprojects {
    apply(plugin = "org.jetbrains.kotlin.jvm")

    repositories {
        mavenCentral()
    }

    dependencies {
        implementation("ch.qos.logback:logback-classic:$logback_version")

        testImplementation("io.ktor:ktor-server-tests-jvm:$ktor_version")
        testImplementation("org.junit.jupiter:junit-jupiter:$junit_version")
    }

    tasks {
        test {
        useJUnitPlatform()
        testLogging {
            events("skipped", "failed")
            showStackTraces = true
            showExceptions = true
            showCauses = true
            exceptionFormat = org.gradle.api.tasks.testing.logging.TestExceptionFormat.FULL
        }
    }
    }
}

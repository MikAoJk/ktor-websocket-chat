import org.gradle.api.tasks.JavaExec
import org.gradle.kotlin.dsl.invoke
import org.gradle.kotlin.dsl.named

val ktor_version = "2.3.1"
val kotlin_version = "1.8.21"
val logback_version = "1.2.11"
val jvm_version = "17"

plugins {
    id("io.ktor.plugin") version "2.3.1"
    id("application")
    kotlin("jvm") version "1.8.21"
}

application {
    mainClass.set("no.taule.kartveit.ApplicationKt")
}

dependencies {
    implementation("io.ktor:ktor-client-core:$ktor_version")
    implementation("io.ktor:ktor-client-cio:$ktor_version")
    implementation("io.ktor:ktor-client-websockets:$ktor_version")
}

tasks {
    named<JavaExec>("run") {
        standardInput = System.`in`
    }
    register("prepareKotlinBuildScriptModel") {}

}
repositories {
    mavenCentral()
}
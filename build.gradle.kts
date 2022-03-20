val ktor_version: String by project
val kotlin_version: String by project
val logback_version: String by project
val kotest_version: String by project

plugins {
    application
    kotlin("jvm") version "1.6.10"
    id("org.jetbrains.kotlin.plugin.serialization") version "1.6.10"
    id("com.github.johnrengelman.shadow") version "7.0.0"
}

group = "markstanden.dev"
version = "0.0.1"
application {
    mainClass.set("io.ktor.server.cio.EngineMain")
}

repositories {
    mavenCentral()
    maven { url = uri("https://maven.pkg.jetbrains.space/public/p/ktor/eap") }
}

dependencies {
    implementation("io.ktor:ktor-server-core-jvm:$ktor_version")
    implementation("io.ktor:ktor-server-host-common-jvm:$ktor_version")
    implementation("io.ktor:ktor-server-content-negotiation-jvm:$ktor_version")
    implementation("io.ktor:ktor-serialization-kotlinx-json-jvm:$ktor_version")
    implementation("io.ktor:ktor-server-freemarker-jvm:$ktor_version")
    implementation("io.ktor:ktor-server-cio-jvm:$ktor_version")
    implementation("ch.qos.logback:logback-classic:$logback_version")
    testImplementation("io.ktor:ktor-server-tests-jvm:$ktor_version")
    testImplementation("org.jetbrains.kotlin:kotlin-test-junit:$kotlin_version")
    testImplementation("io.kotest:kotest-runner-junit5:$kotest_version")
    testImplementation ("io.kotest:kotest-assertions-core:$kotest_version")
    testImplementation ("io.kotest:kotest-property:$kotest_version")


}

tasks {
    shadowJar {
        manifest {
            attributes(Pair("Main-Class", "io.ktor.server.cio.EngineMain"))
        }
    }

    withType<Test>().configureEach {
        useJUnitPlatform()
    }
}
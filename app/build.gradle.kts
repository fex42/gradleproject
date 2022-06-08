val kotlin_version = "1.6.21"
val ktor_version = "2.0.2"
val logback_version = "1.2.11"
val KGraphQLVersion = "0.17.14"

plugins {
    application
    id("org.jetbrains.kotlin.jvm") version "1.6.21"
    kotlin("plugin.serialization").version("1.6.21")
}

repositories {
    // Use Maven Central for resolving dependencies.
    mavenCentral()
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8:$kotlin_version")
    implementation("io.ktor:ktor-server-core:$ktor_version")
    implementation("io.ktor:ktor-server-netty:$ktor_version")
    implementation("io.ktor:ktor-server-content-negotiation:$ktor_version")
    implementation("io.ktor:ktor-serialization-kotlinx-json:$ktor_version")
    implementation("io.ktor:ktor-server-method-override:$ktor_version")
    implementation("ch.qos.logback:logback-classic:$logback_version")
    testImplementation("io.ktor:ktor-server-test-host:$ktor_version")
    testImplementation("org.jetbrains.kotlin:kotlin-test-junit:$kotlin_version")

    implementation("org.jetbrains.exposed", "exposed-core", "0.38.1")
    implementation("org.jetbrains.exposed", "exposed-jdbc", "0.38.1")

    implementation("com.h2database:h2:1.4.200")

    implementation ("com.apurebase:kgraphql:$KGraphQLVersion")
}

application {
    // Define the main class for the application.
    mainClass.set("gradleproject.AppKt")
    applicationDefaultJvmArgs = listOf("-Dio.ktor.development=true")
}


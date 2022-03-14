package dev.markstanden

import dev.markstanden.plugins.configureRouting
import dev.markstanden.plugins.configureSecurity
import io.ktor.server.engine.*
import io.ktor.server.netty.*

fun main() {
    embeddedServer(Netty, port = System.getenv("PORT")?.toIntOrNull() ?: 8080, host = "0.0.0.0") {
        configureSecurity()
        configureRouting()
    }.start(wait = true)
}
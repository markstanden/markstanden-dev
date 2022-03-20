package dev.markstanden.restAPI

import dev.markstanden.restAPI.plugins.configureRouting
import dev.markstanden.restAPI.plugins.configureTemplating
import io.ktor.server.engine.*
import io.ktor.server.cio.*

fun main() {
    embeddedServer(CIO, port = 8080, host = "0.0.0.0") {
        configureRouting()
        configureTemplating()
    }.start(wait = true)
}
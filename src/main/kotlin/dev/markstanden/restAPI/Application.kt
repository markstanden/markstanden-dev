package dev.markstanden.restAPI

import dev.markstanden.restAPI.plugins.configureRouting
import dev.markstanden.restAPI.plugins.configureTemplating
import io.ktor.server.application.*

fun main(args: Array<String>): Unit =
    io.ktor.server.cio.EngineMain.main(args)

@Suppress("unused")
fun Application.module() {
    configureRouting()
    configureTemplating()
}
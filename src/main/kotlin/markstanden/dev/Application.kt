package markstanden.dev

import io.ktor.server.application.*
import markstanden.dev.plugins.configureRouting
import markstanden.dev.plugins.configureTemplating

fun main(args: Array<String>): Unit =
    io.ktor.server.netty.EngineMain.main(args)

@Suppress("unused")
fun Application.module() {
    configureRouting()
    configureTemplating()
}
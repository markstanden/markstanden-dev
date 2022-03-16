package markstanden.dev.plugins

import io.ktor.server.application.*
import io.ktor.server.http.content.*
import io.ktor.server.routing.*

fun Application.configureRouting() {

    routing {
        static("/static") { resources("/files") }
        static("/styles") { resources("/files/css") }
        static("/pages") { resources("/files/html") }
        static("/assets") { resources("/files/images") }
    }
}
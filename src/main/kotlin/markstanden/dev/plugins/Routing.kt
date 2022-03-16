package markstanden.dev.plugins

import io.ktor.server.application.*
import io.ktor.server.http.content.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Application.configureRouting() {

    routing {
        get("/") {
            call.respondRedirect("pages/home.html")
        }
        static("/static") { resources("/files") }
        static("/styles") { resources("/files/css") }
        static("/pages") { resources("/files/html") }
        static("/assets") { resources("/files/images") }
    }
}
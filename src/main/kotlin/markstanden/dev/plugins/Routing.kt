package markstanden.dev.plugins

import io.ktor.server.application.*
import io.ktor.server.http.content.*
import io.ktor.server.routing.*
import markstanden.dev.routes.homepageRouting

fun Application.configureRouting() {

    routing {
        static("/static") {
            files("/src/files")
        }
        static("/static/css") {
            files("/src/files/css")
        }

        homepageRouting()
    }


}
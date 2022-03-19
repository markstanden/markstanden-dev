package markstanden.dev.plugins

import io.ktor.server.application.*
import io.ktor.server.http.content.*
import io.ktor.server.routing.*
import markstanden.dev.routes.homepageRouting
import java.io.File

fun Application.configureRouting() {

    routing {
        static("/static") {
            resources("files")
        }

        static("/static") {
            staticRootFolder = File("/static")
            static("assets") {
                files("css")
                files("images")
            }
        }
        homepageRouting()
    }


}
package markstanden.dev.plugins

import io.ktor.server.application.*
import io.ktor.server.http.content.*
import io.ktor.server.routing.*
import markstanden.dev.routes.homepageRouting
import java.io.File

fun Application.configureRouting() {

    routing {
        static("static") {
            staticRootFolder = File("static")
            static("icons") {
                files("icons")
            }
            static("projects") {
                files("projects")
            }
            static("css") {
                files("css")
            }
        }
        homepageRouting()
    }


}
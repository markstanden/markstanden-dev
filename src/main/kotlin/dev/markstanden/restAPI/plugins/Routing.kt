package dev.markstanden.restAPI.plugins

import dev.markstanden.restAPI.routes.homepageRouting
import io.ktor.server.application.*
import io.ktor.server.http.content.*
import io.ktor.server.routing.*
import java.io.File

fun Application.configureRouting() {

    routing {
        static("/") {
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
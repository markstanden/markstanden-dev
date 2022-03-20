package dev.markstanden.restAPI.plugins

import dev.markstanden.restAPI.routes.homepageRouting
import dev.markstanden.restAPI.routes.staticRouting
import io.ktor.server.application.*
import io.ktor.server.routing.*

fun Application.configureRouting() {

    routing {
        homepageRouting()
        staticRouting()
    }


}
package dev.markstanden.restAPI.routes

import dev.markstanden.restAPI.models.languages
import dev.markstanden.restAPI.models.personalAttrs
import dev.markstanden.restAPI.models.projects
import io.ktor.server.application.*
import io.ktor.server.freemarker.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

class StaticRoutes {
    fun Route.homepageRouting() {
        route("/") {
            get {
                call.respond(FreeMarkerContent("homepage.ftl",
                                               mapOf("languages" to languages,
                                                     "attributes" to personalAttrs,
                                                     "projects" to projects)))
            }
        }
    }
}
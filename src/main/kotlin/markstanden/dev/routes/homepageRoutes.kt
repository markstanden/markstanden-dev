package markstanden.dev.routes

import io.ktor.server.application.*
import io.ktor.server.freemarker.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import markstanden.dev.models.languages
import markstanden.dev.models.personalAttrs
import markstanden.dev.models.projects

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
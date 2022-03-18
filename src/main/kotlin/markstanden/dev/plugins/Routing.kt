package markstanden.dev.plugins

import io.ktor.server.application.*
import io.ktor.server.freemarker.*
import io.ktor.server.http.content.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import markstanden.dev.models.languages
import markstanden.dev.models.projects
import markstanden.dev.routes.projectRouting

fun Application.configureRouting() {

    routing {
        get("/") {
            call.respond(FreeMarkerContent("homepage.ftl", mapOf("languages" to languages, "attributes" to markstanden.dev.models.attributes, "projects" to projects)))
        }
        static("/static") { resources("/files") }
        static("/styles") { resources("/files/css") }
        static("/pages") { resources("/files/html") }

        projectRouting()
    }
}
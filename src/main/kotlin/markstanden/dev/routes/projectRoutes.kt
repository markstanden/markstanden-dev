package markstanden.dev.routes

import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.freemarker.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import markstanden.dev.models.projects

fun Route.projectRouting() {
    route("/projects") {
        get {
            if (projects.isNotEmpty()) {
                call.respond(FreeMarkerContent("projects.ftl", mapOf("projects" to projects)))
            }
            else {
                call.respondText(status = HttpStatusCode.NoContent) { "No projects found" }
            }
        }
        get("{id}") {
            val id =
                call.parameters["id"] ?: return@get call.respondText(
                        status = HttpStatusCode.BadRequest) { "Missing or malformed Project ID" }
            val project =
                projects.find { it.id == id.toInt() } ?: return@get call.respondText(
                        status = HttpStatusCode.NotFound) { "No project with id: $id" }
            call.respond(project)
        }

        get("{id}/edit"){
            //edit
        }

        post("{id}"){
            //update/delete
        }
    }
}
package markstanden.dev.routes

import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import markstanden.dev.models.projects

fun Route.projectRouting() {
    route("/projects") {
        get {
            if (projects.isNotEmpty()) {
                call.respond(projects)
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
                        status = HttpStatusCode.NotFound) { "No Customer with id: $id" }
            call.respond(project)

        }
    }
}
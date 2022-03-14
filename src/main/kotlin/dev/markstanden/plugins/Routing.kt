package dev.markstanden.plugins

import io.ktor.server.application.*
import io.ktor.server.request.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import processFeedbackForm

fun Application.configureRouting() {

    routing {
        post("/api/feedback") {
            val formParameters = call.receiveParameters()
            val response = processFeedbackForm(formParameters)
            call.response.status()

            call.respondText(response)

            // reroute to feedback response
            // use js to insert response text.
        }
    }
}
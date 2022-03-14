package dev.markstanden.plugins

import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.auth.*
import io.ktor.server.html.*
import io.ktor.server.request.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import kotlinx.html.FormEncType
import kotlinx.html.FormMethod
import kotlinx.html.body
import kotlinx.html.form
import kotlinx.html.p
import kotlinx.html.passwordInput
import kotlinx.html.submitInput
import kotlinx.html.textInput
import processFeedbackForm

fun Application.configureRouting() {
    routing {
        get("/") {
            call.respondText { "OK" }
        }

        post("/feedback") {
            val formParameters = call.receiveParameters()
            val response = processFeedbackForm(formParameters)
            call.response.status(HttpStatusCode.OK)

            // reroute to feedback response
            // use js to insert response text.
        }
    }

    routing {
        authenticate("auth-form") {
            post("/protected/feedback") {
                call.response.status(HttpStatusCode.OK)
                call.respondText("Hello, ${call.principal<UserIdPrincipal>()?.name}!")
            }
        }

        get("/login") {
            call.respondHtml {
                body {
                    form(action = "/protected/feedback", encType = FormEncType.applicationXWwwFormUrlEncoded,
                         method = FormMethod.post) {
                        p {
                            +"Username:"
                            textInput(name = "name")
                        }
                        p {
                            +"Password:"
                            passwordInput(name = "password")
                        }
                        p {
                            submitInput { value = "Login" }
                        }
                    }
                }
            }
        }
    }
}
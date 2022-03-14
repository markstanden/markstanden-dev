package dev.markstanden.plugins

import io.ktor.server.application.*
import io.ktor.server.auth.*


fun Application.configureSecurity() {

    install(Authentication) {
        form("auth-form") {
            userParamName = "name"
            passwordParamName = "password"
            validate { credentials ->
                if (credentials.name == "mark" && credentials.password == "vfiheXDJS2oJyUyS6yFFPgnhJYVbx5pbAhrZiiihxVjSvrcRCgx") {
                    UserIdPrincipal(credentials.name)
                }
                else {
                    null
                }
            }
        }
    }

    /*routing {
        authenticate("auth-form") {
            post("/protected/feedback") {
                call.respondText("Hello, ${call.principal<UserIdPrincipal>()?.name}!")
            }
        }

        get("/") {
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
    }*/
}
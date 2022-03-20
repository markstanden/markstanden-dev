package dev.markstanden.restAPI.routes

import io.ktor.server.http.content.*
import io.ktor.server.routing.*
import java.io.File

fun Route.staticRouting() {
    staticRootFolder = File("static")
    static("icons") {
        files("icons")
    }
    static("projects") {
        files("projects")
    }
    static("styles") {
        files("styles")
    }
}
package dev.markstanden.restAPI

import dev.markstanden.restAPI.plugins.configureRouting
import io.ktor.server.routing.*
import io.ktor.http.*
import io.ktor.server.http.content.*
import freemarker.cache.*
import io.ktor.server.freemarker.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.request.*
import io.ktor.client.request.*
import io.ktor.client.statement.*
import kotlin.test.*
import io.ktor.server.testing.*
import markstanden.dev.plugins.*

class ApplicationTest {
    @Test
    fun testRoot() =
        testApplication {
            application {
                configureRouting()
            }
        }
}
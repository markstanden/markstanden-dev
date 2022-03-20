package dev.markstanden.restAPI

import dev.markstanden.restAPI.plugins.configureRouting
import dev.markstanden.restAPI.plugins.configureTemplating
import io.kotest.core.spec.style.AnnotationSpec
import io.ktor.client.request.*
import io.ktor.client.statement.*
import io.ktor.http.*
import io.ktor.server.testing.*
import kotlin.test.assertContains
import kotlin.test.assertEquals

class ApplicationTest : AnnotationSpec() {

    @Test
    fun testHomePage() =
        testApplication {
            application {
                configureRouting()
                configureTemplating()
            }
            client.get("/").apply {
                assertEquals(HttpStatusCode.OK, status)
                assertContains(bodyAsText(), "markstanden.dev")
                assertContains(bodyAsText(), "Programming language competency cards")
                assertContains(bodyAsText(), "Kotlin")
                assertContains(bodyAsText(), "Java")
                assertContains(bodyAsText(), "Personal attribute cards")
                assertContains(bodyAsText(), "Interesting Projects and Achievements.")
                bodyAsText().basePageTests()
            }
        }
}
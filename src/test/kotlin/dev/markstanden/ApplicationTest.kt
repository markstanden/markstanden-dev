import io.ktor.client.request.*
import io.ktor.client.statement.*
import io.ktor.http.*
import io.ktor.server.testing.*
import kotlin.test.Test
import kotlin.test.assertEquals

class ApplicationTest {
    @Test
    fun testPost() =
        testApplication {
            val response = client.post("/signup") {
                header(HttpHeaders.ContentType, ContentType.Application.FormUrlEncoded.toString())
                setBody(listOf("username" to "JetBrains", "email" to "example@jetbrains.com", "password" to "foobar",
                               "confirmation" to "foobar").formUrlEncode())
            }
            assertEquals("Thank you Testy McTest, I will be in contact shortly with a response.", response.bodyAsText())
        }
}
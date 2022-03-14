import io.ktor.http.*

fun processFeedbackForm(formData: Parameters): String {
    val name = formData["name"]
    return """
    Thank you $name, I will be in contact shortly with a response.
        """.trimIndent()
}
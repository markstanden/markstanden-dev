import io.ktor.http.*

fun processFeedbackForm(formData: Parameters): String {
    val name = formData["name"]
    return """
        <script>
            document.getElementsByClassName("contact-form-section")[0].innerHTML = "<div>Thank you $name, I will be in contact shortly with a response.</div>"
        </script>
        """.trimIndent()
}
package markstanden.dev.models

@kotlinx.serialization.Serializable
data class Language(
        val title: String, val body: String, val iconLink: String, val iconAlt: String, val colorClass: String,
)

val languages = listOf(
        Language(title = "Kotlin", iconAlt = "Kotlin Logo", iconLink = "/static/images/icons/kotlin.svg", body = """
                        Functional programming as a first concern, with a modern rapidly evolving syntax.
                        Kotlin is the perfect language I have been searching for.  I love using the functional first syntax and the simplified class declarations.  It has my favourite Java features without the downsides and verbosity.
                         I absolutely love developing in Kotlin!
                    """.trimIndent(), colorClass = "kotlin"
        ),

        Language(title = "Java", iconAlt = "Java steaming mug logo", iconLink = "/static/images/icons/java.svg",
                 body = """
                        I began reluctantly coding in Java as part of a degree module, but quickly began to enjoy the simplicity and benefits of coding in such an established language.  Reading books on the 'new' streams API and functional programming techniques fuelled a fire to develop more in an immutable, data flow style.  I think Java still has much to offer.
                    """.trimIndent(), colorClass = "java"
        ),

        Language(title = "C# .NET Core", iconAlt = "C-Sharp Icon", iconLink = "/static/images/icons/c-sharp-c.svg",
                 body = """
                        Functional programming using LINQ, emphasis on parallelism and multithreading,
                        using pure functions to produce a functional core and encapsulating IO operations,
                        to produce highly testable reliable code.
                    """.trimIndent(), colorClass = "cs"),

        Language(title = "TypeScript", iconAlt = "TypeScript TS Icon", iconLink = "/static/images/icons/ts.svg",
                 body = """
                        Typescript has been a game-changer for me, able to write type
                        safe code in an editing environment that helps you to succeed.
      
                        A few more build hoops to jump through, but the added security
                        of the type checking - in my opinion - more than makes up for this.
                    """.trimIndent(), colorClass = "ts"),

        Language(title = "JavaScript", iconAlt = "JavaScript JS Icon", iconLink = "/static/images/icons/js.svg",
                 body = """
                        <em>The</em>
                        programming language of the modern web.
                        Whilst I code primarily in Typescript,
                        I can read and write javascript as required.
                    """.trimIndent(), colorClass = "js"),

        Language(title = "HTML 5", iconAlt = "HTML 5 Shield Icon", iconLink = "/static/images/icons/html5.svg",
                 body = """
                        The structural web foundation. Standards-compliant code written in
                        HTML5 will stand the test of time, but I have also transferred
                        these skills to include JSX and templating.
                    """.trimIndent(), colorClass = "html"),

        Language(title = "CSS 3", iconAlt = "CSS 3 Shield Icon", iconLink = "/static/images/icons/css3.svg", body = """
                        Providing an outlet for my design skills, I have successfully produced
                        CSS and Sass(SCSS) and have experimented with CSS in JS frameworks, although
                        for the most tasks I prefer vanilla CSS using CSS custom properties (CSS variables)
                    """.trimIndent(), colorClass = "css"))
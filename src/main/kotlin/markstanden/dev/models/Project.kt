package markstanden.dev.models

class Project(
        val title: String, val body: String, val imageLink: String, val imageAlt: String,
        val hostLink: String, val hostIcon: String, val hostIconAlt: String, val srcLink: String, val srcIcon: String,
        val srcIconAlt: String,
)

val projects = listOf(
        Project(
                title = "Sudoku Verifier",
                body = """
                Written in Java, this started as a challenge to produce a verifier for a sudoku grid, supplied as a 2D array.
                It was quickly developed using unit testing to provide almost instantaneous feedback on the written functions.
                I decided to extend the project and wrote a web front end, with a backend http server that validates and sanitises requests.
                The app also builds the html internally, allowing for dynamic grid creation.""".trimIndent(),
                imageLink = "sudoku-verifier.png",
                imageAlt = "A screenshot of the sudoku verifier application, showing an unsolved sudoku puzzle.",
                hostLink = "https://sudoku-verifier.onrender.com/",
                hostIcon = "render.svg",
                hostIconAlt = "Application hosted on Render",
                srcLink = "https://github.com/markstanden/sudoku-verifier",
                srcIcon = "github.png",
                srcIconAlt = "Source code hosted on GitHub",
        ),

        Project(
                title = "markstanden.dev HomePage",
                body = """
               Initially written in HTML/CSS and hosted on netlify, my homepage has undergone a re-write in kotlin, with templating and a RESTful API backend for feedback and contact forms.
               """.trimIndent(),
                imageLink = "ms-dev.png",
                imageAlt = "A screenshot of the homepage header section",
                hostLink = "https://markstanden.dev/",
                hostIcon = "heroku.svg",
                hostIconAlt = "Application hosted on Heroku",
                srcLink = "https://github.com/markstanden/markstanden-dev",
                srcIcon = "github.png",
                srcIconAlt = "Source code hosted on GitHub",
        ))
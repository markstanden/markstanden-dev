package markstanden.dev.models

import java.util.concurrent.atomic.AtomicInteger

@kotlinx.serialization.Serializable
class Project
private constructor(
        val id: Int, val title: String, val body: String, val imageLink: String, val imageAlt: String,
        val hostLink: String, val hostIcon: String, val hostIconAlt: String, val srcLink: String, val srcIcon: String,
        val srcIconAlt: String,
) {
    companion object {
        private val idCounter = AtomicInteger()

        fun newProject(
                title: String, body: String,
                imageLink: String, imageAlt: String,
                hostLink: String, hostIcon: String, hostIconAlt: String,
                srcLink: String, srcIcon: String, srcIconAlt: String,
        ) =
            Project(idCounter.getAndIncrement(), title, body, imageLink, imageAlt, hostLink, hostIcon, hostIconAlt,
                    srcLink, srcIcon, srcIconAlt)
    }
}

val sudokuProject = Project.newProject(
        title = "Sudoku Verifier",
        body = """
                Written in Java, this started as a challenge to produce a verifier for a sudoku grid, supplied as a 2D array.
                It was quickly developed using unit testing to provide almost instantaneous feedback on the written functions.
                I decided to extend the project and wrote a web front end, with a backend http server that validates and sanitises requests.
                The app also builds the html internally, allowing for dynamic grid creation.""".trimMargin(),
        imageLink = "/static/images/projects/sudoku-verifier.png",
        imageAlt = "A screenshot of the sudoku verifier application, showing an unsolved sudoku puzzle.",
        hostLink = "https://sudoku-verifier.onrender.com/",
        hostIcon = "/static/images/icons/render.svg",
        hostIconAlt = "Application hosted on Render",
        srcLink = "https://github.com/markstanden/sudoku-verifier",
        srcIcon = "/static/images/icons/github.png",
        srcIconAlt = "Source code hosted on GitHub",
)

val homepageProject = Project.newProject(
        title = "markstanden.dev HomePage",
        body = """
               Initially written in HTML/CSS and hosted on netlify, my homepage has undergone a re-write in kotlin, with templating and a RESTful API backend for feedback and contact forms.
               """.trimMargin(),
        imageLink = "/static/images/projects/ms-dev.png",
        imageAlt = "A screenshot of the homepage header section",
        hostLink = "https://markstanden.dev/",
        hostIcon = "/static/images/icons/heroku.svg",
        hostIconAlt = "Application hosted on Heroku",
        srcLink = "https://github.com/markstanden/markstanden-dev",
        srcIcon = "/static/images/icons/github.png",
        srcIconAlt = "Source code hosted on GitHub",
)

val projects =
    listOf(sudokuProject, homepageProject)
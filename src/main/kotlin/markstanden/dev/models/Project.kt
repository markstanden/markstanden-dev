package markstanden.dev.models

import java.util.concurrent.atomic.AtomicInteger

val projects =
    listOf(Project.newProject(
            title = "Sudoku Verifier",
            body = """
                Written in Java, this started as a challenge to produce a verifier for a sudoku grid, supplied as a 2D array.
                It was quickly developed using unit testing to provide almost instantaneous feedback on the written functions.
                I decided to extend the project and wrote a web front end, with a backend http server that validates and sanitises requests.
                The app also builds the html internally, allowing for dynamic grid creation.""".trimMargin(),
            imageLink = "/static/images/projects/sudoku-verifier.png",
            imageAlt = "A screenshot of the sudoku verifier application, showing an unsolved sudoku puzzle.",
            hostLink = "https://sudoku-verifier.onrender.com/",
            srcLink = "https://github.com/markstanden/sudoku-verifier"
    ))

class Project
private constructor(
        val id: Int, val title: String, val body: String, val imageLink: String, val imageAlt: String,
        val hostLink: String, val srcLink: String,
) {
    companion object {
        private val idCounter = AtomicInteger()

        fun newProject(
                title: String, body: String, imageLink: String, imageAlt: String, hostLink: String, srcLink: String,
        ) =
            Project(idCounter.getAndIncrement(), title, body, imageLink, imageAlt, hostLink, srcLink)
    }
}
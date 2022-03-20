package dev.markstanden.restAPI.models

data class PersonalAttrs(val title: String, val body: String, val iconLink: String, val iconAlt: String)

val personalAttrs = listOf(
        PersonalAttrs(title = "Team Focused", iconLink = "printer.svg", iconAlt = "Printer!",
                      body = """
                Having been a team member for my entire working
                life, I am used to working in small teams with
                diverse strengths and weaknesses.
            
                Whilst often in a leading role within the team,
                I'm also happy to take a back-seat, taking instructions,
                constructively working to help the team perform well.
            """.trimIndent()),

        PersonalAttrs(title = "Motivated", iconLink = "printer.svg", iconAlt = "Printer!", body = """
            Highly motivated by personal challenges,
            and driven by the reward of a clean solution
            to a difficult problem.
            This is strengthened by being drilled within
            the military to stop and think first -
            planning a course of action before rushing in.
        """.trimIndent()),

        PersonalAttrs(title = "Cool Head", iconLink = "printer.svg", iconAlt = "Printer!", body = """
            Known for my patience and calm friendly manner, I
            am able to remain calm when others
            around me are losing control, often
            under intense time pressure.

            Unwavering when the "perfect"
            solution hits a stumbling block, and
            wise enough to know that the first
            solution was unlikely to be perfect.
        """.trimIndent()),

        PersonalAttrs(title = "Testing First", iconLink = "printer.svg", iconAlt = "Printer!",
                      body = """
            Small re-usable blocks of code minimise wastage,
            encouraging re-use where possible,
            as well as improving reliability, and team integration.
    
            This is basis of my approach to problem-solving
            - writing unit tests first, forcing me to analyse the
            problem as a whole before developing a disjointed solution.
            The tests allow for continuous refactoring and code improvements.
        """.trimIndent()),

        PersonalAttrs(title = "Functional Thinking", iconLink = "printer.svg", iconAlt = "Printer!",
                      body = """
        Avoiding the pitfalls and concurrency issues associated
        with mutating shared state, I work to minimise the
        effect of change within applications.
 
        This allows for greater concurrency, easier unit testing,
        and therefore a more solid reliable application overall.
    """.trimIndent()),

        PersonalAttrs(title = "Always Learning", iconLink = "printer.svg", iconAlt = "Printer!",
                      body = """
        Driven by the love of problem-solving, researching, learning new ways to overcome obstacles.
        Currently completing a computer science degree in my spare time, 
        and learning well beyond the scope of the course in areas of interest,
        such as functional programming, C# and Kotlin.
    """.trimIndent()))
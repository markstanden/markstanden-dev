<#-- @ftlvariable name="projects" type="kotlin.collections.List<dev.markstanden.models.Project>" -->
<#import  "_layout.ftl" as layout>
<#import  "_divider.ftl" as divider>
<#import  "_projectCards.ftl" as projectCards>

<@layout.general cssFile="home.css">
    <!-----------------------------------------
    |  Programming language competency cards   |
    ------------------------------------------->

    <section class="main-section code-section">
        <h2 class="main-section--title">
            Multiple Languages, one goal.
        </h2>

        <div class="code-language-cards-wrapper">

            <article class="code-section--card cs shadow">
                <section class="code-card-section--title-block">
                    <h3 class="code-card--title">C# .NET Core</h3>
                    <img alt="C-Sharp Icon"
                         class="code-image"
                         src="/static/images/icons/c-sharp-c.svg"
                    />
                </section>
                <section class="code-card-section--text">
                    <p class="code-card--text">
                        Functional programming using LINQ, emphasis on parallelism and multithreading, using pure
                        functions to produce a functional core and encapsulating IO operations, to produce highly
                        testable reliable code.
                    </p>
                </section>
            </article>

            <article class="code-section--card java shadow">
                <section class="code-card-section--title-block">
                    <h3 class="code-title">Java</h3>
                    <img
                            alt="Java steaming mug logo"
                            class="code-image"
                            src="/static/images/icons/java.svg"
                    />
                </section>
                <section class="code-card-section--text">
                    <p class="code-card--text">
                        Backend functionality, file handling, functional programming, streams api
                    </p>
                </section>
            </article>

            <article class="code-section--card ts shadow">
                <section class="code-card-section--title-block">
                    <h3 class="code-title">TypeScript</h3>
                    <img
                            alt="TypeScript TS Icon"
                            class="code-image"
                            src="/static/images/icons/ts.svg"
                    />
                </section>
                <section class="code-card-section--text">
                    <p>
                        Typescript has been a
                        game-changer for me, able to write
                        type safe code in an editing
                        environment that helps you to
                        succeed.
                    </p>
                    <p>
                        A few more build hoops to jump
                        through, but the added security
                        of the type checking - in my
                        opinion - more than makes up for
                        this.
                    </p>
                </section>
            </article>

            <article class="code-section--card js shadow">
                <section class="code-card-section--title-block">
                    <h3 class="code-title">JavaScript</h3>
                    <img alt="JavaScript Icon"
                         class="code-image"
                         src="/static/images/icons/js.svg"
                    />
                </section>
                <section class="code-card-section--text">
                    <p class="code-card--text">
                        <em>The</em>
                        programming language of the modern web.
                        Whilst I code primarily in Typescript,
                        I can read and write javascript as required.
                    </p>
                </section>
            </article>

            <article class="code-section--card html shadow">
                <section class="code-card-section--title-block">
                    <h3 class="code-card--title">HTML 5</h3>
                    <img
                            alt="HTML5 Icon"
                            class="code-image"
                            src="/static/images/icons/html5.svg"
                    />
                </section>
                <section class="code-card-section--text">
                    <p class="code-card--text">
                        The structural web foundation. Standards-compliant code written in
                        HTML5 will stand the test of time, but I have also transferred
                        these skills to include JSX and experiments with templating.
                    </p>
                </section>
            </article>

            <article class="code-section--card css shadow">
                <section class="code-card-section--title-block">
                    <h3 class="code-card--title">CSS 3</h3>
                    <img
                            alt="CSS3 Icon"
                            class="code-image"
                            src="/static/images/icons/css3.svg"
                    />
                </section>
                <section class="code-card-section--text">
                    <p class="code-card--text">
                        Providing a and
                        Sass(SCSS) and have experimented
                        with CSS in JS frameworks, although
                        for the most tasks I prefer vanilla
                        CSS using CSS custom properties (CSS
                        variables)
                    </p>
                </section>
            </article>
        </div>
    </section>

    <@divider.withButton>
        I'd love to hear more
    </@divider.withButton>


    <!-----------------------------------------
    |        Personal attribute cards          |
    ------------------------------------------->

    <section class="main-section card-section">
        <h2 class="main-section--title">
            Developing the process, not just apps.
        </h2>
        <div class="attribute-cards--wrapper">

            <article class="attribute-card shadow">
                <img alt="" src="/static/images/icons/printer.svg">
                <h3>Team Focused</h3>
                <p>
                    Having been a team member for my entire working
                    life, I am used to working in small teams with
                    diverse strengths and weaknesses.
                </p>
                <p>
                    Whilst often in a leading role within the team,
                    I'm also happy to take a back-seat, taking instructions,
                    constructively working to help the team perform well.
                </p>
            </article>

            <article class="attribute-card shadow">
                <img alt="" src="/static/images/icons/printer.svg">
                <h3>Motivated</h3>
                <p>
                    Highly motivated by personal challenges,
                    and driven by the reward of a clean solution
                    to a difficult problem.
                </p>
                <p>
                    This is strengthened by being drilled within
                    the military to stop and think first -
                    planning a course of action before rushing in.
                </p>

            </article>

            <article class="attribute-card shadow">
                <img alt="" src="/static/images/icons/printer.svg">
                <h3>Cool Head</h3>
                <p>
                    Known for my patience and calm friendly manner, I
                    am able to remain calm when others
                    around me are losing control, often
                    under intense time pressure.
                </p>
                <p>
                    Unwavering when the "perfect"
                    solution hits a stumbling block, and
                    wise enough to know that the first
                    solution was unlikely to be perfect.
                </p>
            </article>

            <article class="attribute-card shadow">
                <img alt="" src="/static/images/icons/printer.svg">
                <h3>Testing First</h3>
                <p>
                    Small re-usable blocks of code minimise wastage,
                    encouraging re-use where possible,
                    as well as improving reliability, and team integration.
                </p>
                <p>
                    This is basis of my approach to problem-solving
                    - writing unit tests first, forcing me to analyse the
                    problem as a whole before developing a disjointed solution.
                    The tests allow for continuous refactoring and code improvements.
                </p>
            </article>

            <article class="attribute-card shadow">
                <img alt="" src="/static/images/icons/printer.svg">
                <h3>Functional Thinking</h3>
                <p>
                    Avoiding the pitfalls and concurrency issues associated
                    with mutating shared state, I work to minimise the
                    effect of change within applications.
                </p>
                <p>
                    This allows for greater concurrency, easier unit testing,
                    and therefore a more solid reliable application overall.
                </p>
            </article>

            <article class="attribute-card shadow">
                <img alt="" src="/static/images/icons/printer.svg">
                <h3>Always learning</h3>
                <p>
                    Driven by the love of problem-solving,
                    researching, learning new
                    ways to overcome obstacles.
                </p>
                <p>
                    Currently completing a computer science degree in my spare
                    time, and learning well beyond the scope of the course in areas
                    of interest, such as functional programming, and C#.
                </p>
            </article>

        </div>
    </section>


    <@divider.withButton>
        Contact me
    </@divider.withButton>

    <@projectCards.cards projects/>

    <@divider.withButton>
        Contact me
    </@divider.withButton>

</@layout.general>
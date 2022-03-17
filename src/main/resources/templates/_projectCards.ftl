<#macro cards projects>
    <!-----------------------------------------
    |  Interesting Projects and Achievements.  |
    ------------------------------------------->

    <section class="main-section project-section">
        <h2 class="main-section--title">
            Maintainable, tested code,
            written with care and attention to detail.
        </h2>
        <div class="project-cards--wrapper">

            <#list projects?reverse as project>
                <article class="project-card shadow">
                    <section class="project-card--title">
                        <h3>${project.title}</h3>
                    </section>
                    <section class="project-card--desc">
                        <img alt="${project.imageAlt}"
                             src="${project.imageLink}">
                        <p>
                            ${project.body}
                        </p>
                    </section>
                    <section class="project-card--source-links">
                        <a class="button--secondary button--project as-button shadow"
                           href="${project.hostLink}">
                            <img src="${project.hostIcon}"
                                 alt="${project.hostIconAlt}"/>
                            <p>View Application</p>
                        </a>
                        <a class="button--secondary button--project as-button shadow"
                           href="${project.srcLink}">
                            <img src="${project.srcIcon}"
                                 alt="${project.srcIconAlt}"/>
                            <p>View Source Code</p>
                        </a>
                    </section>
                </article>
            </#list>

        </div>
    </section>

</#macro>


<#-- @ftlvariable name="projects" type="kotlin.collections.List<dev.markstanden.models.Project>" -->
<@cards projects/>
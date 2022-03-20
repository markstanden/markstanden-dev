<#-- @ftlvariable name="languages" type="kotlin.collections.List<dev.markstanden.models.Language>" -->
<#macro cards languages>

    <!-----------------------------------------
   |  Programming language competency cards   |
   ------------------------------------------->

    <section class="main-section code-section">
        <h2 class="main-section--title">
            Multiple Languages, one goal.
        </h2>

        <div class="code-language-cards-wrapper">

            <#list languages as language>

                <article class="code-section--card ${language.colorClass} shadow">
                    <section class="code-card-section--title-block">
                        <h3 class="code-card--title">${language.title}</h3>
                        <img alt="${language.iconAlt}"
                             class="code-image"
                             src="/icons/${language.iconLink}"
                        />
                    </section>
                    <section class="code-card-section--text">
                        <p class="code-card--text">
                            ${language.body}
                        </p>
                    </section>
                </article>

            </#list>

        </div>
    </section>

</#macro>

<@cards languages/>
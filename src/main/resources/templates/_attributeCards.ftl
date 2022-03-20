<#-- @ftlvariable name="attributes" type="kotlin.collections.List<dev.markstanden.models.Attribute>" -->

<#macro cards attributes>

    <!-----------------------------------------
    |        Personal attribute cards          |
    ------------------------------------------->

    <section class="main-section card-section">
        <h2 class="main-section--title">
            Developing the process, not just apps.
        </h2>
        <div class="attribute-cards--wrapper">

            <#list attributes as attribute>
                <article class="attribute-card shadow">
                    <img alt="${attribute.iconAlt}" src="/icons/${attribute.iconLink}">
                    <h3>${attribute.title}</h3>
                    <p>
                        ${attribute.body}
                    </p>
                </article>
            </#list>

        </div>
    </section>
</#macro>

<@cards attributes/>
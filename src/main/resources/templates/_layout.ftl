<#import "_head.ftl" as head>
<#import "_header.ftl" as header>
<#import "_footer.ftl" as footer>

<#macro general pageTitle="markstanden.dev" cssFile="global.css">
    <!DOCTYPE html>
    <html lang="en">

    <@head.main pageTitle "${cssFile}"/>

    <body>

        <@header.header/>

    <main class="main-wrapper">

        <#nested/>

    </main>

        <@footer.footer/>

    </body>
    </html>
</#macro>
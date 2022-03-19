<#macro main pageTitle cssFilePath>
    <head>
        <meta charset="UTF-8"/>
        <meta
                content="width=device-width, initial-scale=1.0"
                name="viewport"
        />
        <title>${pageTitle}</title>
        <link href="/static/css/global.css" rel="stylesheet"/>
        <link href="${cssFilePath}" rel="stylesheet"/>
    </head>
</#macro>
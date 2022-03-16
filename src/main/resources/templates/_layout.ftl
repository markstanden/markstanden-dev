<#macro header>
    <!DOCTYPE html>
    <html lang="en">
    <head>
        <meta charset="UTF-8"/>
        <meta
                content="width=device-width, initial-scale=1.0"
                name="viewport"
        />
        <title>markstanden.dev - Freelance development</title>
        <link href="/styles/home.css" rel="stylesheet"/>
    </head>

    <body>
    <header>
        <div class="logo">
            <a href="/pages/contact.html">
                <div class="logo-title">
                    <h1>markstanden.dev</h1>
                    <span>Contact</span>
                </div>
            </a>
            <p>think twice code once.</p>
        </div>
        <nav class="nav-link-group">
            <a class="nav-item nav-item--current" href="/pages/home.html">
                <span class="nav-text">Home</span>
            </a>
            <a class="nav-item nav-item--primary" href="/pages/contact.html">
                <span class="nav-text">Contact</span>
            </a>
            <a class="nav-item" href="/pages/feedback.html">
                <span class="nav-text">Feedback</span>
            </a>
            <a class="nav-item" href="https://if-interested.com">
                <span class="nav-text">Blog</span>
            </a>
            <a class="nav-item" href="https://github.com/markstanden">
                <span class="nav-text">GitHub</span>
            </a>
        </nav>
    </header>


    <main class="main-wrapper">


        <#nested>


    </main>


    <footer>
        <h2>Other Links</h2>
        <ul>
            <li><a href="https://github.com/markstanden">Github</a></li>
            <li><a href="https://if-interested.com">Development Blog</a></li>
            <li><a href="https://aboutme.markstanden.dev">more about me...</a></li>
        </ul>
    </footer>


    </body>
    </html>
</#macro>
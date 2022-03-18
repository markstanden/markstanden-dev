<#-- @ftlvariable name="projects" type="kotlin.collections.List<dev.markstanden.models.Project>" -->

<#import  "_layout.ftl" as layout>
<#import  "_projectCards.ftl" as projectCards>

<@layout.general pageTitle="markstanden.dev projects" cssFile="home.css">

    <@projectCards.cards projects/>

</@layout.general>
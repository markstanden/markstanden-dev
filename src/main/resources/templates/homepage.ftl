<#-- @ftlvariable name="languages" type="kotlin.collections.List<dev.markstanden.models.Language>" -->
<#-- @ftlvariable name="attributes" type="kotlin.collections.List<dev.markstanden.models.Attribute>" -->
<#-- @ftlvariable name="projects" type="kotlin.collections.List<dev.markstanden.models.Project>" -->

<#import  "_layout.ftl" as layout>
<#import  "_divider.ftl" as divider>
<#import  "_languageCards.ftl" as languageCards>
<#import  "_attributeCards.ftl" as attributeCards>
<#import  "_projectCards.ftl" as projectCards>

<@layout.general cssFile="home.css">

    <@languageCards.cards languages/>

    <@divider.withButton>
        I'd love to hear more
    </@divider.withButton>

    <@attributeCards.cards attributes/>

    <@divider.withButton>
        Contact me
    </@divider.withButton>

    <@projectCards.cards projects/>

    <@divider.withButton>
        Contact me
    </@divider.withButton>

</@layout.general>
package com.example.detektcustomrules

import io.gitlab.arturbosch.detekt.api.Config
import io.gitlab.arturbosch.detekt.api.Debt
import io.gitlab.arturbosch.detekt.api.Issue
import io.gitlab.arturbosch.detekt.api.Rule
import io.gitlab.arturbosch.detekt.api.Severity
import org.jetbrains.kotlin.psi.KtBlockStringTemplateEntry
import org.jetbrains.kotlin.psi.KtEscapeStringTemplateEntry
import org.jetbrains.kotlin.psi.KtLiteralStringTemplateEntry
import org.jetbrains.kotlin.psi.KtSimpleNameStringTemplateEntry

class HardcodedString(config: Config): Rule(config) {
    override val issue: Issue
        get() = Issue(javaClass.simpleName, Severity.Minor, "This rule is used to detect hardcoded strings", Debt.FIVE_MINS)

//    override fun visitLiteralStringTemplateEntry(entry: KtLiteralStringTemplateEntry) {
//        println(entry.text)
//    }

//    override fun visitSimpleNameStringTemplateEntry(entry: KtSimpleNameStringTemplateEntry) {
//        println(entry.text)
//    }

//    override fun visitBlockStringTemplateEntry(entry: KtBlockStringTemplateEntry) {
//        println(entry.text)
//    }

    override fun visitEscapeStringTemplateEntry(entry: KtEscapeStringTemplateEntry) {
        println(entry.text)
    }
}
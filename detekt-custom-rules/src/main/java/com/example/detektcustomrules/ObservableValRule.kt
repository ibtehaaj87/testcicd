package com.example.detektcustomrules

import io.gitlab.arturbosch.detekt.api.CodeSmell
import io.gitlab.arturbosch.detekt.api.Config
import io.gitlab.arturbosch.detekt.api.Debt
import io.gitlab.arturbosch.detekt.api.Entity
import io.gitlab.arturbosch.detekt.api.Issue
import io.gitlab.arturbosch.detekt.api.Rule
import io.gitlab.arturbosch.detekt.api.Severity
import org.jetbrains.kotlin.psi.KtProperty

class ObservableValRule(config: Config): Rule(config) {
    override val issue: Issue
        get() = Issue(javaClass.simpleName, Severity.Minor, "This rule is for detecting hardcoded string", Debt.FIVE_MINS)

    override fun visitProperty(property: KtProperty) {
        val containsVar = property.text.contains("var", true)
        val containsObservable = property.text.contains("Observable", true)
        val containsStateFlow = property.text.contains("StateFlow", true)
        val containsLiveData = property.text.contains("LiveData", true)
        if (
            (containsVar && (containsObservable ||
                    containsStateFlow ||
                    containsLiveData))
        ) {
            report(
                CodeSmell(
                    issue,
                    Entity.from(property),
                    "Observable, StateFlow or LiveData value should not be var. They should be val."
                )
            )
        }
    }

}
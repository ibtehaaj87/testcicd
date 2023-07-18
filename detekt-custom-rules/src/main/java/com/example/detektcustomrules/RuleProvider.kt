package com.example.detektcustomrules

import io.gitlab.arturbosch.detekt.api.Config
import io.gitlab.arturbosch.detekt.api.RuleSet
import io.gitlab.arturbosch.detekt.api.RuleSetProvider

class RuleProvider: RuleSetProvider {
    override val ruleSetId: String
        get() = "custom-rules"

    override fun instance(config: Config): RuleSet {
        return RuleSet(ruleSetId, listOf(ObservableValRule(config), HardcodedString(config)))
    }
}
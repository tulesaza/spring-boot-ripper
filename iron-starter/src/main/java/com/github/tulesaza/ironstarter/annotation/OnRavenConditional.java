package com.github.tulesaza.ironstarter.annotation;

import org.springframework.boot.autoconfigure.condition.AllNestedConditions;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Condition;

import static org.springframework.context.annotation.ConfigurationCondition.ConfigurationPhase.REGISTER_BEAN;

public class OnRavenConditional extends AllNestedConditions {
    public OnRavenConditional() {
        super(REGISTER_BEAN);
    }

    @ConditionalOnProperty("raven.destination")
    static class OnDestinationCondition {
    }

    @ConditionalOnProperty(value = "raven.enabled")
    static class OnEnabledCondition {
    }

}

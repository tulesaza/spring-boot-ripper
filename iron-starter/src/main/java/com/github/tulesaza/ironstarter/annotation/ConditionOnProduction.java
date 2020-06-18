package com.github.tulesaza.ironstarter.annotation;

import org.springframework.context.annotation.Conditional;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@Conditional({OnProductionConditional.class})
public @interface ConditionOnProduction {
}

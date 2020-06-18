package com.github.tulesaza.ironstarter.annotation;

import org.springframework.context.annotation.Conditional;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Retention(RUNTIME)
@Conditional({OnRavenConditional.class})
public @interface ConditionalOnRaven {
}

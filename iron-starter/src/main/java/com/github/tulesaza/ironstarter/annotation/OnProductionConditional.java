package com.github.tulesaza.ironstarter.annotation;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

import javax.swing.*;

public class OnProductionConditional implements Condition {

    static String answer;

    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        if (answer == null) {
            answer = JOptionPane.showInputDialog("is it production?");
        }
        return answer.toLowerCase().contains("yes");
    }

}

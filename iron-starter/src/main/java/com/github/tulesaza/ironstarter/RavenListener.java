package com.github.tulesaza.ironstarter;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;

import java.util.List;

@RequiredArgsConstructor
public class RavenListener implements ApplicationListener<ContextRefreshedEvent> {

    private final RavenProperties ravenProperties;

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        ravenProperties.getDestination().forEach(s -> {
            System.out.println("Raven is sent to " + s);
        });
    }
}

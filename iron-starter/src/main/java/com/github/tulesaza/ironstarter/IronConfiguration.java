package com.github.tulesaza.ironstarter;


import com.github.tulesaza.ironstarter.annotation.ConditionOnProduction;
import com.github.tulesaza.ironstarter.annotation.ConditionalOnRaven;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(RavenProperties.class)
public class IronConfiguration {

    @Bean
    @ConditionOnProduction
    //@ConditionalOnProperty("raven.destination") when we trying to creatre @ConditionalOnProperty("raven.on") it won't work. Not repeatable
    //That's why condition below
    @ConditionalOnRaven
    @ConditionalOnMissingBean
    public RavenListener ravenListener(RavenProperties properties){
        return new RavenListener(properties);
    }
}

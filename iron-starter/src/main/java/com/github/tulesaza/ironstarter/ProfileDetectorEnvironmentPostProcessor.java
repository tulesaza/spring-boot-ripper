package com.github.tulesaza.ironstarter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.env.EnvironmentPostProcessor;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.Environment;

public class ProfileDetectorEnvironmentPostProcessor implements EnvironmentPostProcessor {
    @Override
    public void postProcessEnvironment(ConfigurableEnvironment environment, SpringApplication application) {
        if(environment.getActiveProfiles().length == 0 && getTemperature() < -272 ){
            environment.setActiveProfiles("winterHere");
        }
        else {
            environment.setActiveProfiles("winterComing");
        }
    }

    private int getTemperature(){
        return -300;
    }
}

package com.github.tulesaza.ironbank.service;


import com.github.tulesaza.ironbank.ProfileConstants;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.concurrent.ThreadLocalRandom;

@Service
@Profile(ProfileConstants.WINTER_COMING)
public class NameBasedProphetService implements ProphetService {
    @Override
    public boolean willSurvive(String name) {
        return !name.contains("Stark") && ThreadLocalRandom.current().nextBoolean();
    }
}

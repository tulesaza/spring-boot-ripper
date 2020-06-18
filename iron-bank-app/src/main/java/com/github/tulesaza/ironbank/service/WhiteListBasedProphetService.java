package com.github.tulesaza.ironbank.service;

import com.github.tulesaza.ironbank.ProfileConstants;
import com.github.tulesaza.ironbank.config.props.ProphetProperties;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile(ProfileConstants.WINTER_HERE)
@RequiredArgsConstructor
public class WhiteListBasedProphetService implements ProphetService {
    private final ProphetProperties prophetProperties;

    @Override
    public boolean willSurvive(String name) {
        return prophetProperties.getThoseWhoRepayDebts().contains(name);
    }
}

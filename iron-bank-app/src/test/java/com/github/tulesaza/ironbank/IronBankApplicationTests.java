package com.github.tulesaza.ironbank;

import com.github.tulesaza.ironbank.config.props.ProphetProperties;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Profile;
import org.springframework.test.context.ActiveProfiles;


@SpringBootTest(classes = {ProphetProperties.class})
@ActiveProfiles("test")
@EnableConfigurationProperties(ProphetProperties.class)
class IronBankApplicationTests {

    @Autowired
    ProphetProperties prophetProperties;

    @Test
    void contextLoads() {

        assert prophetProperties.getThoseWhoRepayDebts().contains("Ланистеры");
    }

}

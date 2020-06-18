package com.github.tulesaza.ironbank.config.props;


import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConstructorBinding;

import java.util.List;

@Data
@ConstructorBinding
@ConfigurationProperties("ironbank")
public class ProphetProperties {
    List<String> thoseWhoRepayDebts;
    int a;
}
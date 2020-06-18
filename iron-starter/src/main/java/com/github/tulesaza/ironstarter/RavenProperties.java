package com.github.tulesaza.ironstarter;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.List;

@Data
@ConfigurationProperties("raven")
public class RavenProperties {
    List<String> destination;
    boolean enabled;

}

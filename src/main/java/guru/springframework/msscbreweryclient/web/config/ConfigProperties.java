package guru.springframework.msscbreweryclient.web.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import lombok.Getter;
import lombok.Setter;

@Configuration
@ConfigurationProperties(prefix = "sfg.brewery")
@Getter
@Setter
public class ConfigProperties
{
    private Integer maxTotalConnections;
    private Integer defaultMaxConnectionsPerRoute;
    private Integer connectionRequestTimeout;
    private Integer socketTimeout;
    private String apihost;
}

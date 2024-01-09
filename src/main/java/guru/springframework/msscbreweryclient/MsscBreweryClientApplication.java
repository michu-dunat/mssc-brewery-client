package guru.springframework.msscbreweryclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import guru.springframework.msscbreweryclient.web.config.ConfigProperties;

@SpringBootApplication
@EnableConfigurationProperties(ConfigProperties.class)
public class MsscBreweryClientApplication
{

    public static void main(String[] args)
    {
        SpringApplication.run(MsscBreweryClientApplication.class, args);
    }

}

package io.pturczyk.speed.config;

import io.pturczyk.speed.generated.SpeedApplication;
import io.pturczyk.speed.generated.SpeedApplicationBuilder;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import static com.speedment.runtime.core.ApplicationBuilder.LogType.STREAM;

@Configuration
public class SpeedmentConfiguration {
    @Value("${jdbcUser:postgres}")
    private String user;

    @Value("${jdbcPassword}")
    private String password;

    @Value("${host:localhost}")
    private String host;


    @Bean(destroyMethod = "close")
    public SpeedApplication speedApplication() {
        return new SpeedApplicationBuilder()
                .withUsername(user)
                .withPassword(password)
                .withIpAddress(host)
                .withLogging(STREAM)
                .build();
    }
}

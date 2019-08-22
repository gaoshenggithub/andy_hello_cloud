package cn.andy.config;

import feign.Contract;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UserConfiguration {
    @Bean
    public Contract contract() {
        return new feign.Contract.Default();
    }
}

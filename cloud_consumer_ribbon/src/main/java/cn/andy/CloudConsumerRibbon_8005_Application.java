package cn.andy;

import cn.andy.config.DefaultRibbonConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
@RibbonClient(value = "CLOUD_PROVIDER", configuration = DefaultRibbonConfig.class)
public class CloudConsumerRibbon_8005_Application {
    public static void main(String[] args) {
        SpringApplication.run(CloudConsumerRibbon_8005_Application.class);
    }

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}

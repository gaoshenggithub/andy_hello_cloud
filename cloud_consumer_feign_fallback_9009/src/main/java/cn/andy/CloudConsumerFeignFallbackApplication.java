package cn.andy;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableCircuitBreaker
@EnableDiscoveryClient
@EnableFeignClients
@EnableEurekaClient
public class CloudConsumerFeignFallbackApplication {
    public static void main(String[] args) {
        SpringApplication.run(CloudConsumerFeignFallbackApplication.class);
    }
}

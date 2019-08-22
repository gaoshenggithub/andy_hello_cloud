package cn.andy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

@SpringBootApplication
@EnableTurbine
@EnableEurekaClient
@EnableDiscoveryClient
public class CloudTurbineComplexApplication {
    public static void main(String[] args) {
        SpringApplication.run(CloudTurbineComplexApplication.class);
    }
}
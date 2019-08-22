package cn.andy.controller;


import cn.andy.model.User;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@RestController
public class UserController {

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping
    @HystrixCommand(fallbackMethod = "errorList", commandProperties = {
            @HystrixProperty(name = "execution.isolation.strategy", value = "SEMAPHORE")})
    public List<User> getList() {
        return restTemplate.getForObject("http://localhost:8000/getList", List.class);
    }

    public List<User> errorList() {
        return new ArrayList<User>() {{
            add(new User().setId(UUID.randomUUID().toString()).setLastName("A").setDate(LocalDate.MAX));
        }};
    }
}

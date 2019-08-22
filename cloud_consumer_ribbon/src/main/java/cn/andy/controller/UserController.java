package cn.andy.controller;

import cn.andy.model.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Slf4j
@RestController
public class UserController {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private LoadBalancerClient loadBalancer;

    @RequestMapping("/getList")
    public List getList() {
        ServiceInstance instance = loadBalancer.choose("CLOUD_PROVIDER");
        log.info("http://" + instance.getHost() + ":" + instance.getPort() + "/getList");
        return restTemplate.getForObject("http://" + instance.getHost() + ":" + instance.getPort() + "/getList", List.class);
    }

    @RequestMapping("/getTest")
    public User getTest() {
        ServiceInstance instance = loadBalancer.choose("CLOUD_PROVIDER");
        log.info(instance.getHost() + "====>" + instance.getPort());
        return new User();
    }
}

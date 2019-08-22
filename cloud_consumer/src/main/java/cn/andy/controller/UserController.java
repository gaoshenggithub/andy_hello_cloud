package cn.andy.controller;

import cn.andy.model.User;
import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.EurekaClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private RestTemplate restTemplate;

    String url = "http://localhost:8000/";

    @Autowired
    private DiscoveryClient discoveryClient;

    @Autowired
    private EurekaClient eurekaClient;

    @GetMapping("/getList")
    public List<User> getList() {
        return restTemplate.getForObject(url + "getList", List.class);
    }

    @GetMapping("/getUser/{id}")
    public User getUser(@PathVariable("id") String id) {
        return restTemplate.getForObject(url + "getUser/" + id, User.class, id);
    }

    @GetMapping("/getListEurekaClient")
    public List<User> getListEurekaClient() {
        InstanceInfo instanceInfo = eurekaClient.getNextServerFromEureka("CLOUD_PROVIDER", false);
        String homePageUrl = instanceInfo.getHomePageUrl();
        return restTemplate.getForObject(homePageUrl + "getList", List.class);
    }

    @GetMapping("/getDiscoveryClient")
    public List<ServiceInstance> getInstance() {
        return discoveryClient.getInstances("CLOUD_PROVIDER");
    }
}

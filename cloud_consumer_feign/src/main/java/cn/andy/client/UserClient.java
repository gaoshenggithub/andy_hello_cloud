package cn.andy.client;

import cn.andy.model.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "CLOUD-PROVIDER")
public interface UserClient {

    @GetMapping("/getList")
    List<User> getList();

    @GetMapping("/getUser/{id}")
    User getUser(@PathVariable("id") String id);
}

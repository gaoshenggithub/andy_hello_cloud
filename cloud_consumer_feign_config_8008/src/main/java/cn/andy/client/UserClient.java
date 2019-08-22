package cn.andy.client;

import cn.andy.config.UserConfiguration;
import cn.andy.model.User;
import feign.RequestLine;
import org.springframework.cloud.openfeign.FeignClient;

import java.util.List;

@FeignClient(name = "CLOUD-PROVIDER", configuration = UserConfiguration.class)
public interface UserClient {

    @RequestLine("GET /getList")
    List<User> getList();
}

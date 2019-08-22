package cn.andy.client;

import cn.andy.model.User;
import feign.Param;
import feign.RequestLine;
import org.springframework.cloud.openfeign.FeignClient;

import java.util.List;

@FeignClient(name = "CLOUD-PROVIDER", fallback = UserFallback.class)
public interface UserClient001 {

    @RequestLine("GET /getList")
    List<User> getList();

    @RequestLine("GET /getUser/{id}")
    User getUser(@Param("id") String id);
}

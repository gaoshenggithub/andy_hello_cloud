package cn.andy.client;

import cn.andy.model.Sys;
import feign.RequestLine;
import org.springframework.cloud.openfeign.FeignClient;

import java.util.List;

@FeignClient(name = "CLOUD-PROVIDER-7999")
public interface SysClient {
    @RequestLine("GET /getSys")
    Sys getSys();

    @RequestLine("GET /getSysList")
    List<Sys> getSysList();
}

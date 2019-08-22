package cn.andy.controller;

import cn.andy.client.SysClient;
import cn.andy.model.Sys;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SysController {

    @Autowired
    private SysClient sysClient;

    @GetMapping("/getSys")
    public Sys getSys() {
        return sysClient.getSys();
    }

    @GetMapping("/getSysList")
    public List<Sys> getSysList() {
        return sysClient.getSysList();
    }
}

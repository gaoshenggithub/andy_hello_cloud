package cn.andy.controller;

import cn.andy.client.SysClient001;
import cn.andy.model.Sys;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SysController {

    @Autowired
    private SysClient001 sysClient001;

    @GetMapping("/getSys")
    public Sys getSys() {
        return sysClient001.getSys();
    }

    @GetMapping("/getSysList")
    public List<Sys> getSysList() {
        return sysClient001.getSysList();
    }
}

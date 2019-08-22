package cn.andy.controller;

import cn.andy.model.Sys;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@RestController
public class SysController {
    @GetMapping("/getSysList")
    public List<Sys> getSysList() {
        return new ArrayList<Sys>() {{
            add(new Sys().setId(UUID.randomUUID().toString()).setNumber(UUID.randomUUID().toString()).setPassword(UUID.randomUUID().toString()));
            add(new Sys().setId(UUID.randomUUID().toString()).setNumber(UUID.randomUUID().toString()).setPassword(UUID.randomUUID().toString()));
            add(new Sys().setId(UUID.randomUUID().toString()).setNumber(UUID.randomUUID().toString()).setPassword(UUID.randomUUID().toString()));
            add(new Sys().setId(UUID.randomUUID().toString()).setNumber(UUID.randomUUID().toString()).setPassword(UUID.randomUUID().toString()));
        }};
    }

    @GetMapping("/getSys")
    public Sys getSys() {
        return new Sys().setId(UUID.randomUUID().toString()).setNumber(UUID.randomUUID().toString()).setPassword(UUID.randomUUID().toString());
    }
}

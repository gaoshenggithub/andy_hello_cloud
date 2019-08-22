package cn.andy.controller;


import cn.andy.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@RestController
public class UserController {


    @GetMapping("/getList")
    public List<User> getList() {
        List<User> list = new ArrayList<User>() {{
            add(new User().setId(UUID.randomUUID().toString()).setDate(LocalDate.now()).setLastName("A"));
            add(new User().setId(UUID.randomUUID().toString()).setDate(LocalDate.now().plusDays(1)).setLastName("B"));
            add(new User().setId(UUID.randomUUID().toString()).setDate(LocalDate.now().plusDays(2)).setLastName("D"));
            add(new User().setId(UUID.randomUUID().toString()).setDate(LocalDate.now().plusDays(3)).setLastName("E"));
            add(new User().setId(UUID.randomUUID().toString()).setDate(LocalDate.now().plusDays(4)).setLastName("F"));
        }};
        return list;
    }

    @GetMapping("/getUser/{id}")
    public User getUser(@PathVariable("id") String id) {
        return new User().setId(UUID.randomUUID().toString()).setDate(LocalDate.now().plusDays(1)).setLastName(id);
    }
}

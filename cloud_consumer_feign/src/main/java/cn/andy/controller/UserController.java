package cn.andy.controller;


import cn.andy.client.UserClient;
import cn.andy.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserClient userClient;


    @GetMapping("/getList")
    public List<User> getList() {
        return userClient.getList();
    }

    @GetMapping("/getUser/{id}")
    public User getUser(@PathVariable("id") String id) {
        return userClient.getUser(id);
    }

}

package com.example.demo.user;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("api/v1/users")
public class UserController {

    @GetMapping
    public String addUser() {
        return "adduser";
    }

    @PostMapping
    public String addUser(@RequestBody User user) {
        System.out.println(user.toString());
        return "adduser";
    }
}

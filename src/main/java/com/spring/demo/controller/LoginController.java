package com.spring.demo.controller;

import com.spring.demo.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {
    @RequestMapping("/login")
    public String loginController(User user){
        return "login";
    }
}

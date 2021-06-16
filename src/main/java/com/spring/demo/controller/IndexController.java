package com.spring.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class IndexController {
    @RequestMapping("/hello")
    public String index(HttpServletRequest request, HttpServletResponse response, Model model){
        model.addAttribute("message","hello springboot");
        return "hello.html";
    }

    @RequestMapping("/")
    public String index(Model model){
        model.addAttribute("wellcome","wellcomr to my home");
        return "index";
    }
}

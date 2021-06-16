package com.spring.demo.controller;

import com.spring.demo.entity.User;
import com.spring.demo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.SQLException;
import java.util.List;

@Controller
public class UserController {

    @Autowired
    UserMapper userMapper;

    @RequestMapping("/user")
    public String showUser(Model model){
        List<User> users = userMapper.allUser();
        model.addAttribute("userlist",users);
        return "user";
    }

    @RequestMapping("/deleteUser")
    public String deleteUser(int id){
        userMapper.deleteUser(id);
        return "redirect:user";
    }

    @PostMapping("/addUser")
    public String addUser(@RequestParam("id")int id,@RequestParam("username")String username,@RequestParam("sex")String sex,@RequestParam("age")int age){
        try{
            userMapper.insertUser(id,age,username,sex);
        } catch (Exception e) {
            e.printStackTrace();
            return "error";
        }
        return "redirect:user";
    }

}

package com.spring.demo.entity;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component("user")
public class User {
    private int id;
    private String username;
    private String sex;
    private int age;

    public void setUser(int id,String username,String sex,int age){
        this.age = age;
        this.id = id;
        this.username = username;
        this.sex = sex;
    }
}

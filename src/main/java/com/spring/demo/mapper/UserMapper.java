package com.spring.demo.mapper;

import com.spring.demo.entity.User;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
public interface UserMapper {

    @Select("select * from user")
    List<User> allUser();

    @Insert("insert into user (id,username,sex,age) values (#{id},#{username},#{sex},#{age})")
    void insertUser(@Param("id")int id,@Param("age")int age,@Param("username")String username,@Param("sex")String sex);

    @Insert("insert into user (id,username,sex,age) values (#{id},#{username},#{sex},#{age})")
    void insertOneUser(User user);

    @Delete("delete from user where id = #{id}")
    void  deleteUser(@Param("id")int id);

    @Update("update user set id = #{id},username = #{username},sex = #{sex},age = #{age}")
    void updateUser(User user);

    @Select("select * from user where username = #{username}")
    User oneUser(@Param("username") String username);
}

package com.example.demo3.controller;

import com.example.demo3.pojo.User;
import com.example.demo3.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/getUserList")
    public List<User> getUserList(){
        return userService.getUserList();
    }

    @PostMapping(value = "/register")
    public String registerUser(@RequestBody User user){
        if (!user.isNotNull()||userService.isExistUser(user.getUsername())){
            System.out.println("注册失败");
            return "注册失败，用户名存在或信息不全！！！";
        }else {
            userService.addUser(user);
            System.out.println("用户："+user.getUsername()+" 注册成功");
            return "注册成功";
        }
    }

    @PostMapping("/login")
    public int login(@RequestBody User user){
        System.out.println(user.getUsername()+"--"+user.getPassword());
        if (userService.loginUser(user)){
            System.out.println("登录成功");
            return 1;
        }else {
            System.out.println("登录失败");
            return 0;
        }
    }

    @GetMapping("/getUserNum")
    public int getUserNum(){
        return userService.getUserNum();
    }
}

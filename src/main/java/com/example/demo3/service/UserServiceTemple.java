package com.example.demo3.service;

import com.example.demo3.mapper.UserMapper;
import com.example.demo3.pojo.User;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserServiceTemple implements UserService{

    final
    UserMapper userMapper;

    public UserServiceTemple(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @Override
    public List<User> getUserList() {
        return userMapper.getUserList();
    }

    @Override
    public boolean addUser(User user) {
        return userMapper.addUser(user);
    }

    @Override
    @Transactional
    public boolean batchRemoveUser(List<Integer> ids) {
        userMapper.batchRemoveUser(ids);
        return true;
    }

    @Override
    public int getUserNum() {
        return userMapper.getUserNum();
    }

    @Override
    public boolean isExistUser(String username) {
        if (userMapper.isExists(username)>0) return true;
        return false;
    }

    @Override
    public boolean loginUser(User user) {
        if (userMapper.loginUser(user)!=null) return true;
        else return false;
    }

    @Override
    public User getUserByName(String username) {
        return userMapper.getUserByName(username);
    }

    @Override
    public List<User> getUserByIds(List<Integer> ids) {
        return userMapper.getUserByIds(ids);
    }
}

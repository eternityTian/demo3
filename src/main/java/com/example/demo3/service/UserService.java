package com.example.demo3.service;

import com.example.demo3.pojo.User;

import java.util.List;

public interface UserService {

    List<User> getUserList();

    boolean addUser(User user);

    /**
     * 批量删除用户
     *
     * @param ids
     * @return
     */
    boolean batchRemoveUser(List<Integer> ids);

    /**
     * 获取总的用户数
     *
     * @return
     */
    int getUserNum();

    /**
     * 用户名是否存在
     *
     * @return
     */
    boolean isExistUser(String username);

    boolean loginUser(User user);

    /**
     * 根据用户名查询用户
     *
     * @return
     */
    User getUserByName(String username);

    /**
     * 根据ids批量查询用户
     *
     * @param ids
     * @return
     */
    List<User> getUserByIds(List<Integer> ids);
}

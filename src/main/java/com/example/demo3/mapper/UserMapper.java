package com.example.demo3.mapper;

import com.example.demo3.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

//这个注解表示了这是一个mybatis的mapper类
@Mapper
@Repository
public interface UserMapper {

    List<User> getUserList();

    boolean addUser(User user);

    /**
     * 批量删除
     * @param ids
     * @return
     */
    int batchRemoveUser(List<Integer> ids);

    /**
     * 获取用户数量
     *
     * @return
     */
    int getUserNum();

    /**
     * 用户名是否存在
     *
     * @return
     */
    int isExists(String username);

    User loginUser(User user);

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
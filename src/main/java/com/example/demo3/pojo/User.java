package com.example.demo3.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

    private int id;
    private String username;
    private String password;
    private String phone_num;
    private String email;

    /**
     * 是否包含空信息,不全为空返回true
     * @return
     */
    public boolean isNotNull(){
        if (username==null || password ==null || phone_num==null || email ==null) return false;
        else return true;
    }
}

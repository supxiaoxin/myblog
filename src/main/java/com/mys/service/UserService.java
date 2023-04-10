package com.mys.service;

import com.mys.entity.User;

/**
 * @Description: 用户业务层接口
 * @Author: supxiaoxin
 */
public interface UserService {
    //核对用户名和密码
    User checkUser(String username, String password);
}
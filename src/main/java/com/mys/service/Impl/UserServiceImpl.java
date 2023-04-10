package com.mys.service.Impl;

import com.mys.dao.UserDao;
import com.mys.entity.User;
import com.mys.service.UserService;
import com.mys.util.MD5Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Description: 用户业务层接口实现类
 * @Author: supxiaoxin
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    /**
     * @Description:
     * @Auther: ONESTAR
     * @Date: 21:25 2020/5/27
     * @Param: username:用户名；password:密码
     * @Return: 返回用户对象
     */
    @Override
    public User checkUser(String username, String password) {
        User user = userDao.findByUsernameAndPassword(username, MD5Utils.code(password));
        return user;
    }
}
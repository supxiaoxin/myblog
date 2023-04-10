package com.mys.dao;

import com.mys.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * @Description: 用户持久层接口
 * @Author: supxiaoxin
 */
@Mapper
@Repository
public interface UserDao {
    /**
     * @Description:
     * @Auther: ONESTAR
     * @Date: 10:24 2020/5/27
     * @Param: username:用户名；password:密码
     * @Return: 返回用户对象
     */
    User findByUsernameAndPassword(@Param("username") String username, @Param("password") String password);
}
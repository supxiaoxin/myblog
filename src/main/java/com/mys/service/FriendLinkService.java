package com.mys.service;

import com.mys.entity.FriendLink;

import java.util.List;

/**
 * @Description: 友链业务层接口
 * @Author: supxiaoxin
 */
public interface FriendLinkService {

    //查询所有友链
    List<FriendLink> listFriendLink();

    //友链新增
    int saveFriendLink(FriendLink friendLink);

    //根据网址查询友链
    FriendLink getFriendLinkByBlogaddress(String blogaddress);

    //根据id查询友链
    FriendLink getFriendLink(Long id);

    //编辑修改友链
    int updateFriendLink(FriendLink friendLink);

    //删除友链
    void deleteFriendLink(Long id);

}
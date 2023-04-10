package com.mys.dao;

import com.mys.entity.Comment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Description: 评论持久层接口
 * @Author: supxiaoxin
 */
@Mapper
@Repository
public interface CommentDao {

    // 查询父级评论
    List<Comment> findByBlogIdParentIdNull(@Param("blogId") Long blogId, @Param("blogParentId") Long blogParentId);

    // 查询一级回复
    List<Comment> findByBlogIdParentIdNotNull(@Param("blogId") Long blogId, @Param("id") Long id);

    // 查询二级回复
    List<Comment> findByBlogIdAndReplayId(@Param("blogId") Long blogId,@Param("childId") Long childId);

    // 添加一个评论
    int saveComment(Comment comment);

    // 删除评论
    void deleteComment(Long id);

    // 根据父评论id查询留言信息
    Comment getEmailByParentId(Long parentId);
}
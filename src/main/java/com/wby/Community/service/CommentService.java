package com.wby.Community.service;

import com.wby.Community.dao.CommentMapper;
import com.wby.Community.entity.Comment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentService {
    @Autowired
    CommentMapper commentMapper ;
    public List<Comment> findCommentsByEntity(int entityType,int entityId ,int offset,int limit){
        return commentMapper .selectCommentsByEntity(entityType ,entityId ,offset ,limit );
    }



    public int findCommentCount(int entityType,int entityId){
        return  commentMapper.selectCountByEntity(entityType ,entityId );
    }
}

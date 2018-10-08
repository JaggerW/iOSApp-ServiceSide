package com.nju.test.service;

import com.nju.test.entity.Comment;

import java.util.List;

public interface CommentService {

    List<Comment> getCommentList(int storeId);

    Comment getCommentById(String commentId);

    boolean addComment(Comment comment);

}

package com.nju.test.web;


import com.nju.test.entity.Comment;
import com.nju.test.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class CommentCRUDController {

    @Autowired
    private CommentService commentService;

    //提交

    @RequestMapping(value = "/addcomment", method = RequestMethod.POST)
    private Map<String,Object> addComment(@RequestBody Comment comment){
        Map<String,Object> modelMap = new HashMap<String, Object>();
        modelMap.put("success", commentService.addComment(comment));
        return modelMap;
    }

    //按storeId查询所有

    @RequestMapping(value = "/listcomment", method = RequestMethod.GET)
    private Map<String,Object> listComment(Integer storeId){
        Map<String,Object> modelMap = new HashMap<String, Object>();
        List<Comment> list = commentService.getCommentList(storeId);
        modelMap.put("data", list);
        return modelMap;
    }

}

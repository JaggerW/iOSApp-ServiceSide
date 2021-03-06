package com.nju.test.entity;

import java.io.Serializable;

public class Comment implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_comment.comment_id
     *
     * @mbggenerated Tue Apr 03 08:57:43 CST 2018
     */
    private Integer commentId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_comment.store_id
     *
     * @mbggenerated Tue Apr 03 08:57:43 CST 2018
     */
    private Integer storeId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_comment.store_name
     *
     * @mbggenerated Tue Apr 03 08:57:43 CST 2018
     */
    private String storeName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_comment.goods_name
     *
     * @mbggenerated Tue Apr 03 08:57:43 CST 2018
     */
    private String goodsName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_comment.comments
     *
     * @mbggenerated Tue Apr 03 08:57:43 CST 2018
     */
    private String comments;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_comment.user_id
     *
     * @mbggenerated Tue Apr 03 08:57:43 CST 2018
     */
    private Integer userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_comment.user_name
     *
     * @mbggenerated Tue Apr 03 08:57:43 CST 2018
     */
    private String userName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_comment.commit_time
     *
     * @mbggenerated Tue Apr 03 08:57:43 CST 2018
     */
    private String commitTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_comment.user_image
     *
     * @mbggenerated Tue Apr 03 08:57:43 CST 2018
     */
    private String userImage;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_comment
     *
     * @mbggenerated Tue Apr 03 08:57:43 CST 2018
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_comment.comment_id
     *
     * @return the value of t_comment.comment_id
     *
     * @mbggenerated Tue Apr 03 08:57:43 CST 2018
     */
    public Integer getCommentId() {
        return commentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_comment.comment_id
     *
     * @param commentId the value for t_comment.comment_id
     *
     * @mbggenerated Tue Apr 03 08:57:43 CST 2018
     */
    public void setCommentId(Integer commentId) {
        this.commentId = commentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_comment.store_id
     *
     * @return the value of t_comment.store_id
     *
     * @mbggenerated Tue Apr 03 08:57:43 CST 2018
     */
    public Integer getStoreId() {
        return storeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_comment.store_id
     *
     * @param storeId the value for t_comment.store_id
     *
     * @mbggenerated Tue Apr 03 08:57:43 CST 2018
     */
    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_comment.store_name
     *
     * @return the value of t_comment.store_name
     *
     * @mbggenerated Tue Apr 03 08:57:43 CST 2018
     */
    public String getStoreName() {
        return storeName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_comment.store_name
     *
     * @param storeName the value for t_comment.store_name
     *
     * @mbggenerated Tue Apr 03 08:57:43 CST 2018
     */
    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_comment.goods_name
     *
     * @return the value of t_comment.goods_name
     *
     * @mbggenerated Tue Apr 03 08:57:43 CST 2018
     */
    public String getGoodsName() {
        return goodsName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_comment.goods_name
     *
     * @param goodsName the value for t_comment.goods_name
     *
     * @mbggenerated Tue Apr 03 08:57:43 CST 2018
     */
    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_comment.comments
     *
     * @return the value of t_comment.comments
     *
     * @mbggenerated Tue Apr 03 08:57:43 CST 2018
     */
    public String getComments() {
        return comments;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_comment.comments
     *
     * @param comments the value for t_comment.comments
     *
     * @mbggenerated Tue Apr 03 08:57:43 CST 2018
     */
    public void setComments(String comments) {
        this.comments = comments;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_comment.user_id
     *
     * @return the value of t_comment.user_id
     *
     * @mbggenerated Tue Apr 03 08:57:43 CST 2018
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_comment.user_id
     *
     * @param userId the value for t_comment.user_id
     *
     * @mbggenerated Tue Apr 03 08:57:43 CST 2018
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_comment.user_name
     *
     * @return the value of t_comment.user_name
     *
     * @mbggenerated Tue Apr 03 08:57:43 CST 2018
     */
    public String getUserName() {
        return userName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_comment.user_name
     *
     * @param userName the value for t_comment.user_name
     *
     * @mbggenerated Tue Apr 03 08:57:43 CST 2018
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_comment.commit_time
     *
     * @return the value of t_comment.commit_time
     *
     * @mbggenerated Tue Apr 03 08:57:43 CST 2018
     */
    public String getCommitTime() {
        return commitTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_comment.commit_time
     *
     * @param commitTime the value for t_comment.commit_time
     *
     * @mbggenerated Tue Apr 03 08:57:43 CST 2018
     */
    public void setCommitTime(String commitTime) {
        this.commitTime = commitTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_comment.user_image
     *
     * @return the value of t_comment.user_image
     *
     * @mbggenerated Tue Apr 03 08:57:43 CST 2018
     */
    public String getUserImage() {
        return userImage;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_comment.user_image
     *
     * @param userImage the value for t_comment.user_image
     *
     * @mbggenerated Tue Apr 03 08:57:43 CST 2018
     */
    public void setUserImage(String userImage) {
        this.userImage = userImage;
    }
}
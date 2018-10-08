package com.nju.test.entity;

import java.io.Serializable;

public class Goods implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_goods.goods_id
     *
     * @mbggenerated Tue Apr 03 08:57:43 CST 2018
     */
    private Integer goodsId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_goods.goods_category
     *
     * @mbggenerated Tue Apr 03 08:57:43 CST 2018
     */
    private String goodsCategory;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_goods.goods_name
     *
     * @mbggenerated Tue Apr 03 08:57:43 CST 2018
     */
    private String goodsName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_goods.goods_price
     *
     * @mbggenerated Tue Apr 03 08:57:43 CST 2018
     */
    private Float goodsPrice;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_goods.goods_sales_amount
     *
     * @mbggenerated Tue Apr 03 08:57:43 CST 2018
     */
    private Integer goodsSalesAmount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_goods.goods_image
     *
     * @mbggenerated Tue Apr 03 08:57:43 CST 2018
     */
    private String goodsImage;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_goods.t_store_store_id
     *
     * @mbggenerated Tue Apr 03 08:57:43 CST 2018
     */
    private Integer tStoreStoreId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_goods.t_category_category_id
     *
     * @mbggenerated Tue Apr 03 08:57:43 CST 2018
     */
    private Integer tCategoryCategoryId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_goods
     *
     * @mbggenerated Tue Apr 03 08:57:43 CST 2018
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_goods.goods_id
     *
     * @return the value of t_goods.goods_id
     *
     * @mbggenerated Tue Apr 03 08:57:43 CST 2018
     */
    public Integer getGoodsId() {
        return goodsId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_goods.goods_id
     *
     * @param goodsId the value for t_goods.goods_id
     *
     * @mbggenerated Tue Apr 03 08:57:43 CST 2018
     */
    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_goods.goods_category
     *
     * @return the value of t_goods.goods_category
     *
     * @mbggenerated Tue Apr 03 08:57:43 CST 2018
     */
    public String getGoodsCategory() {
        return goodsCategory;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_goods.goods_category
     *
     * @param goodsCategory the value for t_goods.goods_category
     *
     * @mbggenerated Tue Apr 03 08:57:43 CST 2018
     */
    public void setGoodsCategory(String goodsCategory) {
        this.goodsCategory = goodsCategory;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_goods.goods_name
     *
     * @return the value of t_goods.goods_name
     *
     * @mbggenerated Tue Apr 03 08:57:43 CST 2018
     */
    public String getGoodsName() {
        return goodsName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_goods.goods_name
     *
     * @param goodsName the value for t_goods.goods_name
     *
     * @mbggenerated Tue Apr 03 08:57:43 CST 2018
     */
    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_goods.goods_price
     *
     * @return the value of t_goods.goods_price
     *
     * @mbggenerated Tue Apr 03 08:57:43 CST 2018
     */
    public Float getGoodsPrice() {
        return goodsPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_goods.goods_price
     *
     * @param goodsPrice the value for t_goods.goods_price
     *
     * @mbggenerated Tue Apr 03 08:57:43 CST 2018
     */
    public void setGoodsPrice(Float goodsPrice) {
        this.goodsPrice = goodsPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_goods.goods_sales_amount
     *
     * @return the value of t_goods.goods_sales_amount
     *
     * @mbggenerated Tue Apr 03 08:57:43 CST 2018
     */
    public Integer getGoodsSalesAmount() {
        return goodsSalesAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_goods.goods_sales_amount
     *
     * @param goodsSalesAmount the value for t_goods.goods_sales_amount
     *
     * @mbggenerated Tue Apr 03 08:57:43 CST 2018
     */
    public void setGoodsSalesAmount(Integer goodsSalesAmount) {
        this.goodsSalesAmount = goodsSalesAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_goods.goods_image
     *
     * @return the value of t_goods.goods_image
     *
     * @mbggenerated Tue Apr 03 08:57:43 CST 2018
     */
    public String getGoodsImage() {
        return goodsImage;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_goods.goods_image
     *
     * @param goodsImage the value for t_goods.goods_image
     *
     * @mbggenerated Tue Apr 03 08:57:43 CST 2018
     */
    public void setGoodsImage(String goodsImage) {
        this.goodsImage = goodsImage;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_goods.t_store_store_id
     *
     * @return the value of t_goods.t_store_store_id
     *
     * @mbggenerated Tue Apr 03 08:57:43 CST 2018
     */
    public Integer gettStoreStoreId() {
        return tStoreStoreId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_goods.t_store_store_id
     *
     * @param tStoreStoreId the value for t_goods.t_store_store_id
     *
     * @mbggenerated Tue Apr 03 08:57:43 CST 2018
     */
    public void settStoreStoreId(Integer tStoreStoreId) {
        this.tStoreStoreId = tStoreStoreId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_goods.t_category_category_id
     *
     * @return the value of t_goods.t_category_category_id
     *
     * @mbggenerated Tue Apr 03 08:57:43 CST 2018
     */
    public Integer gettCategoryCategoryId() {
        return tCategoryCategoryId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_goods.t_category_category_id
     *
     * @param tCategoryCategoryId the value for t_goods.t_category_category_id
     *
     * @mbggenerated Tue Apr 03 08:57:43 CST 2018
     */
    public void settCategoryCategoryId(Integer tCategoryCategoryId) {
        this.tCategoryCategoryId = tCategoryCategoryId;
    }
}
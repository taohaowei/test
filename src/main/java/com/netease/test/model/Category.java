package com.netease.test.model;

/**
 * @Author: 陶浩伟
 * @CreateDate: 2018/4/24 15:55
 **/
public class Category {

    /**
     * 类型Id
     */
    private Integer categoryId;

    /**
     * 类型名称
     */
    private String categoryName;

    public Category() {
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }
}

package com.netease.test.model;

/**
 * @Author: 陶浩伟
 * @CreateDate: 2018/4/24 15:53
 **/
public class Article {

    /**
     * 文章Id
     */
    private Integer articleId;

    /**
     * 文章名
     */
    private String articleName;

    /**
     * 类型Id
     */
    private Integer categoryId;

    public Article() {
    }



    public Integer getArticleId() {
        return articleId;
    }

    public void setArticleId(Integer articleId) {
        this.articleId = articleId;
    }

    public String getArticleName() {
        return articleName;
    }

    public void setArticleName(String articleName) {
        this.articleName = articleName;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }
}

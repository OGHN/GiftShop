package com.giftshop.model;

public class Article {

    // products attributes.. will keep simple, nothing fancy
    private String articleName;
    private String articleCategory;
    private String articleDescription;
    private double articlePrice;
    private int articleCustomerReview;
    private String articleShippingInfo;
    private int articleCode;
    private String articleId;

    public String getArticleName() {
        return articleName;
    }

    public void setArticleName(String articleName) {
        this.articleName = articleName;
    }

    public String getArticleCategory() {
        return articleCategory;
    }

    public void setArticleCategory(String articleCategory) {
        this.articleCategory = articleCategory;
    }

    public String getArticleDescription() {
        return articleDescription;
    }

    public void setArticleDescription(String articleDescription) {
        this.articleDescription = articleDescription;
    }

    public double getArticlePrice() {
        return articlePrice;
    }

    public void setArticlePrice(double articlePrice) {
        this.articlePrice = articlePrice;
    }

    public int getArticleCustomerReview() {
        return articleCustomerReview;
    }

    public void setArticleCustomerReview(int articleCustomerReview) {
        this.articleCustomerReview = articleCustomerReview;
    }

    public String getArticleShippingInfo() {
        return articleShippingInfo;
    }

    public void setArticleShippingInfo(String skuShippinginfo) {
        this.articleShippingInfo = skuShippinginfo;
    }

    public int getArticleCode() {
        return articleCode;
    }

    public void setArticleCode(int articleCode) {
        this.articleCode = articleCode;
    }

    public String getArticleId() {
        return articleId;
    }

    public void setArticleId(String articleId) {
        this.articleId = articleId;
    }
}


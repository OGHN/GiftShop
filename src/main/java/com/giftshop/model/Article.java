package com.giftshop.model;
/**
 * Created by O HERNANDEZ
 * on 27/03/2018.
 */

import javax.persistence.Entity;

@Entity
public class Article extends AbstractPersistenceObject {

    public Article() {
    }

    private String articleName;
    private String articleCategory;
    private String articleDescription;
    private double articlePrice;
    private int articleCustomerReview;
    private String articleShippingInfo;
    private int articleCode;

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

}


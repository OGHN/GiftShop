package com.giftshop.dao;

import com.giftshop.model.Article;

import java.util.List;

/**
 * Created by O HERNANDEZ
 * on 27/03/2018.
 */
public interface ArticleDao {

    void addArticle(Article article);

    Article getArticleById(Long Id);

    List<Article> getAllArticles();

    void deleteArticle(Long id);
}

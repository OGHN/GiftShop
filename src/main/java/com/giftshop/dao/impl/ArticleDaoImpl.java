package com.giftshop.dao.impl;

import com.giftshop.ArticleHelper;
import com.giftshop.model.Article;
import com.giftshop.dao.ArticleDao;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by O HERNANDEZ
 * on 27/03/2018.
 */

@Repository
@Transactional
public class ArticleDaoImpl implements ArticleDao {

    @Autowired
    private SessionFactory factory;

    public void addArticle(Article article) {
        Session session = factory.getCurrentSession();
        session.saveOrUpdate(article);
        session.flush();
    }

    public Article getArticleById(Long id) {
        Session session = factory.getCurrentSession();
        Article article = (Article) session.get(Article.class, id);
        session.flush();
        return article;
    }

    public List<Article> getAllArticles() {
        Session session = factory.getCurrentSession();
        Query query = session.createQuery(ArticleHelper.QUERY_ALL_ARTICLES);
        List<Article> articles = query.list();
        session.flush();
        return articles;
    }

    public void deleteArticle(Long id) {
        Session session = factory.getCurrentSession();
        session.delete(getArticleById(id));
        session.flush();
    }
}

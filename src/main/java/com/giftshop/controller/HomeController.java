package com.giftshop.controller;

import com.giftshop.model.Article;
import dao.ArticleDao;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.IOException;
import java.util.List;

@Controller
public class HomeController {

    private ArticleDao articleDao = new ArticleDao();

    // home page wiew
    @RequestMapping("/")
    public String home() {
        return "home";
    }

    // articles detailed page wiew
    @RequestMapping("/articleList")
    public String getArticle(Model model) {
        List<Article> articles = articleDao.getArticleList();
        model.addAttribute("articles", articles);
        return "articleList";
    }

    // articles list page wiew
    @RequestMapping("/articleList/viewArticle/{articleId}")
    public String viewArticle(@PathVariable String articleId, Model model) throws IOException{
        Article article = articleDao.getArticleById(articleId);
        model.addAttribute(article);
        return "viewArticle";
    }

}

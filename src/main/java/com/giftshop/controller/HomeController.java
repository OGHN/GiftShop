package com.giftshop.controller;

import com.giftshop.model.Article;
import com.giftshop.dao.ArticleDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.IOException;
import java.util.List;

@Controller
public class HomeController {

    @Autowired
    private ArticleDao articleDao;

    // home page wiew
    @RequestMapping("/")
    public String home() {
        return "home";
    }

    // articles detailed page wiew
    @RequestMapping("/articleList")
    public String getArticle(Model model) {
        List<Article> articles = articleDao.getAllArticles();
        model.addAttribute("articles", articles);
        return "articleList";
    }

    // articles list page wiew
    @RequestMapping("/articleList/viewArticle/{Id}")
    public String viewArticle(@PathVariable Long Id, Model model) throws IOException{
        Article article = articleDao.getArticleById(Id);
        model.addAttribute(article);
        return "viewArticle";
    }

    // contact view
    @RequestMapping("/contact")
    public String contact(){return "contact";}

    // about us view
    @RequestMapping("/about")
    public String about(){return "about";}

}

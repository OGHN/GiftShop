package dao;

import com.giftshop.model.Article;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ArticleDao {

    // dummy
    private List<Article> articleList;

    public List<Article> getArticleList() {

        articleList = new ArrayList<Article>();

        // harcoded dummy products
        Article article1 = new Article();
        Article article2 = new Article();
        Article article3 = new Article();
        Article article4 = new Article();
        Article article5 = new Article();
        Article article6 = new Article();
        Article article7 = new Article();
        Article article8 = new Article();
        Article article9 = new Article();
        Article article10 = new Article();

        article1.setArticleName("dummy1");
        article1.setArticleCategory("Category1");
        article1.setArticleShippingInfo("Free shipping");
        article1.setArticleDescription("Article description");
        article1.setArticlePrice(5);
        article1.setArticleCustomerReview(5);
        article1.setArticleCode(123);
        article1.setArticleId("1");

        article2.setArticleName("dummy2");
        article2.setArticleCategory("Category2");
        article2.setArticleShippingInfo("Free shipping");
        article2.setArticleDescription("Article description");
        article2.setArticlePrice(10);
        article2.setArticleCustomerReview(5);
        article2.setArticleCode(123);
        article2.setArticleId("2");

        article3.setArticleName("dummy3");
        article3.setArticleCategory("Category2");
        article3.setArticleShippingInfo("Free shipping");
        article3.setArticleDescription("Article description");
        article3.setArticlePrice(18);
        article3.setArticleCustomerReview(4);
        article3.setArticleCode(123);
        article3.setArticleId("3");

        article4.setArticleName("dummy4");
        article4.setArticleCategory("Categor1");
        article4.setArticleShippingInfo("Free shipping");
        article4.setArticleDescription("Article description");
        article4.setArticlePrice(22);
        article4.setArticleCustomerReview(5);
        article4.setArticleCode(123);
        article4.setArticleId("4");

        article5.setArticleName("dummy5");
        article5.setArticleCategory("Category1");
        article5.setArticleShippingInfo("Free shipping");
        article5.setArticleDescription("Article description");
        article5.setArticlePrice(9);
        article5.setArticleCustomerReview(3);
        article5.setArticleCode(123);
        article5.setArticleId("5");

        article6.setArticleName("dummy6");
        article6.setArticleCategory("Category1");
        article6.setArticleShippingInfo("Free shipping");
        article6.setArticleDescription("Article description");
        article6.setArticlePrice(15);
        article6.setArticleCustomerReview(1);
        article6.setArticleCode(123);
        article6.setArticleId("6");

        article7.setArticleName("dummy7");
        article7.setArticleCategory("Category2");
        article7.setArticleShippingInfo("Free shipping");
        article7.setArticleDescription("LArticle description");
        article7.setArticlePrice(20);
        article7.setArticleCustomerReview(4);
        article7.setArticleCode(123);
        article7.setArticleId("7");

        article8.setArticleName("dummy8");
        article8.setArticleCategory("Category2");
        article8.setArticleShippingInfo("Free shipping");
        article8.setArticleDescription("Article description");
        article8.setArticlePrice(11);
        article8.setArticleCustomerReview(5);
        article8.setArticleCode(123);
        article8.setArticleId("8");

        article9.setArticleName("dummy9");
        article9.setArticleCategory("Category2");
        article9.setArticleShippingInfo("Free shipping");
        article9.setArticleDescription("Article description");
        article9.setArticlePrice(19);
        article9.setArticleCustomerReview(2);
        article9.setArticleCode(123);
        article9.setArticleId("9");

        article10.setArticleName("dummy10");
        article10.setArticleCategory("Category1");
        article10.setArticleShippingInfo("Free shipping");
        article10.setArticleDescription("Article description");
        article10.setArticlePrice(10);
        article10.setArticleCustomerReview(1);
        article10.setArticleCode(123);
        article10.setArticleId("10");

        articleList.add(article1);
        articleList.add(article2);
        articleList.add(article3);
        articleList.add(article4);
        articleList.add(article5);
        articleList.add(article6);
        articleList.add(article7);
        articleList.add(article8);
        articleList.add(article9);
        articleList.add(article10);
        return articleList;
    }

    public Article getArticleById(String articleId) throws IOException{
        for (Article article: getArticleList()){
            if (article.getArticleId().equals(articleId)){
                return article;
            }
        }
        throw new IOException("No article found");
    }
}

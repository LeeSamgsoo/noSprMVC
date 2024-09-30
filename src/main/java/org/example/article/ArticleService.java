package org.example.article;

import java.util.List;

public class ArticleService {
    private final ArticleRepository articleRepository = new ArticleRepository();

    public List<Article> list() {
        return this.articleRepository.getAll();
    }
}

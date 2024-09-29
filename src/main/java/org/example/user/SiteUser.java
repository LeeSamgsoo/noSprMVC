package org.example.user;

import org.example.article.Article;

import java.util.List;

public class SiteUser {
    private Integer id;
    private String username;
    private String password;
    private String nickname;
    private List<Article> articles;

    public Integer getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getNickname() {
        return nickname;
    }

    public String getPassword() {
        return password;
    }

    public List<Article> getArticles() {
        return articles;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public void setArticles(List<Article> articles) {
        this.articles = articles;
    }
}

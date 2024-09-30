package org.example.article;

import org.example.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class ArticleRepository {
    public List<Article> getAll() {
        List<Article> articles = new ArrayList<>();
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement("SELECT * FROM article")) {

            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                Article article = new Article();
                article.setId(rs.getInt("id"));
                article.setTitle(rs.getString("title"));
                article.setContent(rs.getString("content"));
                article.setCreateDate(rs.getDate("create_date"));
                article.setModifyDate(rs.getDate("modify_date"));
                article.setAuthorId(rs.getInt("author_id"));

                articles.add(article);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return articles;
    }
}

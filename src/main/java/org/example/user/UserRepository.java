package org.example.user;

import org.example.DBConnection;
import org.example.article.Article;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UserRepository {

    public SiteUser getUser(Integer id) {
        SiteUser user = new SiteUser();
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement("SELECT * FROM site_user where id = " + id)) {

            ResultSet rs = stmt.executeQuery();
            user.setId(rs.getInt("id"));
            user.setUsername(rs.getString("username"));
            user.setPassword(rs.getString("password"));
            user.setNickname(rs.getString("nickname"));

        } catch (Exception e) {
            e.printStackTrace();
        }
        return user;
    }
}


package org.example.user;

import org.example.DBConnection;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class UserRepository {

    public List<String> getUsers() {
        List<String> users = new ArrayList<>();
        try (Connection conn = DBConnection.getConnection();
             Statement stmt = conn.createStatement()) {

            ResultSet rs = stmt.executeQuery("SELECT username FROM site_user");
            while (rs.next()) {
                users.add(rs.getString("username"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return users;
    }
}


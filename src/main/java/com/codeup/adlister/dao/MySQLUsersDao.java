package com.codeup.adlister.dao;

import com.codeup.adlister.models.User;

import java.sql.*;
import com.mysql.cj.jdbc.Driver;

public class MySQLUsersDao implements Users {

    private Connection connection = null;

    public MySQLUsersDao(Config config){
        try {
            DriverManager.registerDriver(new Driver());
            connection = DriverManager.getConnection(
                    config.getUrl(),
                    config.getUser(),
                    config.getPassword()
            );
        } catch (SQLException se){
            throw new RuntimeException("Error connecting to the database!", se);
        }
    }


    @Override
    public User findByUsername(String username) throws SQLException {
        String sql = "SELECT * FROM users WHERE username = ?";
        PreparedStatement stmt = connection.prepareStatement(sql);
        stmt.setString(1, username);

        ResultSet rs = stmt.executeQuery();
        rs.next();

        User user = new User(
                rs.getLong("id"),
                rs.getString("username"),
                rs.getString("email"),
                rs.getString("password")
        );

        return user;
    }


    @Override
    public Long insert(User user) throws SQLException {
        String sql = "INSERT INTO users (username, email, password) VALUES (?, ?, ?)";
        PreparedStatement stmt = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

        stmt.setString(1, user.getUsername());
        stmt.setString(2, user.getEmail());
        stmt.setString(3, user.getPassword());

        stmt.executeUpdate();
        ResultSet generatedIdRS = stmt.getGeneratedKeys();
        generatedIdRS.next();

        return generatedIdRS.getLong(1);
    }
}

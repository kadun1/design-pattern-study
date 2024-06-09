package com.study.designpatterns._02_structural_patterns._07_bridge._03_java;

import java.sql.*;

public class JdbcExample {
    public static void main(String[] args) throws ClassNotFoundException {
        Class.forName("org.h2.Driver");

        try (Connection conn = DriverManager.getConnection("jdbc:h2:mem:~/test", "sa", "")) {

            String sql = "CREATE TABLE ACCOUNT " +
                    "(id INTEGER not NULL, " +
                    " first VARCHAR(255), " +
                    " last VARCHAR(255), " +
                    " PRIMARY KEY ( id ))";

            Statement stmt = conn.createStatement();
            stmt.executeUpdate(sql);

//            PreparedStatement pstmt = conn.prepareStatement(sql);
//            ResultSet resultSet = stmt.executeQuery(sql);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}

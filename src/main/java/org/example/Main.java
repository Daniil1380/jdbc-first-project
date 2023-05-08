package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) throws SQLException {
        Connection connection =
                DriverManager.getConnection("jdbc:postgresql://localhost:5433/postgres", "postgres", "qwerty");
        Statement statement = connection.createStatement();
        statement.execute("INSERT INTO cars VALUES (3, 'AUDI')");
        System.out.println("Connected!");
    }
}
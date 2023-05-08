package org.example;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws SQLException {
        DatabaseConnection databaseConnection
                = new DatabaseConnection("jdbc:postgresql://localhost:5433/postgres", "postgres", "qwerty");
        CarDAO carDAO = new CarDAO(databaseConnection);

        System.out.println(carDAO.getAllCars());

    }
}
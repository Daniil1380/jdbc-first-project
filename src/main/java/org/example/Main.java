package org.example;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws SQLException {
        CarDAO carDAO = new CarDAO();

        System.out.println(carDAO.getAllCars());

    }
}
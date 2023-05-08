package org.example;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws SQLException {
        Connection connection =
                DriverManager.getConnection("jdbc:postgresql://localhost:5433/postgres", "postgres", "qwerty");
        Statement statement = connection.createStatement();
        //statement.execute("INSERT INTO cars VALUES (3, 'AUDI')");
        ResultSet resultSet = statement.executeQuery("SELECT * FROM cars");

        List<Car> carList = new ArrayList<>();

        while (resultSet.next()) {
            int id = resultSet.getInt(1);
            String name = resultSet.getString(2);
            Car car = new Car(id, name);
            carList.add(car);
            System.out.println(id + " " + name);
        }
        System.out.println("Connected!");
        System.out.println(carList);

        //отобрать только машины, с id больше 2

    }
}
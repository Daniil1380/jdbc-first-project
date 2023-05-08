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
        ResultSet resultSet = statement.executeQuery("SELECT country, count(*) from cars group by country");

        List<Car> carList = new ArrayList<>();

        while (resultSet.next()) {
            String country = resultSet.getString(1);
            int count = resultSet.getInt(2);
            System.out.println(country + " " + count);
            //int id = resultSet.getInt(1);
            //String name = resultSet.getString(2);
            //Car car = new Car(id, name);
            //carList.add(car);
            //System.out.println(id + " " + name);
        }
        System.out.println("Connected!");
        System.out.println(carList);

        //отобрать только машины, с id больше 2

    }
}
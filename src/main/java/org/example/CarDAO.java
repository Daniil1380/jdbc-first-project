package org.example;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CarDAO {

    public List<Car> getAllCars() throws SQLException {
        Connection connection =
                DriverManager.getConnection("jdbc:postgresql://localhost:5433/postgres", "postgres", "qwerty");
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT * from cars");

        List<Car> cars = new ArrayList<>();
        while (resultSet.next()) {
            int id = resultSet.getInt(1);
            String name = resultSet.getString(2);
            String country = resultSet.getString("country");
            Car car = new Car(id, name, country);
            cars.add(car);
        }

        return cars;
    }


}

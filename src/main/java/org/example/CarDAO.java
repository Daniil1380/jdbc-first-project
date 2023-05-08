package org.example;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CarDAO {

    private DatabaseConnection databaseConnection;

    private static final String SELECT_ALL = "SELECT * from cars";

    public CarDAO(DatabaseConnection databaseConnection) {
        this.databaseConnection = databaseConnection;
    }

    public List<Car> getAllCars() throws SQLException {
        Connection connection = databaseConnection.getConnection();
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(SELECT_ALL);

        List<Car> cars = new ArrayList<>();
        while (resultSet.next()) {
            int id = resultSet.getInt(1);
            String name = resultSet.getString(2);
            String country = resultSet.getString(3);
            Car car = new Car(id, name, country);
            cars.add(car);
        }

        return cars;
    }

    public void insertCar(Car car) throws SQLException {
        Connection connection = databaseConnection.getConnection();
        Statement statement = connection.createStatement();
        String query = "INSERT INTO cars VALUES (" + car.getId() + ", '" + car.getName() + "', '" + car.getCountry() + "')";
        statement.execute(query);
    }


}

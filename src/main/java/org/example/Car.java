package org.example;

public class Car {

    private int id;

    private String name;

    private String country;

    public Car(int id, String name, String country) {
        this.id = id;
        this.name = name;
        this.country = country;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}

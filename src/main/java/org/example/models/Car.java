package org.example.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.math.BigDecimal;

@Entity
@Table(name = "cars")
public class Car extends PassengerVehicle {
    private final static String type = "CAR";

    public Car(String model, BigDecimal price, String fuelType, int noOfpassengers) {
        super(type, model, price, fuelType, noOfpassengers);
    }

    public Car() {
    }

    @Override
    public String toString() {
        return "Car { id=" + id + ", model=" + model + ", price=" + price + ", fuel_type=" + fuelType + ", seats=" + noOfpassengers + " }";
    }
}

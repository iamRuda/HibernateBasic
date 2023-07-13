package org.example.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.math.BigDecimal;

@Entity
@Table(name = "planes")
public class Plane extends PassengerVehicle {
    private final static String type = "PLANE";

    @Column(name = "airline", length = 255)
    private String airline;

    public Plane(String model, BigDecimal price, String fuelType, String airline, int noOfPassenger){
        super(type, model, price, fuelType, noOfPassenger);
        this.airline = airline;
    }

    public Plane() {}

    @Override
    public String toString() {
        return "Plane { id=" + id + ", model=" + model  + ", price=" + price  + ", fuel_type=" + fuelType + ", airline=" + airline + ", seats=" + noOfpassengers + " }";
    }
}

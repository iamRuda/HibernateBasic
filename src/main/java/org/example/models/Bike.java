package org.example.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.math.BigDecimal;

@Entity
@Table(name = "bikes")
public class Bike extends Vehicle {
    private final static String type = "BIKE";
    public Bike(String model, BigDecimal price, String fuelType){
        super(type, model, price, fuelType);
    }
    public Bike() {}

    @Override
    public String toString() {
        return "Bike { id=" + id + ", model=" + model  + ", price=" + price  + ", fuel_type=" + fuelType + " }";
    }
}

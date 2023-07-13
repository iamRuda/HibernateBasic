package org.example.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.math.BigDecimal;

@Entity
@Table(name = "trucks")
public class Truck extends Vehicle {
    private final static String type = "TRUCK";

    @Column(name = "load_capacity")
    private double loadCapacity;

    public Truck(String model, BigDecimal price, String fuelType, double loadCapacity){
        super(type, model, price, fuelType);
        this.loadCapacity = loadCapacity;
    }

    public Truck() {}

    @Override
    public String toString() {
        return "Truck { id=" + id + ", model=" + model  + ", price=" + price  + ", fuel_type=" + fuelType + ", load_capacity=" + loadCapacity + " }";
    }
}
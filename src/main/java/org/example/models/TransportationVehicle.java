package org.example.models;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;

import java.math.BigDecimal;

@MappedSuperclass
public abstract class TransportationVehicle extends Vehicle {
    @Column(name = "load_capacity")
    private double loadCapacity;
    public TransportationVehicle(String model, BigDecimal price, String fuelType, String type,double loadCapacity) {
        super(type, model, price, fuelType);
        this.loadCapacity = loadCapacity;
    }

    public double getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(double loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    @Override
    public String toString() {
        return "TransportationVehicle { id=" + id + ", model=" + model  + ", price=" + price  + ", fuel_type=" + fuelType + ", load_capacity=" + loadCapacity + " }";
    }
}
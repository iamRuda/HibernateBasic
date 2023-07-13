package org.example.models;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;

import java.math.BigDecimal;

@MappedSuperclass
public abstract class PassengerVehicle extends Vehicle {
    @Column(name = "seats")
    protected int noOfpassengers;
    public PassengerVehicle() { }
    public PassengerVehicle(String type, String model, BigDecimal price, String fuelType, int noOfpassengers) {
        super(type, model, price, fuelType);
        this.noOfpassengers = noOfpassengers;
    }

    public int getNoOfpassengers() {
        return noOfpassengers;
    }

    public void setNoOfpassengers(int noOfpassengers) {
        this.noOfpassengers = noOfpassengers;
    }

    @Override
    public String toString() {
        return "PassengerVehicle { id=" + id + ", model=" + model  + ", price=" + price  + ", fuel_type=" + fuelType + ", seats=" + noOfpassengers + " }";
    }
}

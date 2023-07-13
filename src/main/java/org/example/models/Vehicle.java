package org.example.models;

import jakarta.persistence.*;

import java.math.BigDecimal;
@Entity
@Table(name = "vehicles")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Vehicle {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    protected int id;
    @Column(name = "type", length = 255, nullable = false)
    private String type;
    @Column(name = "model", length = 255)
    protected String model;
    @Column(name = "price", precision = 19, scale = 2)
    protected BigDecimal price;
    @Column(name = "fuel_type", length = 255)
    protected String fuelType;

    protected Vehicle() {}
    protected Vehicle(String type, String model, BigDecimal price, String fuelType) {
        this.type = type;
        this.model = model;
        this.price = price;
        this.fuelType = fuelType;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }
}

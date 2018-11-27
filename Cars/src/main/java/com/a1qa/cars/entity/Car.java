package com.a1qa.cars.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Car {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "make")
    private String make;

    @Column(name ="mileage")
    private double mileage;

    @Column(name = "manufacture_date", columnDefinition="DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date manufactureDate;

    @Column(name = "color")
    private String color;
    @Column(name = "for_sale")
    private boolean forSale;

    public Car() {

    }

    public Car(String make, double mileage, Date manufactureDate, String color, boolean forSale) {
        this.make = make;
        this.mileage = mileage;
        this.manufactureDate = manufactureDate;
        this.color = color;
        this.forSale = forSale;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public double getMileage() {
        return mileage;
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }

    public Date getManufactureDate() {
        return manufactureDate;
    }

    public void setManufactureDate(Date manufactureDate) {
        this.manufactureDate = manufactureDate;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean getForSale() {
        return forSale;
    }

    public void setForSale(boolean forSale) {
        this.forSale = forSale;
    }
}

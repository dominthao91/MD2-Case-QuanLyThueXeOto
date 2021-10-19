package model.car;

import java.io.Serializable;

public class CarEconomy extends Car implements Serializable {
    private String nameCar;
    private String color;
    private String licensePlate;
    private double price;
    private boolean status;

    public CarEconomy(String name, String color, String licensePlate, String price, String status) {
    }

    public CarEconomy(String nameCar, String color, String licensePlate, double price, boolean status) {
        this.nameCar = nameCar;
        this.color = color;
        this.licensePlate = licensePlate;
        this.price = price;
        this.status = status;
    }

    public String getNameCar() {
        return nameCar;
    }

    public void setNameCar(String nameCar) {
        this.nameCar = nameCar;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

}

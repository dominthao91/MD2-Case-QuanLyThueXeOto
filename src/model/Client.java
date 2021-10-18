package model;

import model.car.CarEconomy;
import model.car.CarVip;

public class Client {
    private String FullName;
    private String identity;
    private String phoneNumber;
    private String address;
    private CarVip carVip;
    private CarEconomy carEconomy;

    public Client() {
    }

    public Client(String fullName, String identity, String phoneNumber, String address, CarVip carVip, CarEconomy carEconomy) {
        FullName = fullName;
        this.identity = identity;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.carVip = carVip;
        this.carEconomy = carEconomy;
    }

    public String getIdentity() {
        return identity;
    }

    public void setIdentity(String identity) {
        this.identity = identity;
    }

    public String getFullName() {
        return FullName;
    }

    public void setFullName(String fullName) {
        FullName = fullName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public CarVip getCarVip() {
        return carVip;
    }

    public void setCarVip(CarVip carVip) {
        this.carVip = carVip;
    }

    public CarEconomy getCarEconomy() {
        return carEconomy;
    }

    public void setCarEconomy(CarEconomy carEconomy) {
        this.carEconomy = carEconomy;
    }

    @Override
    public String toString() {
        return "Client{" +
                "FullName='" + FullName + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", address='" + address + '\'' +
                ", carVip=" + carVip +
                ", carEconomy=" + carEconomy +
                '}';
    }
}

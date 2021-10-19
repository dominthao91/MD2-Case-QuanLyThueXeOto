package model;

import model.car.CarEconomy;
import model.car.CarVip;

public class Client {
    private String FullName;
    private String identity;
    private String phoneNumber;
    private String address;

    public Client() {
    }

    public Client(String fullName, String identity, String phoneNumber, String address) {
        FullName = fullName;
        this.identity = identity;
        this.phoneNumber = phoneNumber;
        this.address = address;
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

    @Override
    public String toString() {
        return "Client{" +
                "FullName='" + FullName + '\'' +
                ", identity='" + identity + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}

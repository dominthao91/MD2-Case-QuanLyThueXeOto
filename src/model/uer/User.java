package model.uer;

import model.bill.Bill;

import java.io.Serializable;

public class User implements Serializable {
    private String fullName;
    private  String  identity;
    private String phoneNumber;
    private String address;
    private String role;

    public User() {
    }

    public User(String fullName, String identity, String phoneNumber, String address) {
        this.fullName = fullName;
        this.identity = identity;
        this.phoneNumber = phoneNumber;
        this.address = address;
      this.setRole("user");
    }


    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getIdentity() {
        return identity;
    }

    public void setIdentity(String identity) {
        this.identity = identity;
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
        return "User{" +
                "fullName='" + fullName + '\'' +
                ", identity='" + identity + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}

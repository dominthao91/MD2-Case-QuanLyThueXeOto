package model;

import model.car.CarEconomy;
import model.car.CarVip;

import java.time.LocalDate;

public class Bill {
    private Client client;
    private CarVip carVip;
    private CarEconomy carEconomy;
    private LocalDate checkIn;
    private LocalDate checkOut;

    public Bill() {
    }

    public Bill(Client client, CarVip carVip, CarEconomy carEconomy, LocalDate checkIn, LocalDate checkOut) {
        this.client = client;
        this.carVip = carVip;
        this.carEconomy = carEconomy;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }
    public void getTotalMoney() {

    }

    public LocalDate getCheckIn() {
        return checkIn;
    }

    public void setCheckIn(LocalDate checkIn) {
        this.checkIn = checkIn;
    }

    public LocalDate getCheckOut() {
        return checkOut;
    }

    public void setCheckOut(LocalDate checkOut) {
        this.checkOut = checkOut;
    }
    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
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
        return "Bill{" +
                "client=" + client +
                ", carVip=" + carVip +
                ", carEconomy=" + carEconomy +
                '}';
    }
}

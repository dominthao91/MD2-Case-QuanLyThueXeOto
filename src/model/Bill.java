package model;

import model.car.CarEconomy;
import model.car.CarVip;

import java.time.LocalDate;
import java.util.List;

public class Bill {
    private Client client;
    private CarVip carVip;
    private CarEconomy carEconomy;
    private LocalDate checkIn;
    private LocalDate checkOut;
    private List<Client>clients;
    private List<CarEconomy>carEconomies;
    private List<CarVip>carVips;

    public Bill() {
    }

    public Bill(Client client, CarVip carVip, CarEconomy carEconomy, LocalDate checkIn, LocalDate checkOut) {
        this.client = client;
        this.carVip = carVip;
        this.carEconomy = carEconomy;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    public int searchClientByIdentity(String identity) {
        int index = -1;
        for (int i = 0; i < clients.size(); i++) {
            if (clients.get(i).getIdentity().equals(identity)) {
                index = i;
            }
        }
        return index;
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

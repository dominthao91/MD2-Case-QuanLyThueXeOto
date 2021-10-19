package model;

import model.car.CarEconomy;
import model.car.CarVip;

import java.time.LocalDate;
import java.util.List;

public class Bill {
    private Client client;
    private CarVip carVip;
    private CarEconomy carEconomy;
   private double dayNumber;
   private double totalMoneyCarVip;
   private double totalMoneyCarEconomy;
    private List<Client>clients;
    private List<CarEconomy>carEconomies;
    private List<CarVip>carVips;

    public Bill(Client client, CarVip carVip) {
        this.client = client;
        this.carVip = carVip;
    }

    public Bill(String fullName, String identity, String phone, String address, String nameCar, String color, String licensePlate, double price, String status) {
    }

    public Bill(Client client, CarVip carVip, CarEconomy carEconomy, double dayNumber, double totalMoneyCarVip, double totalMoneyCarEconomy, List<Client> clients, List<CarEconomy> carEconomies, List<CarVip> carVips) {
        this.client = client;
        this.carVip = carVip;
        this.carEconomy = carEconomy;
        this.dayNumber = dayNumber;
        this.totalMoneyCarVip = totalMoneyCarVip;
        this.totalMoneyCarEconomy = totalMoneyCarEconomy;
        this.clients = clients;
        this.carEconomies = carEconomies;
        this.carVips = carVips;
    }

    public double getMoneyCarVip() {
        return totalMoneyCarVip = carVip.getPrice()*dayNumber;
    }

    public void setTotalMoneyCarVip(double totalMoneyCarVip) {
        this.totalMoneyCarVip = totalMoneyCarVip;
    }

    public double getTotalMoneyCarEconomy() {
        return totalMoneyCarEconomy = carEconomy.getPrice()*dayNumber;
    }

    public void setTotalMoneyCarEconomy(double totalMoneyCarEconomy) {
        this.totalMoneyCarEconomy = totalMoneyCarEconomy;
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

    public double getDayNumber() {
        return dayNumber;
    }

    public void setDayNumber(double dayNumber) {
        this.dayNumber = dayNumber;
    }

    public List<Client> getClients() {
        return clients;
    }

    public void setClients(List<Client> clients) {
        this.clients = clients;
    }

    public List<CarEconomy> getCarEconomies() {
        return carEconomies;
    }

    public void setCarEconomies(List<CarEconomy> carEconomies) {
        this.carEconomies = carEconomies;
    }

    public List<CarVip> getCarVips() {
        return carVips;
    }

    public void setCarVips(List<CarVip> carVips) {
        this.carVips = carVips;
    }

    @Override
    public String toString() {
        return "Bill{" +
                "client=" + client +
                ", carVip=" + carVip +
                ", carEconomy=" + carEconomy +
                ", dayNumber=" + dayNumber +
                ", carVips=" + carVips +
                '}';
    }
}

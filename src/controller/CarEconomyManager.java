package controller;

import model.car.CarEconomy;

import java.util.ArrayList;
import java.util.List;

public class CarEconomyManager implements IGeneralCar<CarEconomy> {
    private List<CarEconomy> carEconomies = new ArrayList<>();

    public CarEconomyManager() {
    }

    public CarEconomyManager(List<CarEconomy> carEconomies) {
        this.carEconomies = carEconomies;
    }

    @Override
    public void showAll() {

    }

    @Override
    public void addNew(CarEconomy carEconomy) {

    }

    @Override
    public void updateByLicensePlate(String licensePlate, CarEconomy carEconomy) {

    }

    @Override
    public void removeByLicensePlate(String licensePlate, CarEconomy carEconomy) {

    }

    @Override
    public int searchByLicensePlate(String licensePlate) {
        return 0;
    }
}

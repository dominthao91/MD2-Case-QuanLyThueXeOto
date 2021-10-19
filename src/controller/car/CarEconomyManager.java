package controller.car;

import model.car.CarEconomy;

import java.util.ArrayList;
import java.util.List;

public class CarEconomyManager implements IGeneralCar<CarEconomy> {
    private List<CarEconomy> carEconomy = new ArrayList<>();

    public CarEconomyManager() {
    }

    public CarEconomyManager(List<CarEconomy> carEconomies) {
        this.carEconomy = carEconomies;
    }

    @Override
    public void showAll() {
        for (CarEconomy carE : carEconomy) {
            System.out.println(carE);
        }
    }

    @Override
    public void addNew(CarEconomy carEconomy) {
        this.carEconomy.add(carEconomy);
    }

    @Override
    public void updateByLicensePlate(String licensePlate, CarEconomy carEconomy) {
        int index = searchByLicensePlate(licensePlate);
        if (index != -1) {
            this.carEconomy.set(index, carEconomy);
        } else {
            System.err.println("Biển số xe không hợp lệ =>>.");
        }
    }

    @Override
    public void removeByLicensePlate(String licensePlate) {
        int index = searchByLicensePlate(licensePlate);
        if (index != -1) {
            carEconomy.remove(index);
        } else {
            System.err.println("Biển số xe không hợp lệ =>>.");
        }
    }

    @Override
    public int searchByLicensePlate(String licensePlate) {
        int index = -1;
        for (int i = 0; i < carEconomy.size(); i++) {
            if (carEconomy.get(i).getLicensePlate().equals(licensePlate)) {
                index = i;
            }
        }
        return index;
    }
}

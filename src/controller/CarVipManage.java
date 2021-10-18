package controller;

import model.car.CarVip;

import java.util.ArrayList;
import java.util.List;

public class CarVipManage implements IGeneralCar<CarVip> {
    private List<CarVip> carVips = new ArrayList<>();

    public CarVipManage() {
    }

    public CarVipManage(List<CarVip> carVips) {
        this.carVips = carVips;
    }

    @Override
    public void showAll() {
        for (CarVip carVip:carVips ){
            System.out.println(carVip);
        }
    }

    @Override
    public void addNew(CarVip carVip) {
        carVips.add(carVip);
    }

    @Override
    public void updateByLicensePlate(String licensePlate, CarVip carVip) {
        int index = searchByLicensePlate(licensePlate);
        if (index != -1) {
            carVips.set(index, carVip);
        } else {
            System.err.println("Biển số xe không hợp lệ =>>.");
        }
    }

    @Override
    public void removeByLicensePlate(String licensePlate, CarVip carVip) {
        int index = searchByLicensePlate(licensePlate);
        if (index != -1) {
            carVips.remove(index);
        } else {
            System.err.println("Biển số xe không hợp lệ =>>.");
        }
    }

    @Override
    public int searchByLicensePlate(String licensePlate) {
        int index = -1;
        for (int i = 0; i < carVips.size(); i++) {
            if (carVips.get(i).getLicensePlate().equals(licensePlate)) {
                index = i;
            }
        }
        return index;
    }
}

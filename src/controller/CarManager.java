package controller;

import model.car.Car;

import java.util.ArrayList;
import java.util.List;

public class CarManager implements IGeneralManager<Car> {
    private List<Car> carList = new ArrayList<>();

    public List<Car> getCarList() {
        return carList;
    }

    public void setCarList(List<Car> carList) {
        this.carList = carList;
    }

    public CarManager() {
    }

    public CarManager(List<Car> carList) {
        this.carList = carList;
    }

    @Override
    public void addAll(Car car) {
        carList.add(car);
    }

    @Override
    public void showAll() {
        for (Car car : carList) {
            System.out.println(car);
        }
    }

    @Override
    public void removeByLicensePlate(String licensePlate) {
        int index = searchByLicensePlate(licensePlate);
        if (index!=-1){
            carList.remove(index);
        }else {
            System.out.println("Không tìm thấy Biển số xe này >>>.");
        }
    }

    @Override
    public void updateByLicensePlate(String licensePlate, Car car) {
        int index = searchByLicensePlate(licensePlate);
        if (index != -1) {
            carList.set(index, car);
        } else {

            System.out.println("Không tìm thấy biển số này >>.");
        }
    }

    @Override
    public int searchByLicensePlate(String licensePlate) {
        int index = -1;
        for (int i = 0; i < carList.size(); i++) {
            if (carList.get(i).getLicensePlate().equals(licensePlate)){
                return i;
            }
        }
        return index;
    }
}

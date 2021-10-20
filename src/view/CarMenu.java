package view;

import controller.CarManager;
import model.car.Car;

import java.util.ArrayList;
import java.util.List;

public class CarMenu {
    public List<Car> runCar() {
        Car car1 = new Car("x1", "x", "", "11", "vip");
        Car car2 = new Car("x2", "d", "", "22", "thuong");
        Car car3 = new Car("x3", "v", "", "33", "vip");
        CarManager carManager = new CarManager();
        List<Car> carList = new ArrayList<>();
        carManager.setCarList(carList);
        carManager.addAll(car1);
        carManager.addAll(car2);
        carManager.addAll(car3);

        return carList;
    }

}

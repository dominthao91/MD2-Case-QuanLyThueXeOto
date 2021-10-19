package model.car;

import java.io.Serializable;

public class CarVip extends Car implements Serializable {
   public CarVip() {
   }

   public CarVip(String nameCar, String color, String licensePlate, double price, String status) {
      super(nameCar, color, licensePlate, price, status);
   }
}

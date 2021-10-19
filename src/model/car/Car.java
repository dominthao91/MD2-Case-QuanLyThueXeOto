package model.car;

public class Car {
    private String nameCar;
    private String color;
    private String licensePlate;
    private double price;
    private boolean status;

    public Car() {
    }

    public Car(String nameCar, String color, String licensePlate, double price, boolean status) {
        this.nameCar = nameCar;
        this.color = color;
        this.licensePlate = licensePlate;
        this.price = price;
        this.status = status;
    }

    public String getNameCar() {
        return nameCar;
    }

    public void setNameCar(String nameCar) {
        this.nameCar = nameCar;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Car{" +
                "nameCar='" + nameCar + '\'' +
                ", color='" + color + '\'' +
                ", licensePlate='" + licensePlate + '\'' +
                ", price=" + price +
                ", status='" + status + '\'' +
                '}';
    }
}

package controller.car;

public interface IGeneralCar<T>{
    void showAll();
    void addNew(T t);
    void updateByLicensePlate(String licensePlate,T t);
    void removeByLicensePlate(String licensePlate);
    int searchByLicensePlate(String licensePlate);
}

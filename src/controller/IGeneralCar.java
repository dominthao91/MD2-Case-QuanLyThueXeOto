package controller;

public interface IGeneralCar<T>{
    void showAll();
    void addNew(T t);
    void updateByLicensePlate(String licensePlate,T t);
    void removeByLicensePlate(String licensePlate,T t);
    int searchByLicensePlate(String licensePlate);
}

package controller;

public interface IGeneralClient <T>{
    void showAll();
    void addNew(T t);
    void updateByLicensePlate(String identity,T t);
    void removeByLicensePlate(String identity,T t);
    int searchByLicensePlate(String identity);
}

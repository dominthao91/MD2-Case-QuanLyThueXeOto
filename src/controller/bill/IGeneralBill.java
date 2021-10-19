package controller.bill;

public interface IGeneralBill <T>{
    void showAll();
    void addNew(T t);
    void updateByIdentity(String identity,T t);
    void removeByIdentity(String identity);
    int searchByIdentity(String identity);
}

package controller.bill;

import controller.bill.IGeneralBill;
import model.Bill;

import java.util.ArrayList;
import java.util.List;

public class BillManage implements IGeneralBill<Bill> {
    private List<Bill> bills = new ArrayList<>();

    public BillManage() {
    }

    public BillManage(List<Bill> bills) {
        this.bills = bills;
    }


    @Override
    public void showAll() {
        for (Bill bill : bills) {
            System.out.println(bill);
        }
    }

    @Override
    public void addNew(Bill bill) {
        bills.add(bill);
    }

    @Override
    public void updateByLicensePlate(String identity, Bill bill) {
        int index = searchByLicensePlate(identity);
        if (index != -1) {
            bills.set(index,bill);
        } else {
            System.err.println("Số CMND không hợp lệ =>>.");
        }
    }

    @Override
    public void removeByLicensePlate(String identity, Bill bill) {
        int index = searchByLicensePlate(identity);
        if (index != -1) {
            bills.remove(index);
        } else {
            System.err.println("Số CMND không hợp lệ =>>.");
        }

    }

    @Override
    public int searchByLicensePlate(String identity) {
        int index = -1;
        for (int i = 0; i < bills.size(); i++) {
            if (bills.get(i).getClient().getIdentity().equals(identity)) {
                index = i;
            }
        }
        return index;
    }
}
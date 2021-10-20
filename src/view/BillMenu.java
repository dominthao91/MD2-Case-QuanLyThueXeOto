package view;

import controller.BillManager;
import controller.UserManager;
import model.bill.Bill;
import model.car.Car;
import model.car.User;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class BillMenu {
    public static BillManager billManager = new BillManager();
    UserManager userManager = new UserManager();
    UserMenu userMenu = new UserMenu();
    CarMenu carMenu = new CarMenu();
    private Bill inputBill;

    public void runBill() {
        int choice;
        do {
            System.out.println("1.Hiển thị Bill");
            System.out.println("2. Thêm mới Bill");
            System.out.println("3. Sửa Bill");
            System.out.println("4. Xóa BIll");
            System.out.println("5.Tính tiền ");
            System.out.println("0. Quay Lại");
            System.out.println("Nhập lựa chọn của bạn");
            Scanner scanner = new Scanner(System.in);
            choice = scanner.nextInt();
            switch (choice) {
                case 1: {
                    showBill();
                    break;
                }
                case 2: {
                    addNewBill();
                    break;
                }
                case 3:{
                    updateBill();
                    break;
                }
                case 4:{
                    deleteBill();
                    break;
                }
                case 5:{
                    totalMoney();
                }
                case 0:{
                    System.exit(0);
                }
            }

        } while (choice != 0);
    }

    private void totalMoney() {
        int index=0;
        if (billManager.getBillList().get(index).getCar().getType().equals("vip")){
            long ls = billManager.getBillList().get(index).getTotalPrice() * 2;
        }else {
            billManager.getBillList().get(index).getTotalPrice();
        }

    }

    private void deleteBill() {
        System.out.println("4. Xóa BIll");
        System.out.println("Nhập biển số xe");
        Scanner scanner = new Scanner(System.in);
        String bsx =scanner.nextLine();
        billManager.removeByLicensePlate(bsx);
    }

    private void updateBill() {
        System.out.println("3. Sửa Bill");
        System.out.println("Nhập biển số xe");
        Scanner scanner = new Scanner(System.in);
        String bsx =scanner.nextLine();
        billManager.updateByLicensePlate(bsx,inputBill());
    }

    private void addNewBill() {
        System.out.println("2. Thêm mới Bill");
        billManager.addAll(inputBill());

    }

    private Bill inputBill() {
        System.out.println("Thêm danh sách BIll");
        System.out.println("Nhập ID");
        Scanner sc = new Scanner(System.in);
        String id = sc.nextLine();
        System.out.println("Nhập CMND");
        String identity = sc.nextLine();
        searchUser(identity);
        System.out.println("Nhập biển số xe");
        String bsx =sc.nextLine();
        checkIn();
        checkOut();
        searchCar(bsx);
        return new Bill(id,searchCar(bsx),searchUser(identity),checkIn(),checkOut());
    }

    private LocalDate checkOut() {
        System.out.println("Ngày trả");
        check();
        return checkOut();
    }

    private LocalDate checkIn() {
        System.out.println("Ngày Thuê");
        check();
        return checkIn();
    }

    private void check() {
        System.out.println("Nhập năm");
        Scanner scanner =new Scanner(System.in);
        int year =scanner.nextInt();
        System.out.println("Nhập tháng");
        Scanner scanner1 =new Scanner(System.in);
        int month =scanner1.nextInt();
        System.out.println("Nhập ngày");
        Scanner scanner2 =new Scanner(System.in);
        int day =scanner2.nextInt();
        LocalDate.of(year,month,day);
    }

    private void showBill() {
        billManager.showAll();
    }

    private User searchUser(String identity) {

       int index= userManager.searchByIdentity(identity);
       return userManager.getUserList().get(index);
    }
    private Car searchCar(String licensePlate) {
        List<Car>cars=carMenu.runCar();
        for (Car car:cars  ) {
            if (car.getLicensePlate().equals(licensePlate)){
               return car;
            }
        }
        return null;
    }
}

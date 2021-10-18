package controller;

import controller.bill.BillManage;
import controller.car.CarEconomyManager;
import controller.car.CarVipManage;
import controller.client.ClientManage;
import model.car.CarVip;

import java.util.Scanner;

public class Management {
    public static CarVipManage carVipManage = new CarVipManage();
    public static CarEconomyManager carEconomyManager = new CarEconomyManager();
    public static ClientManage clientManage = new ClientManage();
    public static BillManage billManage = new BillManage();
    public void runAll(){
        int choice;
        do {
            System.out.println("1. CarVip");
            System.out.println("2. CarEconomy");
            System.out.println("3. Client");
            System.out.println("4. Bill");
            System.out.println("0. Exit");
            System.out.println(" Nhập lựa chọn cửa bạn >>>");
            Scanner scanner = new Scanner(System.in);
            choice =scanner.nextInt();
            switch (choice){
                case 1:{
                    runCarVip();
                }
                case 2:{
                    runCarEconomy();
                }
            }

        }while (choice!=0);
    }
    public void runCarEconomy(){
        int choice;
        do {
            System.out.println("1. Hiển thị xe");
            System.out.println("2. Thêm xe mới vào kho");
            System.out.println("3. Sửa thông tin xe");
            System.out.println("4. Xóa thông tin xe");
            System.out.println("0. Quay lại");
            System.out.println("Nhập lựa chọn của bạn");
            Scanner scanner = new Scanner(System.in);
            choice = scanner.nextInt();
            switch (choice) {
                case 1: {
                    showCarEconomy();
                }
                case 2:{
                    addNewCarEconomy();
                    break;
                }
                case 3:{
                    updateCarEconomy();
                    break;
                }
                case 4:{
                    deleteCarEconomy();
                    break;
                }
                case 5:{
                    System.exit(0);
                }

            }

        } while (choice != 0);
    }
    private void deleteCarEconomy() {
        System.out.println("Nhập biển số xe muốn sửa");
        Scanner scanner = new Scanner(System.in);
        String licensePlate =scanner.nextLine();
        carVipManage.removeByLicensePlate(licensePlate);
    }

    private void updateCarEconomy() {
        System.out.println("Nhập biển số xe muốn sửa");
        Scanner scanner = new Scanner(System.in);
        String licensePlate =scanner.nextLine();
        CarVip carVip =inputCarEconomy();
        carVipManage.updateByLicensePlate(licensePlate,carVip);
    }

    private void showCarEconomy() {
        carVipManage.showAll();
    }

    private void addNewCarEconomy() {
        CarVip carVip = inputCarEconomy();
        carVipManage.addNew(carVip);
    }

    private CarVip inputCarEconomy() {
        System.out.println("Thêm danh sách xe mới : ");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên xe : ");
        String name = scanner.nextLine();
        System.out.println("Nhâp màu xe : ");
        String color = scanner.nextLine();
        System.out.println("Nhập Biển số xe : ");
        String licensePlate = scanner.nextLine();
        System.out.println("Tinh trạng xe : ");
        String status = scanner.nextLine();
        System.out.println("Nhập giá cho  thuê");
        String price = scanner.nextLine();
        CarVip carVip = new CarVip(name, color, licensePlate, status,price);
        return carVip;
    }


    public void runCarVip() {
        int choice;
        do {
            System.out.println("1. Hiển thị xe");
            System.out.println("2. Thêm xe mới vào kho");
            System.out.println("3. Sửa thông tin xe");
            System.out.println("4. Xóa thông tin xe");
            System.out.println("0. Quay lại");
            System.out.println("Nhập lựa chọn của bạn");
            Scanner scanner = new Scanner(System.in);
            choice = scanner.nextInt();
            switch (choice) {
                case 1: {
                   showCarVip();
                }
                case 2:{
                    addNewCarVip();
                    break;
                }
                case 3:{
                    updateCarVip();
                    break;
                }
                case 4:{
                    deleteCarVip();
                    break;
                }
                case 5:{
                    System.exit(0);
                }

            }

        } while (choice != 0);
    }

    private void deleteCarVip() {
        System.out.println("Nhập biển số xe muốn xóa");
        Scanner scanner = new Scanner(System.in);
        String licensePlate =scanner.nextLine();
        carVipManage.removeByLicensePlate(licensePlate);
    }

    private void updateCarVip() {
        System.out.println("Nhập biển số xe muốn sửa");
        Scanner scanner = new Scanner(System.in);
        String licensePlate =scanner.nextLine();
        CarVip carVip =inputCar();
        carVipManage.updateByLicensePlate(licensePlate,carVip);
    }

    private void showCarVip() {
        carVipManage.showAll();
    }

    private void addNewCarVip() {
        CarVip carVip = inputCar();
        carVipManage.addNew(carVip);
    }

    private CarVip inputCar() {
        System.out.println("Thêm danh sách xe mới : ");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên xe : ");
        String name = scanner.nextLine();
        System.out.println("Nhâp màu xe : ");
        String color = scanner.nextLine();
        System.out.println("Nhập Biển số xe : ");
        String licensePlate = scanner.nextLine();
        System.out.println("Tinh trạng xe : ");
        String status = scanner.nextLine();
        System.out.println("Nhập giá cho  thuê");
        String price = scanner.nextLine();
            CarVip carVip = new CarVip(name, color, licensePlate, status,price);
        return carVip;
    }

}

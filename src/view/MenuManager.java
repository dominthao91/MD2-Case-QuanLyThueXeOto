package view;

import java.util.Scanner;

public class MenuManager {
    BillMenu billMenu = new BillMenu();
    CarMenu carMenu = new CarMenu();

    public void runMenu() {
        int choice;
        do {
            System.out.println("  =====ỨNG DỤNG QUẢN LÝ THUÊ XE =====");
            System.out.println("1.|           Đăng nhập             |");
            System.out.println("2.|        Đăng kí thuê xe          |");
            System.out.println("0.|             Thoát               |");
            System.out.println("  ===================================");
            System.out.println("       Nhập lựa chọn của bạn       ");
            Scanner scanner = new Scanner(System.in);
            choice = scanner.nextInt();
            switch (choice) {
                case 1: {
                    runBill();
                    break;
                }
                case 2: {

                    break;
                }
                case 0: {
                    System.exit(0);
                }
            }

        } while (choice != 0);
    }

    public void runBill() {
        int choice;
        do {
            System.out.println("Hello Admin");
            System.out.println("1. Quản lý xe");
            System.out.println("2. Quản lý Bill");
            System.out.println("0. Quay Lại");
            System.out.println("Nhập lựa chọn của Bạn");
            Scanner scanner = new Scanner(System.in);
            choice = scanner.nextInt();
            switch (choice) {
                case 1: {
                    carMenu.run();
                    carMenu.runCar();
                    break;
                }
                case 2: {
                    billMenu.runBill();
                    break;
                }
                case 0: {
                    runMenu();
                }
            }


        } while (choice != 0);
    }


}

package view;

import controller.AdminManage;
import controller.Management;
import model.Admin;

import java.util.Scanner;

public class LoginMenu {
    private AdminManage adminManage = new AdminManage();
    Management management = new Management();

    public void run() {
        adminManage.addAccount(new Admin("thao8386", "t11"));
        int choice;
        do {
            System.out.println("=======ỨNG DỤNG QUẢN LÝ THUÊ XE =======");
            System.out.println("1.           Đăng nhập");
            System.out.println("3.        Đăng kí thuê xe");
            System.out.println("0.             Thoát");
            System.out.println("Nhập lựa chọn của bạn");
            Scanner scanner = new Scanner(System.in);
            choice = scanner.nextInt();
            switch (choice) {
                case 1: {
                    doLogin();
                    break;
                }
            }


        } while (choice != 0);
    }

    private void doLogin() {
        System.out.println("Đăng Nhập");
        System.out.println("Nhập UserName");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Nhập password");
        String password = scanner.nextLine();
        Admin admin = new Admin(name, password);
        if (adminManage.isLogin(admin) != null) {
            management.runAll();
        } else {
            System.err.println("Sai tài khoản hoặc mật khẩu");
        }
    }
}

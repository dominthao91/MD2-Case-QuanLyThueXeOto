package view;

import controller.UserManager;
import model.car.User;

import java.util.Scanner;

public class UserMenu {
     UserManager userManager = new UserManager();
    public void runUser(){
        int choice;
        do {
            System.out.println("1. Thêm khách hàng");
            System.out.println("2. Hiển thị danh sách khách hàng");
            System.out.println("3. Sửa thông tin khách hàng");
            System.out.println("4. Xóa khách hàng");
            System.out.println("5. Tìm kiếm khách hàng");
            System.out.println("0. Quay lại");
            System.out.println("Nhập lựa chọn của bạn");
            Scanner scanner =new Scanner(System.in);
            choice = scanner.nextInt();
            switch (choice){
                case 1:{
                    addNewUser();
                    break;
                }
                case 2:{
                    showUserList();
                    break;
                }
                case 3:{
                    updateUser();
                    break;
                }
                case 4:{
                    deleteUser();
                    break;
                }
                case 5:{
                    searchUser();
                }
                case 0:{
                    System.exit(0);
                }
            }

        }while (choice!=0);
    }

    private void searchUser() {
        System.out.println("5. Tìm kiếm khách hàng");
        System.out.println("Nhập CMND");
        Scanner scanner =new Scanner(System.in);
        String identity =scanner.nextLine();
        userManager.searchByIdentity(identity);
    }

    private void deleteUser() {
        System.out.println("4. Xóa khách hàng");
        System.out.println("Nhập CMND");
        Scanner scanner =new Scanner(System.in);
        String identity =scanner.nextLine();
        userManager.removeByIdentity(identity);
    }

    private void updateUser() {
        System.out.println("3. Sửa thông tin khách hàng");
        System.out.println("Nhập CMND");
        Scanner scanner =new Scanner(System.in);
        String identity =scanner.nextLine();
        userManager.updateByIdentity(identity,inputUser());

    }

    private void showUserList() {
        System.out.println("2. Hiển thị danh sách khách hàng");
        userManager.showAll();
    }

    private void addNewUser() {
        System.out.println("1. Thêm khách hàng");
        userManager.addAll(inputUser());
    }

    private User inputUser() {
        System.out.println("Nhập tên");
        Scanner scanner =new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Nhập số CMND");
        String identity =scanner .nextLine();
        System.out.println("Nhập SDT");
        String phone = scanner.nextLine();
        System.out.println("Nhập địa chỉ");
        String address =scanner.nextLine();
        return new User(name,identity,phone,address);
    }

}

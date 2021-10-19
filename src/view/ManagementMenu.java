package view;

import controller.bill.BillManage;
import controller.car.CarEconomyManager;
import controller.car.CarVipManage;
import controller.client.ClientManage;
import model.Bill;
import model.Client;
import model.car.CarEconomy;
import model.car.CarVip;

import java.util.Scanner;

public class ManagementMenu {
    public static CarVipManage carVipManage = new CarVipManage();
    public static CarEconomyManager carEconomyManager = new CarEconomyManager();
    public static ClientManage clientManage = new ClientManage();
    public static BillManage billManage = new BillManage();

    public void runAll() {
        int choice;
        do {
            System.out.println("1. CarVip");
            System.out.println("2. CarEconomy");
            System.out.println("3. Client");
            System.out.println("4. Bill");
            System.out.println("0. Exit");
            System.out.println(" Nhập lựa chọn cửa bạn >>>");
            Scanner scanner = new Scanner(System.in);
            choice = scanner.nextInt();
            switch (choice) {
                case 1: {
                    runCarVip();
                    break;
                }
                case 2: {
                    runCarEconomy();
                    break;
                }
                case 3: {
                    runClient();
                    break;
                }
                case 4: {
                    runBill();
                    break;
                }
                case 0:{
                    System.exit(0);
                }
            }

        } while (choice != 0);
    }

    private void runClient() {
    }

    private void runBill() {
        int choice;
        do {
            System.out.println("======== Bill =========");
            System.out.println("1.  Hiển thị bill  ");
            System.out.println("2.    Thêm bill    ");
            System.out.println("3.    Xóa Bill     ");
            System.out.println("4.    Sửa Bill    ");
            System.out.println("5. Tính tiền cho khách");
            System.out.println("0.     Thoát    ");
            System.out.println(" Nhập lựa chọn của bạn");
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
                case 3: {
                    deleteBill();
                    break;
                }
                case 4: {
                    updateBill();
                    break;
                }
                case 5: {
                    getMoney();
                    break;
                }
                case 0: {
                   runAll();
                }
            }

        } while (choice != 0);
    }

    private void showBill() {
        billManage.showAll();
    }

    private void getMoney() {
        System.out.println("Nhập số CMND khách muốn tính tiền");
        Scanner scanner = new Scanner(System.in);
        String identity = scanner.nextLine();
        billManage.showTotalPrice(identity);
    }

    private void updateBill() {
        System.out.println("Nhập số CMND khách muốn sửa");
        Scanner scanner = new Scanner(System.in);
        String identity = scanner.nextLine();
        Bill bill = inputBill();
        billManage.updateByIdentity(identity, bill);
    }

    private void deleteBill() {
        System.out.println("Nhập số CMND khách muốn xóa");
        Scanner scanner = new Scanner(System.in);
        String identity = scanner.nextLine();
        billManage.removeByIdentity(identity);
    }

    private void addNewBill() {

        billManage.addNew(inputBill());

    }

    private Bill inputBill() {
        System.out.println("Thêm danh sách BIll");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên khách hàng");
        String fullName = scanner.nextLine();
        System.out.println("Nhập CMND khách ");
        String identity = scanner.nextLine();
        System.out.println("Nhập số phone của khách");
        String phone = scanner.nextLine();
        System.out.println("Nhập địa chỉ khách");
        String address = scanner.nextLine();
        System.out.println("Nhập tên xe");
        String nameCar = scanner.nextLine();
        System.out.println("Nhập màu xe");
        String color = scanner.nextLine();
        System.out.println("Nhập biển số xe");
        String licensePlate = scanner.nextLine();
        System.out.println("Nhập giá tiền thuê / ngày");
        double price = scanner.nextDouble();
        System.out.println("Nhập tình trạng xe");
        scanner.nextLine();
        String status = scanner.nextLine();
        return new Bill(new Client(fullName,identity,phone,address),new CarVip(nameCar,color,licensePlate,price,status));
    }

    public void runCarEconomy() {
        int choice;
        do {
            System.out.println("  ======= CaEconomy =======");
            System.out.println("1.|      Hiển thị xe      |");
            System.out.println("2.|   Thêm xe mới vào kho |");
            System.out.println("3.|    Sửa thông tin xe   |");
            System.out.println("4.|   Xóa thông tin xe    |");
            System.out.println("0.|      Quay lại         |");
            System.out.println(" __Nhập lựa chọn của bạn __");
            Scanner scanner = new Scanner(System.in);
            choice = scanner.nextInt();
            switch (choice) {
                case 1: {
                    showCarEconomy();
                }
                case 2: {
                    addNewCarEconomy();
                    break;
                }
                case 3: {
                    updateCarEconomy();
                    break;
                }
                case 4: {
                    deleteCarEconomy();
                    break;
                }
                case 0: {
                   runAll();
                }

            }

        } while (choice != 0);
    }

    private void deleteCarEconomy() {
        System.out.println("Nhập biển số xe muốn sửa");
        Scanner scanner = new Scanner(System.in);
        String licensePlate = scanner.nextLine();
        carEconomyManager.removeByLicensePlate(licensePlate);
    }

    private void updateCarEconomy() {
        System.out.println("Nhập biển số xe muốn sửa");
        Scanner scanner = new Scanner(System.in);
        String licensePlate = scanner.nextLine();
        CarEconomy carEconomy = inputCarEconomy();
        carEconomyManager.updateByLicensePlate(licensePlate, carEconomy);
    }

    private void showCarEconomy() {
        carEconomyManager.showAll();
    }

    private void addNewCarEconomy() {
        CarEconomy carEconomy = inputCarEconomy();
        carEconomyManager.addNew(carEconomy);
    }

    private CarEconomy inputCarEconomy() {
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
        CarEconomy carEconomy = new CarEconomy(name, color, licensePlate, price, status);
        return carEconomy;
    }


    public void runCarVip() {
        int choice;
        do {
            System.out.println("  ======= CarVip =======");
            System.out.println("1.|    Hiển thị xe      |");
            System.out.println("2.| Thêm xe mới vào kho |");
            System.out.println("3.|  Sửa thông tin xe   |");
            System.out.println("4.| Xóa thông tin xe    |");
            System.out.println("0.|    Quay lại         |");
            System.out.println(" = Nhập lựa chọn của bạn =");
            Scanner scanner = new Scanner(System.in);
            choice = scanner.nextInt();
            switch (choice) {
                case 1: {
                    showCarVip();
                    break;
                }
                case 2: {
                    addNewCarVip();
                    break;
                }
                case 3: {
                    updateCarVip();
                    break;
                }
                case 4: {
                    deleteCarVip();
                    break;
                }
                case 0: {
                   runAll();
                }

            }

        } while (choice != 0);
    }

    private void deleteCarVip() {
        System.out.println("Nhập biển số xe muốn xóa");
        Scanner scanner = new Scanner(System.in);
        String licensePlate = scanner.nextLine();
        carVipManage.removeByLicensePlate(licensePlate);
    }

    private void updateCarVip() {
        System.out.println("Nhập biển số xe muốn sửa");
        Scanner scanner = new Scanner(System.in);
        String licensePlate = scanner.nextLine();
        CarVip carVip = inputCar();
        carVipManage.updateByLicensePlate(licensePlate, carVip);
    }

    private void showCarVip() {
        carVipManage.showAll();
    }

    private void addNewCarVip() {
        CarVip carVip = inputCar();
        carVipManage.addNew(carVip);
    }

    private CarVip inputCar() {
        System.out.println(" Thêm danh sách xe mới : ");
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
        double price = scanner.nextDouble();
        return new CarVip(name, color, licensePlate,price,status);

    }

}

package view;

import model.User;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
    private static LoginView loginView;
    private  static Scanner scanner;
    private static User currentUser = null;
    public Menu() {
        loginView = new LoginView();
        scanner = new Scanner(System.in);
    }
    public static void menuLogin() {
        System.out.println("                               ╔════════════════════════════════════--Giao diện--══════════════════════════════════╗");
        System.out.println("                               ║                                                                                   ║");
        System.out.println("                               ║                              WELCOME TO PHUC LONG COFFEE!                         ║");
        System.out.println("                               ║                                   1. Login by Admin                               ║");
        System.out.println("                               ║                                   2. Login by Customer                            ║");
        System.out.println("                               ║                                   3. Exit                                         ║");
        System.out.println("                               ╚═══════════════════════════════════════════════════════════════════════════════════╝");
        System.out.println();
        System.out.println();
    }
    public static void login() {
        do {
            menuLogin();
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.println("\nChọn chức năng ");
                System.out.print("\t➺ ");
                int number = scanner.nextInt();
                switch (number) {
                    case 1:
                        admin();
                        break;
                    case 2:
                        customer();
                        break;
                    case 3:
                        exit();
                        break;
                    default:
                        System.out.println("Chọn chức năng không đúng! Vui lòng chọn lại");
                        login();
                }

            } catch (InputMismatchException io) {
                System.out.println("Nhập sai! Vui lòng nhập lại");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } while (true);
    }

    public static void admin() throws IOException {
        loginView.loginAdmin();

    }
    private static void customer() {
    }
    public static boolean checkLogin() {
        if (currentUser == null) {
            System.out.println("Vui lòng đăng nhập trước khi sử dụng chức năng này!");
            return false;
        }
        return true;
    }
    public static void exit() {
        System.out.println("\t\t\t\t\t\tCám ơn quý khách");
        System.out.println("\t\t\t\t\t\t ✌ Hẹn gặp lại ✌");

        System.exit(0);
    }
    public static void menuAdmin() {
        System.out.println("⚪ ⚪ ⚪ ⚪ ⚪ Giao diện chủ ⚪ ⚪ ⚪ ⚪ ⚪ ⚪");
        System.out.println("⚪                                             ⚪");
        System.out.println("⚪     1. Hiển thị danh sách sản phẩm          ⚪");
        System.out.println("⚪     2. Hiển thị mô tả sản phẩm              ⚪");
        System.out.println("⚪     3. Thêm sản phẩm vào danh sách          ⚪");
        System.out.println("⚪     4. Sửa thông tin sản phẩm               ⚪");
        System.out.println("⚪     5. Tìm kiếm sản phẩm theo tên           ⚪");
        System.out.println("⚪     6. Tìm kiếm sản phẩm theo loại          ⚪");
        System.out.println("⚪     7. Xem tổng doanh thu                   ⚪");
        System.out.println("⚪     8. Quay lại                             ⚪");
        System.out.println("⚪     9. Thoát                                ⚪");
        System.out.println("⚪                                             ⚪");
        System.out.println("⚪ ⚪ ⚪ ⚪ ⚪ ⚪ ⚪ ⚪ ⚪ ⚪ ⚪ ⚪ ⚪ ⚪ ⚪");
    }
    public static void main(String[] args) {
        login();
    }
}

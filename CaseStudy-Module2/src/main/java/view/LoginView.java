package view;

import model.ERole;
import model.User;
import repository.FileContext;
import service.FileService;
import service.UserService;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;
import java.util.UUID;

public class LoginView {
    private UserService userService;
    private Scanner scanner;
    public LoginView() {
        userService = new UserService();
        scanner = new Scanner(System.in);
    }
    public void menuLoginAdmin() {
        System.out.println("                               ╔═══════════════════════════════════════════════════════════════════════════════════╗");
        System.out.println("                               ║                                                                                   ║");
        System.out.println("                               ║                          WELCOME TO COFFE MANAGEMENT SYSTEM                       ║");
        System.out.println("                               ║-----------------------------------ADMIN LOGIN PANEL-------------------------------║");
        System.out.println("                               ║                                 Login now to admin!!!                             ║");
        System.out.println("                               ║                                                                                   ║");
        System.out.println("                               ╚═══════════════════════════════════════════════════════════════════════════════════╝");
        System.out.println();
        System.out.println();
    }
    public void menuLoginCustomer() {
        System.out.println("                               ╔═══════════════════════════════════════════════════════════════════════════════════╗");
        System.out.println("                               ║                                                                                   ║");
        System.out.println("                               ║                              WELCOME TO PHUC LONG COFFEE!                         ║");
        System.out.println("                               ║------------------------------- --CUSTOMER LOGIN PANEL--------- -------------------║");
        System.out.println("                               ║                                Login now to customer!!!                           ║");
        System.out.println("                               ║                                                                                   ║");
        System.out.println("                               ╚═══════════════════════════════════════════════════════════════════════════════════╝");
        System.out.println();
        System.out.println();
    }
    public void loginAdmin() throws IOException {
        menuLoginAdmin();
        boolean checkInfoLogin;
        do {
            System.out.println("Enter username:");
            String username = scanner.nextLine();
            System.out.println("Enter password:");
            String password = scanner.nextLine();
            checkInfoLogin = userService.checkLoginAdmin(username,password);
            if (!checkInfoLogin) {
                System.out.println("Incorrect username or incorrect password. Please re-enter");
            }else {
                userService.loginAdmin(username, password);
            }
        }while (checkInfoLogin);
    }
    public void loginCustomer() {

    }
}

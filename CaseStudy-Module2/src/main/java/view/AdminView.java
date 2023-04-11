package view;

import model.Food;

import java.io.IOException;
import java.util.Scanner;

public class AdminView {
    private FoodView foodView;
    private Scanner scanner;
    public AdminView() {
        foodView = new FoodView();
        scanner = new Scanner(System.in);
    }
    public  void menuAdminView(){
        System.out.println("                               ╔═══════════════════════════════════════════════════════════════════════════════════╗");
        System.out.println("                               ║                                    Giao diện Admin                                ║");
        System.out.println("                               ║                                 [1] Quản lý đồ uống, thức ăn                      ║");
        System.out.println("                               ║                                 [2] Quản lý đơn hàng                              ║");
        System.out.println("                               ║                                 [3] Quản lý khách hàng                            ║");
        System.out.println("                               ║                                 [4] Tổng doanh thu                                ║");
        System.out.println("                               ║                                 [5] Đăng xuất                                     ║");
        System.out.println("                               ╚═══════════════════════════════════════════════════════════════════════════════════╝");
    }
    public void launcher() throws IOException {
        boolean checkAction = false;
        do {
            menuAdminView();
            System.out.println("Chọn chức năng:");
            int select = Integer.parseInt(scanner.nextLine());
            switch (select) {
                case 1:
                    foodView.launcher();
                    break;
                case 2:
//                    addFoodByIdOrName();
                    break;
                case 3:
//                    editFoodByIdOrName();
                    break;
                case 4:
//                    findFoodByIdOrName();
                    break;
                default:
                    FoodView foodView = new FoodView();
                    foodView.launcher();
                    break;
            }
            checkAction = checkActionContinue();
        }while (checkAction);
    }
    public boolean checkActionContinue() {
        boolean checkActionContinue = false;
        do {
            System.out.println("Continue? Y/N");
            String choice = scanner.nextLine().trim().toUpperCase();
            switch (choice) {
                case "Y":
                    return true;
                case "N":
                    return false;
                default:
                    checkActionContinue = true;
            }
        } while (checkActionContinue);
        return false;
    }

}

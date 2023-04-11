package view;

import model.ETypeOfFood;
import model.Food;
import model.Oder;
import model.User;
import service.FileService;
import service.FoodService;
import service.OderService;
import service.UserService;
import utils.SortOderById;
import utils.ValidateUtils;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class OderView {
    private final String FILE_PATH = "./src/main/data/oder.csv";
    private final String FILE_PATH_ODERALL = "./src/main/data/oderAll.csv";
    private FoodService foodService;
    private UserService userService;
    private OderService oderService;
    private FileService fileService;
    private Scanner scanner;

    public OderView() {
        foodService = new FoodService();
        userService = new UserService();
        oderService = new OderService();
        fileService = new FileService();
        scanner = new Scanner(System.in);
    }

    public void addFoodInOder() throws IOException {
//        int idOder, String nameCustomer, String nameFood, int quantityFood, double priceFood, double totalMoney, Date createDateOder
        List<Food> foods = foodService.getAllFood();
        List<User> users = userService.getAllUserUse();
        List<Oder> oders = oderService.getAllOderAll();
        List<Oder> odersNew = oderService.getAllOder();
        oders.sort(new SortOderById());
        Oder oder = new Oder();
        int id;
        String nameFood = null;
        boolean checkId = false;
        do {
            boolean checkAction = false;
            System.out.println("Nhập ID đồ uống, thức ăn bạn muốn oder:");
            id = Integer.parseInt(scanner.nextLine());
            int check = foodService.checkIdFood(id);
            switch (check) {
                case 1:
                    for (int i = 0; i < foods.size(); i++) {
                        if (foods.get(i).getIdFood() == id) {
                            nameFood = foods.get(i).getNameFood();
                        }
                    }
                    checkId = true;
                    break;
                case -1:
                    System.out.println("ID không tìm thấy, mời bạn nhập lại");
                    checkId = false;
                    break;
            }
        } while (!checkId);
        int quantity = 0;
        boolean checkQuantity = false;
        boolean checkValid = false;
        do {
            System.out.println("Nhập số lượng:");
            try {
                quantity = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException numberFormatException) {
                System.out.println("Số lượng không hợp lệ vui lòng nhập lại! Số lượng từ 0-1000");
                quantity = 0;
                continue;
            }
            for (int i = 0; i < foods.size(); i++) {
                if (foods.get(i).getIdFood() == id) {
                    if (quantity <= foods.get(i).getQuantity()) {
                        checkValid = true;
                    } else {
                        checkValid = false;
                    }
                }
            }
            if (!checkValid) {
                System.out.println("Số lượng vượt quá số lượng hiện tại đang có, vui lòng nhập lại!");
            }
        } while (!checkQuantity);
        double price = 0;
        for (int i = 0; i < foods.size(); i++) {
            if (foods.get(i).getIdFood() == id) {
                price = foods.get(i).getPriceFood();
            }
        }
        double totalMoney = quantity * price;
        oder.setIdOder(oders.get(oders.size() - 1).getIdOder() + 1);
        oder.setNameCustomer(users.get(0).getFullName());
        oder.setNameFood(nameFood);
        oder.setQuantityFood(quantity);
        oder.setPriceFood(price);
        oder.setPriceFood(totalMoney);
        oder.setCreateDateOder(new Date());
        oders.add(oder);
        odersNew.add(oder);
        fileService.writeData(FILE_PATH, odersNew);
        fileService.writeData(FILE_PATH_ODERALL, oders);
    }

    public void editQuantityFoodInOder() {

    }

    public void deleteFoodOutOder() {
    }

    public void showHistoryOder() {
    }

    public void payOder() {
    }
}

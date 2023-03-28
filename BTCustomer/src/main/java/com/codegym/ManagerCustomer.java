package com.codegym;

import java.util.*;

public class ManagerCustomer {
    List<Customer> customers;
    private Scanner scanner = new Scanner(System.in);
    public ManagerCustomer() {
        customers = new ArrayList<>();
        customers.add(new Customer(1, "Bảo Thi", "baothi@gmail.com", "Huế", new Date()));
        customers.add(new Customer(2, "Văn Nghĩa", "vannghia@gmail.com", "Huế", new Date()));
        customers.add(new Customer(3, "Phước Đạt", "phuocdat@gmail.com", "Huế", new Date()));
        customers.add(new Customer(4, "Đặng Quang", "dangquang@gmail.com", "Huế", new Date()));
        customers.add(new Customer(5, "Thư Lê", "thule@gmail.com", "Huế", new Date()));
    }
    public void showCustomers() {
        System.out.printf("%5s | %30s | %20s | %10s | %30s \n", "ID", "FullName", "Email", "Address", "CreateDate");
        for (int i = 0; i < customers.size(); i++) {
            Customer customer  =  customers.get(i);
            System.out.printf("%5s | %30s | %20s | %10s | %30s \n",
                    customer.getId(),customer.getFullName(),customer.getEmail(),
                    customer.getAddress(), customer.getCreateAt());
        }
    }
    public void showCustomers(List<Customer> customers) {
        System.out.printf("%5s | %30s | %20s | %10s | %30s \n", "ID", "FullName", "Email", "Address", "CreateDate");
        for (int i = 0; i < customers.size(); i++) {
            Customer customer  =  customers.get(i);
            System.out.printf("%5s | %30s | %20s | %10s | %30s \n",
                    customer.getId(),customer.getFullName(),customer.getEmail(),
                    customer.getAddress(), customer.getCreateAt());
        }
    }

    public void addCustomer(){
        System.out.println("Nhập thông tin khách hàng:");
        System.out.println("Nhập tên khách hàng:");
        String fullName = scanner.nextLine();
        System.out.println("Nhập email: ");
        String email = scanner.nextLine();
        System.out.println("Nhập địa chỉ: ");
        String address = scanner.nextLine();

        Comparator comparator = new ComparatorById();
        customers.sort(comparator);
        long maxId = customers.get(customers.size()-1).getId();

        Customer customer = new Customer();
        customer.setId(maxId + 1);
        customer.setFullName(fullName);
        customer.setEmail(email);
        customer.setAddress(address);
        customer.setCreateAt(new Date());

        customers.add(customer);

        showCustomers();


    }

    public void editCustomer(){
        System.out.println("Nhập ID bạn muốn sửa: ");
        long id = Long.parseLong(scanner.nextLine());

        System.out.println("Nhập tên mới: ");
        String nameNew = scanner.nextLine();
        System.out.println("Nhập email mới: ");
        String emailNew = scanner.nextLine();
        System.out.println("Nhập địa chỉ mới: ");
        String addressNew = scanner.nextLine();

        for (int i = 0; i < customers.size(); i++) {
            if (id == customers.get(i).getId()) {
                customers.get(i).setFullName(nameNew);
                customers.get(i).setEmail(emailNew);
                customers.get(i).setAddress(addressNew);
            }
        }
        showCustomers();
    }

    public void deleteCustomer() {
        System.out.println("Nhập khách hàng bạn muốn xóa: ");
        long id = Long.parseLong(scanner.nextLine());

        for (int i = 0; i < customers.size(); i++) {
            if (id == customers.get(i).getId()) {
                customers.remove(i);
            }
        }
        showCustomers();
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ManagerCustomer managerCustomer = new ManagerCustomer();
        boolean checkActionMenu = true;
        do {
            System.out.println("Menu quản lý customer: ");
            System.out.println("Nhấn 1. Xem danh sách");
            System.out.println("Nhấn 2. Thêm khách hàng ");
            System.out.println("Nhấn 3. Sửa khách hàng");
            System.out.println("Nhấn 4. Xóa khách hàng");
            System.out.println("Nhấn 5. Sắp xếp khách hàng theo tên ");
            System.out.println("Nhấn 6. Sắp xếp khách hàng theo ngày tạo");
            System.out.println("Nhấn 7. Tìm kiếm khách hàng theo tên");
            System.out.println("Nhấn 8. Tìm kiếm khách hàng theo tên hoặc email");
            int actionMenu = Integer.parseInt(scan.nextLine());
            switch (actionMenu) {
                case 1:
                    managerCustomer.showCustomers();
                    break;
                case 2:
                    managerCustomer.addCustomer();
                    break;
                case 3:
                    managerCustomer.editCustomer();
                    break;
                case 4:
                    managerCustomer.deleteCustomer();
                    break;
                case 5:
                    managerCustomer.sortByName();
                    break;
                case 6:
                    managerCustomer.sortByCreatDate();
                    break;
                case 7:
                    managerCustomer.searchByName();
                    break;
                case 8:
                    managerCustomer.searchByNameOrEmail();
                    break;
                default:
                    System.out.println("Nhập sai rồi bạn ơi! Vui lòng nhập lại");
            }
            boolean checkActionMenuContinue = true;
            do {
                System.out.println("Bạn có muốn tiếp tục hay không: Y/N");
                String actionMenuContinue = scan.nextLine();
                switch (actionMenuContinue) {
                    case "Y":
                        checkActionMenu = true;
                        checkActionMenuContinue = false;
                        break;
                    case "N":
                        checkActionMenu = false;
                        checkActionMenuContinue = false;
                        break;
                    default:
                        checkActionMenuContinue = true;
                }
            }while (checkActionMenuContinue) ;

        } while (checkActionMenu);

    }

    private void searchByNameOrEmail() {
        System.out.println("Nhập tên bạn muốn tìm kiếm: ");
        String kw = scanner.nextLine();
        List<Customer> results = new ArrayList<>();
        for (int i = 0; i < customers.size(); i++) {
            if(customers.get(i).getFullName().contains(kw) || customers.get(i).getEmail().contains(kw)){
                results.add(customers.get(i));
            }
        }
        showCustomers(results);
    }

    private void searchByName() {
        System.out.println("Nhập tên bạn muốn tìm kiếm: ");
        String kw = scanner.nextLine();
        List<Customer> results = new ArrayList<>();
        for (int i = 0; i < customers.size(); i++) {
            if(customers.get(i).getFullName().contains(kw)){
                results.add(customers.get(i));
            }
        }
        showCustomers(results);
    }

    private void sortByName() {
        customers.sort(new ComparatorByName());
        showCustomers();
    }

    private void sortByCreatDate() {
//        Comparator comparator = new ComparatorByPrice();
        customers.sort(new ComparatorByCreatDate());
        showCustomers();
    }
}
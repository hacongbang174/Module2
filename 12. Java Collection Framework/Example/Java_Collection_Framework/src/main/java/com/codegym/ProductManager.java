package com.codegym;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Objects;

public class ProductManager {
    public static ArrayList<Product> products = new ArrayList<>();
    public static void addProduct(Product product) {
        products.add(product);
    }
    public static void editProduct(int id, String name, double price) {
        Product product = findProductById(id);
        if (product == null) {
            System.out.println("Không tìm thấy sản phẩm!");
        }
        product.setName(name);
        product.setPrice(price);
    }

    private static Product findProductById(int id) {
        for (Product product : products) {
            if (Objects.equals(product.getId(), id)) {
                return product;
            }
        }
        return null;
    }
    public static void deleteProduct(int id) {
        Product product = findProductById(id);
        if (product == null) {
            System.out.println("Không tìm thấy sản phẩm!");
        }
        products.remove(product);
    }
    public static void showProduct() {
        if(products.isEmpty()) {
            System.out.println("Danh sách sản phẩm trống!");
        } else {
            System.out.println("Danh sách sản phẩm:");
            for (Product product : products) {
                System.out.println(product);
            }
        }
    }
    public static void findProductByName(String name) {
        ArrayList<Product> matchedProducts = new ArrayList<>();
        for (Product product : products) {
            if (Objects.equals(product.getName(), name)) {
                matchedProducts.add(product);
            }
        }
        if (matchedProducts.isEmpty()) {
            System.out.println("Không tìm thấy sản phẩm nào với tên \"" + name + "\"");
        } else {
            System.out.println("Các sản phẩm tìm thấy với tên \"" + name + "\":");
            for (Product product : matchedProducts) {
                System.out.println(product);
            }
        }
    }
    public static void sortProductsByPriceAscending() {
        Collections.sort(products, new Comparator<Product>(){
            @Override
            public int compare(Product p1, Product p2) {
                return Double.compare(p1.getPrice(), p2.getPrice());
            }
        });
        System.out.println("Danh sách sản phẩm đã được sắp xếp tăng dần theo giá:");
        for (Product product : products) {
            System.out.println(product);
        }
    }
    public static void sortProductsByPriceDescending() {
        Collections.sort(products, new Comparator<Product>(){
            @Override
            public int compare(Product p1, Product p2) {
                return Double.compare(p2.getPrice(), p1.getPrice());
            }
        });
        System.out.println("Danh sách sản phẩm đã được sắp xếp giảm dần theo giá:");
        for (Product product : products) {
            System.out.println(product);
        }
    }
    public static void main(String[] args) {
        Product product1 = new Product(1, "Iphone", 2000);
        Product product2 = new Product(2,"Samsung",1800);
        Product product3 = new Product(3,"Nokia",1500);
        Product product4 = new Product(4,"Xiaomi",1000);

        ProductManager productManager = new ProductManager();
        productManager.addProduct(product1);
        productManager.addProduct(product2);
        productManager.addProduct(product3);
        productManager.addProduct(product4);
//        productManager.showProduct();
//
//        productManager.editProduct(1,"Vertu", 3000);
//        productManager.showProduct();
//
//        productManager.deleteProduct(1);
//        productManager.showProduct();
//
//        productManager.findProductByName("Nokia");
//
//        productManager.sortProductsByPriceAscending();
        productManager.sortProductsByPriceDescending();
    }
}

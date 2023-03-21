package com.codegym;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product(1,"Iphone",10000,"Apple","Ios"));
        products.add(new Product(2,"Nokia",5000,"Nokia","Androi"));
        products.add(new Product(3,"SamSung",7000,"Samsung","Androi"));
        products.add(new Product(4,"Xiaomi",4000,"Xiaomi","Androi"));
        products.add(new Product(5,"OPPO",5000,"OPPO","Androi"));
        writeToFile("D:\\CNTT\\Codegym\\Module2\\17. IO Binary File & Serialization\\Example\\Product\\src\\main\\java\\com\\codegym\\product.txt", products);
        List<Product> productDataFromFile = readDataFromFile("D:\\CNTT\\Codegym\\Module2\\17. IO Binary File & Serialization\\Example\\Product\\src\\main\\java\\com\\codegym\\product.txt");
        for (Product product : productDataFromFile){
            System.out.println(product);
        }
    }
    public static void writeToFile(String path, List<Product> products) {
        try {
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(products);
            oos.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static List<Product> readDataFromFile(String path){
        List<Product> products = new ArrayList<>();
        try{
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);
            products = (List<Product>) ois.readObject();
            fis.close();
            ois.close();
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return products;
    }
}
package com.codegym;

public class Main {
    private static NameClass nameClass;
    public static final String[] validAccount = new String[]{"C0223G", "A0323K"};
    public static final String[] invalidAccount = new String[]{"M0318G", "P0323A"};
    public static void main(String[] args) {
        nameClass = new NameClass();
        for (String name : validAccount) {
            boolean isValid = nameClass.validate(name);
            System.out.println("Name is " + name + " is valid: " + isValid);
        }
        for (String name : invalidAccount) {
            boolean isValid = nameClass.validate(name);
            System.out.println("Name is " + name + " is valid: " + isValid);
        }
    }
}
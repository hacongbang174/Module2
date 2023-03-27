package com.codegym;

public class Main {
    private static PhoneNumber phoneNumber;
    public static final String[] validAccount = new String[]{"(84)-(0978489648)"};
    public static final String[] invalidAccount = new String[]{"(a8)-(22222222)", "(84)-(22b22222)", "(84)-(9978489648)"};

    public static void main(String[] args) {
        phoneNumber = new PhoneNumber();
        for (String phone : validAccount) {
            boolean isValid = phoneNumber.validate(phone);
            System.out.println("Phone is " + phone + " is valid: " + isValid);
        }
        for (String phone : invalidAccount) {
            boolean isValid = phoneNumber.validate(phone);
            System.out.println("Phone is " + phone + " is valid: " + isValid);
        }
    }
}
package com.codegym;

import java.util.Scanner;

public class CountCharactersInString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String myString = input.nextLine();

        int count = 0;
        String myChar;
        do {
            System.out.print("Enter a character you want to find: ");
            myChar = input.next();
            if (myChar.length() > 1) {
                System.out.println("You can only enter one character like this: 'a', '$', '1', ...");
                continue;
            }
            for (int i = 0; i < myString.length(); i++) {
                if (myChar.charAt(0) == myString.charAt(i)) {
                    count++;
                }
            }
            break;
        } while (true);

        if (count == 0) {
            System.out.printf("Can't find '%s' in your string!", myChar);
            return;
        }
        System.out.printf("There %s %d character '%s' in your string.", count == 1 ? "is" : "are", count, myChar);
    }
}

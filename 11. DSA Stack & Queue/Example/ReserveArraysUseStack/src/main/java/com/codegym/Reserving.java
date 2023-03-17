package com.codegym;

import java.util.Arrays;
import java.util.Stack;
public class Reserving {
    public static int[] reserveArray (int[] array) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < array.length; i++) {
            stack.push(array[i]);
        }
        for (int i = 0; i < array.length; i++) {
            array[i] = stack.pop();
        }
        return array;
    }
    public static String reserveString (String string) {
        Stack<Character> wStack = new Stack<>();
        for (int i = 0; i < string.length(); i++) {
            wStack.push(string.charAt(i));
        }
        String display = "";
        for (int i = 0; i < string.length(); i++) {
            display += wStack.pop();
        }
        return display;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,7,8,9};
        int [] array = reserveArray(arr);
        System.out.println(Arrays.toString(array));
        System.out.println(reserveString("Codegym"));
    }
}

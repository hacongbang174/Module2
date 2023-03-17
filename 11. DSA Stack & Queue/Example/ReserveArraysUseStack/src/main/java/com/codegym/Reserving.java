package com.codegym;

import java.util.Arrays;
import java.util.Stack;
public class Reserving {
    private static int[] reserveIntArray(int[] array) {
        Stack<Integer> myStack = new Stack<>();
        for (int element : array) {
            myStack.push(element);
        }
        for (int i = 0; i < array.length; i++) {
            array[i] = myStack.pop();
        }
        return array;
    }

    private static String reserveString(String string) {
        Stack<Character> myStack = new Stack<>();
        for (int i = 0; i < string.length(); i++) {
            myStack.push(string.charAt(i));
        }
        String output = "";
        for (int i = 0; i < string.length(); i++) {
            output += myStack.pop();
        }
        return output;
    }

    public static void main(String[] args) {
        int[] myArray = reserveIntArray(new int[] {1,2,3,4,5,6,7,8});
        System.out.println(Arrays.toString(myArray));
        System.out.println(reserveString("BornToShine"));
    }
}

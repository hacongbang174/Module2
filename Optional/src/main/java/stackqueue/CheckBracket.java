package stackqueue;

import java.util.Scanner;
import java.util.Stack;

public class CheckBracket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập biểu thức bạn muốn kiểm tra dấu ()");
        String sym = sc.nextLine();
        boolean result = checkParentheses(sym);
        if (result) {
            System.out.println("Biểu thức " + sym + " có đúng dấu ngoặc");
        } else {
            System.out.println("Biểu thức " + sym + " không có đúng dấu ngoặc");
        }
    }
    public static boolean checkParentheses(String str) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(') {
                stack.push(str.charAt(i));
            } else if (str.charAt(i) == ')') {
                if (stack.empty()) {
                    return false;
                }
                char left = stack.pop();
                if (left != '(') {
                    return false;
                }
            }
        }
        return stack.empty();
    }
}

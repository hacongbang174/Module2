package stackqueue;


import java.util.Scanner;
import java.util.Stack;

public class ConvertDecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số bạn muốn chuyển đổi:");
        int number = sc.nextInt();
        Stack<Integer> stack = new Stack<>();
        while (number > 0) {
            int sodu = number % 2;
            stack.push(sodu);
            number = number /2;
        }
        String str = "";
        while (!stack.isEmpty()){
            str += stack.pop();
        }
        System.out.println(str);
    }
}

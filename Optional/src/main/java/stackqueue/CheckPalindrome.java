package stackqueue;

import org.w3c.dom.Node;

import java.util.*;

public class CheckPalindrome {
//    static class Node {
//        int data;
//        Node link;
//    }
//
//    static class Queue {
//        Node front, rear;
//    }
//
//    static void enQueue(Queue q, int value) {
//        Node temp = new Node();
//        temp.data = value;
//        if (q.front == null)
//            q.front = temp;
//        else
//            q.rear.link = temp;
//
//        q.rear = temp;
//        q.rear.link = q.front;
//    }
//
//    static int deQueue(Queue q) {
//        if (q.front == null) {
//            System.out.print("Queue is empty");
//            return Integer.MIN_VALUE;
//        }
//
//        int value;
//        if (q.front == q.rear) {
//            value = q.front.data;
//            q.front = null;
//            q.rear = null;
//        } else {
//            Node temp = q.front;
//            value = temp.data;
//            q.front = q.front.link;
//            q.rear.link = q.front;
//        }
//
//        return value;
//    }
//
//    static void displayQueue(Queue q) {
//        Node temp = q.front;
//        System.out.print("Elements in Circular Queue are: ");
//        while (temp.link != q.front) {
//            System.out.printf("%d ", temp.data);
//            temp = temp.link;
//        }
//        System.out.printf("%d", temp.data);
//    }

    public static void main(String[] args) {

        //Kiểm tra chuỗi theo Queue và Stack

        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập chuỗi bạn muốn kiểm tra");
        String str = sc.nextLine();
        boolean check = true;
        Queue<Character> queue = new LinkedList<>();
        for (int i = 0; i < str.length(); i++) {
            queue.add(str.charAt(i));
        }
        System.out.println(queue);
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
        }
        System.out.println(stack);
        while (!stack.isEmpty()|| !queue.isEmpty()) {
            if(stack.pop().hashCode() == queue.remove().hashCode()) {
                check = true;
            }else check = false;
        }
        if (check) {
            System.out.println("Đây là chuỗi Palindrome");
        } else {
            System.out.println("Đây không phải là chuỗi Palindrome");
        }

//        checkPalindromeByStack(str);

    }
    public static void checkPalindromeByStack(String str) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
        }
        String strNew = "";
        while (!stack.isEmpty()) {
            strNew += stack.pop();
        }
        if (str.hashCode() == strNew.hashCode()) {
            System.out.println("Đây là chuỗi Palindrome");
        } else {
            System.out.println("Đây không phải là chuỗi Palindrome");
        }
    }

}

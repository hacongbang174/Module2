package exp;

import java.util.Scanner;

public class NumberToString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số cần đọc: ");
        int num = scanner.nextInt();
        String read;
        if (0 <= num && num < 10) {
            switch (num) {
                case 0:
                    read = "zero";
                    break;
                case 1:
                    read = "one";
                    break;
                case 2:
                    read = "two";
                    break;
                case 3:
                    read = "three";
                    break;
                case 4:
                    read = "four";
                    break;
                case 5:
                    read = "five";
                    break;
                case 6:
                    read = "six";
                    break;
                case 7:
                    read = "seven";
                    break;
                case 8:
                    read = "eight";
                    break;
                case 9:
                    read = "nine";
                    break;
                default:
                    read = "out of ability";
                    break;
            }else
            if (10 <= num && num < 20) {
                switch (num) {
                    case 10:
                        read = "ten";
                        break;
                    case 11:
                        read = "one";
                        break;
                    case 12:
                        read = "two";
                        break;
                    case 3:
                        read = "three";
                        break;
                    case 4:
                        read = "four";
                        break;
                    case 5:
                        read = "five";
                        break;
                    case 6:
                        read = "six";
                        break;
                    case 7:
                        read = "seven";
                        break;
                    case 8:
                        read = "eight";
                        break;
                    case 9:
                        read = "nine";
                        break;
                    default:
                        read = "out of ability";
                        break;
                }
            }
        }
    }
}
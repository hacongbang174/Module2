package exp;

import java.util.Scanner;

public class NumberToString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số cần đọc: ");
        int num = scanner.nextInt();
        if (0 <= num && num < 10) {
            String read;
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
            }
            System.out.printf("%s", read);
        } else if (10 <= num && num < 20) {
            String read;
            switch (num - 10) {
                case 0:
                    read = "ten";
                    break;
                case 1:
                    read = "eleven";
                    break;
                case 2:
                    read = "twelve";
                    break;
                case 3:
                    read = "thirteen";
                    break;
                case 4:
                    read = "fourteen";
                    break;
                case 5:
                    read = "fifteen";
                    break;
                case 6:
                    read = "sixteen";
                    break;
                case 7:
                    read = "seventeen";
                    break;
                case 8:
                    read = "eighteen";
                    break;
                case 9:
                    read = "nineteen";
                    break;
                default:
                    read = "out of ability";
                    break;
            }
            System.out.printf("%s", read);
        } else if (20 <= num && num < 100) {
            int tens = num / 10;
            String readTens;
            switch (tens) {
                case 2:
                    readTens = "twenty ";
                    break;
                case 3:
                    readTens = "thirty ";
                    break;
                case 4:
                    readTens = "forty ";
                    break;
                case 5:
                    readTens = "fifty ";
                    break;
                case 6:
                    readTens = "sixty ";
                    break;
                case 7:
                    readTens = "seventy ";
                    break;
                case 8:
                    readTens = "eighty ";
                    break;
                case 9:
                    readTens = "ninety ";
                    break;
                default:
                    readTens = "out of ability";
                    break;
            }
            System.out.printf("%s", readTens);
            String read;
            switch (tens % 10) {
                case 0:
                    read = "";
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
            }
            System.out.printf("%s", read);
        } else if (100 <= num && num < 1000) {
            int hundred = num / 100;
            String readHundred;
            switch (hundred) {
                case 1:
                    readHundred = "one hundred ";
                    break;
                case 2:
                    readHundred = "two hundred ";
                    break;
                case 3:
                    readHundred = "three hundred ";
                    break;
                case 4:
                    readHundred = "four hundred ";
                    break;
                case 5:
                    readHundred = "five hundred ";
                    break;
                case 6:
                    readHundred = "six hundred ";
                    break;
                case 7:
                    readHundred = "seven hundred ";
                    break;
                case 8:
                    readHundred = "eight hundred ";
                    break;
                case 9:
                    readHundred = "nine hundred ";
                    break;
                default:
                    readHundred = "out of ability";
                    break;
            }
            System.out.printf("%s", readHundred);
            int tens = num % 100;
            String readTens;
            if (0 <= tens && tens < 10) {
                System.out.print("");
            }
            if (10 <= tens && tens < 20) {
                String read;
                switch (tens - 10) {
                    case 0:
                        read = "ten";
                        break;
                    case 1:
                        read = "eleven";
                        break;
                    case 2:
                        read = "twelve";
                        break;
                    case 3:
                        read = "thirteen";
                        break;
                    case 4:
                        read = "fourteen";
                        break;
                    case 5:
                        read = "fifteen";
                        break;
                    case 6:
                        read = "sixteen";
                        break;
                    case 7:
                        read = "seventeen";
                        break;
                    case 8:
                        read = "eighteen";
                        break;
                    case 9:
                        read = "nineteen";
                        break;
                    default:
                        read = "out of ability";
                        break;
                }
                System.out.printf("%s", read);
            }
            if (20 <= tens && tens < 100) {
                switch (tens / 10) {
                    case 2:
                        readTens = "twenty ";
                        break;
                    case 3:
                        readTens = "thirty";
                        break;
                    case 4:
                        readTens = "forty ";
                        break;
                    case 5:
                        readTens = "fifty ";
                        break;
                    case 6:
                        readTens = "sixty ";
                        break;
                    case 7:
                        readTens = "seventy ";
                        break;
                    case 8:
                        readTens = "eighty ";
                        break;
                    case 9:
                        readTens = "ninety ";
                        break;
                    default:
                        readTens = "out of ability";
                        break;
                }
                System.out.printf("%s", readTens);
            }
            String read;
            switch (tens % 10) {
                case 0:
                    read = "";
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
            }
            System.out.printf("%s", read);
        }
    }
}

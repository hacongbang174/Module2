package SearchAlgorithm.Optional1;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số phần tử của mảng");
        int number = Integer.parseInt(sc.nextLine());
        int[] array = new int[number];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Nhập phần tử thứ " + i);
            array[i] = Integer.parseInt(sc.nextLine());
        }
        array = sort(array);
        System.out.println(Arrays.toString(array));
        System.out.println("Nhập phần tử bạn muốn tìm");
        int num = Integer.parseInt(sc.nextLine());
        int left = 0;
        int right = array.length -1;
        int result = binarySearch(array, left, right, num);
        if(result == -1) {
            System.out.println("Số bạn nhập không nằm trong mảng");
        }else {
            System.out.println("Vị trí phần tử bạn cần tìm là " + result);
        }
    }

    public static int[] sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if(array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }

    public static int binarySearch(int[] array, int left, int right, int value) {
        while (left < right) {
            int middle = (left + right) / 2;
            if (array[middle] == value) {
                return middle;
            } else if (array[middle] < value) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }
        return -1;
    }
}

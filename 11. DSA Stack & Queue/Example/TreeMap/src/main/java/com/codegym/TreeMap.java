package com.codegym;
import java.util.*;

public class TreeMap {
    public static void main(String[] args) {
        String str = "hello words hello words hello codegym";
        String[] arr = str.split(" ");
        System.out.println(Arrays.toString(arr));
        String key = "";
        int value;
        Map<String, Integer> map = new HashMap<>(); //Java Map là một phần của collections framework. Đối tượng Java Map được sử dụng để chứa các cặp khóa-giá trị. Java Map không thể chứa các khóa giống hệt nhau tuy nhiên các giá trị giống nhau thì được phép.
        for (int i = 0; i < arr.length; i++) {
            key = arr[i];
            if(map.containsKey(key)) {      //map.containsKey(key): ktra xem key có nằm trong các key của map không
                value = map.get(key);       //map.get(key) : trả về số lượng key đang có trong map
                map.remove(key);            //map.remove(key): xóa key khỏi map
                map.put(key, value+1);      //map.put(key, value): thêm key có số lượng value vào map
            } else{
                map.put(key, 1);
            }
        }
        Set<String> set = map.keySet();     //Set là một interface kế thừa Collection interface trong java. Set trong java là một Collection không thể chứa các phần tử trùng lặp.

        Iterator i = set.iterator();      //Trả về một trình vòng lặp iterator để duyệt qua các phần tử của set.

        while(i.hasNext()){                // i.hasNext(): check có phần tử tiếp theo hay không
            key=(String)i.next();         //Trả về phần tử tiếp theo. Một NoSuchEuityException được ném nếu không có phần tử tiếp theo.
            System.out.println("Từ '"+key+"' xuất hiện "+map.get(key)+" lần");
        }
    }
}

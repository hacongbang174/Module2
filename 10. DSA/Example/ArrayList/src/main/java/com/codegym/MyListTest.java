package com.codegym;

public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> list = new MyList<>();
        list.addFirst(2 );
        list.addLast(4);
        list.add(1, 3);
        list.add(2, 5);
        System.out.println(list.clone());
        list.remove(2);
        System.out.println("After remove :" + list);
        list.size();
//        System.out.println(list.size());
//        System.out.println(list.clone());
//        System.out.println(list.contains(5));
//        System.out.println(list.indexOf(3));
//        System.out.println(list.clear());
    }
}

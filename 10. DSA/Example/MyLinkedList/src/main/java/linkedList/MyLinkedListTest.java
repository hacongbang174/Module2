package linkedList;

public class MyLinkedListTest {
    public static void main(String[] args) {
        MyLinkedList<Integer> link = new MyLinkedList<>();
        link.addLast(20);
        link.addLast(10);
        link.addLast(30);
        link.addLast(40);
        link.add(1,19);
        System.out.println(link);
////        link.printlist();
//        link.size();
//        link.clone();
//        System.out.println(link);
//        System.out.println(link.indexOf(1));
//        link.remove(2);
        System.out.println(link.get(3));
        System.out.println(link);
    }
}

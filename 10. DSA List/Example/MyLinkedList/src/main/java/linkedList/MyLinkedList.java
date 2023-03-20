package linkedList;

public class MyLinkedList<E> {
    private Node head;
    private int numNodes;

//    public MyLinkedList(Object data) {
//        head = new Node(data);
//        numNodes++;
//    }

    public MyLinkedList() {

    }

    private class Node {
        private Node next;
        private Object data;

        public Node(Object data) {
            this.data = data;
        }

        public Object getData() {
            return this.data;
        }
    }

    public void add(int index, E element) {
        Node temp = head;
        Node holder;
        for (int i = 0; i < index - 1 && temp.next != null; i++) {
            temp = temp.next;
        }
        holder = temp.next;
        temp.next = new Node(element);
        temp.next.next = holder;
        numNodes++;
    }

    public void addFirst(E e) {
        Node temp = head;
        head = new Node(e);
        head.next = temp;
        numNodes++;
    }

    public void addLast(E e) {
        if (head == null) {
            head = new Node(e);
            numNodes++;
        } else {
            Node newNode = new Node(e);
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
            numNodes++;
        }
    }

    public void remove(int index) {
        Node temp = head;
        Node holder = null;
        for (int i = 0; i < index - 1 && temp.next != null; i++) {
            temp = temp.next;
        }
        holder = temp.next.next;
        temp.next = null;
        temp.next = holder;
        numNodes--;
    }

    // lam lai (dang loi o doan while)
    public boolean remove(Object e) {
        Node temp = head;
        Node holder = null;
        if (head == null) {
            System.out.println("valueless");
            return false;
        } else {
            while (temp.next != null) {
                if (temp.next.data.equals(e)) {
                    holder = temp.next.next;
                    temp.next = holder;
                }
                temp = temp.next;
                return true;
            }
        }
        numNodes--;
        return false;
    }

    public int size() {
        System.out.println("size: " + numNodes);
        return numNodes;
    }

    public E clone() {
        MyLinkedList<E> newList = new MyLinkedList<>();
        Node temp = head;
        for (int i = 0; i < numNodes; i++) {
            newList.addLast((E) temp.data);
            temp = temp.next;
        }
        return (E) newList;
    }

    public boolean contains(E e) {
        Node temp = head;
        if (head == null) {
            System.out.println("valueless");
            return false;
        } else {
            while (temp != null) {
                if (temp.data == e) {
                    return true;
                }
                temp = temp.next;
            }
        }
        return false;
    }

    public int indexOf(E o) {
        Node temp = head;
        int count = 0;
        if(temp == null) {
            System.out.println("valueless");
        }
        while (temp != null) {
            if(temp.data == o) {
                return count;
            }
            temp = temp.next;
            count++;
        }
        return -1;
    }

    public E get(int index) {
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return (E) temp.data;
    }

    public E getFirst() {
        Node temp = head;
        return (E) temp.data;
    }

    public E getLast() {
        Node temp = head;
        for (int i = 0; i < numNodes - 1; i++) {
            temp = temp.next;
        }
        return (E) temp.data;
    }

    public void printlist() {
        Node temp = head;
        String str = "[ ";
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

//    public E get(int i) {
//        Node temp = head;
//        if (temp == null)
//            return (E) "valueless";
//        int j = 0;
//        while (temp != null) {
//            if (j == i) {
//
//            }
//        }
//        return (E) "valueless";
//    }

    @Override
    public String toString() {
        Node temp = head;
        String str = "[ ";
        while (temp != null) {
            if (temp.next == null) {
                str += temp.data;
                break;
            }
            str += temp.data + ", ";
            temp = temp.next;
        }
        str += " ]";
        return "MyLinkedList{" +
                "head=" + str +
                ", numNodes= " + numNodes +
                '}';
    }

//    public void printlist() {
//        Node temp = head;
//        String str = "[ ";
//        while (temp != null) {
//            if (temp.next == null) {
//                str += temp.data;
//                break;
//            }
//            str += temp.data + ", ";
//            temp = temp.next;
//        }
//        str += " ]";
//        System.out.println(str);
//    }
}

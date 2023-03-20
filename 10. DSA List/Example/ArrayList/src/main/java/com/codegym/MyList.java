package com.codegym;

import java.util.ArrayList;
import java.util.Arrays;

import static com.sun.tools.javac.util.ArrayUtils.ensureCapacity;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object[] elements;

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public MyList(int capacity) {
        elements = new Object[capacity];
    }

    private void ensureCapacity() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }

    public void add(int index, E element) {
        if (size >= elements.length) {
            ensureCapacity();
        }
        if (index > size || index < 0) {
            System.out.println("Index invalid");
        } else {
            // System.arraycopy(elements, index, elements, index + 1, size - index);
            MyList<E> myList = new MyList<>();
            if(index > elements.length) {
                ensureCapacity();
                if(!contains(element))
                    return;
            } else {
                for (int i = size - 1; i >= index; i--) {
                    elements[i + 1] = elements[i];
                    if (elements[i] == element) {
                        elements[i] = element;
                        return;
                    }
                }
            }
        }
        elements[index] = element;
        size++;
    }

    public void addLast(E e) {
        if (size == elements.length) {
            ensureCapacity();
        }
        elements[size++] = e;
    }
    public void addFirst(E e) {
        if (size >= elements.length) {
            ensureCapacity();
        }
        if (elements == null) {
            MyList<E> list = new MyList<>();
            list.addLast(e);
        } else {
            for (int i = elements.length - 1; i <= 0 ; i--) {
                elements[i] = elements[i + 1];
            }
        }
        elements[0] = e;
        size++;
    }

    @Override
    public String toString() {
        return "MyList{" +
                "size=" + size +
                ", elements=" + Arrays.toString(elements) +
                '}';
    }

    //remove (int index)
    public void remove(int index) {
        if (size == elements.length) {
            ensureCapacity();
        }
        if (index >= size || index < 0) {
            System.out.println("Index invalid");
        } else {
//            for (int i = index; i < elements.length -1; i++){
//                elements[i] = elements[i+1];
//                elements[size -1] = null;
//            }
//            return elements;
//            size --;
            for (int i = index; i <= size; i++){
                elements[i] = elements[i+1];
                elements[size -1] = null;
                return;
            }
        }
        size--;
    }

    public int size() {
        System.out.println(size);
        return size;
    }

    public Object clone() {
        Object[] newArr = new Object[size];
        for (int i = 0; i < size; i++) {
            newArr[i] = elements[i];
        }
        return "MyListClone{" +
                "size=" + size +
                ", elements = " + Arrays.toString(newArr) + '}';
    }

    // E get (int i)
    public E get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        return (E) elements[index];
    }

    public boolean contains(E e) {
        for (int i = 0; i < size; i++) {
            if (e.equals(elements[i]))
                return true;
        }
        return false;
    }

    public int indexOf(E e) {
        int indexOf = -1;
        for (int i = 0; i < size; i++) {
            if (elements[i] == e) {
                indexOf = i;
            }
        }
        return indexOf;
    }

    public Object clear() {
        for (int i = 0; i < size; i++) {
            elements[i] = null;
        }
        size = 0;
        return "MyList{" +
                "size=" + size +
                ", elements=" + Arrays.toString(elements) +
                '}';
    }
}

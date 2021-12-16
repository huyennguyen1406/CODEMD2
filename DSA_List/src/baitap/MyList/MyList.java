package baitap.MyList;

import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object elements[];

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }
    private void ensureCapa() {
        int newSize = elements.length * 2;
        if (size == elements.length) {
            elements = Arrays.copyOf(elements, newSize);
        }
    }
    public void add(E o) {
        if (size == elements.length) {
            ensureCapa();
        }
        elements[size++] = o;
    }

    public E remove(int index) {
        for (int i = 0; i < index; i++) {

        }
    }

    public int size() {
        return this.size;
    }

    public E clone(){
        elements.clone();
    }
    public boolean contains(E o){
        return
    }

    public int indexOf(){
        for (int i = 0; i < elements.length; i++) {

        }
    }

    public boolean add(E o){
        if (size == elements.length) {
            ensureCapa();
        }
        elements[size++] = o;
    }

    public void ensureCapacity(int minCapacity){
    }

    public E get(int i)
    {
        if (i >= size || i < 0) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i);
        }
        return (E) elements[i];
    }

    public void clear(){

    }
}

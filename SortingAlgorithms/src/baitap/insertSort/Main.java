package baitap.insertSort;

public class Main {
    static int [] list = {3, 5, 7, 8, 21, 6, 0, 10};

    public static void insertionSort(int[] array) {
        int pos, x;
        for (int i = 0; i < array.length; i++) {
            x = array[i];
            pos = i;
            while (pos > 0 && x < array[pos - 1]) {
                array[pos] = array[pos - 1];
                pos--;
            }
            array[pos] = x;
        }
    }

    public static void main(String[] args) {
        insertionSort(list);
        for (int j : list) {
            System.out.println(j + " ");
        }
    }
}

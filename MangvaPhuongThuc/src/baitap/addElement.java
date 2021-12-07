package baitap;

import java.util.Scanner;

public class addElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array;
        int addIndex;
        int addElement;
        System.out.println("Nhap vao so luong phan tu cua mang: ");
        array = new int[scanner.nextInt()];
        int i = 0;
        while (i < array.length) {
            System.out.println("Nhap vao phan tu thu " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
            i++;
        }
        for (int k : array) {
            System.out.println(k + "\t");
        }
        System.out.println("Nhap vao phan tu muon them: ");
        addElement = scanner.nextInt();
        do {
            System.out.println("Nhap vao vi tri muon: ");
            addIndex = scanner.nextInt();
        } while (addIndex < 0 || addIndex > array.length);

        int[] result = new int[array.length + 1];
        for (int j = 0; j < array.length; j++) {
            if (j < addIndex - 1) {
                result[j] = array[j];
            } else if (j == (addIndex - 1)) {
                result[j] = addElement;
            } else {
                result[j] = array[j - 1];
            }
        }
        for (int k : result) {
            System.out.println(k + "\t");
        }
    }
}

package baitap;

import java.util.Scanner;

public class minElement {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.print("Nhap vao so luong phan tu cua mang 1: ");
        int[] array = new int[scanner.nextInt()];
        int i = 0;
        while (i < array.length) {
            System.out.print("Nhap vao phan tu thu " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
            i++;
        }
        int minElement = array[0];
        for (int j = 1; j < array.length; j++) {
            if (minElement > array[j]) {
                minElement = array[j];
            }
        }

        System.out.println("Phan tu nho nhat la: " + minElement);
    }
}

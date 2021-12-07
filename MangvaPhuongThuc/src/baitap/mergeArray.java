package baitap;

import java.util.Scanner;

public class mergeArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr1 = createArray(scanner);
        int[] arr2 = createArray(scanner);
        int[] arr3 = mergeArray(arr1, arr2);
        System.out.println(" .... ");
        for (int element : arr3) {
            System.out.print(element + " ");
        }
    }

    public static int[] createArray(Scanner scanner) {
        System.out.println("Nhap so phan tu cua mang");
        int size = scanner.nextInt();
        int [] array = new int [size];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Nhap so phan tu thu " + (i + 1));
            array[i] = scanner.nextInt();
        }
        return array;
    }
}

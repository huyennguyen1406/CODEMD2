package baitap;

import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        int [] array;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so phan tu cua mang: ");
        array = new int[scanner.nextInt()];

        for (int i = 0; i < array.length; i++) {
            System.out.println("Nhap vao phan tu thu: ");
            array[i] = scanner.nextInt();
        }
        System.out.println();
        System.out.println("Nhap phan tu can xoa: ");

        int deleteEle = scanner.nextInt();
        for (int i = 0; i < array.length; i++) {
            if (array[i] == deleteEle){
                for (int j = 0; j < array.length - 1; j++) {
                    array[j] = array[j + 1];
                }
                array[array.length - 1] = 0;
                i--;
            }
        }
        for (int k : array) {
            System.out.println(k + " ");
        }
    }
}

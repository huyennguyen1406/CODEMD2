package baitap;

import java.util.Scanner;

public class minMaxMang2Chieu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter column: ");
        int column = scanner.nextInt();
        System.out.println("Enter row: ");
        int row = scanner.nextInt();
        int[][] arr = new int [column] [row];
        for (int i = 0; i < column; i++) {
            for (int j = 0; j < row; j++) {
                System.out.println("Nhap phan tu thu: " + (j + 1));
                arr [i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < column; i++) {
            for (int j = 0; j < row; j++) {
                System.out.println(arr[i][j]);
            }
        }
        int max = maxArray(arr);
        System.out.println(max[0]);
        System.out.println(max[1]);
    }
    public static int [] maxArray(int [][] arr) {
        int max = arr [0][0];
        int min = arr [0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (max < arr[i][j]) {
                    max = arr[i][j];
                }
                if (min > arr[i][j]) {
                    min = arr[i][j];
                }
            }
        }
        return new int []{max, min};
    }
}

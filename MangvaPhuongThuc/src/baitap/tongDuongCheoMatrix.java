package baitap;

import java.time.chrono.MinguoDate;
import java.util.Scanner;

public class tongDuongCheoMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao so dong va so cot cua mang: ");
        int num = scanner.nextInt();

        double [][] array = new double[num][num];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.printf("Phan tu thu [%d][%d]: ",i, j);
                array[i][j] = scanner.nextDouble();
            }
        }
        double sum = 0;
        for (int i = 0; i < args.length; i++) {
            sum += array[i][i];
        }
        System.out.println("Tong duong cheo chinh o ma tran vuong la: " + sum);
    }
}

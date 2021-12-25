package baitap;

import java.util.Scanner;

public class illegalTriangle {

    private static  class IllegalTriangleException extends Exception{
    }

    private static void calculate(int a, int b, int c) throws IllegalTriangleException {
        if (a > 0 && b > 0 && c > 0 && a + b > c && a + c > b && b + c > a) {
            System.out.println("Day la 3 canh tam giac");
        } else {
            throw new IllegalTriangleException();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Nhap canh a: ");
            int a = scanner.nextInt();
            System.out.println("Nhap canh b: ");
            int b = scanner.nextInt();
            System.out.println("Nhap canh c: ");
            int c = scanner.nextInt();
            calculate(a, b, c);
        } catch (IllegalTriangleException e) {
            System.out.println("Day khong phai 3 canh tam giac");
        }
    }
}

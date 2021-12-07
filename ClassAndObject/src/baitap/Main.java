package baitap;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap vao so thu nhat: ");
        double num1 = scanner.nextDouble();
        System.out.print("Nhap vao so thu hai: ");
        double num2 = scanner.nextDouble();
        System.out.print("Nhap vao so thu ba: ");
        double num3 = scanner.nextDouble();

        QuadraticEquation quad = new QuadraticEquation(num1, num2, num3);

        if (quad.getDiscriminant() > 0) {
            System.out.println("Phuong trinh co 2 nghiem: x1 = " + quad.getRoot1() + " va x2 = " + quad.getRoot2());
        }
        else if (quad.getDiscriminant() == 0) {
            System.out.println("Phuong trinh co nghiem kep x = " +quad.getRoot1());
        } else {
            System.out.println("Phuong trinh vo nghiem");
        }
    }
}

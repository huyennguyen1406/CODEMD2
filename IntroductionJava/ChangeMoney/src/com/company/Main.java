package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	double vnd = 23000;
    double usd;
    Scanner sc = new Scanner(System.in);
    System.out.print("Nhap vao so tien USD: ");
    usd = sc.nextDouble();
    double quyDoi = usd * 23000;
        System.out.print("Gia tri VND: " + quyDoi);
    }
}

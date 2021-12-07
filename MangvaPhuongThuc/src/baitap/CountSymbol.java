package baitap;

import java.util.Scanner;

public class CountSymbol {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str;
        String s;
        int count = 0;
        System.out.println("Nhap 1 chuoi bat ky: ");
        str = scanner.nextLine();
        System.out.println("Nhap ky tu muon tim: ");
        s = scanner.nextLine();

        for (int i = 0; i < str.length(); i++) {
            String symBol = String.valueOf(str.charAt(i));
            if (s.equals(symBol)) {
                count++;
            }
        }
        System.out.println("Tong so ky tu " + s + " trong chuoi da nhap = " + count);
    }
}

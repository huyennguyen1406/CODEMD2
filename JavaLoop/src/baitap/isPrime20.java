package baitap;

import org.omg.CosNaming.BindingIterator;

import java.util.Scanner;

public class isPrime20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 0;
        int count = 0;
        int status = 1;
        int num = 3;
        System.out.println("20 so nguyen to dau tien la: ");
        System.out.println(2);
        for (int i = 2; i <= 20; ) {
            for (int j = 2; j <= Math.sqrt(num); j++) {
                if (num % j == 0) {
                    status = 0;
                    break;
                }
            }
            if (status != 0) {
                System.out.println(num);
                i++;
                count++;
            }
            status = 1;
            num++;
        }
    }
}

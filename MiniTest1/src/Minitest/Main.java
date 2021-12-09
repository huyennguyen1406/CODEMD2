package Minitest;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so luong san pham: ");
        int n = scanner.nextInt();
        scanner.nextLine();
        System.out.println("San pham moi: ");
        Product[] productList = new Product[n];

        for (int i = 0; i < productList.length; i++) {
            System.out.println("Nhap thong tin cua san pham thu " + (i + 1));
            productList[i] = product(scanner);
        }

        for (int i = 0; i < productList.length; i++) {
            System.out.println(productList[i].toString());
        }

        System.out.println("Nhap vao ten san pham can tim: ");
        String nameProduct = scanner.nextLine();
        int count = 0; 

        double sumProduct = 0;
        for (int i = 0; i < productList.length; i++) {
            sumProduct += productList[i].getPrice();
        }
        System.out.println("Tong gia san pham la: " + sumProduct);
    }

    public static Product product(Scanner scanner) {
        int code;
        String name;
        double price;
        String type;

        System.out.println("Nhap code: ");
        code = scanner.nextInt();
        System.out.println("Nhap ten: ");
        name = scanner.nextLine();
        System.out.println("Nhap gia: ");
        price = scanner.nextDouble();
        System.out.println("Nhap loai: ");
        type = scanner.nextLine();

        return new Product(code, name, price, type);
    }
}

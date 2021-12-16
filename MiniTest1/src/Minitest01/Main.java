package Minitest01;

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

        System.out.println("Nhap vao ten san pham tim kiem: ");
        String nameProduct = scanner.nextLine();
        int count = 0;
        for (int i = 0; i < productList.length; i++) {
            if (productList[i].getName().equals(nameProduct)) {
                System.out.println(productList[i]);
                count++;
            }
            else {
                System.out.println("San pham khong ton tai");
            }
        }

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

        System.out.println("Nhap ma san pham: ");
        code = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Nhap ten san pham: ");
        name = scanner.nextLine();
        System.out.println("Nhap gia san pham: ");
        price = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Nhap loai san pham: ");
        type = scanner.nextLine();

        return new Product(code, name, price, type);
    }
}

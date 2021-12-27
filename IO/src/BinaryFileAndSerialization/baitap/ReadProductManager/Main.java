package BinaryFileAndSerialization.baitap.ReadProductManager;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ProductManager productManager = new ProductManager();
        Scanner scanner = new Scanner(System.in);

        int choice;
        do {
            System.out.println("MENU");
            System.out.println("1. Thêm sản phẩm");
            System.out.println("2. Hiển thị sản phẩm");
            System.out.println("3. Tìm kiêm sản phẩm theo id");
            System.out.println("0. Exit ");
            System.out.println("Nhập lựa chọn");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println(productManager.createProduct());
                    break;
                case 2:
                    productManager.displayProduct();
                    break;
                case 3:
                    System.out.println("Nhập Id sản phẩm muốn tìm: ");
                    int id = scanner.nextInt();
                    productManager.findProduct(id);
                    break;
                case 0:
                    System.exit(0);
                    break;
            }

        }
        while (choice != 0);
    }
}

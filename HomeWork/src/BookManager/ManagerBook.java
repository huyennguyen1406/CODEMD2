package BookManager;

import java.util.Scanner;

public class ManagerBook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao loai sach: ");
        int size = scanner.nextInt();
        Book[] books = new Book[size];
        double sumSciencePrice = 0;
        double sumScienceQuantity = 0;
        int choice;

        for (int i = 0; i < books.length; i++) {
            System.out.println("1. Nhap loai sach: ");
            System.out.println("2. Nhap sach Khoa hoc: ");
            System.out.println("3. Nhap sach tieu thuyet: ");
            System.out.println("Chon trong danh sach: ");
            int input = scanner.nextInt();
            if (input == 1) {
                System.out.println("Moi nhap loai sach " + (i + 1) + ": ");
                Book book1 = createBook(scanner);
                books[i] = book1;
            }
        }
    }
}

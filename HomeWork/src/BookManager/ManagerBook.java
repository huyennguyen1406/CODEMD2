package BookManager;

import java.util.Scanner;

public class ManagerBook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so luong sach: ");
        int size = scanner.nextInt();

        Book[] books = new Book[size];
        createBook(scanner, books);
        int choice = -1;
        while (choice != 0) {
            System.out.println("Moi chon danh muc: ");
            System.out.println("1. Hien thi toan bo sach: ");
            System.out.println("2. Tong gia tien");
            System.out.println("3. Sach co gia thanh cao nhat: ");
            System.out.println("4. Sach co gia thanh thap nhat: ");
            System.out.println("5. Chon sach theo the loai: ");
            System.out.println("6. Chon sach theo tac gia: ");
            System.out.println("7. Gia trung binh sach khoa hoc la: ");
            System.out.println("0. Exit");

            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Hien thi toan bo sach: ");
                    displayBooks(books);
                    break;
                case 2:
                    System.out.println("Tong gia tien sach: " + sumBooks(books));
                    break;
                case 3:
                    System.out.println("Sach co gia thanh cao nhat: " + maxPrice(books));
                    break;
                case 4:
                    System.out.println("Sach co gia thanh thap nhat: " + minPrice(books));
                    break;
                case 5:
                    System.out.println("The loai muon tim: ");
                    String findCategory = scanner.nextLine();
                    findCategoryBook(books, findCategory);
                    break;
                case 6:
                    System.out.println("Tac gia muon tim: ");
                    String findAuthor= scanner.nextLine();
                    findAuthorBook(books, findAuthor);
                    break;
                case 7:
                    System.out.println("Gia trung binh cua sach khoa hoc: " + avgPriceScience(books));
                    break;
                case 0:
                    System.exit(0);
            }
        }
    }

    private static void importBook(Scanner scanner, Book[] books, int i) {
        scanner.nextLine();
        System.out.println("Nhap ten sach:");
        String name = scanner.nextLine();
        System.out.println("Nhap gia:");
        double price = scanner.nextDouble();
        System.out.println("Nhap so luong:");
        int quantity = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Ngay xuat ban:");
        String date = scanner.nextLine();

        books[i] = new Book(name, price, quantity, date);
    }

    private static void createBook(Scanner scanner, Book[] books) {
        for (int i = 0; i < books.length; i++) {
            System.out.println("Nhap thong tin sach " + (i + 1));
            System.out.println("The loai sach: ");
            System.out.println("1. Sach khoa hoc");
            System.out.println("2. Sach tieu thuyet");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    books[i] = new Book();
                    importBook(scanner, books, i);
                    System.out.println("Nhap the loai sach: ");
                    String category = scanner.nextLine();
                    books[i] = new Science(books[i].getName(), books[i].getPrice(), books[i].getQuantity(), books[i].getDate(), category);
                    break;
                case 2:
                    books[i] = new Book();
                    importBook(scanner, books, i);
                    System.out.println("Nhap ten tac gia: ");
                    String author = scanner.nextLine();
                    books[i] = new Novel(books[i].getName(), books[i].getPrice(), books[i].getQuantity(), books[i].getDate(), author);
                    break;
                case 0:
                    System.exit(0);
            }
        }
    }

    private static double sumBooks(Book[] books) {
        double sum = 0;
        for (int i = 0; i < books.length; i++) {
            sum += (books[i].getPrice() * books[i].getQuantity());
        }
        return sum;
    }

    private static void displayBooks(Book[] books) {
        for (int i = 0; i < books.length; i++) {
            System.out.println(books[i].toString());
        }
    }

    private static Book maxPrice(Book[] books) {
        double maxPrice = books[0].getPrice();
        int maxIndex = 0;
        for (int i = 0; i < books.length; i++) {
            if (maxPrice < books[i].getPrice()) {
                maxPrice = books[i].getPrice();
                maxIndex = i;
            }
        }
        return books[maxIndex];
    }

    private static Book minPrice(Book[] books) {
        double minPrice = books[0].getPrice();
        int minIndex = 0;
        for (int i = 0; i < books.length; i++) {
            if (minPrice > books[i].getPrice()) {
                minPrice = books[i].getPrice();
                minIndex = i;
            }
        }
        return books[minIndex];
    }

    private static void findCategoryBook (Book[] books, String findCategory) {
        for (int i = 0; i < books.length; i++) {
            if (books[i] instanceof Science) {
                if (((Science) books[i]).getCategory().equals(findCategory)) {
                    System.out.println(books[i]);
                }
            }
        }
    }

    private static void findAuthorBook (Book[] books, String findAuthor) {
        for (int i = 0; i < books.length; i++) {
            if (books[i] instanceof Novel) {
                if (((Novel) books[i]).getAuthor().equals(findAuthor)) {
                    System.out.println(books[i]);
                }
            }
        }
    }

    private static double avgPriceScience (Book[] books) {
        int count = 0;
        double sum = 0;
        for (int i = 0; i < books.length; i++) {
            if (books[i] instanceof Science) {
                sum += books[i].getPrice();
                count++;
            }
        }
        return sum / count;
    }
}

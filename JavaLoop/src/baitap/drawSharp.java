package baitap;

import java.util.Scanner;

public class drawSharp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("Menu: ");
            System.out.println("1. Print the rectangle");
            System.out.println("2. Print the square triangle");
            System.out.println("3. Print isosceles triangle");
            System.out.println("0. Exit");
            System.out.println("Input my choice: ");
            choice = scanner.nextInt();
            if (choice < 0 || choice > 3) {
                System.out.println("Lua chon khong co trong menu, moi nhap lai");
            }
            switch (choice) {
                case 1:
                    rectangle(scanner);
                    break;
                case 2:
                    menuTriangle(scanner);
                    break;
                case 3:
                    isoscelesTriangle(scanner);
                    break;
            }
        } while (choice != 0);
    }
    private static void menuTriangle(Scanner scanner) {
        int choice1;
        do {
            System.out.println("1. Print the square triangle top-left");
            System.out.println("2. Print the square triangle top-right");
            System.out.println("3. Print the square triangle bottom-left");
            System.out.println("4. Print the square triangle bottom-right");
            System.out.println("0. Exit");
            System.out.println("Input my choice: ");
            choice1 = scanner.nextInt();
            if (choice1 < 0 || choice1 > 4) {
                System.out.println("Lua chon khong co trong menu, moi nhap lai");
            }
            switch (choice1) {
                case 1:
                    triangleTopLeft(scanner);
                    break;
                case 2:
                    triangleTopRight(scanner);
                    break;
                case 3:
                    triangleBottomLeft(scanner);
                    break;
                case 4:
                    triangleBottomRight(scanner);
                    break;
            }
        } while (choice1 != 0);
    }

    public static void triangleTopLeft(Scanner scanner) {
        int height;
        do {
            System.out.println("Input height: ");
            height = scanner.nextInt();
        } while (height <= 0);

        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void triangleTopRight(Scanner scanner) {
        int height;
        do {
            System.out.println("Input height: ");
            height = scanner.nextInt();
        } while (height <= 0);

        for (int i = 1; i <= height; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print("  ");
            }
            for (int j = height; j >= i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void triangleBottomLeft(Scanner scanner) {
        int height;
        do {
            System.out.println("Input height: ");
            height = scanner.nextInt();
        } while (height <= 0);

        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    private static void triangleBottomRight(Scanner scanner) {
        int height;
        do {
            System.out.println("Input height: ");
            height = scanner.nextInt();
        } while (height <= 0);

        for (int i = 1; i <= height; i++) {
            for (int j = height; j > i; j--) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void rectangle(Scanner scanner) {
        int height;
        int width;
        do {
            System.out.println("Input height: ");
            height = scanner.nextInt();
            System.out.println("Input width: ");
            width = scanner.nextInt();
        } while (height <= 0 || width <= 0);

        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= width; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void isoscelesTriangle(Scanner scanner) {
        int height;
        do {
            System.out.println("Input height: ");
            height = scanner.nextInt();
        } while (height <= 0);

        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= height - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

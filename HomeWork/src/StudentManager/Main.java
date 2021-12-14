package StudentManager;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so luong sinh vien can tao: ");
        int size = scanner.nextInt();
        Student[] students = new Student[size];
        StudentManager studentManager = new StudentManager(students);

        int choice;
        do {
            System.out.println("Menu");
            System.out.println("1. Them hoc sinh: ");
            System.out.println("2. Hien thi tat ca hoc sinh");
            System.out.println("Nhap lua chon: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    int choice1;
                    do {
                        System.out.println("1.Them hoc sinh: ");
                    }
            }
        }
    }
}

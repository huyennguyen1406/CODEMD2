package Minitest02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student student = new Student();
        int choice = 0;

        do {
            System.out.println("___MENU___");
            System.out.println("Nhap lua chon cua ban: ");
            System.out.println("1. Hien thi tat ca nguoi");
            System.out.println("2. Them 1 nguoi vao danh sach");
            System.out.println("3. Tim vi tri 1 nguoi tronh danh sach");
            System.out.println("4. Xoa 1 nguoi trong danh sach");
            System.out.println("5. Sua thong tin 1 nguoi theo ma");
            System.out.println("6. Sap xep danh sach theo diem trung binh");
            System.out.println("7. Tong diem");
        }
        while (choice != 0);
    }
}

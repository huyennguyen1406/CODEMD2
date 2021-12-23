package Minitest3.main;

import Minitest3.manager.StudentManager;
import Minitest3.model.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StudentManager studentManager = new StudentManager();
        Scanner scanner = new Scanner(System.in);

        int choice;
        do {
            System.out.println("---MENU---");
            System.out.println("1. Hiển thị tất cả sinh viên");
            System.out.println("2. Thêm sinh viên");
            System.out.println("3. Xóa sinh viên theo id");
            System.out.println("4. Sửa sinh viên theo id");
            System.out.println("5. Hiển thị sinh viên theo id");
            System.out.println("6. Sắp xếp theo điểm trung bình ");
            System.out.println("7. Hiển thị sinh viên có điểm cao nhất");
            System.out.println("0. Exit");
            System.out.println("Nhập lựa chọn của bạn: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    studentManager.displayAll();
                    break;
                case 2:
                    Student student = studentManager.createStudent();
                    studentManager.addStudent(student);
                    break;
                case 3:
                    System.out.println("Nhập id muốn tìm: ");
                    int idDelete = scanner.nextInt();
                    scanner.nextLine();
                    Student student1 = studentManager.deleteStudent(idDelete);
                    if (student1 == null) {
                        System.out.println("không có sinh viên có id tương ứng");
                    } else {
                        System.out.println(student1);
                    }
                    break;
                case 4:
                    System.out.println("Nhập vào id sinh viên bạn muốn: ");
                    int idEdit = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println(studentManager.editStudent(idEdit));
                    break;
                case 5:
                    System.out.println("Nhập vào id bạn muốn: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    studentManager.displayStudent(id);
                    break;
                case 6:
                    ArrayList<Student> students = studentManager.studentByPoint();
                    for (Student s : students) {
                        System.out.println(s);
                    }
                    break;
                case 7:
                    studentManager.maxAvgPoint();
                    break;
            }
        }
        while (choice != 0);
    }
}


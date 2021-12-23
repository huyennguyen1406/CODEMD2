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
            System.out.println("1. Thêm sinh viên");
            System.out.println("2. Sửa sinh viên theo id");
            System.out.println("3. Xóa sinh viên theo id");
            System.out.println("5. Tìm kiếm sinh viên theo id");
            System.out.println("6. Sắp xếp theo điểm trung bình ");
            System.out.println("7. Tìm sinh viên có điểm cao nhất");
            System.out.println("0. Exit");
            System.out.println("Nhập lựa chọn của bạn: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    Student student = studentManager.createStudent();
                    if (studentManager.addStudent(student)) {
                        System.out.println("Thêm thành công");
                    } else {
                        System.out.println("Thêm không thành công");
                    }
                    break;
                case 2:
                    System.out.println("Nhập id muốn sửa: ");
                    int editId = scanner.nextInt();
                    Student studentEdit = studentManager.updateStudent(editId);
                    if (studentEdit != null) {
                        System.out.println("Sửa thành công");
                        System.out.println(studentEdit);
                    } else {
                        System.out.println("Sửa không thành công");
                    }
                    break;
                case 3:
                    System.out.println("Nhập id muốn xóa: ");
                    int deleteId = scanner.nextInt();
                    Student studentDelete = studentManager.deleteStudent(deleteId);
                    if (studentDelete != null) {
                        System.out.println("Xóa thành công");
                        System.out.println(studentDelete);
                    } else {
                        System.out.println("Xóa thất bại");
                    }
                    break;
                case 4:
                    System.out.println("Nhập vào id sinh viên muốn tìm: ");
                    int searchId = scanner.nextInt();
                    Student studentSearch = studentManager.searchById(searchId);
                    if (studentSearch != null) {
                        System.out.println(studentSearch);
                    } else {
                        System.out.println("Sinh viên không tồn tại");
                    }
                    break;
                case 5:
                    ArrayList<Student> students = studentManager.sortByAvgPoint();
                    students.forEach(System.out::println);
                    break;
                case 6:
                    ArrayList<Student> studentMax = studentManager.getStudentsByMaxPoint();
                    studentMax.forEach(System.out::println);
                    break;
            }
        }
        while (choice != 0);
    }
}


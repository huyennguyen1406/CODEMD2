package StudentManager.main;

import StudentManager.manager.StudentManager;
import StudentManager.model.Student;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    private static final String PATH_NAME = "src/StudentManager/students";

    public static void main(String[] args) {
        StudentManager studentManager = null;
        try {
            studentManager = new StudentManager(PATH_NAME);
        } catch (IOException | ClassNotFoundException e) {
            System.err.println(e.getMessage());
        }

        Scanner scanner = new Scanner(System.in);

        int choice;
        do {
            System.out.println("MENU:");
            System.out.println("1. Them 1 sinh vien");
            System.out.println("2. Xoa 1 sinh vien theo ten");
            System.out.println("3. Sua sinh vien theo ten");
            System.out.println("4. Hien thi tat ca sinh vien");
            System.out.println("5. Hien thi tat ca sinh vien co diem trung binh tren 7.5");
            System.out.println("6. Hien thi sinh vien theo cu phap");
            System.out.println("0. Exit");
            System.out.println("Enter your choice");
            choice = scanner.nextInt();
            scanner.nextLine();
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
                    System.out.println("Nhập id muốn xóa: ");
                    String deleteName = scanner.nextLine();
                    Student studentDelete = studentManager.deleteStudent(deleteName);
                    if (studentDelete != null) {
                        System.out.println("Xóa thành công");
                        System.out.println(studentDelete);
                    } else {
                        System.out.println("Xóa thất bại");
                    }
                    break;
                case 3:
                    System.out.println("Mhap ten sinh vien can sua:");
                    String name1 = scanner.nextLine();
                    Student studentEdit = studentManager.updateStudent(name1);
                    if (studentEdit != null) {
                        System.out.println("Sửa thành công");
                        System.out.println(studentEdit);
                    } else {
                        System.out.println("Sửa không thành công");
                    }
                    break;
                case 4:
                    studentManager.displayStudent();
                    break;
                case 5:
                    System.out.println("Danh sach sinh vien tren 7.5");
                    studentManager.averagePointHigher();
                    break;
                    break;
            }
        } while (choice != 0);
    }
}

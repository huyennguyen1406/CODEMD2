package Minitest4.main;

import Minitest4.manager.StudentManager;
import Minitest4.model.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentManager studentManager = new StudentManager();

        int choice;
        do {
            System.out.println("MENU:");
            System.out.println("1. Thêm 1 sinh viên");
            System.out.println("2. Sửa sinh viên theo id");
            System.out.println("3. Xóa sinh viên theo id");
            System.out.println("4. Hiển thị sinh viên theo id");
            System.out.println("5. Hiển thị tất cả sinh viên");
            System.out.println("6. Hiển thị danh sách sắp xếp theo điểm tăng dần");
            System.out.println("7. Hiển thị danh sách sắp xếp theo điểm giảm dần");
            System.out.println("8. Sinh viên có điểm cao nhất");
            System.out.println("9. Ghi file");
            System.out.println("10. Đọc file");
            System.out.println("0. Exit");
            System.out.println("Enter your choice");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    studentManager.addStudent();
                    break;
                case 2:
                    System.out.println("Nhập id muốn sửa: ");
                    scanner.nextLine();
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println(studentManager.editStudent(id));
                    break;
                case 3:
                    System.out.println("Mhập id cần xóa:");
                    scanner.nextLine();
                    int idEdit = scanner.nextInt();
                    System.out.println(studentManager.deleteStudent(idEdit));
                    break;
                case 4:
                    System.out.println("Nhập id cần tìm: ");
                    scanner.nextLine();
                    int idFind = scanner.nextInt();
                    studentManager.displayStudentById(idFind);

                case 5:
                    System.out.println("Tất cả sinh viên: ");
                    studentManager.displayAll();
                    break;
                case 6:
                    System.out.println("Danh sách điểm tăng dần là: ");
                    ArrayList<Student> students1 = studentManager.sortByAvgUpPoint();
                    students1.forEach(System.out::println);
                    break;
                case 7:
                    System.out.println("Danh sách điểm giảm dần là: ");
                    ArrayList<Student> students2 = studentManager.sortByAvgDownPoint();
                    students2.forEach(System.out::println);
                    break;
                case 8:
                    System.out.println("Sinh viên điểm cao nhất: ");
                    ArrayList<Student> studentsMax = StudentManager.studentsByMaxPoint();
                    for (Student student : studentsMax) {
                        System.out.println(student);
                    }
                    break;

                case 9:
                    studentManager.writeFile(studentManager.getStudents(), StudentManager.PATH_NAME);
                    break;
                case 10:
                    ArrayList<Student> students = studentManager.readFile(StudentManager.PATH_NAME);
                    students.forEach(System.out::println);
                    break;
            }
        } while (choice != 0);
    }
}

package StudentManager.main;

import StudentManager.manager.StudentManager;
import StudentManager.model.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentManager studentManager = new StudentManager();

        int choice;
        do {
            System.out.println("MENU:");
            System.out.println("1. Them 1 sinh vien");
            System.out.println("2. Sua 1 sinh vien theo ten");
            System.out.println("3. Xoa sinh vien theo ten");
            System.out.println("4. Hien thi tat ca sinh vien");
            System.out.println("5. Hien thi tat ca sinh vien co diem trung binh tren 7.5");
            System.out.println("6. Hien thi sinh vien theo cu phap");
            System.out.println("7. Ghi file");
            System.out.println("8. Doc file");
            System.out.println("0. Exit");
            System.out.println("Enter your choice");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    studentManager.addStudent();
                    break;
                case 2:
                    System.out.println("Nhập ten muốn sua: ");
                    scanner.nextLine();
                    String editName = scanner.nextLine();
                    System.out.println(studentManager.editStudent(editName));
                    break;
                case 3:
                    System.out.println("Mhap ten sinh vien can xoa:");
                    scanner.nextLine();
                    String deleteName = scanner.nextLine();
                    System.out.println(studentManager.deleteStudent(deleteName));
                    break;
                case 4:
                    System.out.println("Tat ca sinh vien: ");
                    studentManager.displayAll();
                    break;
                case 5:
                    System.out.println("Danh sach sinh vien tren 7.5");
                    studentManager.displayStudentByGpa();
                    break;
                case 6:
                    System.out.println("Tat ca sinh vien theo format: ");
                    studentManager.displayStudentFormat();
                    break;
                case 7:
                    studentManager.writeFile(studentManager.getStudents(), StudentManager.PATH_NAME);
                    break;
                case 8:
                    ArrayList<Student> students = studentManager.readFile(StudentManager.PATH_NAME);
                    students.forEach(System.out::println);
                    break;
            }
        } while (choice != 0);
    }
}

package student;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student[] students = new Student[5];
        Student student1 = new Student("A", 20, "Male", "HN", 5, 7, 8);
        Student student2 = new Student("B", 20, "Female", "HN", 5, 6, 7);
        Student student3 = new Student("C", 20, "Male", "HN", 7, 8, 9);
        Student student4 = createStudent(scanner);

        students[0] = student1;
        students[1] = student2;
        students[2] = student3;

        for (Student student : students) {
            System.out.println(student);
        }
        System.out.println("----------------");

        //thay đổi điểm
//        inputPoints(scanner, student1);
//        inputPoints(scanner, student2);

        //display array
        for (Student student : students) {
            System.out.println(student);
        }
        System.out.println("----------------");
        //        //display name + ave
        for (Student student : students) {
            System.out.println(student.getAverage());
        }
        System.out.println("----------------");

        //display name + ave tăng dần
        for (int i = 0; i < students.length; i++) {
            for (int j = 0; j < students.length; j++) {
                if (students[j].averagePoint() > students[i].averagePoint()) {
                    Student temp = students[i];
                    students[i] = students[j];
                    students[j] = temp;
                }
            }
        }
        for (Student student : students) {
            System.out.println(student.getAverage());
        }
    }

//    public static void inputPoints(Scanner scanner, Student student) {
//            if (Student.getName().equals("A")) {
//                System.out.println("Nhập điểm Toán: ");
//                Student.setMath(scanner.nextDouble());
//                System.out.println("Nhập điểm Văn: ");
//                Student.setLiterature(scanner.nextDouble());
//                System.out.println("Nhập điểm Anh: ");
//                Student.setEnglish(scanner.nextDouble());
//            }
//        }

        public static Student createStudent(Scanner scanner) {
            System.out.println("Nhập tên: ");
            String name = scanner.nextLine();
            System.out.println("Nhập tuổi: ");
            int age = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Nhập giới tính: ");
            String gender = scanner.nextLine();
            System.out.println("Nhập địa chỉ: ");
            String address = scanner.nextLine();
            System.out.println("Nhập điểm Toán: ");
            double math = scanner.nextDouble();
            System.out.println("Nhập điểm Văn: ");
            double literature = scanner.nextDouble();
            System.out.println("Nhập điểm Anh: ");
            double english = scanner.nextDouble();
            return new Student(name, age, gender, address, math, literature, english);
        }
    }


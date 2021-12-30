package Minitest4.manager;

import Minitest4.model.Student;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentManager {
    public static final String PATH_NAME = "src/Minitest4/students.csv";

    private final ArrayList<Student> students;
    private final Scanner scanner = new Scanner(System.in);

    public StudentManager() {
        this.students = readFile(PATH_NAME);
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public int checkId(int id) {
    return id;
    }

    public Student addStudent() {
        System.out.println("Nhập họ tên: ");
        String name = scanner.nextLine();
        System.out.println("Nhập tuổi: ");
        int age = scanner.nextInt();
        System.out.println("Nhập điểm Toán: ");
        double math = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Nhập điểm Lý: ");
        double phys = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Nhập điểm Hóa: ");
        double chem = scanner.nextDouble();
        scanner.nextLine();

        Student student = new Student(name, age, math, phys, chem);
        students.add(student);
        writeFile(students, PATH_NAME);
        System.out.println("Thêm sinh viên có id = " + name + " thành công!");
        return student;
    }

    public Student editStudent(int id) {
        Student editStudent = null;
        for (Student student : students) {
            if (editStudent.getId() == id) {
                student = student;
                break;
            }
        }
        if (editStudent != null) {
            int index = students.indexOf(editStudent);
            System.out.println("Nhập tên mới: ");
            String name = scanner.nextLine();
            editStudent.setName(name);
            System.out.println("Nhập tuổi mới: ");
            int age = scanner.nextInt();
            editStudent.setAge(age);
            System.out.println("Nhập điểm Toán mới: ");
            double math = scanner.nextDouble();
            editStudent.setMathPoint(math);
            System.out.println("Nhập điểm Lý mới: ");
            double phys = scanner.nextDouble();
            editStudent.setPhysPoint(phys);
            System.out.println("Nhập điểm Hóa mới: ");
            double chem = scanner.nextDouble();
            editStudent.setChemPoint(chem);
            scanner.nextLine();

            students.set(index, editStudent);
            writeFile(students, PATH_NAME);
            System.out.println("Cập nhập id sinh viên thành công");
        } else {
            System.out.println("Không thành công");
        }
        return editStudent;
    }

    public Student deleteStudent ( int id){
        Student editStudent = null;
        for (Student student : students) {
            if (student.getId() == id) {
                editStudent = student;
                break;
            }
        }
        if (editStudent != null) {
            students.remove(editStudent);
            writeFile(students, PATH_NAME);
            System.out.println("Xóa sinh viên có id = " + id + " thành công!");
        }
        return editStudent;
    }

    public void displayAll() {
        if (students.isEmpty()) {
            System.out.println("Danh sách sinh viên trống");
            return;
        }
        for (Student student : students) {
            writeFile(students, PATH_NAME);
            System.out.println(student);
        }
    }

    public void displayStudentById(int id){
        Student student = null;

        for (Student stu : students) {
            if (student.getId() == id) {
                student = student;
                break;
            }
        }

        if (student != null) {
            System.out.println(student);
        } else {
            System.out.println("Không tìm thấy sinh viên");
        }
        return student;
    }

    public ArrayList<Student> studentsByMaxPoint() {
        ArrayList<Student> studentsMax = new ArrayList<>();
        double max = students.get(0).getAvgPoint();

        for (Student student : students) {
            if (student.getAvgPoint() > max) {
                max = student.getAvgPoint();
            }
        }
        for (Student student : students) {
            if (student.getAvgPoint() == max) {
                writeFile(students, PATH_NAME);
                studentsMax.add(student);
            }
        }
        return studentsMax;
    }

    public ArrayList<Student> sortByAvgUpPoint() {
        writeFile(students, PATH_NAME);
        students.sort((o1, o2) -> Double.compare(o2.getAvgPoint(), o1.getAvgPoint()));
        return students;
    }

    public ArrayList<Student> sortByAvgDownPoint() {
        writeFile(students, PATH_NAME);
        students.sort((o1, o2) -> Double.compare(o2.getAvgPoint(), o1.getAvgPoint()));
        return students;
    }

    public void writeFile(ArrayList<Student> students, String path) {
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path));
            for (Student student : students) {
                bufferedWriter.write(student.getName() + "," + student.getAge() + "," + student.getId() + "," + student.getMathPoint() + "," + student.getPhysPoint() + "," + student.getChemPoint() + "\n");
            }
            bufferedWriter.close();
            System.out.println("Write file thanh cong");
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }

    public ArrayList<Student> readFile(String path) {
        ArrayList<Student> students = new ArrayList<>();
        File file = new File(PATH_NAME);

        try {
            if (!file.exists()) {
                file.createNewFile();
            }
            BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] strings = line.split(",");
                students.add(new Student(strings[0], Integer.parseInt(strings[1]), Double.parseDouble(strings[2]), Double.parseDouble(strings[3]), Double.parseDouble(strings[4])));
            }
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
        return students;
    }
}

package thuchanh.static_method;

public class Student {
    private int rollno;
    private String name;
    private static String college = "BBDIT";

    Student(int r, String n) {
        rollno = r;
        name = n;
    }

    static void change() {
        college = "CODEGYM";
    }

    void display() {
        System.out.println(rollno + " " + name + " " + college);
    }

    public static class Car {
        private String name;
        private String engine;

        public static int numberOfCars;

        public Car(String name, String engine) {
            this.name = name;
            this.engine = engine;
            numberOfCars++;
        }
    }
}


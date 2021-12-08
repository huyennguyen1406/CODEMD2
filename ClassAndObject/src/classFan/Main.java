package classFan;

public class Main {
    public static void main(String[] args) {
        final int level1 = 1;
        final int level2 = 2;
        final int level3 = 3;

        Fan fan1 = new Fan(2, true, 6, "red");
        Fan fan2 = new Fan(3, false, 8, "white");
        Fan fan3 = new Fan();

        System.out.println(fan1.toString());
        System.out.println(fan2.toString());
        System.out.println(fan3.toString());
    }
}

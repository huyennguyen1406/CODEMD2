package baitap.Circle;

import thuchanh.Circle;

public class CircleTest {
    public static void main(String[] args) {
        Circle circle = new thuchanh.Circle();
        System.out.println(circle);

        circle = new thuchanh.Circle(3.5);
        System.out.println(circle);

        circle = new Circle("indigo", false, 3.5);
    }
}

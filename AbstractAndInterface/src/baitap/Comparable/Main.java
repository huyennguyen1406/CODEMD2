package baitap.Comparable;

public class Main {
    public static void main(String[] args) {
        int x = (int) Math.floor(Math.random() * 10);
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle("yellow", false, 1.0);
        shapes[1] = new Rectangle("infinity", true, 2.0, 3.0);
        shapes[2] = new Square("melinda", true, 4.0);
        for (Shape a : shapes){
            System.out.println(a);
        }

        for (Shape a : shapes) {
            a.resize(Math.random() * 1000);
        }
        System.out.println("\n");
        Shape.printShape(shapes);
    }
}

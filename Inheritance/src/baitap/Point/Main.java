package baitap.Point;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Point2d point2d = new Point2d(100, 100);
        System.out.println(point2d);
        point2d.setXY(40, 60);
        System.out.println(Arrays.toString(point2d.getXY()));

        Point3d point3d = new Point3d(100, 100, 100);
        System.out.println(point3d);
        point3d.setXYZ(40, 60, 50);
        System.out.println(Arrays.toString(point3d.getXYZ()));
    }
}

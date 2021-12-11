package baitap.moveablePoint;

public class Main {
    public static void main(String[] args) {
        Point point1 = new MoveAblePoint();
        MoveAblePoint point2 = (MoveAblePoint) point1;
        point2.setX(50);
        point2.setY(50);
        point2.setxSpeed(5);
        point2.setySpeed(8);
        System.out.println(point2);

        point2.move();
        System.out.println(point2);

        point2.move();
        System.out.println(point2);

        point2.move();
        System.out.println(point2);

        point2.move();
        System.out.println(point2);

        MoveAblePoint point = new MoveAblePoint(100, 100, 3, 4);
        System.out.println(point);
        point.move();
        System.out.println(point);
    }
}

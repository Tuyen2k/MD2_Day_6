package bai_tap.bai_tap_3;

import bai_tap.bai_tap_2.Point2D;

public class MainTest {
    public static void main(String[] args) {
        Point2D point2D = new Point2D(20, 30);
        System.out.println(point2D);
        point2D.setXY(10, 20);
        System.out.println(point2D+"\n");

        MoveablePoint movablePoint1 = new MoveablePoint(point2D.getX(), point2D.getY(), 10, 20);
        System.out.println("Before move: " + movablePoint1);
        System.out.println(movablePoint1.move());
        System.out.println("Later move: " + movablePoint1+"\n");


        MoveablePoint moveablePoint = new MoveablePoint(440, 250);
        System.out.println("Before move: " + moveablePoint);
        System.out.println(moveablePoint.move());
        System.out.println("Later move: " + moveablePoint);
    }
}

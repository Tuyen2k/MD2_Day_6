package bai_tap.bai_tap_1;

public class MainTest {
    public static void main(String[] args) {
        Circle circle = new Circle();
        Circle circle1 = new Circle(5, "blue");

        System.out.println(circle);
        System.out.println(circle1);
        System.out.println(circle.getArea());
        System.out.println(circle1.getArea());

        Cylinder cylinder = new Cylinder();
        Cylinder cylinder1 = new Cylinder(9);
        Cylinder cylinder2 = new Cylinder(10,"white",4);

        System.out.println(cylinder);
        System.out.println(cylinder1);
        System.out.println(cylinder2);
        System.out.println(cylinder.getVolume());
        System.out.println(cylinder1.getVolume());
        System.out.println(cylinder2.getVolume());


    }

}

package bai_tap.bai_tap_2;

public class MainTest {
    public static void main(String[] args) {
        Point2D point2D = new Point2D();
        Point2D point2D1 = new Point2D(5, 6);
        System.out.println(point2D);
        System.out.println(point2D1);
        for (float value : point2D1.getXY()) {
            System.out.println("GetXY: " + value + "  ");
        }

        Point3D point3D = new Point3D();
        Point3D point3D1 = new Point3D(8, 6, 4);
        System.out.println("\n"+point3D);
        System.out.println(point3D1);
        for (float v : point3D1.getXYZ()){
            System.out.println("Get XYZ: "+ v);
        }
    }
}

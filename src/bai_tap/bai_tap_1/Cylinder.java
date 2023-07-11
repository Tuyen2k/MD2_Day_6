package bai_tap.bai_tap_1;

public class Cylinder extends Circle {
    private double height;

    public Cylinder() {
        height = 5;
    }

    public Cylinder(double height) {
        this.height = height;
    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume(){
        return getArea()*height;
    }

    public String toString() {
        return super.toString() + " volume: "+getVolume();
    }
}

package lecture3;

import lecture2.Shape;

public class Circle implements Shape {
    private double radius;

    public Circle() {
        System.out.println("Circle constructor");
    }

    public Circle(double radius) {
        this.radius = radius;
        System.out.println("Circle constructor with radius: " + radius);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        System.out.println("Circle getArea");
        return PI * radius * radius;
    }

    public double getCircumference() {
        System.out.println("Circle getCircumference");
        return 2 * PI * radius;
    }
}

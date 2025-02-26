package lecture2;

class Circle implements Shape {
    private double radius;

    protected Circle() {
    }

    protected Circle(double radius) {
        this.radius = radius;
    }

    protected double getRadius() {
        return radius;
    }

    protected void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return PI * this.radius * this.radius;
    }
}
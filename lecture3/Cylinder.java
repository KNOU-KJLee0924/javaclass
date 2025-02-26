package lecture3;

public class Cylinder extends Circle{
    private double height;

    public Cylinder() {
        System.out.println("Cylinder constructor");
    }

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
        System.out.println("Cylinder constructor with radius: " + radius + " and height: " + height);
    }

    @Override
    public double getArea() {
        System.out.println("Cylinder getArea");
        return super.getArea() * 2 + getCircumference() * height;
    }

    //오버로딩 example
    public double getArea(double radius, double height) {
        System.out.println("Cylinder getArea with radius: " + radius + " and height: " + height);
        //super(radius); 생성자에서만 사용할 수 있다.
        super.setRadius(radius);
        return PI * radius * radius * 2 + getCircumference() * height;
    }

    public double getVolume() {
        System.out.println("Cylinder getVolume");
        return super.getArea() * height;
    }
}

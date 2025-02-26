final class Eclipse extends Circle{
    private double radius2;

    public Eclipse() {super();}

    public Eclipse(double radius1, double radius2) {
        super(radius1);
        this.radius2 = radius2;
    }

    @Override
    public double getArea() {
        return super.getRadius() * radius2 * PI;
    }

    public double getRadius2() {
        return radius2;
    }

    public void setRadius2(double radius2) {
        this.radius2 = radius2;
    }
}

package lecture3;

//import lecture2.Circle;

public class main {
    public static void main(String[] args) {
        // error : call class from external package
        // Circle circle = new Circle(); Circle in lecture2
        Circle circle = new Circle(3);
        System.out.println("원주 l = " + circle.getCircumference());
        System.out.println("넓이 S = " + circle.getArea());
        System.out.println("-----------------------------------------");

        Cylinder cylinder = new Cylinder(3, 10);
        System.out.println("겉넓이 = " + cylinder.getArea());
        System.out.println("부피 V = " + cylinder.getVolume());

        System.out.println("-----------------------------------------");

        // 상속받은 클래스의 생성자에서 super가 없어도 자동으로 부모의 생성자를 호출한다.
        Cylinder cylinder1 = new Cylinder();
        System.out.println("겉넓이 = " + cylinder1.getArea(3, 10));
    }
}

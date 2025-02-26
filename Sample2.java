import java.util.Arrays;
import java.util.Scanner;

public class Sample2 {
    public static void main(String[] args) {
//        arraySample();
//        scannerSample();
        classSample();
    }

    private static void arraySample() {
/*
        error sample
        String[2] stringArray = new String();
        String[] stringArray = new String(2);
        String[] stringArray = new String()[2];
*/
        String[] stringArray = new String[2];
        stringArray[0] = "Hello";
        stringArray[1] = "World!";
        System.out.println(Arrays.toString(stringArray));

        int[][] intDoubleArray = {{1, 2}, {3, 4, 5}};
        for (int[] intArray : intDoubleArray) {
            System.out.println(Arrays.toString(intArray));
        }


    }

    private static void scannerSample() {

        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            System.out.println(sc.next());
        }
    }

    private static void classSample() {
        Circle circle = new Circle(4);
        //System.out.println(circle.radius); error private variable
        System.out.println(circle.getArea());
        circle.setRadius(5);
        System.out.println(circle.getArea());
        Eclipse eclipse = new Eclipse(4, 5);
        eclipse.setRadius(4);
        System.out.println(eclipse.getArea());
        Circle circle2 = new Eclipse(4, 5);
        System.out.println(circle2.getArea());

        Circle circle3 = new Circle();
        System.out.println(circle3.getArea());
    }
}
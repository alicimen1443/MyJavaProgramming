package day33_Statics;

public class CircleTest {
    public static void main(String[] args) {

        Circle.printPi();

        Circle circle1 = new Circle(10);
        System.out.println(circle1);

        System.out.println( circle1.calcPerimeter());
        System.out.println(circle1.calcArea());

    }
}

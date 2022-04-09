package day35_Encapsulation.encapsulation;

public class CircleObject {
    public static void main(String[] args) {

        Circle c1 = new Circle(8);

        System.out.println(c1.getRadius());
        System.out.println(Circle.pi);

        System.out.println(c1.calcArea());
        System.out.println(c1.calcPerimeter());

        System.out.println(c1);
    }
}

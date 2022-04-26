package day43_Exceptions.shapeTask;

public class ShapeObjects {
    public static void main(String[] args) {


        Circle circle = new Circle(4);

        Rectangle rectangle = new Rectangle(2,6);

        Square square = new Square(8);

        System.out.println(circle);
        System.out.println(rectangle);
        System.out.println(square);

        System.out.println(Circle.pi);

        rectangle.setWidth(5);
        rectangle.setLength(6);

        square.setSide(2);

        System.out.println(circle);
        System.out.println(rectangle);
        System.out.println(square);




    }
}

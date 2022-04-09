package day35_Encapsulation.encapsulation;

public class SquareTest {
    public static void main(String[] args) {

        Square square = new Square(4);

        System.out.println(square);

        System.out.println(square.getSide());
        square.setSide(8);

        System.out.println(square);

        System.out.println(square.calcArea());
    }
}

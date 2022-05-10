package day45_Abstraction.shape;

public class Cube extends Shape implements Volume {

    private double side;

    public Cube(double side) {
        super("Cube");

    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }



    @Override
    public double area() {
        return side*side*side;
    }

    @Override
    public double perimeter() {
        return 12*side;
    }

    @Override
    public String toString() {
        return "Cube{" +
                super.toString()+
                "side=" + side +
                '}';
    }

    @Override
    public double volume() {
        return 0;
    }
}

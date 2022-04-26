package day43_Exceptions.shapeTask;

public final class Circle extends Shape {

    public final static double pi=3.14;
    private double radius;

    public Circle(double radius) {
        super("Circle");
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }


    public void setRadius(double radius) {
        this.radius = radius;
    }



    @Override
    public double area() {
        return radius*radius*pi;
    }

    @Override
    public double perimeter() {
        return 2*pi*radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "area =" + area() +
                ", perimeter =" + perimeter() +
                '}';
    }
}

package day45_Abstraction.shape;

public class Cylinder extends Shape implements Volume{

    public final static double pi =3.14;
    private double radius;
    private double height;

    public Cylinder(double radius, double height) {
        super("Cylinder");
        setHeight(height);
        setRadius(radius);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double area() {
        return pi*radius*radius*height;
    }

    @Override
    public double perimeter() {
        return 2*pi*radius*height;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                super.toString()+
                "radius=" + radius +
                ", height=" + height +
                '}';
    }

    @Override
    public double volume() {
        return 0;
    }
}

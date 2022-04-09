package day33_Statics;

public class Circle {

    public double radius;
    public double diameter;

    public static double pi = 3.14;

    public Circle(double radius) {
        this.radius = radius;
        this.diameter =this.radius*2;
    }

    public double calcArea(){
        return pi*radius*radius;
    }

    public double calcPerimeter(){
        return 2*pi*radius;
    }

    public static void printPi(){
        System.out.println(pi);
    }

    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", diameter=" + diameter +
                ", pi=" + pi +
                ", area=" + calcArea() +
                ", perimeter =" + calcPerimeter() +
                '}';
    }
}

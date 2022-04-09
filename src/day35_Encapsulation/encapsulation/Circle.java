package day35_Encapsulation.encapsulation;

public class Circle {

    private int radius;
    public static double pi = 3.14;

    public Circle(int radius){
        setRadius(radius);
    }

    public void setRadius(int radius){
        if(radius<=0){
            return;
        }
        this.radius=radius;
    }
    public int getRadius(){
        return radius;
    }

    public double calcArea(){
        return pi*radius*radius;
    }

    public double calcPerimeter(){
        return 2*pi*radius;
    }

    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                "\tarea =" + calcArea() +
                "\tperimeter =" + calcPerimeter() +
                '}';
    }
}
/*
2. Create a class named Circle

			private variables:
				radius

			public variable:
				pi

		 	Encapsulate all the private fields

		 			1. radius of the circle can not be zero or negative

 			Add a constructor that can set the radius of circle when circle object is created

 			Methods:
 				calcArea()
 				calcPerimeter()
 				toString()

 */
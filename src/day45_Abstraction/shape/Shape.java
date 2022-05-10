package day45_Abstraction.shape;

public abstract class Shape {

    //everytime when we declare static or Instance variable as a final, it demands to be Initialized right away

    private final String name;

    public Shape(String name ) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract double area();

    public abstract double perimeter();

    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                ", area='" + area() + '\'' +
                ", perimeter='" + perimeter() + '\'' +
                '}';
    }
}

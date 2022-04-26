package day43_Exceptions.shapeTask;

public final class Square extends Shape {

    private double side;

    public Square( double side) {
        super("Square");
        this.side = side;
    }

    public double getSide(){
        return side;
    }

    public void setSide(double side){
        this.side=side;
    }

    @Override
    public double area() {
        return side*side;
    }

    @Override
    public double perimeter() {
        return 4*side;
    }

    @Override
    public String toString() {
        return "Square{" +
                "area =" + area() +
                ", perimeter =" + perimeter() +
                '}';
    }
}

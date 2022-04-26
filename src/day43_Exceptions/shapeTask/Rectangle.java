package day43_Exceptions.shapeTask;

public final class Rectangle extends Shape {

    private double width;
    private double length;


    public Rectangle(double length, double width){
        super("Rectangle");
        setLength(length);
        setWidth(width);
    }


    public double getWidth(){
        return width;
    }

    public double getLength(){
        return length;
    }

    public void setWidth(double width){
        this.width=width;
    }

    public void setLength(double length){
        this.length=length;
    }

    @Override
    public double area() {
        return width*length;
    }

    @Override
    public double perimeter() {
        return 2*(width+length);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "area =" + area() +
                ", perimeter =" + perimeter() +
                '}';
    }
}

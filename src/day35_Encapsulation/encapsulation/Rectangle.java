package day35_Encapsulation.encapsulation;

public class Rectangle {

    private int width,length;

    public Rectangle(int width,int length){
        setLength(length);
        setWidth(width);
    }

    public void setWidth(int width){
        if(width<0){
            return;
        }
        this.width=width;
    }

    public int getWidth(){
        return width;
    }

    public void setLength(int length){
        if(length<0){
            return;
        }
        this.length=length;
    }

    public int getLength(){
        return length;
    }

    public int calcArea(){
        return width*length;
    }

    public int calcPerimeter(){
        return 2*(width+length);
    }

    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length +
                ", area =" + calcArea() +
                ", perimeter =" + calcPerimeter() +
                '}';
    }
}

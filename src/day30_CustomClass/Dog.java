package day30_CustomClass;

public class Dog {
    public String name;  // instance variable. Instance means every single object has separate copy of instance
    public String breed; // custom classes they dont have main method.They are not for running they are for creating object
    public int age;
    public char gender;
    public String size;
    public String color;

    public void setInfo(String dogName, String dogBreed, int dogAge, char dogGender, String dogSize, String dogColor){
        name=dogName;
        breed=dogBreed;
        age = dogAge;
        gender=dogGender;
        size= dogSize;
        color= dogColor;
    }

    public void eat(){ // instance method
        System.out.println(name+" is eating");
    }
    public void bark(){
        System.out.println(name+" is barking");
    }

    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
/*
Attributes:
    name, age, gender, breed, size, color

Actions:
    eat(), play(), bark() ....

 */
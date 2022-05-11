package day47_Polymorphism;

import day43_Exceptions.EmployeeTask.*;
import day44_Abstraction.animalTask.Animal;
import day44_Abstraction.animalTask.Cat;
import day44_Abstraction.animalTask.Dog;
import day45_Abstraction.shape.Circle;
import day45_Abstraction.shape.Cube;
import day45_Abstraction.shape.Shape;
import day45_Abstraction.shape.Square;

public class ReferenceTypeCastings {

    public static void main(String[] args) {

        //upcasting is done implicitly
        Shape shape = (Shape) new Circle(4);

        Shape shape2 = new Circle(5);

       // Dog dog2 = new Dog("Max", "Husky", 'M', 3, "Small", "White");

        //Dog dog3=dog2;

        Animal animal = new Dog("Max", "Husky", 'M', 3, "Small", "White");//upcasting

        Dog dog =(Dog) animal;  //downcasting

        System.out.println(animal.getName());
        System.out.println(dog.getName());

        //animal.bark();

        dog.bark();
       // animal.bark();

        ((Dog)animal).bark();

        Shape shape1 = new Square(5);

        System.out.println(  ( (Square) shape1) .getSide() );


        System.out.println("-----------------------------------------");

        Animal animal2 =  new Cat("Lucy", "Scottish", 'M', 3, "Small", "White");


        // If you are going to use the method later on, then you need to assign it to a variable
        //Cat cat = (Cat) animal2;
        //cat.meow();

        //If you are not going to use this method more than once than you are better do casting
        ((Cat) animal2).meow();

        //((Dog)animal2).bark();     // ClassCastException

        Employee employee = new Tester("Veli",34,'M',15,"SDET",120000);

        ((Tester)employee).bugReport();

        //((Tester)employee).unitTest();

        //((Developer)employee).unitTest();   // ClassCastException

       // Driver driver = (Driver) employee;         //line1  ClassCastException tester cannot be cast to driver
        Person person = (Person) employee;           //line2
        Teacher teacher = (Teacher) employee;        //line3  ClassCastException tester cannot be cast to teacher

        System.out.println("--------------------------------------------------");

        Shape s1 = new Circle(10);
        s1.area();
        s1.perimeter();

       /* If the new reference type that you are casting it to does not have is A relationship with the object
        type can this casting be completed? Never

        */
        //((Cube)s1).volume();












    }

}

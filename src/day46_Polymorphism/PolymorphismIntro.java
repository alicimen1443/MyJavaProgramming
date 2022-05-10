package day46_Polymorphism;

import day43_Exceptions.EmployeeTask.*;
import day44_Abstraction.animalTask.Animal;
import day44_Abstraction.animalTask.Cat;
import day44_Abstraction.animalTask.Dog;
import day44_Abstraction.animalTask.Playable;
import day45_Abstraction.shape.*;

import java.util.ArrayList;
import java.util.Arrays;

public class PolymorphismIntro {

    public static void main(String[] args) {

        String str="Wooden Spoon";

        Integer n1=2;

        Double n2 =5.5;

        Boolean r1 = true;

        //Do I have to remember all these data types?NO.Every class in Java, they have a parent class

        Object[] array = {str,n1,n2,r1, new Circle(5),new Square(7)};


        /*

        WebDriver driver;

        driver = new ChromeDriver();

        driver = new FireFoxDriver();


         */

        Developer developer = new Developer("Ali",34,'M',14,"Web developer",125000);
        Tester tester = new Tester("Veli",34,'M',15,"SDET",120000);
        Teacher teacher = new Teacher("Ayşe",26,'F',10,"English Teacher",130000);
        Driver driver = new Driver("Fatma",27,'F',16,"Truck driver",115000);

        ArrayList<Employee> cydeoEmployees = new ArrayList<>();

        cydeoEmployees.addAll(Arrays.asList(developer,tester,teacher,driver));


        System.out.println("-------------------------------------------------");

        Employee employee = new Tester("Veli",34,'M',15,"SDET",120000);

        //the implementation of the method depends on the object type
        employee.work();  //Veli is testing the application

      //  employee.bugReport(); it compiles


        // I can only call the variables and the methods of reference type.
        //Reference type, it decides what is accessible

        Animal animal = new Dog("Max","Husky",'M',3,"Small","White");

        animal.drink();
        animal.eat();
        //animal.play(); compiles.Because not all the animals play.
        //animal.bark();

        Playable animal2 = new Dog("Max","Husky",'M',3,"Small","White");
        System.out.println(animal2.isFriendly);
        animal2.play();

        //Reference type does not have these methods
        //animal2.drink();
        //animal2.eat();

        Animal animal3 = new Cat("Max","Husky",'M',3,"Small","White");

        Shape shape = new Circle(5);
        shape.area();//r*r*pi

        // Reference type decides what is accessible
        // Object type decides which implementation of the method to be executed when the method is called

        //System.out.println(shape.getRadius());
        //System.out.println(shape.PI);

        boolean isSquare = shape instanceof Square;
        boolean isRectangle = shape instanceof Rectangle;
        boolean isTriangle = shape instanceof Triangle;
        boolean isCircle = shape instanceof Circle;

        System.out.println("isSquare = " + isSquare);
        System.out.println("isTriangle = " + isTriangle);
        System.out.println("isRectangle = " + isRectangle);
        System.out.println("isCircle = " + isCircle);


        /*
        WebDriver driver:

        if(driver instance Chrome){
            Chrome browser will open
        }else if(driver instance of firefox){
        FireFox browser will open

        }


         */










    }




}

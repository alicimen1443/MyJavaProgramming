package day34_GarbageCollection_AccessModifiers;

import day30_CustomClass.Dog;
import day31_Constructors.Student;
import day32_Constructors.Car;
import day33_Statics.Iphone;

import java.util.ArrayList;
import java.util.Arrays;

public class GarbageCollection {
// Every single object in java they have one common method called finalize
public static void main(String[] args) {

      String str = null; // this null keyword has a special value.It can only be assigned to the non primitive data types.
// do not confuse this null keyword with 0. 0 is a value but null, it is not an existing value
    //System.out.println(str.toUpperCase());

    String str1 = "Wooden Spoon"; // after line 20 "Wooden Spoon" will be eligible for garbage collection.The garbage collector is going to collect and destroy that object
    str1 = null;

    System.out.println(str1);

    Car car1 = new Car("Toyota");

    car1=null;

    System.out.println(car1);

    System.out.println("--------------------------------------------------");

    Dog dog1 = new Dog();
    dog1.name="Lucy";

    dog1 = new Dog();// I created a new object and assigned it to dog1 reference. so the object that is above , it is unreferenced object now.
    dog1.name="Max";

    System.out.println(dog1);

    String language = "Python"; // one reference name, it can only be reference to one object only
    language = "Java";

    System.out.println(language);

    System.out.println("---------------------------------------------------");

    ArrayList<Integer> list1 = new ArrayList<>(); // but one object, it can have multiple reference names

    list1.add(100);

    ArrayList<Integer> list2 = list1; // imagine that the object is a room and it has two doors.

    list2.addAll(Arrays.asList(200,300,400));

    System.out.println(list1);
    System.out.println(list2);

    System.out.println(list1==list2);

    //there is no unreferenced object above

    System.out.println("---------------------------------------------------");

    Student student1 = new Student("Tahir",30,'M','B',14);
    student1.grade = 'A';

    Student student2 = student1;// if I call any method from this reference name or the other reference name, is going to make the change to the same object
    student2.name="Ahmet";

    System.out.println(student1);
    System.out.println(student2);

    System.out.println("-----------------------------------");

    //now we have two rooms. Each room has their own doors.

    ArrayList<String> l1 = new ArrayList<>();
    l1.add("Java");

    ArrayList<String> l2 = new ArrayList<>();
    l2.add("Python");

    System.out.println("l1 = " + l1);
    System.out.println("l2 = " + l2);










    }

}

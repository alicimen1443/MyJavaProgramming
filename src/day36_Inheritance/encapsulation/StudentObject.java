package day36_Inheritance.encapsulation;

public class StudentObject {
    public static void main(String[] args) {

        Student student1 = new Student("Ali",34,'M','A',"Cydeo School");

        student1.setAge(35);

        System.out.println(student1);

    }
}

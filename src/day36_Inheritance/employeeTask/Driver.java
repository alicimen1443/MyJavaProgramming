package day36_Inheritance.employeeTask;

public class Driver extends Employee{

    public Driver(String name, char gender, String jobTitle, int age, int id, double salary) {
        super(name, gender, jobTitle, age, id, salary);
    }


    public void driving(){
        System.out.println(name+" is driving");
    }
}

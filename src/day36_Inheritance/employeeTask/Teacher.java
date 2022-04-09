package day36_Inheritance.employeeTask;

public class Teacher extends Employee {

    public Teacher(String name, char gender, String jobTitle, int age, int id, double salary) {
        super(name, gender, jobTitle, age, id, salary);
    }

    public void teaching(){
        System.out.println(name+" is teaching");
    }



}

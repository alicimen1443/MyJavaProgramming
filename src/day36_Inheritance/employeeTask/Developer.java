package day36_Inheritance.employeeTask;

public class Developer extends Employee{

    public Developer(String name, char gender, String jobTitle, int age, int id, double salary) {
        super(name, gender, jobTitle, age, id, salary);
    }

    public void coding(){
        System.out.println(name+" is coding");
    }

    public void fixingBugs(){
        System.out.println(name+" is fixing bugs");
    }




}

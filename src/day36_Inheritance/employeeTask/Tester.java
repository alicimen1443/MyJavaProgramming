package day36_Inheritance.employeeTask;

public class Tester extends Employee{

    public Tester(String name, char gender, String jobTitle, int age, int id, double salary) {
        super(name, gender, jobTitle, age, id, salary);
    }


    public void testing(){
        System.out.println(name+" is implementing smoke test");
    }

    public void creatingTicket(){
        System.out.println(name+" is creating ticket");
    }







}

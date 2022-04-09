package day36_Inheritance.employeeTask;

public class Employee {

    public String name;
    public char gender;
    public String jobTitle;
    public int age,id;
    public double salary;

    public Employee(String name, char gender, String jobTitle, int age, int id, double salary) {
        this.name = name;
        this.gender = gender;
        this.jobTitle = jobTitle;
        this.age = age;
        this.id = id;
        this.salary = salary;
    }

    public void work(){
        System.out.println(jobTitle+" "+name+" is working hard");

    }

    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", jobTitle='" + jobTitle + '\'' +
                ", age=" + age +
                ", id=" + id +
                ", salary=" + salary +
                '}';
    }
}

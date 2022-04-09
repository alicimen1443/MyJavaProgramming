package day37_Inheritance.scrumTask;

public class Employee extends Person { // Employee IS A Person

    public int id;
    public String jobTitle;
    public double salary;
    public String companyName;

    public Employee(String name, int age, char gender, int id, String jobTitle, double salary, String companyName) {
        super(name, age, gender);
        this.id = id;
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.companyName = companyName;
    }

    public void work() {
        System.out.println(jobTitle + " " + name + " is working");
    }

    public String toString() {
        return "Employee{" +
                " name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", jobTitle='" + jobTitle + '\'' +
                ", id=" + id +
                ", salary= $" + salary +
                ", companyName='" + companyName + '\'' +
                '}';
    }
}
/*
2. Create a sub class of Person named Employee
			Extra variables:
				id, jobTitle, salary

			Extra methods:
				work()

				toString(): generate toString seperately in Employee class so that name, age, gender, id, jobTitle and salary of the emplyee can be displayed

 */
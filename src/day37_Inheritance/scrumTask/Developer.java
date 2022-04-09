package day37_Inheritance.scrumTask;

public class Developer extends Employee {

    public Developer(String name, int age, char gender, int id, String jobTitle, double salary, String companyName) {
        super(name, age, gender, id, jobTitle, salary, companyName);
    }

    public void fixBugs(){
        System.out.println(jobTitle+" "+name+" is crying");
    }
}
/*
4. Create a sub class of Employee named Developer:

			Add any extra variable or method that Developer object need to have
 */
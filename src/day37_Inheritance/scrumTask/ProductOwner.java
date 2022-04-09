package day37_Inheritance.scrumTask;

public class ProductOwner extends Employee{
    public ProductOwner(String name, int age, char gender, int id, double salary, String companyName) {
        super(name, age, gender, id, "Product Owner", salary, companyName);
    }

    public void requrimentGather(){
        System.out.println(name+" is gathering the requirements");
    }
}

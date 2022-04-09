package day32_Constructors;

public class Employee {

    public String name;
    public char gender;
    public String jobTitle;
    public double salary;

    public Employee(String name) {
        this.name = name;
    }

    public Employee(String name, char gender){
          this(name); //This is how you can call constructor in another constructor  this.name=name;
        //  In java, constructors cannot be called by it's name.In order to call the constructors, there is a special keyword that you have to use : this()
        // must be at the first step
        //this.name=name;
        this.gender=gender;
    }

    public Employee(String name, char gender, String jobTitle){

        this(name, gender); // I called the constructor above
        this.jobTitle=jobTitle;
    }

    public Employee(String name, char gender, String jobTitle, double salary){
        this(name, gender, jobTitle);
        this.salary=salary;
    }

    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                '}';
    }
}

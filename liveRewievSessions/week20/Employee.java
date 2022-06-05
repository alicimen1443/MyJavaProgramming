package week20;

public class Employee {

    private String firstName;
    private String lastName;
    private String job_ID;
    private double salary;
    private int department_ID;

    public Employee() {
    }

    public void setInfo(String firstName, String lastName, String job_ID, double salary, int department_ID) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.job_ID = job_ID;
        this.salary = salary;
        this.department_ID = department_ID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getJob_ID() {
        return job_ID;
    }

    public void setJob_ID(String job_ID) {
        this.job_ID = job_ID;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getDepartment_ID() {
        return department_ID;
    }

    public void setDepartment_ID(int department_ID) {
        this.department_ID = department_ID;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", job_ID='" + job_ID + '\'' +
                ", salary=" + salary +
                ", department_ID=" + department_ID +
                '}';
    }
}

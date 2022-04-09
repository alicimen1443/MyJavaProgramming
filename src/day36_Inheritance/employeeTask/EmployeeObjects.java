package day36_Inheritance.employeeTask;

public class EmployeeObjects {

    public static void main(String[] args) {

        Developer developer = new Developer("Ali",'M',"Senior Developer",34,12,140000);

        Tester tester = new Tester("Veli",'M',"QA",32,134,125000);

        Teacher teacher = new Teacher("Ahmet",'M',"Biology Teacher",25,233,115000);

        Driver driver  = new Driver("Fatma",'F',"Truck Driver",35,33,20000);



        System.out.println(developer);
        System.out.println(tester);
        System.out.println(teacher);
        System.out.println(driver);
        System.out.println("------------------------------------------");

        developer.fixingBugs();
        tester.creatingTicket();
        teacher.teaching();
        driver.driving();
        developer.work();


    }
}

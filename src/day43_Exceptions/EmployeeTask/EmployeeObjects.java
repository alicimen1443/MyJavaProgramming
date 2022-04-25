package day43_Exceptions.EmployeeTask;

public class EmployeeObjects {
    public static void main(String[] args) {

        //we cannot create object from abstract classes

        Developer developer = new Developer("Ali",34,'M',14,"Web developer",125000);
        Tester tester = new Tester("Veli",34,'M',15,"SDET",120000);
        Teacher teacher = new Teacher("Ayşe",26,'F',10,"English Teacher",130000);
        Driver driver = new Driver("Fatma",27,'F',16,"Truck driver",115000);

        System.out.println(tester);
        System.out.println(developer);
        System.out.println(teacher);
        System.out.println(driver);

        tester.work();
        tester.sleep();
        tester.bugReport();
        tester.eat();

        System.out.println("-----------------------------------");

        developer.work();
        developer.sleep();
        developer.eat();
        developer.unitTest();

        System.out.println("-----------------------------------");

        teacher.work();
        teacher.sleep();
        teacher.eat();

    }
}

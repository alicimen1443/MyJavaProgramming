import java.util.ArrayList;
import java.util.Arrays;

public class MyScrumTeam {
    public static void main(String[] args) {

        //4 testers objects
        day31_Constructors.scrumTask.Tester tester1 = new day31_Constructors.scrumTask.Tester("Layan",11,"QA",110000);
        day31_Constructors.scrumTask.Tester tester2 = new day31_Constructors.scrumTask.Tester("Ali",43,"SDET",142000);
        day31_Constructors.scrumTask.Tester tester3 = new day31_Constructors.scrumTask.Tester("Alex",44,"SE",135000);
        day31_Constructors.scrumTask.Tester tester4 = new day31_Constructors.scrumTask.Tester("Lala",23,"SDET",115000);

        day31_Constructors.scrumTask.Tester[] testers ={tester2,tester3,tester4};

        //4 developers objects

        day31_Constructors.scrumTask.Developer developer1 = new day31_Constructors.scrumTask.Developer("Olga",22,"Java Developer",125000);
        day31_Constructors.scrumTask.Developer developer2 = new day31_Constructors.scrumTask.Developer("Aygun",39,"Java Master",185000);
        day31_Constructors.scrumTask.Developer developer3 = new day31_Constructors.scrumTask.Developer("Tunc",28,"Software Developer",135000);
        day31_Constructors.scrumTask.Developer developer4 = new day31_Constructors.scrumTask.Developer("Sinem",13,"Senior Developer",200000);

        day31_Constructors.scrumTask.Developer[] developers = {developer2,developer3,developer4};


        //1 ScrumTeam Object
        day31_Constructors.scrumTask.ScrumTeam scrum = new day31_Constructors.scrumTask.ScrumTeam("Nigara","Huseyin","Neira",14);

        scrum.addTester(tester1);
        scrum.addDeveloper(developer1);

        scrum.addTesters(testers);
        scrum.addDevelopers(developers);

        System.out.println(scrum);

        System.out.println("--------------------------------------");

        for( day31_Constructors.scrumTask.Tester eachTester: scrum.testersList){
            System.out.println(eachTester.name+" : "+eachTester.salary);

        }

        System.out.println("-------------------------------------------------");

        for (day31_Constructors.scrumTask.Developer eachDeveloper : scrum.devopsList) {

            System.out.println(eachDeveloper.name+" : "+eachDeveloper.salary);
        }

        System.out.println("-------------------------------------------------------");

        scrum.removeTester(23);
        scrum.removeDeveloper(22);

        System.out.println(scrum);

    }
}

class Tester{
    public String name;
    public int employeeID;
    public String jobTitle;
    public double salary;

    public Tester(String name, int employeeID, String jobTitle, double salary) {
        this.name = name;
        this.employeeID = employeeID;
        this.jobTitle = jobTitle;
        this.salary = salary;
    } // constructor is for helping you to set the instance variables

    public String toString() {
        return "Tester{" +
                "name='" + name + '\'' +
                ", employeeID=" + employeeID +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary= $" + salary +
                '}';
    }

    public void smokeTesting(){
        System.out.println(name+" is performing smoke testing");
    }

    public void creatingTicket(){
        System.out.println(name+" is creating the ticket");
    }

    public void dailyStandUp(){
        System.out.println(name+" is performing daily stand-up");
    }

}

class Developer{
    public String name;
    public int employeeID;
    public String jobTitle;
    public double salary;

    public Developer(String name, int employeeID, String jobTitle, double salary) {
        this.name = name;
        this.employeeID = employeeID;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    public String toString() {
        return "Developer{" +
                "name='" + name + '\'' +
                ", employeeID=" + employeeID +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                '}';
    }

    public void coding(){
        System.out.println(name+" is coding");
    }

    public void unitTesting(){
        System.out.println(name+" is performing unit testing");
    }

    public void fixingBug(){
        System.out.println(name+" is fixing bug");
    }


}

class ScrumTeam{
    public String PO, BA, SM;
    public ArrayList<day31_Constructors.scrumTask.Tester> testersList = new ArrayList<>();
    public ArrayList<day31_Constructors.scrumTask.Developer> devopsList = new ArrayList<>();
    public int daysOfSprint;

    public ScrumTeam(String PO, String BA, String SM, int daysOfSprint) {
        this.PO = PO;
        this.BA = BA;
        this.SM = SM;
        this.daysOfSprint = daysOfSprint;
    }

    public void addTester(day31_Constructors.scrumTask.Tester tester){
        testersList.add(tester);
    }

    public void addTesters(day31_Constructors.scrumTask.Tester[] testers){
        testersList.addAll(Arrays.asList(testers));
    }

    public void addDeveloper(day31_Constructors.scrumTask.Developer developer){
        devopsList.add(developer);
    }

    public void addDevelopers(day31_Constructors.scrumTask.Developer[] developers){
        devopsList.addAll(Arrays.asList(developers));
    }

    public void removeTester(int employeeID){
        testersList.removeIf(p->p.employeeID==employeeID);
    }

    public void removeDeveloper(int employeeID){
        devopsList.removeIf(p->p.employeeID==employeeID);
    }

    public String toString() {
        return "ScrumTeam{" +
                "PO='" + PO + '\'' +
                ", BA='" + BA + '\'' +
                ", SM='" + SM + '\'' +
                ", total number of testers=" + testersList.size() +
                ", total number of developers=" + devopsList.size() +
                ", daysOfSprint=" + daysOfSprint +
                '}';
    }

}
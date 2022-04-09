package day37_Inheritance.scrumTask;

public class AmazonInc {
    public static void main(String[] args) {

        String company = "Amazon Inc";

        ProductOwner po = new ProductOwner("Suhaib",29,'M',1,160000,company);

        BusinessAnalyst ba = new BusinessAnalyst("Cihad",30,'M',2,150000,company);

        ScrumMaster sm = new ScrumMaster("Anel",26,'F',3,145000,company);

        Tester tester1 = new Tester("Rabia",32,'F',1415,"QA",125000,company);
        Tester tester2 = new Tester("Yasemin",31,'F',1416,"QE",130000,company);
        Tester tester3 = new Tester("Irena",29,'F',1417,"SDET",135000,company);
        Tester tester4 = new Tester("Cahid",26,'M',1418,"QA",115000,company);

        Tester[] testers = {tester1,tester2,tester3,tester4};

        Developer developer1 = new Developer("Daniela",27,'F',8,"Java Developer",135000,company);

        ScrumTeam scrumTeam = new ScrumTeam(po , ba, sm);
        scrumTeam.addDeveloper(developer1);
        scrumTeam.addTesters(testers);

        System.out.println(scrumTeam);

        System.out.println("--------------------------------------------------");

        for (Tester tester : scrumTeam.testers) {
            System.out.println(tester.name+" : "+tester.salary);
        }

    }
}

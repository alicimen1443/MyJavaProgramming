package day33_Statics;

public class CydeoStudent {

    public String name;
    public int age;
    public char gender;
    public int id;
    public char grade;
    public String batchNumber;
    public int groupNumber;
    public static String schoolName="Cydeo School";
    public static String prLanguage="Java";

    public CydeoStudent(String name, int age, char gender, int id, char grade, String batchNumber, int groupNumber) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.id = id;
        this.grade = grade;
        this.batchNumber = batchNumber;
        this.groupNumber = groupNumber;
    }

    public void study(){
        System.out.println(name+" is studying");
    }

    public void attendClass(){
        System.out.println(name+" is attending the class");
    }

    public static void printSchoolName(){
        System.out.println("School Name = " + schoolName);
    }

    public static void printPrLanguage(){
        System.out.println("Programming Language = " + prLanguage);
    }


    public String toString() {
        return "CydeoStudent{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", id=" + id +
                ", grade=" + grade +
                ", batchNumber='" + batchNumber + '\'' +
                ", groupNumber=" + groupNumber +
                '}';
    }
}

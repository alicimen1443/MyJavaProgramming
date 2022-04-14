package day39_Recap.studentTask;

public class StudentObjects {
    public static void main(String[] args) {

        CydeoStudent cydeoStudent = new CydeoStudent("Ali",34,'M',123,"QA",'A',25,6);

        System.out.println(cydeoStudent);

        GraduateStudent graduateStudent = new GraduateStudent("Veli",25,'M',234,"SDET",'B',"MIT");

        System.out.println(graduateStudent);

        cydeoStudent.sleep();
        graduateStudent.eat();
        cydeoStudent.eat();
        cydeoStudent.drink();

        cydeoStudent.setGroupNumber(21);
        System.out.println(cydeoStudent);


    }
}

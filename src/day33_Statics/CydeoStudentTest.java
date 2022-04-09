package day33_Statics;

public class CydeoStudentTest {
    public static void main(String[] args) {

        CydeoStudent student1 = new CydeoStudent("Ali",34, 'M',15,'A',"EU8",6);

        System.out.println(student1);

        CydeoStudent.printSchoolName();
        CydeoStudent.printPrLanguage();

        student1.study();
        student1.attendClass();



    }
}

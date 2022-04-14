package day39_Recap.studentTask;

public class UndergraduateStudent extends Student{

    public UndergraduateStudent(String name, int age, char gender, int studentID, String fieldOfStudy, char grade, String schoolName) {
        super(name, age, gender, studentID, fieldOfStudy, grade, schoolName);
    }

    @Override
    public void study() {
        System.out.println("undergraduate "+getName()+" is studying");
    }
}

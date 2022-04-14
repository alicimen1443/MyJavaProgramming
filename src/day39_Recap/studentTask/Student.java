package day39_Recap.studentTask;

public class Student extends Person {

    private int studentID;
    private String fieldOfStudy;
    private char grade;
    private String schoolName;

    public Student(String name, int age, char gender, int studentID, String fieldOfStudy, char grade, String schoolName) {
        super(name, age, gender);
        this.studentID = studentID;
        this.fieldOfStudy = fieldOfStudy;
        this.grade = grade;
        this.schoolName = schoolName;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public String getFieldOfStudy() {
        return fieldOfStudy;
    }

    public void setFieldOfStudy(String fieldOfStudy) {
        if(fieldOfStudy==null||fieldOfStudy.isBlank()||fieldOfStudy.isBlank()){
            System.err.println("Field of study cannot be null or empty");
            System.exit(1);
        }
        this.fieldOfStudy = fieldOfStudy;
    }

    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        if(grade=='A'||grade=='B'||grade=='C'||grade=='D'||grade=='F'){
            this.grade = grade;
        }else{
            System.err.println("Invalid grade data");
            System.exit(1);
        }

    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        if(schoolName==null||schoolName.isBlank()||schoolName.isEmpty()){
            System.err.println("School name cannot be null or empty");
            System.exit(1);
        }
        this.schoolName = schoolName;
    }

    public void study(){
        System.out.println(getName()+" is studying");
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", gender=" + getGender() +
                ", student id =" + studentID +
                ", field of study =" + fieldOfStudy +
                ", grade =" + grade +
                ", school name =" + schoolName +
                '}';

    }
}

package day39_Recap.studentTask;

public class CydeoStudent extends Student {

    private int batchNumber;
    private int groupNumber;
    private String programmingLanguage;

    public CydeoStudent(String name, int age, char gender, int studentID, String fieldOfStudy, char grade, int batchNumber, int groupNumber) {
        super(name, age, gender, studentID, fieldOfStudy, grade, "Cybertech school");
        this.batchNumber = batchNumber;
        this.groupNumber = groupNumber;
        this.programmingLanguage = "Java";
    }

    public int getBatchNumber() {
        return batchNumber;
    }

    public void setBatchNumber(int batchNumber) {
        if(batchNumber<=0){
            System.err.println("batch number cannot be zero or negative");
            System.exit(1);
        }
        this.batchNumber = batchNumber;
    }

    public int getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(int groupNumber) {
        if(groupNumber<=0){
            System.err.println("group number cannot be zero or negative");
            System.exit(1);
        }
        this.groupNumber = groupNumber;
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        if(programmingLanguage==null||programmingLanguage.isEmpty()||programmingLanguage.isBlank()){
            System.err.println("Invalid data");
            System.exit(1);
        }
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public void eat() {
        System.out.println(getName()+" is eating with "+programmingLanguage);
    }

    @Override
    public void drink() {
        System.out.println(getName()+" is drinking with "+programmingLanguage);
    }

    @Override
    public void sleep() {
        System.out.println(getName()+" is sleeping with "+programmingLanguage);
    }

    public String toString() {
        return "Student{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", gender=" + getGender() +
                ", student id =" + getStudentID() +
                ", field of study =" + getFieldOfStudy() +
                ", grade =" + getGrade() +
                ", school name =" + getSchoolName() +
                ", batch number =" + batchNumber +
                ", group number =" + groupNumber +
                ", programming language =" + programmingLanguage +
                '}';

    }

}

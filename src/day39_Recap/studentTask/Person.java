package day39_Recap.studentTask;

public class Person {

    private String name;
    private int age;
    private char gender;

    public Person(String name, int age, char gender) {
        setName(name);
        setAge(age);
        setGender(gender);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(nullOrEmpty(name)||containSpecialChar(name)){
            System.err.println("name cannot be null or empty and name cannot contain any special char");
            System.exit(1);
        }else{
            this.name = name;
        }

    }

    public boolean nullOrEmpty(String name){
        if(name==null||name.isEmpty()||name.isBlank()){
            return true;
        }else{
            return false;
        }
    }

    public boolean containSpecialChar(String name){
        name=name.trim();
        if(name.contains(" ")){
            name=name.replaceAll(" ","");
        }
        for (int i = 0; i < name.length(); i++) {
            if( !(Character.isLetterOrDigit(name.charAt(i))) ){
                return true;
        }
        }
        return false;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age<0){
            System.err.println("Age cannot be less than zero");
            System.exit(1);
        }
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        if(!(gender=='M'||gender=='F' )){
            System.err.println("Invalid gender");
            System.exit(1);
        }else{
            this.gender = gender;
        }
    }

    public void eat(){
        System.out.println(name+" is eating");
    }

    public void drink(){
        System.out.println(name+" is drinking");
    }

    public void sleep(){
        System.out.println(name+" is sleeping");
    }

    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}

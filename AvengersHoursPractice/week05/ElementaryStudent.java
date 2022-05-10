package week05;

public class ElementaryStudent {

    private String name;
    private int age;

    public ElementaryStudent() {
    }

    public ElementaryStudent(String name, int age) {
        setName(name);
        setAge(age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name==null||name.isEmpty()){
            throw new IllegalArgumentException("Name cannot be empty or null");
        }
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age<5||age>12){
            throw new IllegalArgumentException("Age cannot be less than 5 or greater than12");
        }
        this.age = age;
    }

    @Override
    public String toString() {
        return "ElementaryStudent{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

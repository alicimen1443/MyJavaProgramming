package day31_Constructors;

public class PersonObject {
    public static void main(String[] args) {

        Person person1 = new Person("Ali",'M',34);

        Person person2 = new Person("Veli",'M',30);

        person2.age=28;



        System.out.println(person1);
        System.out.println(person2);






    }
}

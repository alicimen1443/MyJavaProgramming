package day33_Statics;

public class PersonTest {
    public static void main(String[] args) {

        Person person1 = new Person("Ali",34,'M');

        System.out.println(person1);

        System.out.println(Person.hasNose);
        System.out.println(Person.hasWings);

        person1.drink("coke");
        person1.eat("pizza");



    }
}

package day33_Statics;

public class DogTest {
    public static void main(String[] args) {

        Dog dog1 = new Dog("Kangal","Large","Male","White",5);

        System.out.println(dog1);

        dog1.eat();
        dog1.sleep();

        int wings = Dog.numberOfWings;

        System.out.println(wings);


    }
}

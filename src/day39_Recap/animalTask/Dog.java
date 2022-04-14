package day39_Recap.animalTask;

public class Dog extends FriendlyAnimal {

    public Dog(String name, String breed, char gender, String color, String size, int age) {
        super(name, breed, gender, color, size, age);
    }

    public void bark(){
        System.out.println(getName()+ " is barking");
    }

    @Override
    public void eat() {
        System.out.println(getName()+" is eating dog food");
    }
}

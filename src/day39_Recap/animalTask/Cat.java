package day39_Recap.animalTask;

public class Cat extends FriendlyAnimal {

    public Cat(String name, String breed, char gender, String color, String size, int age) {
        super(name, breed, gender, color, size, age);
    }

    public void scratch(){
        System.out.println(getName()+" is scratching");
    }

    public void meow(){
        System.out.println(getName()+" is meowing");
    }

    @Override
    public void eat() {
        System.out.println(getName()+" is eating cat food");
    }




}

package day39_Recap.animalTask;

public class Dolphin extends FriendlyAnimal{

    public Dolphin(String name, String breed, char gender, String color, String size, int age) {
        super(name, breed, gender, color, size, age);
    }


    public void swim(){
        System.out.println(getName()+ " is swimming");
    }

    @Override
    public void eat() {
        System.out.println(getName()+" is eating fish food");
    }
}

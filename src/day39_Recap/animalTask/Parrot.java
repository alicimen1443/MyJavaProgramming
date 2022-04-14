package day39_Recap.animalTask;

public class Parrot extends FriendlyAnimal {

    public Parrot(String name, String breed, char gender, String color, String size, int age) {
        super(name, breed, gender, color, size, age);
    }


    public void fly(){
        System.out.println(getName()+" is flying");
    }

    public void sing(){
        System.out.println(getName()+" is singing a song");
    }

    @Override
    public void eat() {
        System.out.println(getName()+" is eating bird food");
    }
}

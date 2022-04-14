package day39_Recap.animalTask;

public class Eagle extends WildAnimal{

    public Eagle(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void hunt() {
        System.out.println(getAge()+" is hunting in the sky");
    }

    public void fly(){
        System.out.println(getName()+" is flying high");
    }
}

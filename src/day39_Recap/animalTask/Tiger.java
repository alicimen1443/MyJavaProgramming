package day39_Recap.animalTask;

public class Tiger extends WildAnimal{

    public Tiger(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void hunt() {
        System.out.println(getName()+" is hunting in the jungle");
    }

    public void run(){
        System.out.println(getName()+" is running");
    }
}

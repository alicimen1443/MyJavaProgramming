package day39_Recap.animalTask;

public class Python extends WildAnimal {

    public Python(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void hunt() {
        System.out.println(getName()+" is hunting in the field");
    }

    public void crawl(){
        System.out.println(getName()+" is crawling");
    }
}

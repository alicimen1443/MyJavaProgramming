package day39_Recap.animalTask;

public class FriendlyAnimal extends Animal {

    public FriendlyAnimal(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    private final static boolean isWild =false;
    private final static boolean isFriendly = true;
    private final static boolean isPlayable = true;


    public static boolean isIsWild() {
        return isWild;
    }

    public static boolean isIsFriendly() {
        return isFriendly;
    }

    public static boolean isIsPlayable() {
        return isPlayable;
    }

    public void play(){
        System.out.println(getName()+" is playing");
    }

    public void pet(){
        System.out.println(getName()+" is a pet animal");
    }
}

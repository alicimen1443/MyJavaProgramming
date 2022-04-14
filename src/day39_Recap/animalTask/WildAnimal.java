package day39_Recap.animalTask;

public class WildAnimal extends Animal {

    public WildAnimal(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    private static boolean isWild=true;
    private static boolean isFriendly=false;
    private static boolean isPlayable = false;

    public static boolean isIsWild() {
        return isWild;
    }

    public static boolean isIsFriendly() {
        return isFriendly;
    }

    public static boolean isIsPlayable() {
        return isPlayable;
    }

    public void hunt(){
        System.out.println(getName()+" is hunting");
    }
}

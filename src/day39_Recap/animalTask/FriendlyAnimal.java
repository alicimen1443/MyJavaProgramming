package day39_Recap.animalTask;

import day40_FinalKeyword.Animal;

public class FriendlyAnimal extends Animal {

    public FriendlyAnimal(String name, String breed, char gender, String color, String size, int age) {
        super(name, breed, gender, color, size, age);
    }

    private static boolean isWild =false;
    private static boolean isFriendly = true;
    private static boolean isPlayable = true;


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

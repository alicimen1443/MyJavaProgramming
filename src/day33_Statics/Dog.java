package day33_Statics;

public class Dog {

    public String breed,size,gender,color;
    public int age;
    public static int numberOfLegs = 4;
    public static int numberOfEyes = 2;
    public static int numberOfWings =0;
    public static boolean isFriendly=true;

    public Dog(String breed, String size, String gender, String color, int age) {
        this.breed = breed;
        this.size = size;
        this.gender = gender;
        this.color = color;
        this.age = age;
    }

    public void eat(){
        System.out.println(color+" "+breed+" is eating");
    }

    public void sleep(){
        System.out.println(color+" "+breed+" is sleeping");
    }
    public void play(){
        System.out.println(color+" "+" is playing");
    }

    public String toString() {
        return "Dog{" +
                "breed='" + breed + '\'' +
                ", size='" + size + '\'' +
                ", gender='" + gender + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                ", number of legs =" + numberOfLegs +
                ", number of eyes =" + numberOfEyes +
                ", number of wings =" + numberOfWings +
                '}';
    }
}

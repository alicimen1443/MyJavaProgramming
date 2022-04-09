package day35_Encapsulation;

public class Person {
    //when we say fields it means the instance variables. Fields, they belong to the object. Object, we use them to store data into it's fields.
    public String name;
    public int age;
    public char gender;
    public String language;

    public static String planet;
    public static boolean isHuman, hasNose;
    public static int numberOfWings,numberofHead;




    public Person(String name, int age, char gender, String language) {
        this.name = name; //When the parameter is having the same name with the instance, then we have to use this. keyword to prevent the conflict
        this.age = age;
        this.gender = gender;
        this.language = language;
    }  // this is the consturctor that can help us to set every single instances

    //Static block, it gets executed when the class is loaded. The moment that this class is being called at anywhere, the static block gets executed

    static{
        planet="Earth"; // we are assuming that it can take several steps to set static variables. We can as well initialize them with single line.
        hasNose=true;
        numberOfWings=0;
        numberofHead=1;
    }

    public static void planetName(){
        System.out.println("Planet name is "+planet);
      //  System.out.println(name); Static does not accept any instances. It does not have direct access to any instances
    }

    public void eat(String food){
        System.out.println(name+" is eating "+food);
    }
    public void drink(String drink){
        System.out.println(name+" is drinking "+drink);
    }

    public String toString() { // toString method is an instance method, It belongs to the object. We can modify it, we can add static variable.
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", language='" + language + '\'' +
                '}';
    }
}
/*
1. Create a class named Person:
			Variables:
				name, age, gender, language, planet, isHuman, hasNose, numberOfWings, numberOfHead

			Add a constructor to initialize all the fields

			Add a static block to initialize all the statics

			Methods:
				printPlanetName()
				eat(String food)
				drink(String drink)
				toString()
 */
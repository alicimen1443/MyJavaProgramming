package day36_Inheritance.animalTask;

public class Zoo {
    public static void main(String[] args) {

        Dog dog = new Dog();
        dog.setInfo("Max","Husky",'M',2,"Small","White");
        System.out.println(dog);

        dog.eat();
        dog.drink();
        dog.sleep();
        dog.move();
        dog.bark();

        Cat cat = new Cat();
        cat.setInfo("Tarcin","British",'M',3,"Small","Brown");
        System.out.println(cat);

        cat.eat();
        cat.sleep();
        cat.drink();
        cat.move();
        cat.meow();
        cat.scratch();


        Tiger tiger = new Tiger();
        tiger.setInfo("Sher Khan","Bengal",'M',4,"Large","Orange");
        System.out.println(tiger);

        tiger.eat();
        tiger.drink();
        tiger.sleep();
        tiger.move();
        tiger.hunt();
        tiger.roar();







    }
}

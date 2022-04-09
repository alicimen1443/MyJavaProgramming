package day37_Inheritance.animalTask;

public class AnimalObjects {

    public static void main(String[] args) {

        Dog dog1 = new Dog("Alex","Husky",'M',1,"Small","White");
        System.out.println(dog1);
        dog1.drink();

        Cat cat1 = new Cat("Love","Siamese",'F',2,"Large","Black");
        System.out.println(cat1);
        cat1.scratch();

        Parrot parrot1 = new Parrot("King","Macaw",'M',3,"Small","Blue");
        System.out.println(parrot1);
        parrot1.sing();


    }
}

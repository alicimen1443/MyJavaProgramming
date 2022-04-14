package day39_Recap.animalTask;

public class Zoo {
    public static void main(String[] args) {


        Bear bear = new Bear("Teddy","Grizzly",'M',5,"Large","White");
        System.out.println(bear);

        System.out.println(Bear.isIsWild());
        System.out.println(bear.isIsFriendly());

        bear.hibernate();
        bear.hunt();

        bear.sleep();
        bear.eat();

        System.out.println("---------------------------------------");

        Cat cat = new Cat("Minnoş","Van",'F',3,"Medium","White");
        System.out.println(cat);

        System.out.println(cat.isIsFriendly());
        System.out.println(cat.isIsWild());

        cat.eat();
        cat.meow();
        cat.scratch();
        cat.play();
        cat.setColor("Black");

        System.out.println(cat);

        System.out.println("-------------------------------------");

        Crocodile crocodile = new Crocodile("Vahşi","Nehir Timsahı",'M',2,"Small","Green");
        System.out.println(crocodile);
        System.out.println(Crocodile.isIsPlayable());
        crocodile.hunt();
        crocodile.eat();

        System.out.println("------------------------------------");

        Dog dog = new Dog("Tarcın","Golden",'M',4,"Large","Orange");

        System.out.println(dog);

        dog.eat();
        dog.bark();
        dog.play();
        System.out.println(Dog.isIsPlayable());

        System.out.println("--------------------------------------------");

        Lion lion = new Lion("Aslan Kral","Sri Lanka",'F',1,"Small","Orange");

        System.out.println(lion);

        lion.hunt();
        lion.roar();
        System.out.println(lion.isIsWild());


    }
}

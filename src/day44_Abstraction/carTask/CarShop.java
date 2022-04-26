package day44_Abstraction.carTask;

public class CarShop {
    public static void main(String[] args) {

        Audi audi = new Audi("Q7",2020,120000,"White");

        BMW bmw = new BMW("M5",2022,150000,"Red");

        CydeoCar cydeoCar = new CydeoCar("EU8",2022,10000,"Green");

        Honda honda = new Honda("Accord",2020,50000,"Black");

        Mercedes mercedes = new Mercedes("C200",2019,200000,"Yellow");

        Nio nio = new Nio("NioS",2018,140000,"Blue");

        Tesla tesla = new Tesla("Model3",2017,120000,"White");

        Toyota toyota = new Toyota("Corolla",2021,100000,"Brown");

        tesla.selfDrive();

        nio.autoPark();

        audi.autoPark();

        mercedes.start();

        honda.stop();

        cydeoCar.fly();

        System.out.println(CydeoCar.hasAutopark);

        System.out.println(honda);
        System.out.println(tesla);
        System.out.println(audi);
        System.out.println(mercedes);
        System.out.println(nio);
        System.out.println(toyota);
        System.out.println(bmw);
        System.out.println(cydeoCar);

    }
}

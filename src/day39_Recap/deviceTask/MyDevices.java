package day39_Recap.deviceTask;

public class MyDevices {
    public static void main(String[] args) {

        Laptop laptop = new Laptop("Asus","VivoBook",5000,true);
        System.out.println(laptop);


        Iphone iphone = new Iphone("Iphone12",3000,true);
        System.out.println(iphone);

        Samsung samsung = new Samsung("A12",1000,true);
        System.out.println(samsung);

        TV tv = new TV("SEG","FullHD",500,false);
        System.out.println(tv);

        laptop.setPrice(3000);

        samsung.freeze();
        samsung.setBrand("S22");

        System.out.println(samsung);
        System.out.println(laptop);

        tv.channelDown();
        tv.channelUp();

        samsung.turnOf();
        iphone.turnOn();

        System.out.println(Samsung.isHasPowerButton());




    }
}

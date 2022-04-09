package day37_Inheritance.phoneTask;

public class PhoneShop {
    public static void main(String[] args) {

        Iphone iphone = new Iphone("Iphone 12","Pro max",1000,"Black");


        Samsung samsung = new Samsung("galaxy s22","mini",900,"White");


        Nokia nokia = new Nokia("Lumia","4 inches",50,"Gray");



        System.out.println(iphone);
        System.out.println(samsung);
        System.out.println(nokia);

        iphone.call(911);
        iphone.text(21323344);
        iphone.faceTime(235465656);
        iphone.faceTime("yahoo@gmail.com");

        System.out.println("-----------------------------------------");

        samsung.call(911);
        samsung.text(456768768);
        samsung.freeze();

        System.out.println("--------------------------------------");

        nokia.call(911);
        nokia.text(3254422);
        nokia.selfDefense();

        System.out.println("-------------------------------------");

        System.out.println(Phone.hasBattery);
        System.out.println(Iphone.hasBattery);
        System.out.println(Samsung.hasBattery);
        System.out.println(Nokia.hasBattery);


    }
}

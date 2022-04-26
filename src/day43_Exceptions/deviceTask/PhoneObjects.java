package day43_Exceptions.deviceTask;

public class PhoneObjects {
    public static void main(String[] args) {

        Iphone iphone = new Iphone("12 promax",2500);

        Samsung samsung = new Samsung("S22",1500);


        iphone.call(12323244);
        samsung.turnOff();
        samsung.call(231324324);

        System.out.println(samsung);
        System.out.println(iphone);

    }
}

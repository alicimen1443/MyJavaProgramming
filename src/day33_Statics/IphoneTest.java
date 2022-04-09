package day33_Statics;

public class IphoneTest {

    public static void main(String[] args) {

        System.out.println(Iphone.isTouchScreen); // I can call static member through the class names,for static members we don't have an object

        Iphone.printOperatingSystem();

        System.out.println(Iphone.madeIn);

        new Iphone().method1();



    }

}

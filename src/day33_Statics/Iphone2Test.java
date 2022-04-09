package day33_Statics;

public class Iphone2Test {
    public static void main(String[] args) {

        Iphone2 iphone = new Iphone2("12 ProMAX",1700,"White","L");

        System.out.println(iphone);

        System.out.println(Iphone2.madeIn);
        System.out.println(Iphone2.OS);

        iphone.faceTime("alicimen1443@gmail.com");
        iphone.text(551256348);




    }
}

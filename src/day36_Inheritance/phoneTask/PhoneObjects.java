package day36_Inheritance.phoneTask;

public class PhoneObjects {
    public static void main(String[] args) {

        Iphone iphone = new Iphone();
        iphone.setInfo("Apple","iphone 12","promax",3500,"Gold");
        System.out.println(iphone);

        iphone.call(231234354);
        iphone.text(33243243);
        iphone.faceTime("alicimen@gmail.com");

        Samsung samsung = new Samsung();
        samsung.setInfo("Samsung","s22","Large",2000,"White");
        System.out.println(samsung);

        samsung.freeze();

        Nokia nokia = new Nokia();
        nokia.setInfo("Nokia","Lumia","Medium",1000,"Black");
        System.out.println(nokia);

        nokia.selfDefense();


    }

}

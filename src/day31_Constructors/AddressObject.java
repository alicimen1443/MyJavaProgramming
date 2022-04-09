package day31_Constructors;

public class AddressObject {
    public static void main(String[] args) {

        Address aliCimen = new Address(6,"Sehit Fatih Akbulut cd","Midyat","Mardin",47500);

        System.out.println("aliCimen : \n" + aliCimen);

        System.out.println("------------------------------------");

        Address reyhanCankilic = new Address(11,"Yesillik sokak","Buyukcekmece","Istanbul",34750);

        System.out.println("reyhanCankilic : \n" + reyhanCankilic);


    }
}

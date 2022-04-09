package day05_StringConcatenation;

public class MyAddress {

    public static void main(String[] args) {

        String name = "Ali Cimen",
                 mahalle = "Yenimahalle",
                 cadde = "Sehit Fatih Akbulut cd.",
                 buildingNumber = "6/3",
                 district = "Midyat",
                 province = "Mardin";

        String address = name + "\n" + mahalle + " " + cadde + " " + buildingNumber + "\n" + district + "," + province;

        System.out.println(address);

        


    }
}

/*
Ali Cimen
Yenimahalle Sehit Fatih Akbulut cd. 6/3
Midyat,Mardin
 */

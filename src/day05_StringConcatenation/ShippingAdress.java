package day05_StringConcatenation;

public class ShippingAdress {

    public static void main(String[] args) {

        String name = "James King",
                buildingNumber = "11821B",
                streetName = "Jones Branch Dr",
                city = "McLean",
                state = "VA",
                zipCode = "47500A";

        //System.out.println(name + "\n" +buildingNumber + " " + streetName +"\n" + city + ", " + state + " " + zipCode);

        String address = name + "\n" +buildingNumber + " " + streetName +"\n" + city + ", " + state + " " + zipCode;

        System.out.println(address);
    }
}



/*
1. Create a class called ShippingAddress.java
2. Declare the following variables:
    1. name
    2. buildingNumber
    3. streetName
    4. city
    5. state
    6. zipCode
3. Use concatenation to print the full address

 */
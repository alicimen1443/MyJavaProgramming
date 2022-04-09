package day33_Statics;

public class Address {

    public String street;
    public String city;
    public String state;
    public int zipcode;
    public static String country = "USA";
    public static String planet = "Earth";

    public Address(String street, String city, String state, int zipcode) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipcode = zipcode;
    }

    public String toString() {
        return street+"\n"+city+" "+state+", "+zipcode;

    }
}

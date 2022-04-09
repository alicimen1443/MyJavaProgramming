package day33_Statics;

public class AdressTest {
    public static void main(String[] args) {

        Address address = new Address("Central park street","New Jersey","New York",1245632);
        System.out.println(address);

        System.out.println(Address.country);
        System.out.println(Address.planet);



    }
}

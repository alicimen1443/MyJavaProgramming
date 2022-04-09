package day35_Encapsulation.encapsulation;

public class CarpetTest {
    public static void main(String[] args) {
        
        Carpet carpet = new Carpet(8,2,50,false);

        System.out.println("carpet = " + carpet);

        System.out.println(carpet.calcCost());

        System.out.println(carpet.getUnitPrice());

        carpet.setPersian(true);

        System.out.println(carpet);
    }
}

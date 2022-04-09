package week12;

public class TelephoneTest {
    public static void main(String[] args) {

      //  System.out.println(Telephone.total); static block initialize

        Telephone telephone = new Telephone(); // do i get my static block initialized?

        System.out.println(telephone.total);
        telephone.setNumber("555-5050550");
        System.out.println(telephone.getNumber());



    }
}

package day35_Encapsulation.encapsulation;

import java.util.ArrayList;
import java.util.Arrays;

public class CandyFactory {
    public static void main(String[] args) {

        Candy candy = new Candy("ülker",5,10,true);
        Candy candy1 = new Candy("eti",5,20,false);
        Candy candy2 = new Candy("ozmo",4,5,true);
        Candy candy3 = new Candy("şölen",2,20,true);
        Candy candy4 = new Candy("nestle",1,10,false);

        System.out.println(candy);
        System.out.println(candy1);
        System.out.println(candy2);
        System.out.println(candy3);
        System.out.println(candy4);

        ArrayList<Candy> candies = new ArrayList<>();
        candies.addAll(Arrays.asList(candy,candy1,candy2,candy3,candy4));

        for(Candy each : candies){
            System.out.println(each.getBrand()+" : "+each.calcPrice());
        }
    }
}
 
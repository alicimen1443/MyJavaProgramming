package week06;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetOfProducts {
    public static void main(String[] args) {

        //Set<Product> products = new HashSet<>();// HashSet has random order
        Set<Product> products = new TreeSet<>();

        // Set: does not keep duplicate results
        // TreeSet : it is ordered ascendingly
        // LinkedHashSet : keeps insertion order

        products.add(new Product("book",24.99));
        products.add(new Product("newspaper",5.99));
        products.add(new Product("magazine",7.99));

        System.out.println(products);

        for (Product eachProduct : products) {
            if(eachProduct.getName().equalsIgnoreCase("newspaper")){
                eachProduct.setName("comics");
                eachProduct.setPrice(9.99);
            }
        }
        System.out.println(products);
    }
}

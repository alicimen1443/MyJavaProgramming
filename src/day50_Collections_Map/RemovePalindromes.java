package day50_Collections_Map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

public class RemovePalindromes {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.addAll(
                Arrays.asList("Java","Python","Cydeo","Car","Level","civic","radar","kayak","reviver","racecar","madam")
        );

        Iterator<String> it = names.iterator(); // now I have next(),hasNext() and remove() methods of Iterator

        while (it.hasNext()){
            String each = it.next();
            String reverse="";

            for (int i = each.length()-1; i >=0 ; i--) {
                reverse+=each.charAt(i);
                }

            if(reverse.equalsIgnoreCase(each)){
                it.remove();
            }
        }
        System.out.println(names);

        System.out.println("------------------------------------------");

        List<String> names2 = new ArrayList<>();
        names2.addAll(
                Arrays.asList("Java","Python","Cydeo","Car","Level","civic","radar","kayak","reviver","racecar","madam")
        );

        //If the body of the lambda expression requires more than one statement then this is how you give lambda expressions body
        Predicate<String> palindrome = each-> { // Predicate means boolean expression it will return a boolean value at the end
            String reverse="";

            for (int i = each.length()-1; i >=0 ; i--) {
                reverse+=each.charAt(i);
            }

            return reverse.equalsIgnoreCase(each);
        };

        names2.removeIf(palindrome);

        System.out.println(names2);

    }
}

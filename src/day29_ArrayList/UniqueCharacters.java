package day29_ArrayList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class UniqueCharacters {
    public static void main(String[] args) {

        String str = "aaabcccdeeefggggggggghiiiiijkkkkkkkl";

        String[] arr = str.split(""); // we are creating non primitive array

        ArrayList<String> list = new ArrayList<>(Arrays.asList(arr)); // here you can use asList method of Arrays utility class to pass any non
        //primitive array that you have
        //whichever non primitive array that you wanted to convert it to the collection type you will use asList method

        System.out.println("list = " + list);
        
        String unique = "";

        for (String each : list) {
            int frequency = Collections.frequency(list,each);
            if(frequency==1){
                unique+=each;
            }

        }

        System.out.println("unique = " + unique);


    }
}

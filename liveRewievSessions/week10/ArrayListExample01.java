package week10;

import java.util.ArrayList;

public class ArrayListExample01 {
    public static void main(String[] args) {

        // to show auto-boxing
        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 0; i <10 ; i++) { // 0,1,2,3.....==>>primitives

            arr.add(i);
        }
        System.out.println(arr);

    }
}

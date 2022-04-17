package java_Shorts;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListQuiz {
    public static void main(String[] args) {


       ArrayList<Integer> list = new ArrayList<>();

        list.addAll(Arrays.asList(1,2,3,4,5,6,7));

        Integer a = 7;

        System.out.println(list.remove(a));




    }
}

package week11;

import java.util.ArrayList;
import java.util.Arrays;

public class SomeUsefulMethods {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.remove(1);

        list.remove(Integer.valueOf(1));
        System.out.println(list);

        //array to array list
        String[] array ={"red","green","blue"};

        ArrayList<String> list2 = new ArrayList<>(Arrays.asList(array));
        System.out.println(list2);

        //array list into an array

        String[] arrayTwo =new String[list2.size()];
        list2.toArray(arrayTwo);
        System.out.println(Arrays.toString(arrayTwo));

        int[] arrayThree ={1,2,3,4};

        ArrayList<Integer> listThree = new ArrayList<>();

        for (int each : arrayThree) {
            listThree.add(each);
        }
        System.out.println(listThree);




    }
}

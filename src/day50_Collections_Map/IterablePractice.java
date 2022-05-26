package day50_Collections_Map;

import java.util.*;

public class IterablePractice {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,1,2,3,4,5,1,2,3,4,5));

        //remove all the elements that are less than 4
        //Without the iterable it does not work properly.Removing the elements from any collection type
        //they must use iterable. Even the lambda expression, it still uses iterable

        for (int i = 0; i < list.size(); i++) {
            if(list.get(i)<4){
                list.remove(i);
            }
        }
        System.out.println(list);



        System.out.println("==============================================================");

        List<Integer> list2 = new ArrayList<>(Arrays.asList(1,2,3,4,5,1,2,3,4,5,1,2,3,4,5));

        //remove all the elements that are less than 4

        Iterator<Integer> it = list2.iterator();

       /* boolean r1 = it.hasNext(); // it means there is an element in the list

        System.out.println(r1); // true

        System.out.println(it.next());  //1

        boolean r2 = it.hasNext();

        System.out.println(r2);  //true

        System.out.println(it.next());  //2

        */

        while (it.hasNext()){
            if(it.next() < 4){
                it.remove();
            }
        }
        System.out.println(list2);

        System.out.println("==============================================================");

        //we can do it with regular for loop but while loop is better

        List<Integer> list3 = new ArrayList<>(Arrays.asList(1,2,3,4,5,1,2,3,4,5,1,2,3,4,5));

        for(Iterator<Integer> i=list3.iterator(); i.hasNext(); ){

            if(i.next() < 4){
                i.remove();
            }
        }
        System.out.println(list3);

        System.out.println("==============================================================");

        List<Integer> list4 = new ArrayList<>(Arrays.asList(1,2,3,4,5,1,2,3,4,5,1,2,3,4,5));

        if(list4.removeIf(p->(p<4))); // as soon as you call removeIf method what happens is, this removeIf method
        //it creates an Iterator for your list.All you have to do is just to provide the condition for removing
        // it is just a shortcut of the Iterator that we have above

        System.out.println(list4);











    }

}

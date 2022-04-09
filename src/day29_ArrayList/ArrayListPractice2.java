package day29_ArrayList;
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractice2 {
    public static void main(String[] args) {

        ArrayList<String> employees = new ArrayList<>();

        employees.addAll(Arrays.asList("Ali","David","Ahmed","Jimmy","Daniel","Aaron","Ahmed","David","Shay"));
        employees.retainAll(Arrays.asList("Ahmed","David"));//every single bulk operations only accept collection type as
        //the argument.They do not accept anything else.If i have array values and if i want to convert them to the collection value
        //then from Arrays.utiliy we can call asList method

        System.out.println(employees);

        System.out.println("---------------------------------------------------------");

        String[] names = {"Mary","Monica","Mehray","Musti","Sumeyra","Hasan","Beril"};
        //remove all the names starts with  M

        ArrayList<String> list = new ArrayList<>(Arrays.asList(names));

        list.removeIf(p->p.startsWith("M"));

        names = list.toArray(new String[0]);
        System.out.println(Arrays.toString(names));






    }
}

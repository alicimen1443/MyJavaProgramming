package day40_FinalKeyword;

public class FinalVariable {

    final String birthday;
    final static String name;

    static {
        name="Batch 25";
    }

    public FinalVariable(String birthday) {
        this.birthday = birthday;
    }


    public static void main(String[] args) {

        final double pi = 3.14;

        //pi = 4.14;  final variables can not be reassigned
        // pi=5.5;

        final String name;

        name = "Java"; // I can only assign a value once

        //name="Wooden Spoon"; since it's final it does not allow me to reassign it

        System.out.println("-------------------------------");



        FinalVariable obj = new FinalVariable("May/01");

      //  obj.birthday="June/01";// final variables cannot be reassigned

        System.out.println(obj.birthday);

        System.out.println(name);


        System.out.println("--------------------------------------");

        System.out.println(FinalVariable.name);


    }
}

package day34_GarbageCollection_AccessModifiers;

import utilities.MathUtility;

import static day34_GarbageCollection_AccessModifiers.Circle.*;

import static utilities.MathUtility.*;

public class Test {

    public static void main(String[] args) {

        System.out.println(pi);
        System.out.println(name);
        System.out.println(numbers);


        System.out.println("-------------------------------");

        //find the sum of 10, 20
        int r1 = sum(10,20);


        //find the sum of 100, 200
        int r2 = sum(100,200);

        int r3 = subtraction(100,50);

        int r4 = max(1000,2000);

        System.out.println("r1 = " + r1);
        System.out.println("r2 = " + r2);
        System.out.println("r3 = " + r3);
        System.out.println("r4 = " + r4);




    }
}

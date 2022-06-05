package day53_FunctionalInterface.practiceTasks;

import java.util.function.Function;

public class FunctionalInterfaceTest {

    public static void main(String[] args) {
        //4.1 Create a function that can return the sum of digits from a string
        Function<String, Integer> sumOfDigits = str -> str.chars()
                .filter(Character::isDigit)
                .map(Character::getNumericValue)
                .sum();
        System.out.println("Sum of digits of \"7kjdsh8dsf9ds\" = " + sumOfDigits.apply("7kjdsh8dsf9ds"));



        //4.2 Create a function that can convert a Set of Integers to List of Integers



    }
}
/*
4. Use Function functional interface to:
		4.1 Create a function that can return the sum of digits from a string

		4.2 Create a function that can convert a Set of Integers to List of Integers

		4.3 Create a function that can convert a Set of String to List of String

		4.4 Create a function that can return the reversed version of an int array

		4.5 Create a function that can return the reversed version of a String array

		4.6 Create a function that can return the sorted (decending) version of an int array
				Note: you can use the reverse function you created at 4.4

		4.7 Create a function that can return the sorted (decending) version of a String array
				Note: you can use the reverse function you created at 4.5
 */
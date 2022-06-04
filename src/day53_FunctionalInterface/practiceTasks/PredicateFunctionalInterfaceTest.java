package day53_FunctionalInterface.practiceTasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateFunctionalInterfaceTest {
    public static void main(String[] args) {

        //3.1 Create a function that can verify if a string contains duplicated characters

        Predicate<String> hasDuplicatedElements = s -> {

           /* My solution
            String nonDup="";
            for (String eachChar : s.split("")) {
                if(!nonDup.contains(eachChar)){
                    nonDup+=eachChar;
                }
            }
            return nonDup.equals(s);
        };

        String str = "Pythonn";
        System.out.println(hasDuplicatedElements.test(str));

            */ // My solution

            //Short solution
            return !(new ArrayList<>(Arrays.asList(s.split(""))).stream().count() ==
                    new HashSet<>(Arrays.asList(s.split(""))).stream().count());
        };

        String str = "Pythonn";
        System.out.println(hasDuplicatedElements.test(str));

        //3.2 Create a function that can verify if a password is a strong password. Characteristics of strong passwords are:
        //		        1 Password must be at least have 8 characters long, and should not contain space
        //		        2 PassWord should at least contain one upper case letter
        //		        3 PassWord should at least contain one lower case letter
        //		        4 Password should at least contain one special characters
        //		        5 Password should at least contain a digit

        Predicate<String> strongPassword = s -> {
            boolean r1 = s.length() > 8 && !s.contains(" ");
            boolean r2 = false;
            boolean r3 = false;
            boolean r4 = false;
            boolean r5= false;
            for (char each : s.toCharArray()) {
                if (Character.isUpperCase(each)) {
                    r2 = true;
                }
                if (Character.isLowerCase(each)) {
                    r3 = true;
                }
                if (!Character.isLetterOrDigit(each)) {
                    r4 = true;
                }
                if (Character.isDigit(each)){
                    r5=true;
                }
            }
            boolean result = r1&&r2&&r3&&r4&&r5;

            return result;
        };

        System.out.println(strongPassword.test("Nc343600"));


    }
}
/*
3. Use Predicate Functional interface to:
		3.1 Create a function that can verify if a string contains duplicated characters

		3.2 Create a function that can verify if a password is a strong password. Characteristics of strong passwords are:
		        1 Password must be at least have 8 characters long, and should not contain space
		        2 PassWord should at least contain one upper case letter
		        3 PassWord should at least contain one lower case letter
		        4 Password should at least contain one special characters
		        5 Password should at least contain a digit
 */
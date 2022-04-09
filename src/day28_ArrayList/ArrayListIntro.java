package day28_ArrayList;

import java.util.ArrayList;

public class ArrayListIntro {
    public static void main(String[] args) {
// size is dynamic
        ArrayList<Integer> numbers = new ArrayList<>();
        ArrayList<String> names = new ArrayList<>();

        System.out.println(numbers.toString());//ArraysList it has the toString method.Compiler can call it automatically if the class has it
        System.out.println(names.toString());// you dont have to call the toString method in ArrayList


    }
}

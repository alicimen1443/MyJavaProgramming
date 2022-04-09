package day12_Scanner;

import java.util.Scanner;

public class ScannerPractice3_NextLine {
    public static void main(String[] args) {
        //123Enter
        Scanner input = new Scanner(System.in); //Enter

        System.out.println("Enter your full name: ");
        String fullName = input.nextLine(); // wooden spoonEnter  it reads everything untill you press the enter

        System.out.println("Enter your Programming Language: ");
        String programmingLanguage = input.nextLine();  // java prg langEnter

        System.out.println("Enter your age: ");
        int age = input.nextInt();  // 24Enter  it reads the 24 and ignores the enter key,it is left to scanner memory,the enter key is assigned to the school name variable by default

        input.nextLine();// nextLine is the only method to capture the enter key

        System.out.println("Enter your school name: ");
        String schoolName = input.nextLine(); //Enter


        System.out.println("fullName = " + fullName);
        System.out.println("programmingLanguage = " + programmingLanguage);
        System.out.println("age = " + age);
        System.out.println("schoolName = " + schoolName);




    }
}

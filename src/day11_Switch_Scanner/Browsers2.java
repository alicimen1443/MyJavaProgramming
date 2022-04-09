package day11_Switch_Scanner;

import java.util.Scanner;

public class Browsers2 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        String browserName;
        System.out.println("Please enter a browser name");
        browserName= scan.next();
        String result="";

        switch (browserName){
            case "chrome" :
                result="chrome browser is selected";break;
            case "firefox" :
                result="firefox browser is selected";break;
            case "opera" :
                result="opera browser is selected";break;
            case "safari" :
                result="safari browser is selected";break;
            case "edge" :
                result ="edge browser is selected";break;
            default:
                result = "Invalid browser";
        }
        System.out.println(result);
    }
}

/*
3.  write a program that can display the selected browser
            3.1  declare a String variable called browserName
            3.2  Assume that the valid browsers are: chrome, firefox, opera, safari, edge
            3.3 if the browser name does not match with the valid browsers' names, out put should be: Invalid Browser

        	Do Not use if statement or ternary
 */
package day11_Switch_Scanner;

import jdk.swing.interop.SwingInterOpUtils;

public class Browsers {
    public static void main(String[] args) {
        String browserName = "chrome";
        String result="";
        boolean validBrowser = browserName=="chrome"|| browserName=="firefox"||browserName=="opera"
                ||browserName=="safari"|| browserName=="edge";

        if(validBrowser){
            //5 options
            if(browserName=="chrome"){
                result="Chrome Browser is Selected";
            }
            else if(browserName=="firefox"){
                result="Firefox Browser is Selected";
            }
            else if(browserName=="opera"){
                result="Opera Browser is Selected";
            }
            else if(browserName=="safari"){
                result="Safari Browser is Selected";
            }else{
                result="Edge Browser is Selected";
            }
            System.out.println(result);


        }else{
            result="Invalid Browser Name";
        }



    }
}

/*
Warmup Tasks:
	1. Create a class called Browser. Write a program that can display the name of selected browser
	        1. declare a String variable named browserName
	        2. Assume that the valid browsers are: chrome, firefox, opera, safari, edge
	        3. if the browser name does not match with the valid browsers' names,
	        out put should be: Invalid Browser Name

	        Ex:
	        	String browser = "chrome";

	    	Output:
	    		Chrome Browser is selected

			Note: MUST use nested if
 */




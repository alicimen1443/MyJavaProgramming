package day11_Switch_Scanner;

public class Grade {
    public static void main(String[] args) {
        char ch='A';
        String str= "";

        switch(ch){
            case 'A': str= "Excellent";break;
            case 'B': str= "Great Job";break;
            case 'C': str= "Good";break;
            case 'D': str= "Passed";break;
            case 'F': str= "Failed";break;
            default: str= "Invalid";break;
        }
        System.out.println(str);

    }
}

/*
3. a char variable named grade is given. use switch statement to print the following messages:
			'A': excellent
			'B': great job
			'C': good
			'D': passed
			'F': failed
			other wise: invalid

 */

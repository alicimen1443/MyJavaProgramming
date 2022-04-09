package day09_IfStatements;

public class NumberToWord {
    public static void main(String[] args) {

        int number = 5;  // please type number between 0~9
        String word;

        if(number==0){
            word = "zero";
        }
        else if (number==1){
            word = "one";
        }
        else if(number==2){
            word = "two";
        }
        else if(number==3){
            word = "three";
        }
        else if(number==4){
            word = "four";
        }
        else if(number==5){
            word = "five";
        }
        else if(number==6){
            word = "six";
        }
        else if(number==7){
            word = "seven";
        }
        else if(number==8){
            word = "eight";
        }
        else{
            word = "nine";
        }

        System.out.println("word = " + word);
    }
}

/*
1. Create a class called NumberToWord, and write a java program that can convert numbers between 0 ~ 9 to words
			Ex:
				number = 1;

			output:
				One
 */
